package uk.co.caprica.vlcj.binding.internal;

import com.sun.jna.Callback;
import com.sun.jna.Pointer;

public interface libvlc_thumbnailer_cbs_on_ended_cb extends Callback {
    void callback(Pointer opaque, libvlc_picture_t picture);
}
