package uk.co.caprica.vlcj.binding.internal;

import com.sun.jna.Callback;
import com.sun.jna.Pointer;

public interface libvlc_media_player_cbs_on_track_list_changed extends Callback {
    void callback(Pointer opaque, int action, int type, Pointer id);
}
