package uk.co.caprica.vlcj.binding.internal;

import com.sun.jna.Callback;
import com.sun.jna.Pointer;

public interface libvlc_media_player_watch_time_on_seek extends Callback {

    void callback(Pointer data, libvlc_media_player_time_point_t value);
}
