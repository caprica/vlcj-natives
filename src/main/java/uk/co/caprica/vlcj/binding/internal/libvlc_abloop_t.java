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

/**
 *
 */
public enum libvlc_abloop_t {

    libvlc_abloop_none(0),
    libvlc_abloop_a(1),
    libvlc_abloop_b(2);

    private static final Map<Integer, libvlc_abloop_t> INT_MAP = new HashMap<Integer, libvlc_abloop_t>();

    static {
        for (libvlc_abloop_t value : libvlc_abloop_t.values()) {
            INT_MAP.put(value.intValue, value);
        }
    }

    public static libvlc_abloop_t abloop(int intValue) {
        return INT_MAP.get(intValue);
    }

    private final int intValue;

    libvlc_abloop_t(int intValue) {
        this.intValue = intValue;
    }

    public int intValue() {
        return intValue;
    }
}
