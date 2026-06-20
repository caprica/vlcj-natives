package uk.co.caprica.vlcj.binding.internal;

import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class libvlc_media_discoverer_cbs extends Structure {

    private static final List<String> FIELD_ORDER = Collections.unmodifiableList(Arrays.asList("version", "on_media_added", "on_media_removed"));

    public int version;

    public libvlc_media_discoverer_on_media_added_cb on_media_added;

    public libvlc_media_discoverer_on_media_removed_cb on_media_removed;

    @Override
    protected List<String> getFieldOrder() {
        return FIELD_ORDER;
    }
}
