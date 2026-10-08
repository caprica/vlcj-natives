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

package uk.co.caprica.vlcj.binding.internal;

import java.util.HashMap;
import java.util.Map;

public enum libvlc_picture_type_t {
    libvlc_picture_Argb(0),
    libvlc_picture_Png(1),
    libvlc_picture_Jpg(2),
    libvlc_picture_WebP(3),
    libvlc_picture_Rgba(4);

    private static final Map<Integer, libvlc_picture_type_t> INT_MAP = new HashMap<Integer, libvlc_picture_type_t>();

    static {
        for(libvlc_picture_type_t value : libvlc_picture_type_t.values()) {
            INT_MAP.put(value.intValue, value);
        }
    }

    public static libvlc_picture_type_t pictureType(int intValue) {
        return INT_MAP.get(intValue);
    }

    private final int intValue;

    libvlc_picture_type_t(int intValue) {
        this.intValue = intValue;
    }

    public int intValue() {
        return intValue;
    }
}
