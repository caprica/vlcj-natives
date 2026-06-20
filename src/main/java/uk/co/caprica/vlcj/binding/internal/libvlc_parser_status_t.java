package uk.co.caprica.vlcj.binding.internal;

import java.util.HashMap;
import java.util.Map;

/**
 * Enumeration of parser status values.
 */
public enum libvlc_parser_status_t {

    libvlc_parser_status_success  (0),
    libvlc_parser_status_cancelled(1),
    libvlc_parser_status_timeout  (2),
    libvlc_parser_status_failed   (3);

    private static final Map<Integer, libvlc_parser_status_t> INT_MAP = new HashMap<Integer, libvlc_parser_status_t>();

    static {
        for(libvlc_parser_status_t value : libvlc_parser_status_t.values()) {
            INT_MAP.put(value.intValue, value);
        }
    }

    public static libvlc_parser_status_t parserStatus(int intValue) {
        return INT_MAP.get(intValue);
    }

    private final int intValue;

    libvlc_parser_status_t(int intValue) {
        this.intValue = intValue;
    }

    public int intValue() {
        return intValue;
    }
}
