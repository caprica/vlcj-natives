package uk.co.caprica.vlcj.binding.internal;

import java.util.HashMap;
import java.util.Map;

/**
 * Enumeration of list action types.
 */
public enum libvlc_list_action_t {

    libvlc_list_action_added  (0),
    libvlc_list_action_removed(1),
    libvlc_list_action_updated(2);

    private static final Map<Integer, libvlc_list_action_t> INT_MAP = new HashMap<Integer, libvlc_list_action_t>();

    static {
        for(libvlc_list_action_t value : libvlc_list_action_t.values()) {
            INT_MAP.put(value.intValue, value);
        }
    }

    public static libvlc_list_action_t listAction(int intValue) {
        return INT_MAP.get(intValue);
    }

    private final int intValue;

    libvlc_list_action_t(int intValue) {
        this.intValue = intValue;
    }

    public int intValue() {
        return intValue;
    }
}
