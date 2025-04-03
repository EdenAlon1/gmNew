package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gid extends ffkk implements ffjm {
    final /* synthetic */ ffjm a;
    final /* synthetic */ cxj b;
    final /* synthetic */ gmk c;
    final /* synthetic */ ffjm d;
    final /* synthetic */ ffix e;
    final /* synthetic */ ffsk f;
    final /* synthetic */ boolean g;
    final /* synthetic */ ffjn h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gid(ffjm ffjmVar, cxj cxjVar, gmk gmkVar, ffjm ffjmVar2, ffix ffixVar, ffsk ffskVar, boolean z, ffjn ffjnVar) {
        super(2);
        this.a = ffjmVar;
        this.b = cxjVar;
        this.c = gmkVar;
        this.d = ffjmVar2;
        this.e = ffixVar;
        this.f = ffskVar;
        this.g = z;
        this.h = ffjnVar;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [ecd, java.lang.Object] */
    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hvi d;
        dys dysVar;
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            d = ebs.d(hvi.e, 1.0f);
            hvi b = ecm.b(d, this.a.a(hfdVar, 0));
            boolean F = hfdVar.F(this.b);
            cxj cxjVar = this.b;
            Object f = hfdVar.f();
            if (F || f == hfc.a) {
                f = new ght(cxjVar);
                hfdVar.y(f);
            }
            hvi a = fvm.a(icf.a(b, (ffji) f), this.c);
            ffjm ffjmVar = this.d;
            gmk gmkVar = this.c;
            ffix ffixVar = this.e;
            ffsk ffskVar = this.f;
            boolean z = this.g;
            ffjn ffjnVar = this.h;
            dxq dxqVar = dxu.c;
            int i = huo.a;
            ipn a2 = dyo.a(dxqVar, hum.j, hfdVar, 0);
            int a3 = hey.a(hfdVar);
            hgb c = hfdVar.c();
            hvi b2 = huz.b(hfdVar, a);
            int i2 = ist.a;
            ffix ffixVar2 = iss.a;
            hfdVar.M();
            hfdVar.x();
            if (hfdVar.H()) {
                hfdVar.j(ffixVar2);
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
            hlc.b(hfdVar, b2, iss.c);
            dys dysVar2 = dys.a;
            if (ffjmVar != null) {
                hfdVar.v(809904841);
                String b3 = hcb.b(R.string.m3c_bottom_sheet_collapse_description, hfdVar);
                String b4 = hcb.b(R.string.m3c_bottom_sheet_dismiss_description, hfdVar);
                String b5 = hcb.b(R.string.m3c_bottom_sheet_expand_description, hfdVar);
                hvi a4 = dys.a(hvi.e, hum.k);
                boolean D = hfdVar.D(gmkVar) | hfdVar.D(ffixVar) | hfdVar.F(ffskVar);
                Object f2 = hfdVar.f();
                if (D || f2 == hfc.a) {
                    f2 = new ghw(gmkVar, ffixVar, ffskVar);
                    hfdVar.y(f2);
                }
                dysVar = dysVar2;
                hvi d2 = dfb.d(a4, false, null, (ffix) f2, 7);
                boolean E = hfdVar.E(z) | hfdVar.D(gmkVar) | hfdVar.D(b4) | hfdVar.D(ffixVar) | hfdVar.D(b5) | hfdVar.F(ffskVar) | hfdVar.D(b3);
                Object f3 = hfdVar.f();
                if (E || f3 == hfc.a) {
                    gic gicVar = new gic(z, gmkVar, b4, b5, b3, ffixVar, ffskVar);
                    hfdVar.y(gicVar);
                    f3 = gicVar;
                }
                hvi c2 = jjs.c(d2, true, (ffji) f3);
                ipn a5 = dyc.a(hum.a, false);
                int a6 = hey.a(hfdVar);
                hgb c3 = hfdVar.c();
                hvi b6 = huz.b(hfdVar, c2);
                ffix ffixVar3 = iss.a;
                hfdVar.M();
                hfdVar.x();
                if (hfdVar.H()) {
                    hfdVar.j(ffixVar3);
                } else {
                    hfdVar.z();
                }
                hlc.b(hfdVar, a5, iss.e);
                hlc.b(hfdVar, c3, iss.d);
                ffjm ffjmVar3 = iss.f;
                if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a6))) {
                    Integer valueOf2 = Integer.valueOf(a6);
                    hfdVar.y(valueOf2);
                    hfdVar.h(valueOf2, ffjmVar3);
                }
                hlc.b(hfdVar, b6, iss.c);
                ffjmVar.a(hfdVar, 0);
                hfdVar.n();
                hfdVar.o();
            } else {
                dysVar = dysVar2;
                hfdVar.v(812807061);
                hfdVar.o();
            }
            ffjnVar.a(dysVar, hfdVar, 6);
            hfdVar.n();
        }
        return ffcu.a;
    }
}
