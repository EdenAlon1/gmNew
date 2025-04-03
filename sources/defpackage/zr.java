package defpackage;

import android.util.SparseArray;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class zr implements zt {
    final SparseArray a = new SparseArray();

    @Override // defpackage.zt
    public final uu a(int i) {
        List list = (List) this.a.get(i);
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException(a.h(i, "Cannot find the wrapper for global view type "));
        }
        return (uu) list.get(0);
    }

    @Override // defpackage.zt
    public final zs b(uu uuVar) {
        return new zq(this, uuVar);
    }
}
