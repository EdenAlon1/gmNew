package com.google.android.apps.messaging.cloudstore.fi;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.preference.Preference;
import com.google.android.apps.messaging.R;
import defpackage.ooi;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SyncPreference extends Preference {
    public int a;
    private final Context b;

    public SyncPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 3;
        this.b = context;
        this.B = R.layout.sync_preference_widget;
        aa();
    }

    public static boolean ab(long j, long j2) {
        return j <= j2 && j >= 0;
    }

    public static long k(long j, long j2) {
        if (j2 == 0) {
            return 0L;
        }
        long j3 = j * 100;
        long j4 = j3 / j2;
        return (j3 - (j2 * j4) != 0 && (((j3 ^ j2) >> 63) | 1) < 0) ? j4 - 1 : j4;
    }

    @Override // androidx.preference.Preference
    public final void a(ooi ooiVar) {
        super.a(ooiVar);
        ProgressBar progressBar = (ProgressBar) ooiVar.C(R.id.sync_preference_progress_bar);
        TextView textView = (TextView) ooiVar.C(android.R.id.title);
        int i = this.a;
        if (i == 0) {
            throw null;
        }
        if (i == 1 || i == 5 || i == 4) {
            if (progressBar != null) {
                progressBar.setVisibility(0);
            }
            if (textView != null) {
                textView.setTextColor(this.j.getColor(R.color.text_color_primary));
                return;
            }
            return;
        }
        if (i == 2) {
            if (progressBar != null) {
                progressBar.setVisibility(4);
            }
            if (textView != null) {
                textView.setTextColor(this.j.getColor(R.color.sync_preference_synced_title_color));
            }
        }
    }

    public final void l(int i) {
        M(this.b.getString(i));
    }

    public final void o(int i, long j) {
        M(this.b.getString(i, Long.valueOf(j)));
    }
}
