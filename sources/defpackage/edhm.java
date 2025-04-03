package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edhm {
    public static String a(List list, boolean z, List list2) {
        if (list.isEmpty()) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (z) {
                str = "places.".concat(String.valueOf(str));
            }
            arrayList.add(str);
        }
        if (!list.contains("attributions")) {
            arrayList.add(true == z ? "places.attributions" : "attributions");
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList.add(((edhl) it2.next()).toString());
        }
        return new emww(",").b(arrayList);
    }

    public static String b(List list, List list2) {
        return a(list, true, list2);
    }
}
