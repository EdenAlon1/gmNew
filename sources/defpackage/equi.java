package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class equi {
    public static final /* synthetic */ eqbp a(eqbb eqbbVar) {
        eyfy build = eqbbVar.build();
        build.getClass();
        return (eqbp) build;
    }

    public static final void b(long j, eqbb eqbbVar) {
        eqbbVar.copyOnWrite();
        eqbp eqbpVar = (eqbp) eqbbVar.instance;
        eygj eygjVar = eqbp.a;
        eqbpVar.c |= 1;
        eqbpVar.d = j;
    }

    public static final void c(int i, eqbb eqbbVar) {
        eqbbVar.copyOnWrite();
        eqbp eqbpVar = (eqbp) eqbbVar.instance;
        eygj eygjVar = eqbp.a;
        eqbpVar.e = i - 1;
        eqbpVar.c |= 2;
    }

    public static final void d(int i, eqbb eqbbVar) {
        eqbbVar.copyOnWrite();
        eqbp eqbpVar = (eqbp) eqbbVar.instance;
        eygj eygjVar = eqbp.a;
        eqbpVar.g = i - 1;
        eqbpVar.c |= 8;
    }

    public static final void e(int i, eqbb eqbbVar) {
        eqbbVar.copyOnWrite();
        eqbp eqbpVar = (eqbp) eqbbVar.instance;
        eygj eygjVar = eqbp.a;
        eqbpVar.f = i - 1;
        eqbpVar.c |= 4;
    }

    public static final void f(int i, eqbb eqbbVar) {
        eqbbVar.copyOnWrite();
        eqbp eqbpVar = (eqbp) eqbbVar.instance;
        eygj eygjVar = eqbp.a;
        eqbpVar.h = i - 1;
        eqbpVar.c |= 16;
    }

    public static final void g(eqbb eqbbVar) {
        eqbbVar.copyOnWrite();
        eqbp eqbpVar = (eqbp) eqbbVar.instance;
        eygj eygjVar = eqbp.a;
        eqbpVar.l = 1;
        eqbpVar.c |= 64;
    }
}
