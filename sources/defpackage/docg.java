package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class docg implements ffjm {
    final /* synthetic */ dodv a;
    final /* synthetic */ dys b;

    public docg(dodv dodvVar, dys dysVar) {
        this.a = dodvVar;
        this.b = dysVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hvi b;
        doco docoVar;
        doco docoVar2;
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hfdVar.v(1699481957);
            dodv dodvVar = this.a;
            if (dodvVar.d == 1 && (docoVar2 = dodvVar.a) != null) {
                docn.c(docoVar2, ioe.a(hvi.e, "horizontal_card_media"), hfdVar, 48, 0);
            }
            hfdVar.o();
            b = dys.b(ioe.a(hvi.e, "horizontal_text_content"), 1.0f, true);
            hvi u = ebs.u(b, 112.0f, 0.0f, 2);
            dodv dodvVar2 = this.a;
            dxq dxqVar = dxu.c;
            int i = huo.a;
            ipn a = dyo.a(dxqVar, hum.j, hfdVar, 0);
            int a2 = hey.a(hfdVar);
            hgb c = hfdVar.c();
            hvi b2 = huz.b(hfdVar, u);
            int i2 = ist.a;
            ffix ffixVar = iss.a;
            hfdVar.M();
            hfdVar.x();
            if (hfdVar.H()) {
                hfdVar.j(ffixVar);
            } else {
                hfdVar.z();
            }
            hlc.b(hfdVar, a, iss.e);
            hlc.b(hfdVar, c, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfdVar.y(valueOf);
                hfdVar.h(valueOf, ffjmVar);
            }
            hlc.b(hfdVar, b2, iss.c);
            dodp.f(dodvVar2, hfdVar, 0);
            hfdVar.n();
            dodv dodvVar3 = this.a;
            if (dodvVar3.d == 2 && (docoVar = dodvVar3.a) != null) {
                docn.c(docoVar, ioe.a(hvi.e, "horizontal_card_media"), hfdVar, 48, 0);
            }
        }
        return ffcu.a;
    }
}
