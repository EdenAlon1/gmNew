package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahzz implements ffjo {
    final /* synthetic */ List a;

    public ahzz(List list) {
        this.a = list;
    }

    @Override // defpackage.ffjo
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj2).intValue();
        hfd hfdVar = (hfd) obj3;
        int intValue2 = ((Number) obj4).intValue();
        ((edi) obj).getClass();
        if ((intValue2 & 48) == 0) {
            intValue2 |= true != hfdVar.B(intValue) ? 16 : 32;
        }
        if ((intValue2 & 145) == 144 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dngx dngxVar = ((aibb) this.a.get(intValue)).b;
            hve hveVar = hvi.e;
            hfdVar.v(435538500);
            hfdVar.o();
            hfdVar.v(435544706);
            hfdVar.o();
            dngm.t(dngxVar, hveVar, hfdVar, 0, 0);
        }
        return ffcu.a;
    }
}
