package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cno<E> implements Cloneable {
    public /* synthetic */ boolean a;
    public /* synthetic */ long[] b;
    public /* synthetic */ Object[] c;
    public /* synthetic */ int d;

    public cno() {
        this((byte[]) null);
    }

    public final int a(long j) {
        if (this.a) {
            int i = this.d;
            long[] jArr = this.b;
            Object[] objArr = this.c;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != cnp.a) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.a = false;
            this.d = i2;
        }
        return cpu.b(this.b, this.d, j);
    }

    public final int b() {
        if (this.a) {
            int i = this.d;
            long[] jArr = this.b;
            Object[] objArr = this.c;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != cnp.a) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.a = false;
            this.d = i2;
        }
        return this.d;
    }

    public final long c(int i) {
        if (i < 0 || i >= this.d) {
            cpx.a(a.h(i, "Expected index to be within 0..size()-1, but was "));
        }
        if (this.a) {
            int i2 = this.d;
            long[] jArr = this.b;
            Object[] objArr = this.c;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != cnp.a) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.a = false;
            this.d = i3;
        }
        return this.b[i];
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        Object clone = super.clone();
        clone.getClass();
        cno cnoVar = (cno) clone;
        cnoVar.b = (long[]) this.b.clone();
        cnoVar.c = (Object[]) this.c.clone();
        return cnoVar;
    }

    public final Object d(long j) {
        Object obj;
        int b = cpu.b(this.b, this.d, j);
        if (b < 0 || (obj = this.c[b]) == cnp.a) {
            return null;
        }
        return obj;
    }

    public final Object e(int i) {
        if (i < 0 || i >= this.d) {
            cpx.a(a.h(i, "Expected index to be within 0..size()-1, but was "));
        }
        if (this.a) {
            int i2 = this.d;
            long[] jArr = this.b;
            Object[] objArr = this.c;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != cnp.a) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.a = false;
            this.d = i3;
        }
        return this.c[i];
    }

    public final void f(long j, Object obj) {
        int i = this.d;
        if (i != 0 && j <= this.b[i - 1]) {
            h(j, obj);
            return;
        }
        if (this.a) {
            long[] jArr = this.b;
            if (i >= jArr.length) {
                Object[] objArr = this.c;
                int i2 = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    Object obj2 = objArr[i3];
                    if (obj2 != cnp.a) {
                        if (i3 != i2) {
                            jArr[i2] = jArr[i3];
                            objArr[i2] = obj2;
                            objArr[i3] = null;
                        }
                        i2++;
                    }
                }
                this.a = false;
                this.d = i2;
                i = i2;
            }
        }
        long[] jArr2 = this.b;
        if (i >= jArr2.length) {
            int e = cpu.e(i + 1);
            long[] copyOf = Arrays.copyOf(jArr2, e);
            copyOf.getClass();
            this.b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.c, e);
            copyOf2.getClass();
            this.c = copyOf2;
        }
        this.b[i] = j;
        this.c[i] = obj;
        this.d = i + 1;
    }

    public final void g() {
        int i = this.d;
        Object[] objArr = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.d = 0;
        this.a = false;
    }

    public final void h(long j, Object obj) {
        int b = cpu.b(this.b, this.d, j);
        if (b >= 0) {
            this.c[b] = obj;
            return;
        }
        int i = ~b;
        int i2 = this.d;
        if (i < i2) {
            Object[] objArr = this.c;
            if (objArr[i] == cnp.a) {
                this.b[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.a) {
            long[] jArr = this.b;
            if (i2 >= jArr.length) {
                Object[] objArr2 = this.c;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj2 = objArr2[i4];
                    if (obj2 != cnp.a) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr2[i3] = obj2;
                            objArr2[i4] = null;
                        }
                        i3++;
                    }
                }
                this.a = false;
                this.d = i3;
                i = ~cpu.b(this.b, i3, j);
            }
        }
        int i5 = this.d;
        long[] jArr2 = this.b;
        if (i5 >= jArr2.length) {
            int e = cpu.e(i5 + 1);
            long[] copyOf = Arrays.copyOf(jArr2, e);
            copyOf.getClass();
            this.b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.c, e);
            copyOf2.getClass();
            this.c = copyOf2;
        }
        int i6 = this.d;
        if (i6 - i != 0) {
            long[] jArr3 = this.b;
            int i7 = i + 1;
            ffdo.m(jArr3, jArr3, i7, i, i6);
            Object[] objArr3 = this.c;
            ffdo.n(objArr3, objArr3, i7, i, this.d);
        }
        this.b[i] = j;
        this.c[i] = obj;
        this.d++;
    }

    public final void i(long j) {
        int b = cpu.b(this.b, this.d, j);
        if (b >= 0) {
            Object[] objArr = this.c;
            Object obj = objArr[b];
            Object obj2 = cnp.a;
            if (obj != obj2) {
                objArr[b] = obj2;
                this.a = true;
            }
        }
    }

    public final boolean j(long j) {
        return a(j) >= 0;
    }

    public final boolean k() {
        return b() == 0;
    }

    public final String toString() {
        if (b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.d * 28);
        sb.append('{');
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(c(i2));
            sb.append('=');
            Object e = e(i2);
            if (e != sb) {
                sb.append(e);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public cno(int i) {
        if (i == 0) {
            this.b = cpu.b;
            this.c = cpu.c;
        } else {
            int e = cpu.e(i);
            this.b = new long[e];
            this.c = new Object[e];
        }
    }

    public /* synthetic */ cno(byte[] bArr) {
        this(10);
    }
}
