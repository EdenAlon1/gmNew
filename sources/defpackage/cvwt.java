package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvwt extends ffkk implements ffjo {
    final /* synthetic */ List a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvwt(List list) {
        super(4);
        this.a = list;
    }

    @Override // defpackage.ffjo
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        hvi d;
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
            cvwg cvwgVar = (cvwg) this.a.get(intValue);
            hfdVar.v(-421274787);
            int i2 = huo.a;
            hus husVar = hum.n;
            d = ebs.d(hvi.e, 1.0f);
            hfdVar.v(-706320048);
            Object f = hfdVar.f();
            if (f == hfc.a) {
                f = new dwn();
                hfdVar.y(f);
            }
            hfdVar.o();
            hvi c = dfb.c(d, (dwn) f, fmn.a(true, 0.0f, 6), false, null, null, cvwgVar.c, 28);
            ipn a = ebm.a(dxu.a, husVar, hfdVar, 48);
            int a2 = hey.a(hfdVar);
            hgb c2 = hfdVar.c();
            hvi b = huz.b(hfdVar, c);
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
            hlc.b(hfdVar, c2, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfdVar.y(valueOf);
                hfdVar.h(valueOf, ffjmVar);
            }
            hlc.b(hfdVar, b, iss.c);
            dwfq.a(cvwgVar.b, null, ebs.m(hvi.e, 40.0f, 40.0f), true, null, null, hfdVar, 3504, 48);
            dwjt.b(cvwgVar.a, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, hfdVar, 0, 0, 131070);
            hfdVar.n();
            hfdVar.o();
        } else {
            hfdVar.s();
        }
        return ffcu.a;
    }
}
