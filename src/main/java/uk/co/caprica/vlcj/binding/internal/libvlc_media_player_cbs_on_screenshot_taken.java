package uk.co.caprica.vlcj.binding.internal;

import com.sun.jna.Callback;
import com.sun.jna.Pointer;

public interface libvlc_media_player_cbs_on_screenshot_taken extends Callback {
    void callback(Pointer opaque, Pointer filename);
}
