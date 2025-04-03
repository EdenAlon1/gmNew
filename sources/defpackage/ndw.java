package defpackage;

import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ndw {
    public int a;
    public int b;
    private final byte[] c;
    private final int d;

    public ndw(byte[] bArr) {
        this.c = bArr;
        this.d = bArr.length;
    }

    public final int a(int i) {
        int i2 = this.a;
        int i3 = 8 - this.b;
        int i4 = i2 + 1;
        byte[] bArr = this.c;
        int min = Math.min(i, i3);
        int i5 = ((bArr[i2] & 255) >> this.b) & (PrivateKeyType.INVALID >> (8 - min));
        while (min < i) {
            i5 |= (this.c[i4] & 255) << min;
            min += 8;
            i4++;
        }
        int i6 = i5 & ((-1) >>> (32 - i));
        b(i);
        return i6;
    }

    public final void b(int i) {
        int i2;
        int i3 = i / 8;
        int i4 = this.a + i3;
        this.a = i4;
        int i5 = this.b + (i - (i3 * 8));
        this.b = i5;
        if (i5 > 7) {
            i4++;
            this.a = i4;
            i5 -= 8;
            this.b = i5;
        }
        boolean z = false;
        if (i4 >= 0 && (i4 < (i2 = this.d) || (i4 == i2 && i5 == 0))) {
            z = true;
        }
        lti.c(z);
    }

    public final boolean c() {
        int i = (this.c[this.a] & 255) >> this.b;
        b(1);
        return 1 == (i & 1);
    }
}
