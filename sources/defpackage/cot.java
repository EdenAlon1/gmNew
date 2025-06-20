package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cot<E> extends cpl<E> implements Set<E>, ffll {
    public final coq a;

    public cot(coq coqVar) {
        super(coqVar);
        this.a = coqVar;
    }

    @Override // defpackage.cpl, java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.a.g(obj);
    }

    @Override // defpackage.cpl, java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        return this.a.h(collection);
    }

    @Override // defpackage.cpl, java.util.Set, java.util.Collection
    public final void clear() {
        this.a.a();
    }

    @Override // defpackage.cpl, java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return new cos(this);
    }

    @Override // defpackage.cpl, java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.a.i(obj);
    }

    @Override // defpackage.cpl, java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        coq coqVar = this.a;
        int i = coqVar.d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            coqVar.b(it.next());
        }
        return i != coqVar.d;
    }

    @Override // defpackage.cpl, java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        collection.getClass();
        coq coqVar = this.a;
        Object[] objArr = coqVar.b;
        int i2 = coqVar.d;
        long[] jArr = coqVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = i3 - length;
                    int i5 = 0;
                    while (true) {
                        i = 8 - ((~i4) >>> 31);
                        if (i5 >= i) {
                            break;
                        }
                        if ((255 & j) < 128) {
                            int i6 = (i3 << 3) + i5;
                            if (!ffdx.au(collection, objArr[i6])) {
                                coqVar.f(i6);
                            }
                        }
                        j >>= 8;
                        i5++;
                    }
                    if (i != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                }
                i3++;
            }
        }
        return i2 != coqVar.d;
    }
}
