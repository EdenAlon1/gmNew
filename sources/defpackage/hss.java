package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hss<T> implements List<T>, RandomAccess, htm, fflh {
    public hto a;

    public hss() {
        hob hobVar = hob.a;
        hrw b = hsj.b();
        hsp hspVar = new hsp(b.v(), hobVar);
        if (!(b instanceof hrp)) {
            hspVar.h = new hsp(1L, hobVar);
        }
        this.a = hspVar;
    }

    public static final boolean h(hsp hspVar, int i, hnn hnnVar, boolean z) {
        boolean z2;
        synchronized (hst.a) {
            int i2 = hspVar.b;
            if (i2 == i) {
                hspVar.a = hnnVar;
                z2 = true;
                if (z) {
                    hspVar.c++;
                }
                hspVar.b = i2 + 1;
            } else {
                z2 = false;
            }
        }
        return z2;
    }

    private final boolean i(ffji ffjiVar) {
        int i;
        hnn hnnVar;
        Object invoke;
        hrw b;
        boolean h;
        do {
            synchronized (hst.a) {
                hto htoVar = this.a;
                htoVar.getClass();
                hsp hspVar = (hsp) hsj.e(htoVar);
                i = hspVar.b;
                hnnVar = hspVar.a;
            }
            hnnVar.getClass();
            hnm b2 = hnnVar.b();
            invoke = ffjiVar.invoke(b2);
            hnn a = b2.a();
            if (ffkj.e(a, hnnVar)) {
                break;
            }
            hto htoVar2 = this.a;
            htoVar2.getClass();
            synchronized (hsj.c) {
                b = hsj.b();
                h = h((hsp) hsj.l(htoVar2, this, b), i, a, true);
            }
            hsj.t(b, this);
        } while (!h);
        return ((Boolean) invoke).booleanValue();
    }

    public final int a() {
        return c().a.size();
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        hnn hnnVar;
        hrw b;
        boolean h;
        do {
            synchronized (hst.a) {
                hto htoVar = this.a;
                htoVar.getClass();
                hsp hspVar = (hsp) hsj.e(htoVar);
                i2 = hspVar.b;
                hnnVar = hspVar.a;
            }
            hnnVar.getClass();
            hnn d = hnnVar.d(i, obj);
            if (ffkj.e(d, hnnVar)) {
                return;
            }
            hto htoVar2 = this.a;
            htoVar2.getClass();
            synchronized (hsj.c) {
                b = hsj.b();
                h = h((hsp) hsj.l(htoVar2, this, b), i2, d, true);
            }
            hsj.t(b, this);
        } while (!h);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return i(new hsq(i, collection));
    }

    public final int b() {
        hto htoVar = this.a;
        htoVar.getClass();
        return ((hsp) hsj.e(htoVar)).c;
    }

    public final hsp c() {
        hto htoVar = this.a;
        htoVar.getClass();
        return (hsp) hsj.j(htoVar, this);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        hrw b;
        hto htoVar = this.a;
        htoVar.getClass();
        synchronized (hsj.c) {
            b = hsj.b();
            hsp hspVar = (hsp) hsj.l(htoVar, this, b);
            synchronized (hst.a) {
                hspVar.a = hob.a;
                hspVar.b++;
                hspVar.c++;
            }
        }
        hsj.t(b, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return c().a.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return c().a.containsAll(collection);
    }

    @Override // defpackage.htm
    public final hto d() {
        return this.a;
    }

    @Override // defpackage.htm
    public final void e(hto htoVar) {
        htoVar.h = this.a;
        htoVar.getClass();
        this.a = (hsp) htoVar;
    }

    public final Object f(int i) {
        int i2;
        hnn hnnVar;
        hrw b;
        boolean h;
        Object obj = get(i);
        do {
            synchronized (hst.a) {
                hto htoVar = this.a;
                htoVar.getClass();
                hsp hspVar = (hsp) hsj.e(htoVar);
                i2 = hspVar.b;
                hnnVar = hspVar.a;
            }
            hnnVar.getClass();
            hnn i3 = hnnVar.i(i);
            if (ffkj.e(i3, hnnVar)) {
                break;
            }
            hto htoVar2 = this.a;
            htoVar2.getClass();
            synchronized (hsj.c) {
                b = hsj.b();
                h = h((hsp) hsj.l(htoVar2, this, b), i2, i3, true);
            }
            hsj.t(b, this);
        } while (!h);
        return obj;
    }

    @Override // defpackage.htm
    public final /* synthetic */ hto g(hto htoVar, hto htoVar2, hto htoVar3) {
        return null;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return c().a.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return c().a.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return c().a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return new htg(this, 0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return c().a.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new htg(this, 0);
    }

    @Override // java.util.List
    public final /* bridge */ Object remove(int i) {
        return f(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        hnn hnnVar;
        hrw b;
        boolean h;
        do {
            synchronized (hst.a) {
                hto htoVar = this.a;
                htoVar.getClass();
                hsp hspVar = (hsp) hsj.e(htoVar);
                i = hspVar.b;
                hnnVar = hspVar.a;
            }
            hnnVar.getClass();
            hnn g = hnnVar.g(collection);
            if (ffkj.e(g, hnnVar)) {
                return false;
            }
            hto htoVar2 = this.a;
            htoVar2.getClass();
            synchronized (hsj.c) {
                b = hsj.b();
                h = h((hsp) hsj.l(htoVar2, this, b), i, g, true);
            }
            hsj.t(b, this);
        } while (!h);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return i(new hsr(collection));
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2;
        hnn hnnVar;
        hrw b;
        boolean h;
        Object obj2 = get(i);
        do {
            synchronized (hst.a) {
                hto htoVar = this.a;
                htoVar.getClass();
                hsp hspVar = (hsp) hsj.e(htoVar);
                i2 = hspVar.b;
                hnnVar = hspVar.a;
            }
            hnnVar.getClass();
            hnn j = hnnVar.j(i, obj);
            if (ffkj.e(j, hnnVar)) {
                break;
            }
            hto htoVar2 = this.a;
            htoVar2.getClass();
            synchronized (hsj.c) {
                b = hsj.b();
                h = h((hsp) hsj.l(htoVar2, this, b), i2, j, false);
            }
            hsj.t(b, this);
        } while (!h);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return a();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > a()) {
            hih.a("fromIndex or toIndex are out of bounds");
        }
        return new htq(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return ffkc.a(this);
    }

    public final String toString() {
        hto htoVar = this.a;
        htoVar.getClass();
        return "SnapshotStateList(value=" + ((hsp) hsj.e(htoVar)).a + ")@" + hashCode();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        hnn hnnVar;
        hrw b;
        boolean h;
        do {
            synchronized (hst.a) {
                hto htoVar = this.a;
                htoVar.getClass();
                hsp hspVar = (hsp) hsj.e(htoVar);
                i = hspVar.b;
                hnnVar = hspVar.a;
            }
            hnnVar.getClass();
            hnn e = hnnVar.e(collection);
            if (ffkj.e(e, hnnVar)) {
                return false;
            }
            hto htoVar2 = this.a;
            htoVar2.getClass();
            synchronized (hsj.c) {
                b = hsj.b();
                h = h((hsp) hsj.l(htoVar2, this, b), i, e, true);
            }
            hsj.t(b, this);
        } while (!h);
        return true;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new htg(this, i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        hnn hnnVar;
        hrw b;
        boolean h;
        do {
            synchronized (hst.a) {
                hto htoVar = this.a;
                htoVar.getClass();
                hsp hspVar = (hsp) hsj.e(htoVar);
                i = hspVar.b;
                hnnVar = hspVar.a;
            }
            hnnVar.getClass();
            hnn f = hnnVar.f(obj);
            if (ffkj.e(f, hnnVar)) {
                return false;
            }
            hto htoVar2 = this.a;
            htoVar2.getClass();
            synchronized (hsj.c) {
                b = hsj.b();
                h = h((hsp) hsj.l(htoVar2, this, b), i, f, true);
            }
            hsj.t(b, this);
        } while (!h);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return ffkc.b(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        hnn hnnVar;
        hrw b;
        boolean h;
        do {
            synchronized (hst.a) {
                hto htoVar = this.a;
                htoVar.getClass();
                hsp hspVar = (hsp) hsj.e(htoVar);
                i = hspVar.b;
                hnnVar = hspVar.a;
            }
            hnnVar.getClass();
            hnn c = hnnVar.c(obj);
            if (ffkj.e(c, hnnVar)) {
                return false;
            }
            hto htoVar2 = this.a;
            htoVar2.getClass();
            synchronized (hsj.c) {
                b = hsj.b();
                h = h((hsp) hsj.l(htoVar2, this, b), i, c, true);
            }
            hsj.t(b, this);
        } while (!h);
        return true;
    }
}
