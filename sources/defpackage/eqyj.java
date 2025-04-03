package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqyj {
    public static final /* synthetic */ eqfs a(eqfr eqfrVar) {
        eyfy build = eqfrVar.build();
        build.getClass();
        return (eqfs) build;
    }

    public static final void b(boolean z, eqfr eqfrVar) {
        eqfrVar.copyOnWrite();
        eqfs eqfsVar = (eqfs) eqfrVar.instance;
        eqfs eqfsVar2 = eqfs.a;
        eqfsVar.b |= 4;
        eqfsVar.e = z;
    }

    public static final void c(boolean z, eqfr eqfrVar) {
        eqfrVar.copyOnWrite();
        eqfs eqfsVar = (eqfs) eqfrVar.instance;
        eqfs eqfsVar2 = eqfs.a;
        eqfsVar.b |= 1;
        eqfsVar.c = z;
    }

    public static final void d(String str, eqfr eqfrVar) {
        eqfrVar.copyOnWrite();
        eqfs eqfsVar = (eqfs) eqfrVar.instance;
        eqfs eqfsVar2 = eqfs.a;
        eqfsVar.b |= 2;
        eqfsVar.d = str;
    }
}
