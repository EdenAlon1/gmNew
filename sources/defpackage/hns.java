package defpackage;

import j$.util.List;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class hns<E> extends ffde<E> implements List<E>, hnn {
    @Override // defpackage.ffcy, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.ffcy, java.util.Collection
    public final boolean containsAll(Collection collection) {
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.hnn
    public hnn e(Collection collection) {
        hnm b = b();
        b.addAll(collection);
        return b.a();
    }

    @Override // defpackage.hnn
    public final hnn f(Object obj) {
        int indexOf = indexOf(obj);
        return indexOf != -1 ? i(indexOf) : this;
    }

    @Override // defpackage.hnn
    public final hnn g(Collection collection) {
        return h(new hnr(collection));
    }

    @Override // defpackage.ffde, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return listIterator();
    }

    @Override // defpackage.ffde, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // defpackage.ffde, java.util.List
    public final /* synthetic */ java.util.List subList(int i, int i2) {
        return new hnj(this, i, i2);
    }
}
