package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfx {
    private final List a;

    public bfx(List list) {
        this.a = new ArrayList(list);
    }

    public static String b(bfx bfxVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = bfxVar.a.iterator();
        while (it.hasNext()) {
            arrayList.add(((bfr) it.next()).getClass().getSimpleName());
        }
        StringBuilder sb = new StringBuilder();
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            while (true) {
                sb.append((CharSequence) it2.next());
                if (!it2.hasNext()) {
                    break;
                }
                sb.append((CharSequence) " | ");
            }
        }
        return sb.toString();
    }

    public final bfr a(Class cls) {
        for (bfr bfrVar : this.a) {
            if (bfrVar.getClass() == cls) {
                return bfrVar;
            }
        }
        return null;
    }

    public final List c(Class cls) {
        ArrayList arrayList = new ArrayList();
        for (bfr bfrVar : this.a) {
            if (cls.isAssignableFrom(bfrVar.getClass())) {
                arrayList.add(bfrVar);
            }
        }
        return arrayList;
    }

    public final boolean d(Class cls) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(((bfr) it.next()).getClass())) {
                return true;
            }
        }
        return false;
    }
}
