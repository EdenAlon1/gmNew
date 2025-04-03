package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erbb {
    public static final /* synthetic */ eprw a(eprv eprvVar) {
        eyfy build = eprvVar.build();
        build.getClass();
        return (eprw) build;
    }

    public static final void b(int i, eprv eprvVar) {
        eprvVar.copyOnWrite();
        eprw eprwVar = (eprw) eprvVar.instance;
        eprw eprwVar2 = eprw.a;
        eprwVar.b |= 1;
        eprwVar.c = i;
    }

    public static final void c(eprv eprvVar) {
        eprvVar.copyOnWrite();
        eprw eprwVar = (eprw) eprvVar.instance;
        eprw eprwVar2 = eprw.a;
        eprwVar.b |= 2;
        eprwVar.d = true;
    }
}
