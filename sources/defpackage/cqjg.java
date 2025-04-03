package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqjg {
    public static final Collection a(cqgj cqgjVar) {
        cqgjVar.getClass();
        eygr eygrVar = cqgjVar.f;
        eygrVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : eygrVar) {
            cqgj cqgjVar2 = (cqgj) obj;
            cqgjVar2.getClass();
            if (g(cqgjVar2)) {
                arrayList.add(obj);
            }
        }
        List am = ffdx.am(arrayList);
        eygr eygrVar2 = cqgjVar.h;
        eygrVar2.getClass();
        am.addAll(eygrVar2);
        if (g(cqgjVar)) {
            cqge cqgeVar = (cqge) cqgjVar.toBuilder();
            cqgeVar.getClass();
            DesugarCollections.unmodifiableList(((cqgj) cqgeVar.instance).f).getClass();
            cqgs.j(cqgeVar);
            DesugarCollections.unmodifiableList(((cqgj) cqgeVar.instance).h).getClass();
            cqgs.i(cqgeVar);
            am.add(cqgs.c(cqgeVar));
        }
        return am;
    }

    public static final boolean b(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (e((cqgj) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static final boolean c(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (f((cqgj) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static final boolean d(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (g((cqgj) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static final boolean e(cqgj cqgjVar) {
        cqgjVar.getClass();
        return cqgjVar.c == 3;
    }

    public static final boolean f(cqgj cqgjVar) {
        cqgjVar.getClass();
        return cqgjVar.c == 4;
    }

    public static final boolean g(cqgj cqgjVar) {
        cqgjVar.getClass();
        return cqgjVar.c == 5;
    }
}
