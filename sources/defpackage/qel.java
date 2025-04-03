package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qel implements qdu, qem {
    public final boolean a;
    public final qer b;
    public final qer c;
    public final qer d;
    public final int e;
    private final List f = new ArrayList();

    public qel(qje qjeVar, qjc qjcVar) {
        this.a = qjcVar.d;
        this.e = qjcVar.e;
        qer a = qjcVar.a.a();
        this.b = a;
        qer a2 = qjcVar.b.a();
        this.c = a2;
        qer a3 = qjcVar.c.a();
        this.d = a3;
        qjeVar.k(a);
        qjeVar.k(a2);
        qjeVar.k(a3);
        a.h(this);
        a2.h(this);
        a3.h(this);
    }

    final void a(qem qemVar) {
        this.f.add(qemVar);
    }

    @Override // defpackage.qem
    public final void d() {
        for (int i = 0; i < this.f.size(); i++) {
            ((qem) this.f.get(i)).d();
        }
    }

    @Override // defpackage.qdu
    public final String g() {
        throw null;
    }

    @Override // defpackage.qdu
    public final void f(List list, List list2) {
    }
}
