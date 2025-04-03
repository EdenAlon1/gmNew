package defpackage;

import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class zp implements zt {
    final SparseArray a = new SparseArray();
    int b = 0;

    @Override // defpackage.zt
    public final uu a(int i) {
        uu uuVar = (uu) this.a.get(i);
        if (uuVar != null) {
            return uuVar;
        }
        throw new IllegalArgumentException(a.h(i, "Cannot find the wrapper for global view type "));
    }

    @Override // defpackage.zt
    public final zs b(uu uuVar) {
        return new zo(this, uuVar);
    }
}
