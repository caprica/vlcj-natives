package uk.co.caprica.vlcj.binding.internal;

import com.sun.jna.Callback;
import com.sun.jna.Pointer;

public interface libvlc_media_player_cbs_on_chapter_selection_changed extends Callback {
    void callback(Pointer opaque, libvlc_title_description_t title, libvlc_chapter_description_t chapter);
}
