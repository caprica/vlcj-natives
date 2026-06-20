package uk.co.caprica.vlcj.binding.internal;

import com.sun.jna.Callback;
import com.sun.jna.Pointer;

public interface libvlc_media_player_cbs_on_program_list_changed extends Callback {
    void callback(Pointer opaque, int action, libvlc_player_program_t program);
}
