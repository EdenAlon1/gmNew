package defpackage;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hnz extends hnq implements ListIterator, fflg {
    private final hnx c;
    private int d;
    private hoc e;
    private int f;

    public hnz(hnx hnxVar, int i) {
        super(i, hnxVar.d);
        this.c = hnxVar;
        this.d = hnxVar.b();
        this.f = -1;
        f();
    }

    private final void c() {
        if (this.d != this.c.b()) {
            throw new ConcurrentModificationException();
        }
    }

    private final void d() {
        if (this.f == -1) {
            throw new IllegalStateException();
        }
    }

    private final void e() {
        hnx hnxVar = this.c;
        this.b = hnxVar.d;
        this.d = hnxVar.b();
        this.f = -1;
        f();
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    private final void f() {
        hnx hnxVar = this.c;
        Object[] objArr = hnxVar.b;
        if (objArr == null) {
            this.e = null;
            return;
        }
        int b = hod.b(hnxVar.d);
        int g = ffmk.g(this.a, b);
        int i = hnxVar.a / 5;
        hoc hocVar = this.e;
        int i2 = i + 1;
        if (hocVar == null) {
            this.e = new hoc(objArr, g, b, i2);
            return;
        }
        hocVar.a = g;
        hocVar.b = b;
        hocVar.c = i2;
        if (hocVar.d.length < i2) {
            hocVar.d = new Object[i2];
        }
        hocVar.d[0] = objArr;
        ?? r6 = g == b ? 1 : 0;
        hocVar.e = r6;
        hocVar.c(g - r6, 1);
    }

    @Override // defpackage.hnq, java.util.ListIterator
    public final void add(Object obj) {
        c();
        this.c.add(this.a, obj);
        this.a++;
        e();
    }

    @Override // defpackage.hnq, java.util.ListIterator, java.util.Iterator
    public final Object next() {
        c();
        a();
        int i = this.a;
        int i2 = i + 1;
        this.f = i;
        hoc hocVar = this.e;
        if (hocVar == null) {
            Object[] objArr = this.c.c;
            this.a = i2;
            return objArr[i];
        }
        if (hocVar.hasNext()) {
            this.a = i2;
            return hocVar.next();
        }
        Object[] objArr2 = this.c.c;
        this.a = i2;
        return objArr2[i - hocVar.b];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        c();
        b();
        int i = this.a;
        int i2 = i - 1;
        this.f = i2;
        hoc hocVar = this.e;
        if (hocVar == null) {
            Object[] objArr = this.c.c;
            this.a = i2;
            return objArr[i2];
        }
        int i3 = hocVar.b;
        if (i <= i3) {
            this.a = i2;
            return hocVar.previous();
        }
        Object[] objArr2 = this.c.c;
        this.a = i2;
        return objArr2[i2 - i3];
    }

    @Override // defpackage.hnq, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        c();
        d();
        this.c.d(this.f);
        int i = this.f;
        if (i < this.a) {
            this.a = i;
        }
        e();
    }

    @Override // defpackage.hnq, java.util.ListIterator
    public final void set(Object obj) {
        c();
        d();
        this.c.set(this.f, obj);
        this.d = this.c.b();
        f();
    }
}
