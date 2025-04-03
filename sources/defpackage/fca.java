package defpackage;

import androidx.compose.foundation.layout.SizeElement;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fca extends ffkk implements ffjm {
    final /* synthetic */ long a;
    final /* synthetic */ boolean b;
    final /* synthetic */ hvi c;
    final /* synthetic */ fcu d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fca(long j, boolean z, hvi hviVar, fcu fcuVar) {
        super(2);
        this.a = j;
        this.b = z;
        this.c = hviVar;
        this.d = fcuVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hvi a;
        hfd hfdVar = (hfd) obj;
        int intValue = ((Number) obj2).intValue();
        if (!hfdVar.J((intValue & 3) != 2, intValue & 1)) {
            hfdVar.s();
        } else if (this.a != 9205357640488583168L) {
            hfdVar.v(-837626688);
            dxi dxiVar = this.b ? dxe.b : dxe.a;
            hvi hviVar = this.c;
            long j = this.a;
            a = hviVar.a(new SizeElement(jzv.b(j), jzv.a(j), Float.NaN, Float.NaN, false));
            fcu fcuVar = this.d;
            boolean z = this.b;
            int i = huo.a;
            ipn a2 = ebm.a(dxiVar, hum.m, hfdVar, 0);
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
            ffjm ffjmVar = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                hfdVar.y(valueOf);
                hfdVar.h(valueOf, ffjmVar);
            }
            hlc.b(hfdVar, b, iss.c);
            hve hveVar = hvi.e;
            boolean F = hfdVar.F(fcuVar);
            Object f = hfdVar.f();
            if (F || f == hfc.a) {
                f = new fby(fcuVar);
                hfdVar.y(f);
            }
            fci.c(hveVar, (ffix) f, z, hfdVar, 6);
            hfdVar.n();
            hfdVar.o();
        } else {
            hfdVar.v(-836697680);
            hvi hviVar2 = this.c;
            boolean F2 = hfdVar.F(this.d);
            fcu fcuVar2 = this.d;
            Object f2 = hfdVar.f();
            if (F2 || f2 == hfc.a) {
                f2 = new fbz(fcuVar2);
                hfdVar.y(f2);
            }
            fci.c(hviVar2, (ffix) f2, this.b, hfdVar, 0);
            hfdVar.o();
        }
        return ffcu.a;
    }
}
