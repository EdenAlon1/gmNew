package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hoi implements Iterator, fflg {
    public final hoz[] a;
    public int b;
    public boolean c = true;

    public hoi(hoy hoyVar, hoz[] hozVarArr) {
        this.a = hozVarArr;
        hoz hozVar = hozVarArr[0];
        Object[] objArr = hoyVar.b;
        int a = hoyVar.a();
        hozVar.c(objArr, a + a);
        this.b = 0;
        d();
    }

    private final int b(int i) {
        if (this.a[i].e()) {
            return i;
        }
        if (!this.a[i].f()) {
            return -1;
        }
        hoz hozVar = this.a[i];
        hozVar.f();
        Object obj = hozVar.a[hozVar.b];
        obj.getClass();
        hoy hoyVar = (hoy) obj;
        if (i == 6) {
            hoz hozVar2 = this.a[7];
            Object[] objArr = hoyVar.b;
            hozVar2.c(objArr, objArr.length);
        } else {
            hoz hozVar3 = this.a[i + 1];
            Object[] objArr2 = hoyVar.b;
            int a = hoyVar.a();
            hozVar3.c(objArr2, a + a);
        }
        return b(i + 1);
    }

    private final void c() {
        if (!this.c) {
            throw new NoSuchElementException();
        }
    }

    private final void d() {
        if (this.a[this.b].e()) {
            return;
        }
        for (int i = this.b; i >= 0; i--) {
            int b = b(i);
            if (b == -1) {
                if (this.a[i].f()) {
                    this.a[i].b();
                    b = b(i);
                } else {
                    b = -1;
                }
            }
            if (b != -1) {
                this.b = b;
                return;
            }
            if (i > 0) {
                this.a[i - 1].b();
            }
            this.a[i].c(hoy.a.b, 0);
        }
        this.c = false;
    }

    protected final Object a() {
        c();
        return this.a[this.b].a();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c;
    }

    @Override // java.util.Iterator
    public Object next() {
        c();
        Object next = this.a[this.b].next();
        d();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
