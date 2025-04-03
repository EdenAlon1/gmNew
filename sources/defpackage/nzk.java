package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nzk implements Iterator, fflg {
    final /* synthetic */ nzl a;
    private int b = -1;
    private boolean c;

    public nzk(nzl nzlVar) {
        this.a = nzlVar;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final nzh next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.c = true;
        nzl nzlVar = this.a;
        int i = this.b + 1;
        this.b = i;
        return (nzh) nzlVar.a.e(i);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b + 1 < this.a.a.c();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.c) {
            throw new IllegalStateException("You must call next() before you can remove an element");
        }
        nzl nzlVar = this.a;
        int i = this.b;
        cpo cpoVar = nzlVar.a;
        ((nzh) cpoVar.e(i)).d = null;
        int i2 = this.b;
        Object[] objArr = cpoVar.c;
        Object obj = objArr[i2];
        Object obj2 = cpp.a;
        if (obj != obj2) {
            objArr[i2] = obj2;
            cpoVar.a = true;
        }
        this.b = i2 - 1;
        this.c = false;
    }
}
