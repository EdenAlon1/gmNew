package defpackage;

import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ficn {
    public int[] a;

    public ficn(byte[] bArr) {
        int length = bArr.length;
        if (length <= 4) {
            throw new IllegalArgumentException("invalid encoding");
        }
        int a = ficl.a(bArr, 0);
        int a2 = fick.a(a - 1);
        if (length != (a * a2) + 4) {
            throw new IllegalArgumentException("invalid encoding");
        }
        this.a = new int[a];
        for (int i = 0; i < a; i++) {
            int[] iArr = this.a;
            int i2 = (i * a2) + 4;
            int i3 = 0;
            for (int i4 = a2 - 1; i4 >= 0; i4--) {
                i3 |= (bArr[i2 + i4] & PrivateKeyType.INVALID) << (i4 * 8);
            }
            iArr[i] = i3;
        }
        int[] iArr2 = this.a;
        int length2 = iArr2.length;
        boolean[] zArr = new boolean[length2];
        for (int i5 : iArr2) {
            if (i5 < 0 || i5 >= length2 || zArr[i5]) {
                throw new IllegalArgumentException("invalid encoding");
            }
            zArr[i5] = true;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ficn) {
            return ficj.a(this.a, ((ficn) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return fics.b(this.a);
    }

    public final String toString() {
        String str = "[" + this.a[0];
        int i = 1;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                return str.concat("]");
            }
            str = str + ", " + iArr[i];
            i++;
        }
    }
}
