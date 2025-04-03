package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erdv extends eyfq implements eyht {
    public erdv() {
        super(erdw.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        erdw erdwVar = (erdw) this.instance;
        erdw erdwVar2 = erdw.a;
        eygi eygiVar = erdwVar.h;
        if (!eygiVar.c()) {
            erdwVar.h = eyfy.mutableCopy(eygiVar);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            erdwVar.h.h(((erep) it.next()).a());
        }
    }
}
