package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epoh {
    public static final /* synthetic */ epol a(epok epokVar) {
        eyfy build = epokVar.build();
        build.getClass();
        return (epol) build;
    }

    public static final void b(eyee eyeeVar, epok epokVar) {
        epokVar.copyOnWrite();
        epol epolVar = (epol) epokVar.instance;
        epol epolVar2 = epol.a;
        epolVar.b |= 2;
        epolVar.f = eyeeVar;
    }

    public static final void c(epok epokVar) {
        epokVar.copyOnWrite();
        epol epolVar = (epol) epokVar.instance;
        epol epolVar2 = epol.a;
        epolVar.e = 1;
        epolVar.b = 1 | epolVar.b;
    }
}
