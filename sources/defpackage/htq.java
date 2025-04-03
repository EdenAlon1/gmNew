package defpackage;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class htq<T> implements List<T>, fflh {
    public int a;
    private final hss b;
    private final int c;
    private int d;

    public htq(hss hssVar, int i, int i2) {
        this.b = hssVar;
        this.c = i;
        this.d = hssVar.b();
        this.a = i2 - i;
    }

    private final void b() {
        if (this.b.b() != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    public final Object a(int i) {
        b();
        Object f = this.b.f(this.c + i);
        this.a--;
        this.d = this.b.b();
        return f;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        b();
        this.b.add(this.c + i, obj);
        this.a++;
        this.d = this.b.b();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        b();
        boolean addAll = this.b.addAll(i + this.c, collection);
        if (addAll) {
            this.a += collection.size();
            this.d = this.b.b();
        }
        return addAll;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i;
        hnn hnnVar;
        hrw b;
        boolean h;
        if (this.a > 0) {
            b();
            hss hssVar = this.b;
            int i2 = this.c;
            int i3 = this.a + i2;
            do {
                synchronized (hst.a) {
                    hto htoVar = hssVar.a;
                    htoVar.getClass();
                    hsp hspVar = (hsp) hsj.e(htoVar);
                    i = hspVar.b;
                    hnnVar = hspVar.a;
                }
                hnnVar.getClass();
                hnm b2 = hnnVar.b();
                b2.subList(i2, i3).clear();
                hnn a = b2.a();
                if (ffkj.e(a, hnnVar)) {
                    break;
                }
                hto htoVar2 = hssVar.a;
                htoVar2.getClass();
                synchronized (hsj.c) {
                    b = hsj.b();
                    h = hss.h((hsp) hsj.l(htoVar2, hssVar, b), i, a, true);
                }
                hsj.t(b, hssVar);
            } while (!h);
            this.a = 0;
            this.d = this.b.b();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        b();
        hst.a(i, this.a);
        return this.b.get(this.c + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        b();
        int i = this.c;
        ffev it = ffmk.q(i, this.a + i).iterator();
        while (((ffmi) it).a) {
            int a = it.a();
            if (ffkj.e(obj, this.b.get(a))) {
                return a - this.c;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.a == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        b();
        for (int i = (this.c + this.a) - 1; i >= this.c; i--) {
            if (ffkj.e(obj, this.b.get(i))) {
                return i - this.c;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final /* bridge */ Object remove(int i) {
        return a(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        hnn hnnVar;
        hrw b;
        boolean h;
        b();
        int i2 = this.c;
        int i3 = this.a + i2;
        hss hssVar = this.b;
        int a = hssVar.a();
        do {
            synchronized (hst.a) {
                hto htoVar = hssVar.a;
                htoVar.getClass();
                hsp hspVar = (hsp) hsj.e(htoVar);
                i = hspVar.b;
                hnnVar = hspVar.a;
            }
            hnnVar.getClass();
            hnm b2 = hnnVar.b();
            b2.subList(i2, i3).retainAll(collection);
            hnn a2 = b2.a();
            if (ffkj.e(a2, hnnVar)) {
                break;
            }
            hto htoVar2 = hssVar.a;
            htoVar2.getClass();
            synchronized (hsj.c) {
                b = hsj.b();
                h = hss.h((hsp) hsj.l(htoVar2, hssVar, b), i, a2, true);
            }
            hsj.t(b, hssVar);
        } while (!h);
        int a3 = a - hssVar.a();
        if (a3 > 0) {
            this.d = this.b.b();
            this.a -= a3;
        }
        return a3 > 0;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        hst.a(i, this.a);
        b();
        int i2 = this.c;
        hss hssVar = this.b;
        Object obj2 = hssVar.set(i + i2, obj);
        this.d = hssVar.b();
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.a;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.a) {
            hih.a("fromIndex or toIndex are out of bounds");
        }
        b();
        hss hssVar = this.b;
        int i3 = this.c;
        return new htq(hssVar, i + i3, i2 + i3);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return ffkc.a(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        b();
        ffkz ffkzVar = new ffkz();
        ffkzVar.a = i - 1;
        return new htp(ffkzVar, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        a(indexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return ffkc.b(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        b();
        this.b.add(this.c + this.a, obj);
        this.a++;
        this.d = this.b.b();
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.a, collection);
    }
}
