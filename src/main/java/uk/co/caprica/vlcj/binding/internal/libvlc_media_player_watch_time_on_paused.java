package uk.co.caprica.vlcj.binding.internal;

import com.sun.jna.Callback;
import com.sun.jna.Pointer;

public interface libvlc_media_player_watch_time_on_paused extends Callback {

    void callback(long system_date_us, Pointer data);
}
