package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gsc extends ffkk implements ffjm {
    final /* synthetic */ cmw a;
    final /* synthetic */ ftb b;
    final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gsc(cmw cmwVar, ftb ftbVar, boolean z) {
        super(2);
        this.a = cmwVar;
        this.b = ftbVar;
        this.c = z;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hvi c;
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hfdVar.v(1547119835);
            cmw cmwVar = this.a;
            ftb ftbVar = this.b;
            boolean z = this.c;
            int i = cmwVar.b;
            for (int i2 = 0; i2 < i; i2++) {
                int a = (!ftbVar.k() || guk.b(ftbVar.f(), 1)) ? cmwVar.a(i2) : cmwVar.a(i2) % 12;
                hve hveVar = hvi.e;
                boolean B = hfdVar.B(i2);
                Object f = hfdVar.f();
                if (B || f == hfc.a) {
                    f = new grz(i2);
                    hfdVar.y(f);
                }
                c = jjs.c(hveVar, false, (ffji) f);
                guj.k(c, ftbVar, a, z, hfdVar, 0);
            }
            hfdVar.o();
            if (guk.b(this.b.f(), 0) && this.b.k()) {
                hfdVar.v(716797954);
                hvi a2 = dee.a(ebs.k(ioe.a(hvi.e, gey.b), 256.0f), ibw.g, eqm.a);
                ftb ftbVar2 = this.b;
                boolean z2 = this.c;
                float f2 = guj.a;
                guj.B(a2, 0.26953125f, hpx.d(-1385767514, new gsb(ftbVar2, z2), hfdVar), hfdVar, 432);
                hfdVar.o();
            } else {
                hfdVar.v(717715709);
                hfdVar.o();
            }
        }
        return ffcu.a;
    }
}
