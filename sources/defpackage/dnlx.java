package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnlx implements ffjm {
    final /* synthetic */ dnlz a;

    public dnlx(dnlz dnlzVar) {
        this.a = dnlzVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dnlz dnlzVar = this.a;
            hfdVar.v(1436262370);
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : dnlzVar.d) {
                if (((dnld) obj3).b == 1) {
                    arrayList.add(obj3);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ffdx.w(arrayList2, ((dnld) it.next()).a);
            }
            String str = dnlzVar.a;
            hfdVar.o();
            dnly.b(str, arrayList2, hfdVar, 0);
        }
        return ffcu.a;
    }
}
