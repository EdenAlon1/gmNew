package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpww extends ffkk implements ffjo {
    final /* synthetic */ List a;
    final /* synthetic */ boolean b;
    final /* synthetic */ float c;
    final /* synthetic */ ffji d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpww(List list, boolean z, float f, ffji ffjiVar) {
        super(4);
        this.a = list;
        this.b = z;
        this.c = f;
        this.d = ffjiVar;
    }

    @Override // defpackage.ffjo
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        edi ediVar = (edi) obj;
        int intValue = ((Number) obj2).intValue();
        hfd hfdVar = (hfd) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i = (true != hfdVar.D(ediVar) ? 2 : 4) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= true != hfdVar.B(intValue) ? 16 : 32;
        }
        if (hfdVar.J((i & 147) != 146, i & 1)) {
            dpwn dpwnVar = (dpwn) this.a.get(intValue);
            hfdVar.v(195382866);
            boolean z = dpwnVar.c;
            hvi d = eba.d(hvi.e, 8.0f);
            int i2 = huo.a;
            ipn a = dyc.a(hum.a, false);
            int a2 = hey.a(hfdVar);
            hgb c = hfdVar.c();
            hvi b = huz.b(hfdVar, d);
            int i3 = ist.a;
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
            hlc.b(hfdVar, b, iss.c);
            boolean z2 = dpwnVar.e;
            hvi k = ebs.k(hvi.e, 52.0f);
            boolean z3 = this.b;
            float f = this.c;
            hfdVar.v(-837654103);
            boolean E = hfdVar.E(z) | hfdVar.E(this.b) | hfdVar.D(this.d) | hfdVar.F(dpwnVar);
            Object f2 = hfdVar.f();
            if (E || f2 == hfc.a) {
                dpwu dpwuVar = new dpwu(z, this.b, this.d, dpwnVar);
                hfdVar.y(dpwuVar);
                f2 = dpwuVar;
            }
            hfdVar.o();
            dpwy.b(dpwnVar, z, z3, z2, f, k, (ffix) f2, hfdVar, 196608);
            hfdVar.n();
            hfdVar.o();
        } else {
            hfdVar.s();
        }
        return ffcu.a;
    }
}
