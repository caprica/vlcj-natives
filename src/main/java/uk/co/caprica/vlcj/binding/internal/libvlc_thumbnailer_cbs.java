package uk.co.caprica.vlcj.binding.internal;

import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class libvlc_thumbnailer_cbs extends Structure {

    private static final List<String> FIELD_ORDER = Collections.unmodifiableList(Arrays.asList("version", "on_ended"));

    public int version = 0;
    public libvlc_thumbnailer_cbs_on_ended_cb on_ended;

    @Override
    protected List<String> getFieldOrder() {
        return FIELD_ORDER;
    }
}
