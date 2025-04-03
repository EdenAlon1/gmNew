package defpackage;

import android.widget.ImageView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddst implements dduf {
    @Override // defpackage.dduf
    public final int a() {
        return R.id.zero_state_search_location_star_icon;
    }

    @Override // defpackage.dduf
    public final void b(crly crlyVar, boolean z) {
        if (crlyVar.i() || z) {
            ((ImageView) crlyVar.b()).setVisibility(true != z ? 8 : 0);
        }
    }
}
