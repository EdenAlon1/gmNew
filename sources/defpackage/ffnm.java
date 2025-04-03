package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffnm extends ffnn implements Iterator, ffgu, fflg {
    public ffgu a;
    private int b;
    private Object c;
    private Iterator d;

    private final Throwable c() {
        int i = this.b;
        return i != 4 ? i != 5 ? new IllegalStateException(a.h(i, "Unexpected state of the iterator: ")) : new IllegalStateException("Iterator has failed.") : new NoSuchElementException();
    }

    @Override // defpackage.ffnn
    public final Object a(Object obj, ffgu ffguVar) {
        this.c = obj;
        this.b = 3;
        this.a = ffguVar;
        return ffhh.a;
    }

    @Override // defpackage.ffnn
    public final Object b(Iterator it, ffgu ffguVar) {
        if (!it.hasNext()) {
            return ffcu.a;
        }
        this.d = it;
        this.b = 2;
        this.a = ffguVar;
        return ffhh.a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.b;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw c();
                }
                Iterator it = this.d;
                it.getClass();
                if (it.hasNext()) {
                    this.b = 2;
                    return true;
                }
                this.d = null;
            }
            this.b = 5;
            ffgu ffguVar = this.a;
            ffguVar.getClass();
            this.a = null;
            ffguVar.w(ffcu.a);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.b;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.b = 1;
            Iterator it = this.d;
            it.getClass();
            return it.next();
        }
        if (i != 3) {
            throw c();
        }
        this.b = 0;
        Object obj = this.c;
        this.c = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // defpackage.ffgu
    public final ffhd u() {
        return ffhe.a;
    }

    @Override // defpackage.ffgu
    public final void w(Object obj) {
        ffci.b(obj);
        this.b = 4;
    }
}
