package defpackage;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enkd implements ListIterator {
    int a;
    enkc b;
    enkc c;
    enkc d;
    int e;
    final /* synthetic */ enkf f;

    public enkd(enkf enkfVar, int i) {
        this.f = enkfVar;
        this.e = enkfVar.e;
        int i2 = enkfVar.d;
        emxf.x(i, i2);
        if (i >= i2 / 2) {
            this.d = enkfVar.b;
            this.a = i2;
            while (i < i2) {
                previous();
                i++;
            }
        } else {
            this.b = enkfVar.a;
            while (i > 0) {
                next();
                i--;
            }
        }
        this.c = null;
    }

    private final void c() {
        if (this.f.e != this.e) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final enkc next() {
        c();
        enkc enkcVar = this.b;
        if (enkcVar == null) {
            throw new NoSuchElementException();
        }
        this.c = enkcVar;
        this.d = enkcVar;
        this.b = enkcVar.c;
        this.a++;
        return this.c;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final enkc previous() {
        c();
        enkc enkcVar = this.d;
        if (enkcVar == null) {
            throw new NoSuchElementException();
        }
        this.c = enkcVar;
        this.b = enkcVar;
        this.d = enkcVar.d;
        this.a--;
        return this.c;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        c();
        return this.b != null;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        c();
        return this.d != null;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.a;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.a - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        c();
        emxf.m(this.c != null, "no calls to next() since the last call to remove()");
        enkc enkcVar = this.c;
        if (enkcVar != this.b) {
            this.d = enkcVar.d;
            this.a--;
        } else {
            this.b = enkcVar.c;
        }
        this.f.f(enkcVar);
        this.c = null;
        this.e = this.f.e;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
