package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fxd extends ffkk implements ffjm {
    final /* synthetic */ float a;
    final /* synthetic */ idh b;
    final /* synthetic */ ffjm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxd(float f, idh idhVar, ffjm ffjmVar) {
        super(2);
        this.a = f;
        this.b = idhVar;
        this.c = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            float f = this.a;
            hve hveVar = hvi.e;
            boolean A = hfdVar.A(f) | hfdVar.D(this.b);
            float f2 = this.a;
            idh idhVar = this.b;
            Object f3 = hfdVar.f();
            if (A || f3 == hfc.a) {
                f3 = new fxc(f2, idhVar);
                hfdVar.y(f3);
            }
            hvi a = icf.a(hveVar, (ffji) f3);
            int i = huo.a;
            ffjm ffjmVar = this.c;
            ipn a2 = dyc.a(hum.e, false);
            int a3 = hey.a(hfdVar);
            hgb c = hfdVar.c();
            hvi b = huz.b(hfdVar, a);
            int i2 = ist.a;
            ffix ffixVar = iss.a;
            hfdVar.M();
            hfdVar.x();
            if (hfdVar.H()) {
                hfdVar.j(ffixVar);
            } else {
                hfdVar.z();
            }
            hlc.b(hfdVar, a2, iss.e);
            hlc.b(hfdVar, c, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                hfdVar.y(valueOf);
                hfdVar.h(valueOf, ffjmVar2);
            }
            hlc.b(hfdVar, b, iss.c);
            ffjmVar.a(hfdVar, 0);
            hfdVar.n();
        }
        return ffcu.a;
    }
}
