package uk.co.caprica.vlcj.binding.internal;

/**
 * Bitmasks for media player capabilities.
 */
public interface libvlc_capability_t {
    int libvlc_capability_seek        = 1;
    int libvlc_capability_pause       = 2;
    int libvlc_capability_change_rate = 4;
    int libvlc_capability_rewind      = 8;
}
