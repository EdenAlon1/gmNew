package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epna {
    public static final /* synthetic */ epes a(eper eperVar) {
        eyfy build = eperVar.build();
        build.getClass();
        return (epes) build;
    }

    public static final void b(boolean z, eper eperVar) {
        eperVar.copyOnWrite();
        epes epesVar = (epes) eperVar.instance;
        epes epesVar2 = epes.a;
        epesVar.b |= 32;
        epesVar.h = z;
    }

    public static final void c(double d, eper eperVar) {
        eperVar.copyOnWrite();
        epes epesVar = (epes) eperVar.instance;
        epes epesVar2 = epes.a;
        epesVar.b |= 8;
        epesVar.f = d;
    }

    public static final void d(long j, eper eperVar) {
        eperVar.copyOnWrite();
        epes epesVar = (epes) eperVar.instance;
        epes epesVar2 = epes.a;
        epesVar.b |= 4;
        epesVar.e = j;
    }

    public static final void e(epfx epfxVar, eper eperVar) {
        epfxVar.getClass();
        eperVar.copyOnWrite();
        epes epesVar = (epes) eperVar.instance;
        epes epesVar2 = epes.a;
        epesVar.g = epfxVar.s;
        epesVar.b |= 16;
    }

    public static final void f(int i, eper eperVar) {
        eperVar.copyOnWrite();
        epes epesVar = (epes) eperVar.instance;
        epes epesVar2 = epes.a;
        epesVar.b |= 2;
        epesVar.d = i;
    }

    public static final void g(int i, eper eperVar) {
        eperVar.copyOnWrite();
        epes epesVar = (epes) eperVar.instance;
        epes epesVar2 = epes.a;
        epesVar.c = i - 1;
        epesVar.b |= 1;
    }
}
