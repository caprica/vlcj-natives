package uk.co.caprica.vlcj.binding.internal;

import com.sun.jna.Callback;
import com.sun.jna.Pointer;

public interface libvlc_parser_cbs_on_attachments_added_cb extends Callback {
    void callback(Pointer opaque, libvlc_media_t media, libvlc_picture_list_t attachments);
}
