package uk.co.caprica.vlcj.binding.internal;

import com.sun.jna.Callback;
import com.sun.jna.Pointer;

public interface libvlc_media_discoverer_on_media_removed_cb extends Callback {

    void callback(Pointer opaque, libvlc_media_t media);
}
