package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ncn {
    public static final int[] a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    public static final int[] c = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    public static final int[] d = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
    public static final int[] e = {5, 8, 10, 12};
    public static final int[] f = {6, 9, 12, 15};
    public static final int[] g = {2, 4, 6, 8};
    public static final int[] h = {9, 11, 13, 16};
    public static final int[] i = {5, 8, 10, 12};

    public static luu a(byte[] bArr) {
        byte b2 = bArr[0];
        if (b2 == Byte.MAX_VALUE || b2 == 100 || b2 == 64 || b2 == 113) {
            return new luu(bArr);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        byte b3 = copyOf[0];
        if (b3 == -2 || b3 == -1 || b3 == 37 || b3 == -14 || b3 == -24) {
            for (int i2 = 0; i2 < copyOf.length - 1; i2 += 2) {
                byte b4 = copyOf[i2];
                int i3 = i2 + 1;
                copyOf[i2] = copyOf[i3];
                copyOf[i3] = b4;
            }
        }
        luu luuVar = new luu(copyOf);
        if (copyOf[0] == 31) {
            luu luuVar2 = new luu(copyOf);
            while (luuVar2.a() >= 16) {
                luuVar2.n(2);
                int d2 = luuVar2.d(14) & 16383;
                int min = Math.min(8 - luuVar.c, 14);
                int i4 = luuVar.c;
                int i5 = (8 - i4) - min;
                byte[] bArr2 = luuVar.a;
                int i6 = luuVar.b;
                byte b5 = (byte) (((65280 >> i4) | ((1 << i5) - 1)) & bArr2[i6]);
                bArr2[i6] = b5;
                int i7 = 14 - min;
                bArr2[i6] = (byte) (b5 | ((d2 >>> i7) << i5));
                int i8 = i6 + 1;
                while (i7 > 8) {
                    i7 -= 8;
                    luuVar.a[i8] = (byte) (d2 >>> i7);
                    i8++;
                }
                byte[] bArr3 = luuVar.a;
                byte b6 = (byte) (bArr3[i8] & ((1 << r6) - 1));
                bArr3[i8] = b6;
                bArr3[i8] = (byte) (((d2 & ((1 << i7) - 1)) << (8 - i7)) | b6);
                luuVar.n(14);
                luuVar.g();
            }
        }
        luuVar.j(copyOf);
        return luuVar;
    }

    public static int b(luu luuVar, int[] iArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < 3 && luuVar.p(); i3++) {
            i2++;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 += 1 << iArr[i5];
        }
        return i4 + luuVar.d(iArr[i2]);
    }
}
