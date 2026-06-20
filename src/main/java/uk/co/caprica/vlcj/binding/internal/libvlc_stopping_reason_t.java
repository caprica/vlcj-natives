package uk.co.caprica.vlcj.binding.internal;

import java.util.HashMap;
import java.util.Map;

/**
 * Enumeration of media player stopping reasons.
 */
public enum libvlc_stopping_reason_t {

    libvlc_stopping_reason_error(0),
    libvlc_stopping_reason_eos  (1),
    libvlc_stopping_reason_user (2);

    private static final Map<Integer, libvlc_stopping_reason_t> INT_MAP = new HashMap<Integer, libvlc_stopping_reason_t>();

    static {
        for(libvlc_stopping_reason_t value : libvlc_stopping_reason_t.values()) {
            INT_MAP.put(value.intValue, value);
        }
    }

    public static libvlc_stopping_reason_t stoppingReason(int intValue) {
        return INT_MAP.get(intValue);
    }

    private final int intValue;

    libvlc_stopping_reason_t(int intValue) {
        this.intValue = intValue;
    }

    public int intValue() {
        return intValue;
    }
}
