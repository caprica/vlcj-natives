package uk.co.caprica.vlcj.binding.internal;

import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class libvlc_parser_cfg extends Structure {

    private static final List<String> FIELD_ORDER = Collections.unmodifiableList(Arrays.asList("version", "max_parser_threads", "max_thumbnailer_threads", "timeout"));

    public int version;
    public int max_parser_threads;
    public int max_thumbnailer_threads;
    public long timeout;

    @Override
    protected List<String> getFieldOrder() {
        return FIELD_ORDER;
    }
}
