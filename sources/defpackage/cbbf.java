package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbbf extends cbce {
    public cbbf(String str, int i, int i2, int i3, int i4) {
        super(csuu.h(str), i, i2, i3, i4, true, false, false, 0);
    }

    @Override // defpackage.cbce, defpackage.cbbi, defpackage.cbbo
    public final cbbn f(Context context) {
        return new cbbe(context, this);
    }

    @Override // defpackage.cbce, defpackage.cbbi
    public final String g() {
        String g = super.g();
        if (g == null) {
            return null;
        }
        return g.concat("|false");
    }
}
