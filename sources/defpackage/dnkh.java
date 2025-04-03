package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnkh implements ffjn {
    final /* synthetic */ List a;
    final /* synthetic */ ffix b;

    public dnkh(List list, ffix ffixVar) {
        this.a = list;
        this.b = ffixVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((dys) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                dnkk.c((dnkm) it.next(), this.b, hfdVar, 0);
            }
        }
        return ffcu.a;
    }
}
