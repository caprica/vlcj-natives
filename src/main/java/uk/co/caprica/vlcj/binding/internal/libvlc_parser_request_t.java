package uk.co.caprica.vlcj.binding.internal;

import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class libvlc_parser_request_t extends Structure {

    private static final List<String> FIELD_ORDER = Collections.unmodifiableList(Arrays.asList("version", "media", "parse_flags"));

    public int version = 0;
    public libvlc_media_t media;
    public int parse_flags;

    @Override
    protected List<String> getFieldOrder() {
        return FIELD_ORDER;
    }
}
