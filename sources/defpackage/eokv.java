package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eokv extends eyfq implements eyht {
    public eokv() {
        super(eokw.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        eokw eokwVar = (eokw) this.instance;
        eokw eokwVar2 = eokw.a;
        eygi eygiVar = eokwVar.E;
        if (!eygiVar.c()) {
            eokwVar.E = eyfy.mutableCopy(eygiVar);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            eokwVar.E.h(((eooc) it.next()).u);
        }
    }
}
