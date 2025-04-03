package defpackage;

import androidx.preference.Preference;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwzr implements oni {
    final /* synthetic */ cwzu a;

    public cwzr(cwzu cwzuVar) {
        this.a = cwzuVar;
    }

    @Override // defpackage.oni
    public final boolean a(Preference preference) {
        this.a.u.c();
        iv ivVar = this.a.u.n;
        if (ivVar == null) {
            return true;
        }
        ivVar.d().getLayoutParams().height = this.a.u.i.getResources().getDimensionPixelSize(R.dimen.group_mms_preference_dialog_listview_height);
        return true;
    }
}
