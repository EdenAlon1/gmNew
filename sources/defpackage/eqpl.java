package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqpl extends eyfq implements eyht {
    public eqpl() {
        super(eqqn.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        eqqn eqqnVar = (eqqn) this.instance;
        eqqn eqqnVar2 = eqqn.a;
        eygi eygiVar = eqqnVar.f;
        if (!eygiVar.c()) {
            eqqnVar.f = eyfy.mutableCopy(eygiVar);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            eqqnVar.f.h(((eqqd) it.next()).x);
        }
    }
}
