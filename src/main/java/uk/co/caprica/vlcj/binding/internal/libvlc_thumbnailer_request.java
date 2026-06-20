package uk.co.caprica.vlcj.binding.internal;

import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class libvlc_thumbnailer_request extends Structure {

    private static final List<String> FIELD_ORDER = Collections.unmodifiableList(Arrays.asList("version", "media", "width", "height", "crop", "type", "seek", "hw_dec"));

    public int version = 0;
    public libvlc_media_t media;
    public int width;
    public int height;
    public int crop;
    public int type;
    public libvlc_thumbnailer_request_seek seek;
    public int hw_dec;

    @Override
    protected List<String> getFieldOrder() {
        return FIELD_ORDER;
    }
}
