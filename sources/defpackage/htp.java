package defpackage;

import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class htp implements ListIterator, fflg {
    final /* synthetic */ ffkz a;
    final /* synthetic */ htq b;

    public htp(ffkz ffkzVar, htq htqVar) {
        this.a = ffkzVar;
        this.b = htqVar;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        hst.b();
        throw new ffbx();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.a.a < this.b.a + (-1);
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.a.a >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.a.a + 1;
        hst.a(i, this.b.a);
        this.a.a = i;
        return this.b.get(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.a.a + 1;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.a.a;
        hst.a(i, this.b.a);
        this.a.a = i - 1;
        return this.b.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.a.a;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ void remove() {
        hst.b();
        throw new ffbx();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        hst.b();
        throw new ffbx();
    }
}
