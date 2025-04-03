package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class boh {
    public static String a(int i) {
        ArrayList arrayList = new ArrayList();
        if ((i & 4) != 0) {
            arrayList.add("IMAGE_CAPTURE");
        }
        if ((i & 1) != 0) {
            arrayList.add("PREVIEW");
        }
        if ((i & 2) != 0) {
            arrayList.add("VIDEO_CAPTURE");
        }
        return bog.a("|", arrayList);
    }

    public static void b(Collection collection, int i) {
        boolean contains = collection.contains(Integer.valueOf(i));
        Locale locale = Locale.US;
        String a = a(i);
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(a(((Integer) it.next()).intValue()));
        }
        ksw.b(contains, String.format(locale, "Effects target %s is not in the supported list %s.", a, "[" + bog.a(", ", arrayList) + "]"));
    }
}
