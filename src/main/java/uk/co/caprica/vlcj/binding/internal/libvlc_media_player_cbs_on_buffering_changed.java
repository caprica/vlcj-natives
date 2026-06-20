package uk.co.caprica.vlcj.binding.internal;

import com.sun.jna.Callback;
import com.sun.jna.Pointer;

public interface libvlc_media_player_cbs_on_buffering_changed extends Callback {
    void callback(Pointer opaque, float new_cache);
}
