package defpackage;

import j$.util.DesugarCollections;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class equc {
    public final eqaq a;

    public equc(eqaq eqaqVar) {
        this.a = eqaqVar;
    }

    public final /* synthetic */ eqar a() {
        eyfy build = this.a.build();
        build.getClass();
        return (eqar) build;
    }

    public final void b(epwy epwyVar) {
        eqaq eqaqVar = this.a;
        eqaqVar.copyOnWrite();
        eqar eqarVar = (eqar) eqaqVar.instance;
        eqar eqarVar2 = eqar.a;
        eqarVar.i = epwyVar;
        eqarVar.b |= 32;
    }

    public final void c(long j) {
        eqaq eqaqVar = this.a;
        eqaqVar.copyOnWrite();
        eqar eqarVar = (eqar) eqaqVar.instance;
        eqar eqarVar2 = eqar.a;
        eqarVar.b |= 1;
        eqarVar.c = j;
    }

    public final /* synthetic */ void d(Iterable iterable) {
        iterable.getClass();
        eqaq eqaqVar = this.a;
        eqaqVar.copyOnWrite();
        eqar eqarVar = (eqar) eqaqVar.instance;
        eqar eqarVar2 = eqar.a;
        eygr eygrVar = eqarVar.d;
        if (!eygrVar.c()) {
            eqarVar.d = eyfy.mutableCopy(eygrVar);
        }
        eydl.addAll(iterable, eqarVar.d);
    }

    public final /* synthetic */ void e() {
        DesugarCollections.unmodifiableList(((eqar) this.a.instance).d).getClass();
    }
}
