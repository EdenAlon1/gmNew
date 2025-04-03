package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahmm implements dqlv {
    final /* synthetic */ ffji a;
    final /* synthetic */ ahmn b;
    final /* synthetic */ ffji c;

    public ahmm(ffji ffjiVar, ahmn ahmnVar, ffji ffjiVar2) {
        this.a = ffjiVar;
        this.b = ahmnVar;
        this.c = ffjiVar2;
    }

    @Override // defpackage.dqlv
    public final /* bridge */ /* synthetic */ Object a(doxs doxsVar, ffgu ffguVar) {
        this.a.invoke((drlh) doxsVar);
        return dqmj.a;
    }

    @Override // defpackage.dqlv
    public final /* synthetic */ void c(doxs doxsVar) {
        doxsVar.getClass();
    }

    @Override // defpackage.dqlv
    public final /* bridge */ /* synthetic */ void d(doxs doxsVar) {
        Object obj;
        drlh drlhVar = (drlh) doxsVar;
        Iterator it = this.b.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            dzsr dzsrVar = (dzsr) dzsl.a(((dzpz) next).a()).f();
            if (ffkj.e(dzsrVar != null ? dzsrVar.g() : null, drlhVar.f())) {
                obj = next;
                break;
            }
        }
        dzpz dzpzVar = (dzpz) obj;
        if (dzpzVar != null) {
            this.c.invoke(dzpzVar);
        }
    }

    @Override // defpackage.dqlv
    public final /* synthetic */ void b() {
    }
}
