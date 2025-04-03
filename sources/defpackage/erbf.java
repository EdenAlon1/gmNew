package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erbf {
    public static final /* synthetic */ eqkt a(eqkr eqkrVar) {
        eyfy build = eqkrVar.build();
        build.getClass();
        return (eqkt) build;
    }

    public static final void b(int i, eqkr eqkrVar) {
        eqkrVar.copyOnWrite();
        eqkt eqktVar = (eqkt) eqkrVar.instance;
        eqkt eqktVar2 = eqkt.a;
        eqktVar.d = i - 1;
        eqktVar.b |= 2;
    }

    public static final void c(eqkr eqkrVar) {
        eqkrVar.copyOnWrite();
        eqkt eqktVar = (eqkt) eqkrVar.instance;
        eqkt eqktVar2 = eqkt.a;
        eqktVar.c = 3;
        eqktVar.b |= 1;
    }
}
