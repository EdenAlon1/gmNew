package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnlv implements ffjm {
    final /* synthetic */ String a;
    final /* synthetic */ dnlz b;

    public dnlv(String str, dnlz dnlzVar) {
        this.a = str;
        this.b = dnlzVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            String str = this.a;
            dnlz dnlzVar = this.b;
            hfdVar.v(397227782);
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : dnlzVar.d) {
                if (((dnld) obj3).b == 2) {
                    arrayList.add(obj3);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ffdx.w(arrayList2, ((dnld) it.next()).a);
            }
            hfdVar.o();
            dnly.b(str, arrayList2, hfdVar, 0);
        }
        return ffcu.a;
    }
}
