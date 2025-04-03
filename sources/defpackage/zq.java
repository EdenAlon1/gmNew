package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class zq implements zs {
    final uu a;
    final /* synthetic */ zr b;

    public zq(zr zrVar, uu uuVar) {
        this.b = zrVar;
        this.a = uuVar;
    }

    @Override // defpackage.zs
    public final int b(int i) {
        List list = (List) this.b.a.get(i);
        if (list == null) {
            list = new ArrayList();
            this.b.a.put(i, list);
        }
        if (!list.contains(this.a)) {
            list.add(this.a);
        }
        return i;
    }

    @Override // defpackage.zs
    public final int a(int i) {
        return i;
    }
}
