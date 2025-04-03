package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hgx {
    public int[] a = new int[10];
    public int b;

    public final int a(int i) {
        int i2 = this.b - 1;
        return i2 >= 0 ? this.a[i2] : i;
    }

    public final int b() {
        int[] iArr = this.a;
        int i = this.b - 1;
        this.b = i;
        return iArr[i];
    }

    public final void c() {
        this.b = 0;
    }

    public final void d(int i) {
        int[] iArr = this.a;
        int i2 = this.b;
        int length = iArr.length;
        if (i2 >= length) {
            iArr = Arrays.copyOf(iArr, length + length);
            iArr.getClass();
            this.a = iArr;
        }
        int i3 = this.b;
        this.b = i3 + 1;
        iArr[i3] = i;
    }
}
