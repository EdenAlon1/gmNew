package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hok extends hoi implements Iterator, fflg {
    public final hoj d;
    public int e;
    private Object f;
    private boolean g;

    public hok(hoj hojVar, hoz[] hozVarArr) {
        super(hojVar.b, hozVarArr);
        this.d = hojVar;
        this.e = hojVar.d;
    }

    public final void b(int i, hoy hoyVar, Object obj, int i2) {
        int i3 = i2 * 5;
        if (i3 > 30) {
            hoz hozVar = this.a[i2];
            Object[] objArr = hoyVar.b;
            hozVar.d(objArr, objArr.length, 0);
            while (!ffkj.e(this.a[i2].a(), obj)) {
                this.a[i2].b += 2;
            }
            this.b = i2;
            return;
        }
        int a = 1 << hpc.a(i, i3);
        if (hoyVar.m(a)) {
            int b = hoyVar.b(a);
            hoz hozVar2 = this.a[i2];
            Object[] objArr2 = hoyVar.b;
            int a2 = hoyVar.a();
            hozVar2.d(objArr2, a2 + a2, b);
            this.b = i2;
            return;
        }
        int c = hoyVar.c(a);
        hoy i4 = hoyVar.i(c);
        hoz hozVar3 = this.a[i2];
        Object[] objArr3 = hoyVar.b;
        int a3 = hoyVar.a();
        hozVar3.d(objArr3, a3 + a3, c);
        b(i, i4, obj, i2 + 1);
    }

    @Override // defpackage.hoi, java.util.Iterator
    public final Object next() {
        if (this.d.d != this.e) {
            throw new ConcurrentModificationException();
        }
        this.f = a();
        this.g = true;
        return super.next();
    }

    @Override // defpackage.hoi, java.util.Iterator
    public final void remove() {
        if (!this.g) {
            throw new IllegalStateException();
        }
        if (this.c) {
            Object a = a();
            hoj hojVar = this.d;
            Object obj = this.f;
            fflf.g(hojVar);
            hojVar.remove(obj);
            b(a != null ? a.hashCode() : 0, this.d.b, a, 0);
        } else {
            hoj hojVar2 = this.d;
            Object obj2 = this.f;
            fflf.g(hojVar2);
            hojVar2.remove(obj2);
        }
        this.f = null;
        this.g = false;
        this.e = this.d.d;
    }
}
