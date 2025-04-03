package defpackage;

import java.lang.reflect.Array;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mz {
    public Object[] a;
    public Object[] b;
    public int c;
    public int d;
    public int e;
    public my f;
    public int g = 0;
    public final Class h;
    private mx i;

    public mz(Class cls, my myVar) {
        this.h = cls;
        this.a = (Object[]) Array.newInstance((Class<?>) cls, 10);
        this.f = myVar;
    }

    public final int a(Object obj) {
        j();
        return b(obj, true);
    }

    public final int b(Object obj, boolean z) {
        int c = c(obj, this.a, 0, this.g, 1);
        if (c == -1) {
            c = 0;
        } else if (c < this.g) {
            Object obj2 = this.a[c];
            if (this.f.f(obj2, obj)) {
                if (this.f.e(obj2, obj)) {
                    this.a[c] = obj;
                    return c;
                }
                this.a[c] = obj;
                my myVar = this.f;
                myVar.g(obj2, obj);
                myVar.a(c, 1, null);
                return c;
            }
        }
        int i = this.g;
        if (c > i) {
            throw new IndexOutOfBoundsException("cannot add item to " + c + " because size is " + this.g);
        }
        int i2 = c + 1;
        Object[] objArr = this.a;
        int length = objArr.length;
        if (i == length) {
            Object[] objArr2 = (Object[]) Array.newInstance((Class<?>) this.h, length + 10);
            System.arraycopy(this.a, 0, objArr2, 0, c);
            objArr2[c] = obj;
            System.arraycopy(this.a, c, objArr2, i2, this.g - c);
            this.a = objArr2;
        } else {
            System.arraycopy(objArr, c, objArr, i2, i - c);
            this.a[c] = obj;
        }
        this.g++;
        if (z) {
            this.f.b(c, 1);
        }
        return c;
    }

    public final int c(Object obj, Object[] objArr, int i, int i2, int i3) {
        while (i < i2) {
            int i4 = (i + i2) / 2;
            Object obj2 = objArr[i4];
            int compare = this.f.compare(obj2, obj);
            if (compare < 0) {
                i = i4 + 1;
            } else {
                if (compare == 0) {
                    if (!this.f.f(obj2, obj)) {
                        int i5 = i4 - 1;
                        while (i5 >= i) {
                            Object obj3 = this.a[i5];
                            if (this.f.compare(obj3, obj) == 0) {
                                if (this.f.f(obj3, obj)) {
                                    break;
                                }
                                i5--;
                            } else {
                                break;
                            }
                        }
                        i5 = i4 + 1;
                        while (i5 < i2) {
                            Object obj4 = this.a[i5];
                            if (this.f.compare(obj4, obj) == 0) {
                                if (this.f.f(obj4, obj)) {
                                    break;
                                }
                                i5++;
                            } else {
                                break;
                            }
                        }
                        i5 = -1;
                        if (i3 != 1 || i5 != -1) {
                            return i5;
                        }
                    }
                    return i4;
                }
                i2 = i4;
            }
        }
        if (i3 == 1) {
            return i;
        }
        return -1;
    }

    public final int d(Object obj) {
        if (this.b == null) {
            return c(obj, this.a, 0, this.g, 4);
        }
        int c = c(obj, this.a, 0, this.e, 4);
        if (c != -1) {
            return c;
        }
        int c2 = c(obj, this.b, this.c, this.d, 4);
        if (c2 != -1) {
            return (c2 - this.c) + this.e;
        }
        return -1;
    }

    public final Object e(int i) {
        int i2;
        if (i < this.g && i >= 0) {
            Object[] objArr = this.b;
            return (objArr == null || i < (i2 = this.e)) ? this.a[i] : objArr[(i - i2) + this.c];
        }
        throw new IndexOutOfBoundsException("Asked to get item at " + i + " but size is " + this.g);
    }

    public final void f() {
        j();
        my myVar = this.f;
        if (myVar instanceof mx) {
            return;
        }
        if (this.i == null) {
            this.i = new mx(myVar);
        }
        this.f = this.i;
    }

    public final void g() {
        j();
        int i = this.g;
        if (i == 0) {
            return;
        }
        Arrays.fill(this.a, 0, i, (Object) null);
        this.g = 0;
        this.f.d(0, i);
    }

    public final void h() {
        j();
        my myVar = this.f;
        if (myVar instanceof mx) {
            ((mx) myVar).b.e();
        }
        my myVar2 = this.f;
        mx mxVar = this.i;
        if (myVar2 == mxVar) {
            this.f = mxVar.a;
        }
    }

    public final void i(int i, boolean z) {
        Object[] objArr = this.a;
        System.arraycopy(objArr, i + 1, objArr, i, (this.g - i) - 1);
        int i2 = this.g - 1;
        this.g = i2;
        this.a[i2] = null;
        if (z) {
            this.f.d(i, 1);
        }
    }

    public final void j() {
        if (this.b != null) {
            throw new IllegalStateException("Data cannot be mutated in the middle of a batch update operation such as addAll or replaceAll.");
        }
    }

    public final void k(int i, Object obj) {
        j();
        Object e = e(i);
        boolean z = e == obj || !this.f.e(e, obj);
        if (e != obj && this.f.compare(e, obj) == 0) {
            this.a[i] = obj;
            if (z) {
                my myVar = this.f;
                myVar.g(e, obj);
                myVar.a(i, 1, null);
                return;
            }
            return;
        }
        if (z) {
            my myVar2 = this.f;
            myVar2.g(e, obj);
            myVar2.a(i, 1, null);
        }
        i(i, false);
        int b = b(obj, false);
        if (i != b) {
            this.f.c(i, b);
        }
    }
}
