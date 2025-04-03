package defpackage;

import j$.util.DesugarCollections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class edxn {
    /* JADX WARN: Multi-variable type inference failed */
    static int a(edvk edvkVar, emsj emsjVar) {
        int i = 0;
        int i2 = 1;
        for (int i3 = 0; i3 < edvkVar.a().size(); i3++) {
            Integer num = (Integer) edvkVar.a().get(i3);
            int intValue = num.intValue();
            emsh emshVar = (emsh) emsjVar.d.get(i3);
            int i4 = emshVar.c;
            if (i4 == 0) {
                engr engrVar = new engr();
                for (Integer num2 : enoe.a.e(DesugarCollections.unmodifiableMap(emshVar.b).keySet())) {
                    num2.intValue();
                    engrVar.h(num2);
                }
                engw g = engrVar.g();
                for (int i5 = 0; i5 < ((enou) g).c; i5++) {
                    if (intValue == ((Integer) g.get(i5)).intValue()) {
                        intValue = i5;
                    }
                }
                throw new edxl(String.format("event_code %s was not found in the dimension's event codes", num));
            }
            if (intValue > i4) {
                throw new edxl(String.format("event_code %s is larger than max_event_code %s", num, Integer.valueOf(emshVar.c)));
            }
            i += intValue * i2;
            i2 *= c(emshVar);
        }
        return i;
    }

    static int b(List list) {
        Iterator it = list.iterator();
        int i = 1;
        while (it.hasNext()) {
            i *= c((emsh) it.next());
        }
        return i;
    }

    private static int c(emsh emshVar) {
        int i = emshVar.c;
        return i != 0 ? i + 1 : emshVar.b.size();
    }
}
