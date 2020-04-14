/*
 * This file is part of VLCJ.
 *
 * VLCJ is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * VLCJ is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with VLCJ.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Copyright 2009-2020 Caprica Software Limited.
 */

package uk.co.caprica.vlcj.binding;

/**
 * Private helper class to ensure the native libraries are properly initialised on Linux.
 * <p>
 * If there are any errors when executing this initialisation code there is little point in even reporting them as
 * nothing else can be done. The approach therefore is do a best-effort at running this initialisation and robustly
 * ignore errors.
 * <p>
 * The reality is that the nature of the initialisation code means errors simply should not occur.
 */
public final class LinuxNativeInit {

    public static void init() {
        initX();
    }

    /**
     * With recent VLC/JDK it seems necessary to do this - it can however cause problems if using the JVM splash-screen
     * options.
     * <p>
     * Without this, VLC will likely complain to the console output and various VLC plugins will fail to load.
     * <p>
     * It is also likely that opening a JavaFX FileChooser will cause a fatal JVM crash.
     * <p>
     * If you're using JavaFX, you should specify -DVLCJ_INITX=no on your command-line.
     */
    private static void initX() {
        String initX = System.getProperty("VLCJ_INITX");
        if (!"no".equalsIgnoreCase(initX)) {
            try {
                LibX11.INSTANCE.XInitThreads();
            }
            catch (Exception e) {
            }
        }
    }

    private LinuxNativeInit() {
    }
}
