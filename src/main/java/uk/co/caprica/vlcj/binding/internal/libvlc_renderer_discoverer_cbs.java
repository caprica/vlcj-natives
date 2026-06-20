package uk.co.caprica.vlcj.binding.internal;

import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class libvlc_renderer_discoverer_cbs extends Structure {

    private static final List<String> FIELD_ORDER = Collections.unmodifiableList(Arrays.asList("version", "on_item_added", "on_item_removed"));

    public int version = 0;

    public libvlc_renderer_discoverer_on_item_added_cb on_item_added;

    public libvlc_renderer_discoverer_on_item_removed_cb on_item_removed;

    @Override
    protected List<String> getFieldOrder() {
        return FIELD_ORDER;
    }
}
