package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffff<T> extends ffde<T> {
    public final List a;

    public ffff(List list) {
        this.a = list;
    }

    @Override // defpackage.ffcy
    public final int a() {
        return this.a.size();
    }

    @Override // defpackage.ffde, java.util.List
    public final Object get(int i) {
        if (i >= 0 && i <= ffdx.e(this)) {
            return this.a.get(ffdx.e(this) - i);
        }
        throw new IndexOutOfBoundsException("Element index " + i + " must be in range [" + new ffmj(0, ffdx.e(this)) + "].");
    }

    @Override // defpackage.ffde, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<T> iterator() {
        return new fffe(this, 0);
    }

    @Override // defpackage.ffde, java.util.List
    public final ListIterator listIterator() {
        return new fffe(this, 0);
    }

    @Override // defpackage.ffde, java.util.List
    public final ListIterator listIterator(int i) {
        return new fffe(this, i);
    }
}
