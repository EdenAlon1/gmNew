package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gqg extends ffkk implements ffjm {
    final /* synthetic */ dji a;
    final /* synthetic */ float b;
    final /* synthetic */ ffjm c;
    final /* synthetic */ ffjm d;
    final /* synthetic */ ffjn e;
    final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gqg(dji djiVar, float f, ffjm ffjmVar, ffjm ffjmVar2, ffjn ffjnVar, int i) {
        super(2);
        this.a = djiVar;
        this.b = f;
        this.c = ffjmVar;
        this.d = ffjmVar2;
        this.e = ffjnVar;
        this.f = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hvi d;
        hvi c;
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            Object f = hfdVar.f();
            if (f == hfc.a) {
                Object hgdVar = new hgd(hgs.a(ffhe.a, hfdVar));
                hfdVar.y(hgdVar);
                f = hgdVar;
            }
            ffsk ffskVar = ((hgd) f).a;
            cyq a = gjb.a(1, hfdVar);
            boolean D = hfdVar.D(this.a) | hfdVar.D(ffskVar);
            dji djiVar = this.a;
            Object f2 = hfdVar.f();
            if (D || f2 == hfc.a) {
                f2 = new glo(djiVar, ffskVar, a);
                hfdVar.y(f2);
            }
            glo gloVar = (glo) f2;
            d = ebs.d(hvi.e, 1.0f);
            int i = huo.a;
            c = dix.c(ebs.z(d, hum.d, 2), this.a, false, true, false);
            hvi b = hxo.b(epp.a(c));
            boolean A = hfdVar.A(this.b) | hfdVar.D(this.c) | hfdVar.D(this.d) | hfdVar.D(this.e) | hfdVar.F(gloVar) | hfdVar.B(this.f);
            float f3 = this.b;
            ffjm ffjmVar = this.c;
            ffjm ffjmVar2 = this.d;
            int i2 = this.f;
            ffjn ffjnVar = this.e;
            Object f4 = hfdVar.f();
            if (A || f4 == hfc.a) {
                Object gqfVar = new gqf(f3, ffjmVar, ffjmVar2, gloVar, i2, ffjnVar);
                hfdVar.y(gqfVar);
                f4 = gqfVar;
            }
            ira.a(b, (ffjm) f4, hfdVar, 0, 0);
        }
        return ffcu.a;
    }
}
