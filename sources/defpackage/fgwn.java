package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgwn implements Set, Serializable {
    private static final long serialVersionUID = -2317587285790834492L;
    public fgza a;
    public boolean b;
    public final boolean c;
    private final Set d;

    public fgwn() {
        this(true, false);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        if (obj instanceof fgwm) {
            return this.d.add(obj);
        }
        throw new IllegalArgumentException("Argument not a ".concat(String.valueOf(fgwm.class.getName())));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.d.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.d.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.d.containsAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == null || !getClass().isAssignableFrom(obj.getClass())) {
            return false;
        }
        fgwn fgwnVar = (fgwn) obj;
        fhoz fhozVar = new fhoz();
        fhozVar.c(this.d, fgwnVar.d);
        fhozVar.c(this.a, fgwnVar.a);
        boolean z = this.b;
        fhozVar.d(z, z);
        return fhozVar.a;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        fhpa fhpaVar = new fhpa();
        fhpaVar.c(this.d);
        fhpaVar.c(this.a);
        fhpaVar.d(this.b);
        return fhpaVar.a;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.d.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.d.iterator();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.d.remove(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.d.removeAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.d.retainAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.d.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return this.d.toArray();
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = iterator();
        while (it.hasNext()) {
            stringBuffer.append(it.next().toString());
            if (it.hasNext()) {
                stringBuffer.append(',');
            }
        }
        return stringBuffer.toString();
    }

    public fgwn(String str) {
        this();
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        while (stringTokenizer.hasMoreTokens()) {
            add(new fgwm(stringTokenizer.nextToken()));
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.d.toArray(objArr);
    }

    public fgwn(boolean z, boolean z2) {
        this.b = z;
        this.c = z2;
        this.d = z2 ? Collections.EMPTY_SET : new TreeSet();
    }
}
