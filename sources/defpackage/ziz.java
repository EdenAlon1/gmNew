package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ziz extends ffkk implements ffjo {
    final /* synthetic */ List a;
    final /* synthetic */ int b;
    final /* synthetic */ hjz c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ziz(List list, int i, hjz hjzVar) {
        super(4);
        this.a = list;
        this.b = i;
        this.c = hjzVar;
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
            zhr zhrVar = (zhr) this.a.get(intValue);
            hfdVar.v(724190565);
            hfdVar.v(161909680);
            int i2 = this.b;
            hvi hviVar = hvi.e;
            if (intValue == i2 - 1) {
                hve hveVar = hvi.e;
                hfdVar.v(-1617315844);
                Object f = hfdVar.f();
                if (f == hfc.a) {
                    ziu ziuVar = new ziu(this.c);
                    hfdVar.y(ziuVar);
                    f = ziuVar;
                }
                hfdVar.o();
                hviVar = ipx.a(hveVar, (ffji) f);
            }
            hfdVar.o();
            zhrVar.getClass();
            zjc.a(hviVar, zhrVar, hfdVar, 0);
            hfdVar.o();
        } else {
            hfdVar.s();
        }
        return ffcu.a;
    }
}
