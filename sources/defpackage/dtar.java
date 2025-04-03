package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtar extends mo {
    final /* synthetic */ dtau a;
    final /* synthetic */ List b;

    public dtar(dtau dtauVar, List list) {
        this.a = dtauVar;
        this.b = list;
    }

    @Override // defpackage.mo
    public final int a() {
        return this.b.size();
    }

    @Override // defpackage.mo
    public final int b() {
        return this.a.d.size();
    }

    @Override // defpackage.mo
    public final boolean d(int i, int i2) {
        return doxw.a((doxx) this.a.d.get(i), (doxx) this.b.get(i2));
    }

    @Override // defpackage.mo
    public final boolean e(int i, int i2) {
        return doxw.a((doxx) this.a.d.get(i), (doxx) this.b.get(i2));
    }
}
