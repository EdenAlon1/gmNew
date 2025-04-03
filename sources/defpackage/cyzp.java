package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyzp implements ffjn {
    final /* synthetic */ cyyj a;
    final /* synthetic */ cvo b;
    final /* synthetic */ List c;
    final /* synthetic */ crw d;

    public cyzp(cyyj cyyjVar, cvo cvoVar, List list, crw crwVar) {
        this.a = cyyjVar;
        this.b = cvoVar;
        this.c = list;
        this.d = crwVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((ebe) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else if (this.a.f.b) {
            hfdVar.v(-1184523896);
            cvo cvoVar = this.b;
            List list = this.c;
            cyyj cyyjVar = this.a;
            czah.h(cvoVar, list, cyyjVar.c, cyyjVar.e, !cyyjVar.f.a, this.d, hfdVar, 0);
            hfdVar.o();
        } else {
            hfdVar.v(-1184216438);
            cvo cvoVar2 = this.b;
            List list2 = this.c;
            cyyj cyyjVar2 = this.a;
            czah.g(cvoVar2, list2, cyyjVar2.c, cyyjVar2.e, !cyyjVar2.f.a, this.d, hfdVar, 0);
            hfdVar.o();
        }
        return ffcu.a;
    }
}
