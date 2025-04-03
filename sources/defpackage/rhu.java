package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rhu {
    private final List a = new ArrayList();
    private final Map b = new HashMap();

    private final synchronized List f(String str) {
        if (!this.a.contains(str)) {
            this.a.add(str);
        }
        List list = (List) this.b.get(str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        this.b.put(str, arrayList);
        return arrayList;
    }

    public final synchronized List a(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            List<rht> list = (List) this.b.get((String) it.next());
            if (list != null) {
                for (rht rhtVar : list) {
                    if (rhtVar.a(cls, cls2)) {
                        arrayList.add(rhtVar.b);
                    }
                }
            }
        }
        return arrayList;
    }

    public final synchronized List b(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            List<rht> list = (List) this.b.get((String) it.next());
            if (list != null) {
                for (rht rhtVar : list) {
                    if (rhtVar.a(cls, cls2) && !arrayList.contains(rhtVar.a)) {
                        arrayList.add(rhtVar.a);
                    }
                }
            }
        }
        return arrayList;
    }

    public final synchronized void c(String str, qtw qtwVar, Class cls, Class cls2) {
        f(str).add(new rht(cls, cls2, qtwVar));
    }

    public final synchronized void d(List list) {
        ArrayList arrayList = new ArrayList(this.a);
        this.a.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.a.add((String) it.next());
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            if (!list.contains(str)) {
                this.a.add(str);
            }
        }
    }

    public final synchronized void e(qtw qtwVar, Class cls, Class cls2) {
        f("legacy_prepend_all").add(0, new rht(cls, cls2, qtwVar));
    }
}
