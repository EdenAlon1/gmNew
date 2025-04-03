package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fvf extends ffkk implements ffjm {
    final /* synthetic */ gmk a;
    final /* synthetic */ ffjm b;
    final /* synthetic */ ffsk c;
    final /* synthetic */ boolean d;
    final /* synthetic */ ffjn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fvf(gmk gmkVar, ffjm ffjmVar, ffsk ffskVar, boolean z, ffjn ffjnVar) {
        super(2);
        this.a = gmkVar;
        this.b = ffjmVar;
        this.c = ffskVar;
        this.d = z;
        this.e = ffjnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hvi d;
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            d = ebs.d(hvi.e, 1.0f);
            hvi a = fvm.a(d, this.a);
            ffjm ffjmVar = this.b;
            gmk gmkVar = this.a;
            ffsk ffskVar = this.c;
            boolean z = this.d;
            ffjn ffjnVar = this.e;
            dxq dxqVar = dxu.c;
            int i = huo.a;
            ipn a2 = dyo.a(dxqVar, hum.j, hfdVar, 0);
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
            dys dysVar = dys.a;
            if (ffjmVar != null) {
                hfdVar.v(-1848575102);
                String b2 = hcb.b(R.string.m3c_bottom_sheet_collapse_description, hfdVar);
                String b3 = hcb.b(R.string.m3c_bottom_sheet_dismiss_description, hfdVar);
                String b4 = hcb.b(R.string.m3c_bottom_sheet_expand_description, hfdVar);
                hvi a4 = dys.a(hvi.e, hum.k);
                boolean D = hfdVar.D(gmkVar) | hfdVar.F(ffskVar);
                Object f = hfdVar.f();
                if (D || f == hfc.a) {
                    f = new fux(gmkVar, ffskVar);
                    hfdVar.y(f);
                }
                hvi d2 = dfb.d(a4, false, null, (ffix) f, 7);
                boolean D2 = hfdVar.D(gmkVar) | hfdVar.E(z) | hfdVar.D(b4) | hfdVar.F(ffskVar) | hfdVar.D(b2) | hfdVar.D(b3);
                Object f2 = hfdVar.f();
                if (D2 || f2 == hfc.a) {
                    fve fveVar = new fve(gmkVar, z, b4, b2, b3, ffskVar);
                    hfdVar.y(fveVar);
                    f2 = fveVar;
                }
                hvi c2 = jjs.c(d2, true, (ffji) f2);
                ipn a5 = dyc.a(hum.a, false);
                int a6 = hey.a(hfdVar);
                hgb c3 = hfdVar.c();
                hvi b5 = huz.b(hfdVar, c2);
                ffix ffixVar2 = iss.a;
                hfdVar.M();
                hfdVar.x();
                if (hfdVar.H()) {
                    hfdVar.j(ffixVar2);
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
                hlc.b(hfdVar, b5, iss.c);
                ffjmVar.a(hfdVar, 0);
                hfdVar.n();
                hfdVar.o();
            } else {
                hfdVar.v(-1845178928);
                hfdVar.o();
            }
            ffjnVar.a(dysVar, hfdVar, 6);
            hfdVar.n();
        }
        return ffcu.a;
    }
}
