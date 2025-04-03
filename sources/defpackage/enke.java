package defpackage;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enke implements ListIterator {
    final Object a;
    int b;
    enkc c;
    enkc d;
    enkc e;
    final /* synthetic */ enkf f;

    public enke(enkf enkfVar, Object obj) {
        this.f = enkfVar;
        this.a = obj;
        enkb enkbVar = (enkb) enkfVar.c.get(obj);
        this.c = enkbVar == null ? null : enkbVar.a;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        this.e = this.f.a(this.a, obj, this.c);
        this.b++;
        this.d = null;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.c != null;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.e != null;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        enkc enkcVar = this.c;
        if (enkcVar == null) {
            throw new NoSuchElementException();
        }
        this.d = enkcVar;
        this.e = enkcVar;
        this.c = enkcVar.e;
        this.b++;
        return this.d.b;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        enkc enkcVar = this.e;
        if (enkcVar == null) {
            throw new NoSuchElementException();
        }
        this.d = enkcVar;
        this.c = enkcVar;
        this.e = enkcVar.f;
        this.b--;
        return this.d.b;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        emxf.m(this.d != null, "no calls to next() since the last call to remove()");
        enkc enkcVar = this.d;
        if (enkcVar != this.c) {
            this.e = enkcVar.f;
            this.b--;
        } else {
            this.c = enkcVar.e;
        }
        this.f.f(enkcVar);
        this.d = null;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        emxf.l(this.d != null);
        this.d.b = obj;
    }

    public enke(enkf enkfVar, Object obj, int i) {
        this.f = enkfVar;
        enkb enkbVar = (enkb) enkfVar.c.get(obj);
        int i2 = enkbVar == null ? 0 : enkbVar.c;
        emxf.x(i, i2);
        if (i >= i2 / 2) {
            this.e = enkbVar == null ? null : enkbVar.b;
            this.b = i2;
            while (i < i2) {
                previous();
                i++;
            }
        } else {
            this.c = enkbVar == null ? null : enkbVar.a;
            while (i > 0) {
                next();
                i--;
            }
        }
        this.a = obj;
        this.d = null;
    }
}
