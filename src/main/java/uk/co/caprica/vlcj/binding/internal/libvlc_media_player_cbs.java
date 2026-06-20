package uk.co.caprica.vlcj.binding.internal;

import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class libvlc_media_player_cbs extends Structure {

    private static final List<String> FIELD_ORDER = Collections.unmodifiableList(Arrays.asList(
        "version",
        "on_media_changed",
        "on_media_stopping",
        "on_state_changed",
        "on_buffering_changed",
        "on_capabilities_changed",
        "on_position_changed",
        "on_length_changed",
        "on_track_list_changed",
        "on_track_selection_changed",
        "on_program_list_changed",
        "on_program_selection_changed",
        "on_titles_changed",
        "on_title_selection_changed",
        "on_chapter_selection_changed",
        "on_recording_changed",
        "on_screenshot_taken",
        "on_media_parsed",
        "on_media_meta_changed",
        "on_media_subitems_changed",
        "on_media_attachments_added",
        "on_vout_changed",
        "on_cork_changed",
        "on_audio_volume_changed",
        "on_audio_mute_changed",
        "on_audio_device_changed"
    ));

    public int version = 0;

    public libvlc_media_player_cbs_on_media_changed on_media_changed;
    public libvlc_media_player_cbs_on_media_stopping on_media_stopping;
    public libvlc_media_player_cbs_on_state_changed on_state_changed;
    public libvlc_media_player_cbs_on_buffering_changed on_buffering_changed;
    public libvlc_media_player_cbs_on_capabilities_changed on_capabilities_changed;
    public libvlc_media_player_cbs_on_position_changed on_position_changed;
    public libvlc_media_player_cbs_on_length_changed on_length_changed;
    public libvlc_media_player_cbs_on_track_list_changed on_track_list_changed;
    public libvlc_media_player_cbs_on_track_selection_changed on_track_selection_changed;
    public libvlc_media_player_cbs_on_program_list_changed on_program_list_changed;
    public libvlc_media_player_cbs_on_program_selection_changed on_program_selection_changed;
    public libvlc_media_player_cbs_on_titles_changed on_titles_changed;
    public libvlc_media_player_cbs_on_title_selection_changed on_title_selection_changed;
    public libvlc_media_player_cbs_on_chapter_selection_changed on_chapter_selection_changed;
    public libvlc_media_player_cbs_on_recording_changed on_recording_changed;
    public libvlc_media_player_cbs_on_screenshot_taken on_screenshot_taken;
    public libvlc_media_player_cbs_on_media_parsed on_media_parsed;
    public libvlc_media_player_cbs_on_media_meta_changed on_media_meta_changed;
    public libvlc_media_player_cbs_on_media_subitems_changed on_media_subitems_changed;
    public libvlc_media_player_cbs_on_media_attachments_added on_media_attachments_added;
    public libvlc_media_player_cbs_on_vout_changed on_vout_changed;
    public libvlc_media_player_cbs_on_cork_changed on_cork_changed;
    public libvlc_media_player_cbs_on_audio_volume_changed on_audio_volume_changed;
    public libvlc_media_player_cbs_on_audio_mute_changed on_audio_mute_changed;
    public libvlc_media_player_cbs_on_audio_device_changed on_audio_device_changed;

    @Override
    protected List<String> getFieldOrder() {
        return FIELD_ORDER;
    }
}
