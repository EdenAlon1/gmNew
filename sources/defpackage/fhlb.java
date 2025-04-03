package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhlb {
    public static final List a(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((fhgt) obj) != fhgt.a) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(ffdx.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((fhgt) it.next()).g);
        }
        return arrayList2;
    }

    public static final boolean b() {
        return ffkj.e("Dalvik", System.getProperty("java.vm.name"));
    }
}
