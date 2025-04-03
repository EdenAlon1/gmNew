package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fhpf implements Iterable<fhpj> {
    private final List<fhpj> a = new LinkedList();
    private final Map<String, List<fhpj>> b = new HashMap();

    public int a(String str) {
        if (str == null) {
            return 0;
        }
        List<fhpj> remove = this.b.remove(str.toLowerCase(Locale.US));
        if (remove == null || remove.isEmpty()) {
            return 0;
        }
        this.a.removeAll(remove);
        return remove.size();
    }

    public List<fhpj> b() {
        return new ArrayList(this.a);
    }

    public List<fhpj> c(String str) {
        if (str == null) {
            return null;
        }
        List<fhpj> list = this.b.get(str.toLowerCase(Locale.US));
        return (list == null || list.isEmpty()) ? Collections.EMPTY_LIST : new ArrayList(list);
    }

    public fhpj d(String str) {
        if (str == null) {
            return null;
        }
        List<fhpj> list = this.b.get(str.toLowerCase(Locale.US));
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public void e(fhpj fhpjVar) {
        if (fhpjVar == null) {
            return;
        }
        String lowerCase = fhpjVar.b().toLowerCase(Locale.US);
        List<fhpj> list = this.b.get(lowerCase);
        if (list == null) {
            list = new LinkedList<>();
            this.b.put(lowerCase, list);
        }
        list.add(fhpjVar);
        this.a.add(fhpjVar);
    }

    public void f(fhpj fhpjVar) {
        if (fhpjVar == null) {
            return;
        }
        List<fhpj> list = this.b.get(fhpjVar.b().toLowerCase(Locale.US));
        if (list == null || list.isEmpty()) {
            e(fhpjVar);
            return;
        }
        list.clear();
        list.add(fhpjVar);
        Iterator<fhpj> it = this.a.iterator();
        int i = 0;
        int i2 = -1;
        while (it.hasNext()) {
            if (it.next().b().equalsIgnoreCase(fhpjVar.b())) {
                it.remove();
                if (i2 == -1) {
                    i2 = i;
                }
            }
            i++;
        }
        this.a.add(i2, fhpjVar);
    }

    @Override // java.lang.Iterable
    public Iterator<fhpj> iterator() {
        return DesugarCollections.unmodifiableList(this.a).iterator();
    }

    public String toString() {
        return this.a.toString();
    }
}
