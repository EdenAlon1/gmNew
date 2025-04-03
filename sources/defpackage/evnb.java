package defpackage;

import java.lang.reflect.AccessibleObject;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evnb {
    public static boolean a(AccessibleObject accessibleObject, Object obj) {
        return evna.b.a(accessibleObject, obj);
    }

    public static int b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int a = ((evlc) it.next()).a();
            if (a != 2) {
                return a;
            }
        }
        return 1;
    }
}
