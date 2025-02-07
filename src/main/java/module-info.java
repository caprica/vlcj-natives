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
 * Copyright 2009-2025 Caprica Software Limited.
 */

/**
 * This library is intended for use by vlcj only, hence the exports are (mostly) restricted to "uk.co.caprica.vlcj".
 * <p>
 * Exports to "com.sun.jna" are required so that JNA can instantiate instances of the various Structure types at
 * run-time.
 * <p>
 * Exports to "uk.co.caprica.vlcj.test" are temporary pending reorganisation of the test/examples project.
 */
module uk.co.caprica.vlcj.natives {
    requires com.sun.jna;
    requires java.desktop;

    requires transitive com.sun.jna.platform;

    exports uk.co.caprica.vlcj.binding.internal to
        com.sun.jna,
        uk.co.caprica.vlcj;

    exports uk.co.caprica.vlcj.binding.lib to
        uk.co.caprica.vlcj;

    exports uk.co.caprica.vlcj.binding.support.runtime to
        uk.co.caprica.vlcj;

    exports uk.co.caprica.vlcj.binding.support.strings to uk.co.caprica.vlcj;

    exports uk.co.caprica.vlcj.binding.support.types to
        com.sun.jna,
        uk.co.caprica.vlcj;
}
