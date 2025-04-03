package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fsv extends ffkk implements ffjm {
    final /* synthetic */ hvi a;
    final /* synthetic */ ffjm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fsv(hvi hviVar, ffjm ffjmVar) {
        super(2);
        this.a = hviVar;
        this.b = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hvi c;
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            String b = hcb.b(R.string.m3c_dialog, hfdVar);
            hvi hviVar = this.a;
            ebe ebeVar = fsx.a;
            hvi w = ebs.w(hviVar, 280.0f, 0.0f, 560.0f, 0.0f, 10);
            hve hveVar = hvi.e;
            boolean D = hfdVar.D(b);
            Object f = hfdVar.f();
            if (D || f == hfc.a) {
                f = new fsu(b);
                hfdVar.y(f);
            }
            c = jjs.c(hveVar, false, (ffji) f);
            hvi a = w.a(c);
            ffjm ffjmVar = this.b;
            int i = huo.a;
            ipn a2 = dyc.a(hum.a, true);
            int a3 = hey.a(hfdVar);
            hgb c2 = hfdVar.c();
            hvi b2 = huz.b(hfdVar, a);
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
            hlc.b(hfdVar, c2, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                hfdVar.y(valueOf);
                hfdVar.h(valueOf, ffjmVar2);
            }
            hlc.b(hfdVar, b2, iss.c);
            ffjmVar.a(hfdVar, 0);
            hfdVar.n();
        }
        return ffcu.a;
    }
}
