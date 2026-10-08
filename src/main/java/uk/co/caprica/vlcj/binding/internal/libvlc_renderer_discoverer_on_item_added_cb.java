package uk.co.caprica.vlcj.binding.internal;

import com.sun.jna.Callback;
import com.sun.jna.Pointer;

public interface libvlc_renderer_discoverer_on_item_added_cb extends Callback {

    void callback(Pointer opaque, libvlc_renderer_item_t item);
}
