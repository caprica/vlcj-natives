/*
 * This file is part of VLCJ.
 *
 * VLCJ is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * VLCJ is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with VLCJ.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Copyright 2009-2024 Caprica Software Limited.
 */

package uk.co.caprica.vlcj.binding.internal;

import com.sun.jna.Callback;
import com.sun.jna.Pointer;

/**
 *
 */
public interface libvlc_video_swap_cb extends Callback {

    /**
     * Callback prototype called after performing drawing calls.
     *
     * @param opaque private pointer passed to the @a libvlc_video_set_output_callbacks() [IN]
     *
     * @since LibVLC 4.0.0 or later
     */
    void swap(Pointer opaque);

}
