package uk.co.caprica.vlcj.binding.internal;

import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class libvlc_media_open_cbs extends Structure {

    private static final List<String> FIELD_ORDER = Collections.unmodifiableList(Arrays.asList("version", "open", "read", "seek", "close"));

    public int version;

    public libvlc_media_open_cb open;

    public libvlc_media_read_cb read;

    public libvlc_media_seek_cb seek;

    public libvlc_media_close_cb close;

    @Override
    protected List<String> getFieldOrder() {
        return FIELD_ORDER;
    }
}
