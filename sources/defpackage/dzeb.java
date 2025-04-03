package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzeb {
    public static dzqb a(fbii fbiiVar) {
        dzqa f = dzqb.f();
        f.c(fbiiVar.d);
        f.f(fbiiVar.e);
        f.d(fbiiVar.c.I());
        f.e(fbiiVar.g);
        if ((fbiiVar.b & 1) != 0) {
            faul faulVar = fbiiVar.f;
            if (faulVar == null) {
                faulVar = faul.a;
            }
            f.b(dzds.a(faulVar));
        }
        return f.a();
    }

    public static fbii b(dzqb dzqbVar) {
        fbih fbihVar = (fbih) fbii.a.createBuilder();
        eyee x = eyee.x(dzqbVar.e());
        fbihVar.copyOnWrite();
        ((fbii) fbihVar.instance).c = x;
        int a = dzqbVar.a();
        fbihVar.copyOnWrite();
        ((fbii) fbihVar.instance).d = a;
        int b = dzqbVar.b();
        fbihVar.copyOnWrite();
        ((fbii) fbihVar.instance).e = b;
        String d = dzqbVar.d();
        fbihVar.copyOnWrite();
        fbii fbiiVar = (fbii) fbihVar.instance;
        d.getClass();
        fbiiVar.g = d;
        if (dzqbVar.c().g()) {
            faul b2 = dzds.b(((Integer) dzqbVar.c().c()).intValue());
            fbihVar.copyOnWrite();
            fbii fbiiVar2 = (fbii) fbihVar.instance;
            b2.getClass();
            fbiiVar2.f = b2;
            fbiiVar2.b |= 1;
        }
        return (fbii) fbihVar.build();
    }
}
