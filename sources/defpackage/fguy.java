package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.StringTokenizer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fguy implements List, Serializable {
    private static final long serialVersionUID = -3700862452550012357L;
    public final fhbs a;
    public fgza b;
    public boolean c;
    private final List d;

    public fguy() {
        this.a = fhbs.f;
        this.d = new ArrayList();
    }

    public final void a(fgza fgzaVar) {
        if (!fhbs.e.equals(this.a)) {
            Iterator it = iterator();
            while (it.hasNext()) {
                ((fgvb) it.next()).a(fgzaVar);
            }
        }
        this.b = fgzaVar;
        this.c = false;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        this.d.add(i, obj);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return this.d.addAll(i, collection);
    }

    public final void b(fgux fguxVar) {
        if (!(fguxVar instanceof fgvb)) {
            if (!fhbs.e.equals(this.a)) {
                fgvb fgvbVar = new fgvb(fguxVar);
                fgvbVar.a(this.b);
                add(fgvbVar);
                return;
            }
        } else if (this.c) {
            ((fgvb) fguxVar).b(true);
        } else {
            fgza fgzaVar = this.b;
            if (fgzaVar != null) {
                ((fgvb) fguxVar).a(fgzaVar);
            }
        }
        add(fguxVar);
    }

    public final void c() {
        if (!fhbs.e.equals(this.a)) {
            Iterator it = iterator();
            while (it.hasNext()) {
                ((fgvb) it.next()).b(true);
            }
        }
        this.b = null;
        this.c = true;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.d.clear();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.d.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.d.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == null || !getClass().isAssignableFrom(obj.getClass())) {
            return false;
        }
        fguy fguyVar = (fguy) obj;
        fhoz fhozVar = new fhoz();
        fhozVar.c(this.d, fguyVar.d);
        fhozVar.c(this.a, fguyVar.a);
        fhozVar.c(this.b, fguyVar.b);
        boolean z = this.c;
        fhozVar.d(z, z);
        return fhozVar.a;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.d.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        fhpa fhpaVar = new fhpa();
        fhpaVar.c(this.d);
        fhpaVar.c(this.a);
        fhpaVar.c(this.b);
        fhpaVar.d(this.c);
        return fhpaVar.a;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.d.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.d.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.d.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return this.d.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return this.d.listIterator();
    }

    @Override // java.util.List
    public final Object remove(int i) {
        return this.d.remove(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.d.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.d.retainAll(collection);
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        return this.d.set(i, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.d.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        return this.d.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return this.d.toArray();
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = iterator();
        while (it.hasNext()) {
            stringBuffer.append(it.next());
            if (it.hasNext()) {
                stringBuffer.append(',');
            }
        }
        return stringBuffer.toString();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        if (obj instanceof fgux) {
            return this.d.add(obj);
        }
        throw new IllegalArgumentException("Argument not a ".concat(String.valueOf(fgux.class.getName())));
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return this.d.addAll(collection);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return this.d.listIterator(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.d.remove(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.d.toArray(objArr);
    }

    public fguy(String str, fhbs fhbsVar, fgza fgzaVar) {
        this(fhbsVar, fgzaVar);
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        while (stringTokenizer.hasMoreTokens()) {
            if (fhbs.e.equals(this.a)) {
                add(new fgux(stringTokenizer.nextToken()));
            } else {
                add(new fgvb(stringTokenizer.nextToken(), fgzaVar));
            }
        }
    }

    public fguy(fhbs fhbsVar) {
        this(fhbsVar, null);
    }

    public fguy(fhbs fhbsVar, fgza fgzaVar) {
        if (fhbsVar == null) {
            this.a = fhbs.f;
        } else {
            this.a = fhbsVar;
        }
        this.b = fgzaVar;
        this.d = new ArrayList();
    }
}
