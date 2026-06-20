package uk.co.caprica.vlcj.binding.internal;

import java.util.HashMap;
import java.util.Map;

/**
 * Enumeration of thumbnailer seeking speeds.
 */
public enum libvlc_thumbnailer_seek_speed_t {

    libvlc_thumbnailer_seek_fast   (0),
    libvlc_thumbnailer_seek_precise(1);

    private static final Map<Integer, libvlc_thumbnailer_seek_speed_t> INT_MAP = new HashMap<Integer, libvlc_thumbnailer_seek_speed_t>();

    static {
        for(libvlc_thumbnailer_seek_speed_t value : libvlc_thumbnailer_seek_speed_t.values()) {
            INT_MAP.put(value.intValue, value);
        }
    }

    public static libvlc_thumbnailer_seek_speed_t seekSpeed(int intValue) {
        return INT_MAP.get(intValue);
    }

    private final int intValue;

    libvlc_thumbnailer_seek_speed_t(int intValue) {
        this.intValue = intValue;
    }

    public int intValue() {
        return intValue;
    }
}
