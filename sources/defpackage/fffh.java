package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fffh<T> extends ffde<T> implements RandomAccess {
    public final Object[] a;
    public final int b;
    public int c;
    public int d;

    public fffh(Object[] objArr, int i) {
        objArr.getClass();
        this.a = objArr;
        if (i < 0) {
            throw new IllegalArgumentException(a.h(i, "ring buffer filled size should not be negative but it is "));
        }
        int length = objArr.length;
        if (i > length) {
            throw new IllegalArgumentException(a.r(length, i, "ring buffer filled size: ", " cannot be larger than the buffer size: "));
        }
        this.b = length;
        this.d = i;
    }

    @Override // defpackage.ffcy
    public final int a() {
        return this.d;
    }

    public final void b(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(a.h(i, "n shouldn't be negative but it is "));
        }
        int i2 = this.d;
        if (i > i2) {
            throw new IllegalArgumentException(a.r(i2, i, "n shouldn't be greater than the buffer size: n = ", ", size = "));
        }
        if (i > 0) {
            int i3 = this.c;
            int i4 = this.b;
            int i5 = (i3 + i) % i4;
            if (i3 > i5) {
                ffdo.d(this.a, null, i3, i4);
                ffdo.d(this.a, null, 0, i5);
            } else {
                ffdo.d(this.a, null, i3, i5);
            }
            this.c = i5;
            this.d -= i;
        }
    }

    public final boolean c() {
        return this.d == this.b;
    }

    @Override // defpackage.ffde, java.util.List
    public final Object get(int i) {
        ffda.b(i, this.d);
        return this.a[(this.c + i) % this.b];
    }

    @Override // defpackage.ffde, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<T> iterator() {
        return new fffg(this);
    }

    @Override // defpackage.ffcy, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[this.d]);
    }

    @Override // defpackage.ffcy, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.d;
        if (length < i) {
            objArr = Arrays.copyOf(objArr, i);
            objArr.getClass();
        }
        int i2 = this.d;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = this.c; i4 < i2 && i5 < this.b; i5++) {
            objArr[i4] = this.a[i5];
            i4++;
        }
        while (i4 < i2) {
            objArr[i4] = this.a[i3];
            i4++;
            i3++;
        }
        ffdx.d(i2, objArr);
        return objArr;
    }
}
