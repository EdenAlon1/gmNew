package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eoop extends eyfq implements eyht {
    public eoop() {
        super(eopq.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        eopq eopqVar = (eopq) this.instance;
        eopq eopqVar2 = eopq.a;
        eygi eygiVar = eopqVar.Z;
        if (!eygiVar.c()) {
            eopqVar.Z = eyfy.mutableCopy(eygiVar);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            eopqVar.Z.h(((eooc) it.next()).u);
        }
    }

    public final void b(epag epagVar) {
        copyOnWrite();
        eopq eopqVar = (eopq) this.instance;
        epai epaiVar = (epai) epagVar.build();
        eopq eopqVar2 = eopq.a;
        epaiVar.getClass();
        eopqVar.a();
        eopqVar.X.add(epaiVar);
    }
}
