package uk.co.caprica.vlcj.binding.internal;

import com.sun.jna.Callback;
import com.sun.jna.Pointer;

public interface libvlc_media_player_cbs_on_position_changed extends Callback {
    void callback(Pointer opaque, long time_us, double position);
}
