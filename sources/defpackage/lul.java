package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lul {
    public int a;
    private int b;
    private int c;
    private long[] d;
    private int e;

    public lul() {
        this(16);
    }

    public final long a() {
        if (this.a != 0) {
            return this.d[this.b];
        }
        throw new NoSuchElementException();
    }

    public final long b() {
        int i = this.a;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.d;
        int i2 = this.b;
        long j = jArr[i2];
        this.b = this.e & (i2 + 1);
        this.a = i - 1;
        return j;
    }

    public final void c(long j) {
        int i = this.a;
        long[] jArr = this.d;
        int length = jArr.length;
        if (i == length) {
            int i2 = length + length;
            if (i2 < 0) {
                throw new IllegalStateException();
            }
            long[] jArr2 = new long[i2];
            int i3 = this.b;
            int i4 = length - i3;
            System.arraycopy(jArr, i3, jArr2, 0, i4);
            System.arraycopy(this.d, 0, jArr2, i4, i3);
            this.b = 0;
            this.c = this.a - 1;
            this.d = jArr2;
            this.e = jArr2.length - 1;
            jArr = jArr2;
        }
        int i5 = (this.c + 1) & this.e;
        this.c = i5;
        jArr[i5] = j;
        this.a++;
    }

    public final void d() {
        this.b = 0;
        this.c = -1;
        this.a = 0;
    }

    public lul(int i) {
        lti.a(true);
        i = i == 0 ? 1 : i;
        if (Integer.bitCount(i) != 1) {
            int highestOneBit = Integer.highestOneBit(i - 1);
            i = highestOneBit + highestOneBit;
        }
        this.b = 0;
        this.c = -1;
        this.a = 0;
        this.d = new long[i];
        this.e = r3.length - 1;
    }
}
