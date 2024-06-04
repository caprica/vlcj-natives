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
 * Copyright 2009-2024 Caprica Software Limited.
 */

package uk.co.caprica.vlcj.binding.internal;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public enum libvlc_video_color_space_e {

    libvlc_video_colorspace_BT601 (1),
    libvlc_video_colorspace_BT709 (2),
    libvlc_video_colorspace_BT2020(3);

    private static final Map<Integer, libvlc_video_color_space_e> INT_MAP = new HashMap<Integer, libvlc_video_color_space_e>();

    static {
        for (libvlc_video_color_space_e value : libvlc_video_color_space_e.values()) {
            INT_MAP.put(value.intValue, value);
        }
    }

    public static libvlc_video_color_space_e videoColorSpace(int intValue) {
        return INT_MAP.get(intValue);
    }

    private final int intValue;

    libvlc_video_color_space_e(int intValue) {
        this.intValue = intValue;
    }

    public int intValue() {
        return intValue;
    }
}
