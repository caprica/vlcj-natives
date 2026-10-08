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

public enum libvlc_media_parse_flag_t {

    libvlc_media_parse(0x01),
    libvlc_media_fetch_local(0x02),
    libvlc_media_fetch_network(0x04),
    libvlc_media_do_interact(0x08);

    private static final Map<Integer, libvlc_media_parse_flag_t> INT_MAP = new HashMap<Integer, libvlc_media_parse_flag_t>();

    static {
        for(libvlc_media_parse_flag_t value : libvlc_media_parse_flag_t.values()) {
            INT_MAP.put(value.intValue, value);
        }
    }

    public static libvlc_media_parse_flag_t mediaParseFlag(int intValue) {
        return INT_MAP.get(intValue);
    }

    private final int intValue;

    libvlc_media_parse_flag_t(int intValue) {
        this.intValue = intValue;
    }

    public int intValue() {
        return intValue;
    }
}
