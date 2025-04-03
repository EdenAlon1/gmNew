package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqwb {
    public static final /* synthetic */ eqea a(eqdw eqdwVar) {
        eyfy build = eqdwVar.build();
        build.getClass();
        return (eqea) build;
    }

    public static final void b(boolean z, eqdw eqdwVar) {
        eqdwVar.copyOnWrite();
        eqea eqeaVar = (eqea) eqdwVar.instance;
        eqea eqeaVar2 = eqea.a;
        eqeaVar.b |= 4;
        eqeaVar.e = z;
    }

    public static final void c(int i, eqdw eqdwVar) {
        eqdwVar.copyOnWrite();
        eqea eqeaVar = (eqea) eqdwVar.instance;
        eqea eqeaVar2 = eqea.a;
        eqeaVar.d = i - 1;
        eqeaVar.b |= 2;
    }

    public static final void d(int i, eqdw eqdwVar) {
        eqdwVar.copyOnWrite();
        eqea eqeaVar = (eqea) eqdwVar.instance;
        eqea eqeaVar2 = eqea.a;
        eqeaVar.c = i - 1;
        eqeaVar.b |= 1;
    }
}
