package defpackage;

import android.app.Activity;
import android.support.constraint.Guideline;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcra extends dcrd {
    public dcra(Activity activity, ViewGroup viewGroup, Guideline guideline, Guideline guideline2, boolean z) {
        super(activity, viewGroup, guideline, guideline2, z);
    }

    @Override // defpackage.dcrd
    public final void a(int i) {
        int i2 = 0;
        int b = b(0) / 2;
        int d = cskf.d(b, ddzb.d(this.a), this.b);
        if (!ctid.e(this.a, this.d)) {
            Activity activity = this.a;
            i2 = cskf.d(b, ddzb.c(activity), this.b);
        }
        d(d, i2);
    }
}
