package j$.util.stream;

import java.util.Arrays;

/* renamed from: j$.util.stream.e3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
abstract class AbstractC0079e3 extends AbstractC0070d implements Iterable, j$.lang.a {
    Object e;
    Object[] f;

    AbstractC0079e3(int i) {
        super(i);
        this.e = b(1 << this.a);
    }

    protected abstract Object[] A();

    protected final void B() {
        long v;
        if (this.b == v(this.e)) {
            if (this.f == null) {
                Object[] A = A();
                this.f = A;
                this.d = new long[8];
                A[0] = this.e;
            }
            int i = this.c;
            int i2 = i + 1;
            Object[] objArr = this.f;
            if (i2 >= objArr.length || objArr[i2] == null) {
                if (i == 0) {
                    v = v(this.e);
                } else {
                    v = v(objArr[i]) + this.d[i];
                }
                y(v + 1);
            }
            this.b = 0;
            int i3 = this.c + 1;
            this.c = i3;
            this.e = this.f[i3];
        }
    }

    public abstract Object b(int i);

    public Object c() {
        long count = count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object b = b((int) count);
        r(0, b);
        return b;
    }

    @Override // j$.util.stream.AbstractC0070d
    public final void clear() {
        Object[] objArr = this.f;
        if (objArr != null) {
            this.e = objArr[0];
            this.f = null;
            this.d = null;
        }
        this.b = 0;
        this.c = 0;
    }

    public void d(Object obj) {
        for (int i = 0; i < this.c; i++) {
            Object obj2 = this.f[i];
            u(obj2, 0, v(obj2), obj);
        }
        u(this.e, 0, this.b, obj);
    }

    public void r(int i, Object obj) {
        long j = i;
        long count = count() + j;
        if (count > v(obj) || count < j) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.c == 0) {
            System.arraycopy(this.e, 0, obj, i, this.b);
            return;
        }
        for (int i2 = 0; i2 < this.c; i2++) {
            Object obj2 = this.f[i2];
            System.arraycopy(obj2, 0, obj, i, v(obj2));
            i += v(this.f[i2]);
        }
        int i3 = this.b;
        if (i3 > 0) {
            System.arraycopy(this.e, 0, obj, i, i3);
        }
    }

    protected abstract void u(Object obj, int i, int i2, Object obj2);

    protected abstract int v(Object obj);

    protected final int x(long j) {
        if (this.c == 0) {
            if (j < this.b) {
                return 0;
            }
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        if (j >= count()) {
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        for (int i = 0; i <= this.c; i++) {
            if (j < this.d[i] + v(this.f[i])) {
                return i;
            }
        }
        throw new IndexOutOfBoundsException(Long.toString(j));
    }

    protected final void y(long j) {
        long v;
        int i = this.c;
        if (i == 0) {
            v = v(this.e);
        } else {
            v = v(this.f[i]) + this.d[i];
        }
        if (j > v) {
            if (this.f == null) {
                Object[] A = A();
                this.f = A;
                this.d = new long[8];
                A[0] = this.e;
            }
            int i2 = this.c + 1;
            while (j > v) {
                Object[] objArr = this.f;
                if (i2 >= objArr.length) {
                    int length = objArr.length * 2;
                    this.f = Arrays.copyOf(objArr, length);
                    this.d = Arrays.copyOf(this.d, length);
                }
                int i3 = this.a;
                if (i2 != 0 && i2 != 1) {
                    i3 = Math.min((i3 + i2) - 1, 30);
                }
                int i4 = 1 << i3;
                this.f[i2] = b(i4);
                long[] jArr = this.d;
                jArr[i2] = jArr[i2 - 1] + v(this.f[r6]);
                v += i4;
                i2++;
            }
        }
    }

    AbstractC0079e3() {
        this.e = b(16);
    }
}
