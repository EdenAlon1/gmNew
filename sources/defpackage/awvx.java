package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awvx extends eyfq implements eyht {
    public awvx() {
        super(awvy.b);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        awvy awvyVar = (awvy) this.instance;
        eygj eygjVar = awvy.a;
        awvyVar.a();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            awvyVar.g.h(((awvh) it.next()).f);
        }
    }

    public final void b(Iterable iterable) {
        copyOnWrite();
        awvy awvyVar = (awvy) this.instance;
        eygj eygjVar = awvy.a;
        eygr eygrVar = awvyVar.h;
        if (!eygrVar.c()) {
            awvyVar.h = eyfy.mutableCopy(eygrVar);
        }
        eydl.addAll(iterable, awvyVar.h);
    }

    public final void c(awvh awvhVar) {
        copyOnWrite();
        awvy awvyVar = (awvy) this.instance;
        eygj eygjVar = awvy.a;
        awvhVar.getClass();
        awvyVar.a();
        awvyVar.g.h(awvhVar.f);
    }
}
