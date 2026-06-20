package uk.co.caprica.vlcj.binding.internal;

import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class libvlc_parser_request extends Structure {

    private static final List<String> FIELD_ORDER = Collections.unmodifiableList(Arrays.asList("version", "media", "parse_flags", "thumbnail"));

    public int version;
    public libvlc_media_t media;
    public int parse_flags;
    public int thumbnail;

    @Override
    protected List<String> getFieldOrder() {
        return FIELD_ORDER;
    }
}
