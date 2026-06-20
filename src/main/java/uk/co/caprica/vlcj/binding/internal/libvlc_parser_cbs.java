package uk.co.caprica.vlcj.binding.internal;

import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class libvlc_parser_cbs extends Structure {

    private static final List<String> FIELD_ORDER = Collections.unmodifiableList(Arrays.asList("version", "on_parsed", "on_attachments_added"));

    public int version;
    public libvlc_parser_cbs_on_parsed_cb on_parsed;
    public libvlc_parser_cbs_on_attachments_added_cb on_attachments_added;

    @Override
    protected List<String> getFieldOrder() {
        return FIELD_ORDER;
    }
}
