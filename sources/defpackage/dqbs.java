package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqbs implements ffjo {
    final /* synthetic */ olu a;
    final /* synthetic */ dpzw b;
    final /* synthetic */ hkx c;

    public dqbs(olu oluVar, dpzw dpzwVar, hkx hkxVar) {
        this.a = oluVar;
        this.b = dpzwVar;
        this.c = hkxVar;
    }

    @Override // defpackage.ffjo
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        hvi a;
        int intValue = ((Number) obj2).intValue();
        hfd hfdVar = (hfd) obj3;
        int intValue2 = ((Number) obj4).intValue();
        ((efx) obj).getClass();
        if ((intValue2 & 48) == 0) {
            intValue2 |= true != hfdVar.B(intValue) ? 16 : 32;
        }
        if ((intValue2 & 145) == 144 && hfdVar.I()) {
            hfdVar.s();
        } else {
            Object f = this.a.f(intValue);
            if (f == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            final drnm drnmVar = (drnm) f;
            hve hveVar = hvi.e;
            hfdVar.v(504110518);
            boolean F = hfdVar.F(this.b) | hfdVar.F(drnmVar);
            final dpzw dpzwVar = this.b;
            Object f2 = hfdVar.f();
            if (F || f2 == hfc.a) {
                f2 = new ffix() { // from class: dqbr
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        dpzw.this.e.invoke(drnmVar);
                        return ffcu.a;
                    }
                };
                hfdVar.y(f2);
            }
            hfdVar.o();
            a = dee.a(dfb.g(hveVar, false, null, (ffix) f2, 127), gft.a(hfdVar).G, idb.a);
            dqbw.f(a, drnmVar, ((List) this.c.a()).indexOf(drnmVar), hfdVar, 0);
        }
        return ffcu.a;
    }
}
