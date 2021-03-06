/*
 * Kontalk Android client
 * Copyright (C) 2020 Kontalk Devteam <devteam@kontalk.org>

 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.

 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.

 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.kontalk.ui;

import com.afollestad.materialdialogs.MaterialDialog;

import android.content.Context;


/**
 * A dialog that can't be dismissed.
 * @author Daniele Ricci
 * @version 1.0
 */
public class LockedDialog {

    private LockedDialog() {
    }

    public static class Builder extends NonSearchableDialog.Builder {

        public Builder(Context context) {
            super(context);
            cancelable(false);
        }

        @Override
        public MaterialDialog build() {
            MaterialDialog dialog = super.build();
            dialog.setCanceledOnTouchOutside(false);
            return dialog;
        }
    }

}
