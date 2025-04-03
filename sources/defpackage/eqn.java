package defpackage;

import androidx.compose.foundation.layout.SizeElement;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eqn extends ffkk implements ffjm {
    final /* synthetic */ long a;
    final /* synthetic */ hvi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eqn(long j, hvi hviVar) {
        super(2);
        this.a = j;
        this.b = hviVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hvi a;
        hfd hfdVar = (hfd) obj;
        int intValue = ((Number) obj2).intValue();
        int i = intValue & 3;
        if (!hfdVar.J(i != 2, intValue & 1)) {
            hfdVar.s();
        } else if (this.a != 9205357640488583168L) {
            hfdVar.v(1828931592);
            hvi hviVar = this.b;
            long j = this.a;
            a = hviVar.a(new SizeElement(jzv.b(j), jzv.a(j), Float.NaN, Float.NaN, false));
            int i2 = huo.a;
            ipn a2 = dyc.a(hum.b, false);
            int a3 = hey.a(hfdVar);
            hgb c = hfdVar.c();
            hvi b = huz.b(hfdVar, a);
            int i3 = ist.a;
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
            equ.a(null, hfdVar, 0, 1);
            hfdVar.n();
            hfdVar.o();
        } else {
            hfdVar.v(1829298756);
            equ.a(this.b, hfdVar, 0, 0);
            hfdVar.o();
        }
        return ffcu.a;
    }
}
