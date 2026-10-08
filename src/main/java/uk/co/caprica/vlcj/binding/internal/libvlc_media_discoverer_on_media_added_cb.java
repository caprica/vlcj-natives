package uk.co.caprica.vlcj.binding.internal;

import com.sun.jna.Callback;
import com.sun.jna.Pointer;

public interface libvlc_media_discoverer_on_media_added_cb extends Callback {

    void callback(Pointer opaque, Pointer parent, libvlc_media_t media);
}
