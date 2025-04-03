package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cmm {
    private int[] a;
    private int b;
    private int c;
    private int d;

    public cmm() {
        int i = 8;
        if (Integer.bitCount(8) != 1) {
            int highestOneBit = Integer.highestOneBit(7);
            i = highestOneBit + highestOneBit;
        }
        this.d = i - 1;
        this.a = new int[i];
    }

    public final int a() {
        int i = this.b;
        if (i == this.c) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i2 = this.a[i];
        this.b = (i + 1) & this.d;
        return i2;
    }

    public final void b(int i) {
        int[] iArr = this.a;
        int i2 = this.c;
        iArr[i2] = i;
        int i3 = this.d & (i2 + 1);
        this.c = i3;
        int i4 = this.b;
        if (i3 == i4) {
            int length = iArr.length;
            int i5 = length - i4;
            int i6 = length + length;
            if (i6 < 0) {
                throw new RuntimeException("Max array capacity exceeded");
            }
            int[] iArr2 = new int[i6];
            ffdo.l(iArr, iArr2, 0, i4, length);
            ffdo.l(this.a, iArr2, i5, 0, this.b);
            this.a = iArr2;
            this.b = 0;
            this.c = length;
            this.d = i6 - 1;
        }
    }

    public final void c() {
        this.c = this.b;
    }

    public final boolean d() {
        return this.b == this.c;
    }
}
