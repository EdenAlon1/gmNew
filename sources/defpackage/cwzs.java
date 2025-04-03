package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import androidx.preference.Preference;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwzs implements oni {
    final /* synthetic */ Context a;
    final /* synthetic */ cwzu b;

    public cwzs(cwzu cwzuVar, Context context) {
        this.a = context;
        this.b = cwzuVar;
    }

    @Override // defpackage.oni
    public final boolean a(Preference preference) {
        try {
            Context context = this.a;
            eldl.p(context, this.b.N.t(context));
            return true;
        } catch (ActivityNotFoundException e) {
            csjy.h("Bugle", e, "Failed to launch wireless alerts activity");
            return true;
        }
    }
}
