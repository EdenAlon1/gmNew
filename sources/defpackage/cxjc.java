package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxjc implements ffjm {
    final /* synthetic */ cxjj a;

    public cxjc(cxjj cxjjVar) {
        this.a = cxjjVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            cxln cxlnVar = (cxln) this.a.b.a();
            hfdVar.v(1179076340);
            boolean F = hfdVar.F(this.a);
            final cxjj cxjjVar = this.a;
            Object f = hfdVar.f();
            if (F || f == hfc.a) {
                f = new ffix() { // from class: cxja
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        eg fe = cxjj.this.a.fe();
                        fe.setResult(-1);
                        fe.finish();
                        return ffcu.a;
                    }
                };
                hfdVar.y(f);
            }
            ffix ffixVar = (ffix) f;
            hfdVar.o();
            hfdVar.v(1179076914);
            boolean F2 = hfdVar.F(this.a);
            final cxjj cxjjVar2 = this.a;
            Object f2 = hfdVar.f();
            if (F2 || f2 == hfc.a) {
                f2 = new ffix() { // from class: cxjb
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        eg fe = cxjj.this.a.fe();
                        fe.setResult(0);
                        fe.finish();
                        return ffcu.a;
                    }
                };
                hfdVar.y(f2);
            }
            ffix ffixVar2 = (ffix) f2;
            hfdVar.o();
            ffixVar.getClass();
            ffixVar2.getClass();
            cxlc cxlcVar = cxlnVar.a;
            cxlm.c(fgdm.a(new cxlf(ffixVar, ffixVar2)), hfdVar, 0);
        }
        return ffcu.a;
    }
}
