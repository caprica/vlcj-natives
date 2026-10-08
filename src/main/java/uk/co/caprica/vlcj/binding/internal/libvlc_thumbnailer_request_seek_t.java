package uk.co.caprica.vlcj.binding.internal;

import com.sun.jna.Structure;
import com.sun.jna.Union;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class libvlc_thumbnailer_request_seek_t extends Structure {

    private static final List<String> FIELD_ORDER = Collections.unmodifiableList(Arrays.asList("type", "value", "speed"));

    public int type;

    public libvlc_thumbnailer_request_seek_value value;

    public int speed;

    @Override
    protected List<String> getFieldOrder() {
        return FIELD_ORDER;
    }

    public static class libvlc_thumbnailer_request_seek_value extends Union {

        public long time;
        public double position;
    }
}
