package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class equj {
    public static final /* synthetic */ eqbu a(eqbq eqbqVar) {
        eyfy build = eqbqVar.build();
        build.getClass();
        return (eqbu) build;
    }

    public static final void b(int i, eqbq eqbqVar) {
        eqbqVar.copyOnWrite();
        eqbu eqbuVar = (eqbu) eqbqVar.instance;
        eqbu eqbuVar2 = eqbu.a;
        eqbuVar.c = i - 1;
        eqbuVar.b |= 1;
    }

    public static final void c(int i, eqbq eqbqVar) {
        eqbqVar.copyOnWrite();
        eqbu eqbuVar = (eqbu) eqbqVar.instance;
        eqbu eqbuVar2 = eqbu.a;
        eqbuVar.d = i - 1;
        eqbuVar.b |= 2;
    }
}
