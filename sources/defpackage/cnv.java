package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cnv extends cmw {
    public cnv() {
        this((byte[]) null);
    }

    public final int c(int i) {
        if (i < 0 || i >= this.b) {
            cpx.c("Index must be between 0 and size");
        }
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (i != this.b - 1) {
            ffdo.l(iArr, iArr, i, i + 1, this.b);
        }
        this.b--;
        return i2;
    }

    public final void d(int i) {
        int[] iArr = this.a;
        int length = iArr.length;
        if (length < i) {
            int[] copyOf = Arrays.copyOf(iArr, Math.max(i, (length * 3) / 2));
            copyOf.getClass();
            this.a = copyOf;
        }
    }

    public final void e(int i) {
        d(this.b + 1);
        int[] iArr = this.a;
        int i2 = this.b;
        iArr[i2] = i;
        this.b = i2 + 1;
    }

    public final void f(int i, int i2) {
        if (i < 0 || i >= this.b) {
            cpx.c("Index must be between 0 and size");
        }
        int[] iArr = this.a;
        int i3 = iArr[i];
        iArr[i] = i2;
    }

    public cnv(int i) {
        super(i);
    }

    public /* synthetic */ cnv(byte[] bArr) {
        super(16);
    }
}
