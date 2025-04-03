package defpackage;

import java.lang.reflect.Array;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhxc extends fhwz {
    public short[][][] c;
    public byte[] d;
    public short[][][] e;
    public short[][][] f;
    public short[][][] g;
    public short[][][] h;
    public short[][][] i;

    public fhxc(fhxa fhxaVar, byte[] bArr) {
        super(false, fhxaVar);
        int i = fhxaVar.k;
        int i2 = fhxaVar.j;
        if (this.b.m == 1) {
            this.c = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, i, i2, i2);
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                for (int i5 = 0; i5 < i2; i5++) {
                    for (int i6 = 0; i6 < i; i6++) {
                        if (i4 > i5) {
                            this.c[i6][i4][i5] = 0;
                        } else {
                            this.c[i6][i4][i5] = (short) (bArr[i3] & 255);
                            i3++;
                        }
                    }
                }
            }
            return;
        }
        this.d = fics.g(bArr, 0, 32);
        int i7 = fhxaVar.h;
        int i8 = fhxaVar.g;
        int i9 = fhxaVar.i;
        this.e = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, i7, i8, i9);
        this.f = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, i7, i7, i7);
        this.g = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, i7, i7, i9);
        this.h = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, i7, i9, i9);
        this.i = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, i9, i9, i9);
        int b = fhxd.b(this.e, bArr, 32, false) + 32;
        int b2 = b + fhxd.b(this.f, bArr, b, true);
        int b3 = b2 + fhxd.b(this.g, bArr, b2, false);
        int b4 = b3 + fhxd.b(this.h, bArr, b3, true);
        if (b4 + fhxd.b(this.i, bArr, b4, true) != bArr.length) {
            throw new IllegalArgumentException("unparsed data in key encoding");
        }
    }
}
