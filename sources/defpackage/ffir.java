package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class ffir {
    public static final ffiq a = new ffiq();
    private static final byte[] b = {13, 10};
    private final boolean c;
    private final boolean d;

    static {
        new ffir(true, false);
        new ffir(false, true);
    }

    public ffir(boolean z, boolean z2) {
        this.c = z;
        this.d = z2;
        if (z && z2) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public static /* synthetic */ String c(ffir ffirVar, byte[] bArr) {
        int i;
        int length = bArr.length;
        ffirVar.b(length, length);
        int a2 = ffirVar.a(length);
        byte[] bArr2 = new byte[a2];
        ffirVar.b(length, length);
        int a3 = ffirVar.a(length);
        if (a3 > a2) {
            throw new IndexOutOfBoundsException(a.r(a3, a2, "The destination array does not have enough capacity, destination offset: 0, destination size: ", ", capacity needed: "));
        }
        byte[] bArr3 = ffirVar.c ? ffis.b : ffis.a;
        int i2 = true != ffirVar.d ? Alert.DURATION_SHOW_INDEFINITELY : 19;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = length - i3;
            if (i3 + 2 >= length) {
                break;
            }
            int min = Math.min(i / 3, i2);
            for (int i5 = 0; i5 < min; i5++) {
                int i6 = bArr[i3] & 255;
                int i7 = i3 + 2;
                int i8 = bArr[i3 + 1] & 255;
                i3 += 3;
                int i9 = (i8 << 8) | (i6 << 16) | (bArr[i7] & 255);
                bArr2[i4] = bArr3[i9 >>> 18];
                bArr2[i4 + 1] = bArr3[(i9 >>> 12) & 63];
                int i10 = i4 + 3;
                bArr2[i4 + 2] = bArr3[(i9 >>> 6) & 63];
                i4 += 4;
                bArr2[i10] = bArr3[i9 & 63];
            }
            if (min == i2 && i3 != length) {
                byte[] bArr4 = b;
                bArr2[i4] = bArr4[0];
                bArr2[i4 + 1] = bArr4[1];
                i4 += 2;
            }
        }
        if (i == 1) {
            int i11 = (bArr[i3] & 255) << 4;
            bArr2[i4] = bArr3[i11 >>> 6];
            bArr2[i4 + 1] = bArr3[i11 & 63];
            bArr2[i4 + 2] = 61;
            bArr2[i4 + 3] = 61;
            i3++;
        } else if (i == 2) {
            int i12 = i3 + 1;
            int i13 = bArr[i3] & 255;
            i3 += 2;
            int i14 = ((bArr[i12] & 255) << 2) | (i13 << 10);
            bArr2[i4] = bArr3[i14 >>> 12];
            bArr2[i4 + 1] = bArr3[(i14 >>> 6) & 63];
            bArr2[i4 + 2] = bArr3[i14 & 63];
            bArr2[i4 + 3] = 61;
        }
        if (i3 == length) {
            return new String(bArr2, ffoo.b);
        }
        throw new IllegalStateException("Check failed.");
    }

    public final int a(int i) {
        int i2 = (i / 3) * 4;
        if (i % 3 != 0) {
            i2 += 4;
        }
        if (this.d) {
            int i3 = (i2 - 1) / 76;
            i2 += i3 + i3;
        }
        if (i2 >= 0) {
            return i2;
        }
        throw new IllegalArgumentException("Input is too big");
    }

    public final void b(int i, int i2) {
        ffda.a(0, i2, i);
    }
}
