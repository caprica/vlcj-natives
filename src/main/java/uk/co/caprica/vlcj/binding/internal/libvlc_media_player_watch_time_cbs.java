package uk.co.caprica.vlcj.binding.internal;

import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class libvlc_media_player_watch_time_cbs extends Structure {

    private static final List<String> FIELD_ORDER = Collections.unmodifiableList(Arrays.asList("version", "on_update", "on_paused", "on_seek"));

    public int version = 0;

    public libvlc_media_player_watch_time_on_update on_update;

    public libvlc_media_player_watch_time_on_paused on_paused;

    public libvlc_media_player_watch_time_on_seek on_seek;

    @Override
    protected List<String> getFieldOrder() {
        return FIELD_ORDER;
    }
}
