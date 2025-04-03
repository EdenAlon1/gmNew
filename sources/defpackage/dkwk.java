package defpackage;

import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkwk implements dkwc {
    public byte[] a;

    @Override // defpackage.dkwc
    public final void c(XmlSerializer xmlSerializer) {
        int i;
        char[] cArr;
        byte[] bArr = this.a;
        char[] cArr2 = dkte.a;
        int i2 = 0;
        int length = bArr != null ? bArr.length : 0;
        if (length == 0) {
            cArr = new char[0];
        } else {
            int i3 = length / 3;
            int i4 = length - 1;
            int i5 = ((i4 / 3) + 1) << 2;
            char[] cArr3 = new char[i5];
            int i6 = 0;
            int i7 = 0;
            while (true) {
                i = i3 * 3;
                if (i6 >= i) {
                    break;
                }
                int i8 = bArr[i6] & 255;
                int i9 = i6 + 2;
                int i10 = bArr[i6 + 1] & 255;
                i6 += 3;
                int i11 = (i10 << 8) | (i8 << 16) | (bArr[i9] & 255);
                char[] cArr4 = dkte.a;
                cArr3[i7] = cArr4[i11 >>> 18];
                cArr3[i7 + 1] = cArr4[(i11 >>> 12) & 63];
                int i12 = i7 + 3;
                cArr3[i7 + 2] = cArr4[(i11 >>> 6) & 63];
                i7 += 4;
                cArr3[i12] = cArr4[i11 & 63];
            }
            int i13 = length - i;
            if (i13 > 0) {
                int i14 = bArr[i] & 255;
                if (i13 == 2) {
                    i2 = (bArr[i4] & 255) << 2;
                    i13 = 2;
                }
                char[] cArr5 = dkte.a;
                int i15 = (i14 << 10) | i2;
                cArr3[i5 - 4] = cArr5[i15 >> 12];
                cArr3[i5 - 3] = cArr5[(i15 >>> 6) & 63];
                cArr3[i5 - 2] = i13 == 2 ? cArr5[i15 & 63] : '=';
                cArr3[i5 - 1] = '=';
            }
            cArr = cArr3;
        }
        xmlSerializer.text(new String(cArr));
    }
}
