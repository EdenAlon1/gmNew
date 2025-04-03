package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erco {
    public static final /* synthetic */ eqlw a(eqlu eqluVar) {
        eyfy build = eqluVar.build();
        build.getClass();
        return (eqlw) build;
    }

    public static final void b(int i, eqlu eqluVar) {
        eqluVar.copyOnWrite();
        eqlw eqlwVar = (eqlw) eqluVar.instance;
        eqlw eqlwVar2 = eqlw.a;
        eqlwVar.c = i - 1;
        eqlwVar.b |= 1;
    }

    public static final void c(int i, eqlu eqluVar) {
        eqluVar.copyOnWrite();
        eqlw eqlwVar = (eqlw) eqluVar.instance;
        eqlw eqlwVar2 = eqlw.a;
        eqlwVar.d = dtfg.a(i);
        eqlwVar.b |= 2;
    }
}
