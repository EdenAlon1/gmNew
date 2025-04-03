package defpackage;

import java.lang.reflect.Array;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhxb extends fhwz {
    public final byte[] c;
    public final short[][] d;
    public final short[][] e;
    public final short[][] f;
    public final short[][] g;
    public final short[][][] h;
    public final short[][][] i;
    public final short[][][] j;
    public final short[][][] k;
    public final short[][][] l;
    public final short[][][] m;
    public final short[][][] n;
    public final byte[] o;
    public byte[] p;

    public fhxb(fhxa fhxaVar, byte[] bArr) {
        super(true, fhxaVar);
        int i = 0;
        if (fhxaVar.m != 3) {
            int i2 = fhxaVar.g;
            int i3 = fhxaVar.h;
            int i4 = fhxaVar.i;
            short[][] sArr = (short[][]) Array.newInstance((Class<?>) Short.TYPE, i3, i4);
            this.d = sArr;
            short[][] sArr2 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, i2, i3);
            this.e = sArr2;
            short[][] sArr3 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, i2, i4);
            this.g = sArr3;
            short[][] sArr4 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, i3, i4);
            this.f = sArr4;
            short[][][] sArr5 = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, i3, i2, i2);
            this.h = sArr5;
            short[][][] sArr6 = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, i3, i2, i3);
            this.i = sArr6;
            short[][][] sArr7 = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, i4, i2, i2);
            this.j = sArr7;
            short[][][] sArr8 = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, i4, i2, i3);
            this.k = sArr8;
            short[][][] sArr9 = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, i4, i2, i4);
            this.l = sArr9;
            short[][][] sArr10 = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, i4, i3, i3);
            this.m = sArr10;
            short[][][] sArr11 = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, i4, i3, i4);
            this.n = sArr11;
            this.o = null;
            byte[] g = fics.g(bArr, 0, 32);
            this.c = g;
            int length = g.length;
            int a = length + fhxd.a(sArr, bArr, length);
            int a2 = a + fhxd.a(sArr2, bArr, a);
            int a3 = a2 + fhxd.a(sArr3, bArr, a2);
            int a4 = a3 + fhxd.a(sArr4, bArr, a3);
            int b = a4 + fhxd.b(sArr5, bArr, a4, true);
            int b2 = b + fhxd.b(sArr6, bArr, b, false);
            int b3 = b2 + fhxd.b(sArr7, bArr, b2, true);
            int b4 = b3 + fhxd.b(sArr8, bArr, b3, false);
            int b5 = b4 + fhxd.b(sArr9, bArr, b4, false);
            int b6 = b5 + fhxd.b(sArr10, bArr, b5, true);
            this.p = fics.g(bArr, b6 + fhxd.b(sArr11, bArr, b6, false), bArr.length);
            return;
        }
        byte[] g2 = fics.g(bArr, 0, 32);
        this.o = g2;
        byte[] g3 = fics.g(bArr, 32, 64);
        this.c = g3;
        int i5 = fhxaVar.m;
        int i6 = fhxaVar.g;
        int i7 = fhxaVar.h;
        int i8 = fhxaVar.i;
        byte[] c = fics.c(g3);
        byte[] c2 = fics.c(g2);
        fhwy fhwyVar = new fhwy(c, fhxaVar.l);
        fhwy fhwyVar2 = new fhwy(c2, fhxaVar.l);
        short[][] f = fhxd.f(fhwyVar, i7, i8);
        short[][] f2 = fhxd.f(fhwyVar, i6, i7);
        short[][] f3 = fhxd.f(fhwyVar, i6, i8);
        short[][] f4 = fhxd.f(fhwyVar, i7, i8);
        short[][] a5 = fhww.a(fhww.b(f2, f4), f3);
        short[][][] h = fhxd.h(fhwyVar2, i7, i6, i6, true);
        short[][][] h2 = fhxd.h(fhwyVar2, i7, i6, i7, false);
        short[][][] h3 = fhxd.h(fhwyVar2, i8, i6, i6, true);
        short[][][] h4 = fhxd.h(fhwyVar2, i8, i6, i7, false);
        short[][][] h5 = fhxd.h(fhwyVar2, i8, i6, i8, false);
        short[][][] h6 = fhxd.h(fhwyVar2, i8, i7, i7, true);
        short[][][] h7 = fhxd.h(fhwyVar2, i8, i7, i8, false);
        short[][][] c3 = fhww.c(f, h3, h);
        short[][][] c4 = fhww.c(f, h4, h2);
        short[][][] g4 = fhxd.g(c3);
        short[][][] sArr12 = new short[i7][][];
        while (i < i7) {
            short[][][] sArr13 = h4;
            short[][] e = fhww.e(c3[i]);
            sArr12[i] = e;
            short[][] b7 = fhww.b(e, f2);
            sArr12[i] = b7;
            sArr12[i] = fhww.a(b7, c4[i]);
            i++;
            h4 = sArr13;
        }
        short[][][] sArr14 = h4;
        short[][][] sArr15 = new short[i8][][];
        short[][][] sArr16 = new short[i8][][];
        short[][][] sArr17 = new short[i8][][];
        short[][][] sArr18 = new short[i8][][];
        short[][][] g5 = fhxd.g(h3);
        int i9 = 0;
        while (i9 < i8) {
            short[][][] sArr19 = sArr15;
            short[][] e2 = fhww.e(h3[i9]);
            short[][][] sArr20 = sArr16;
            short[][] b8 = fhww.b(e2, f2);
            sArr19[i9] = b8;
            short[][][] sArr21 = sArr12;
            sArr19[i9] = fhww.a(b8, sArr14[i9]);
            sArr20[i9] = fhww.b(e2, a5);
            short[][] a6 = fhww.a(sArr20[i9], fhww.b(sArr14[i9], f4));
            sArr20[i9] = a6;
            sArr20[i9] = fhww.a(a6, h5[i9]);
            short[][] a7 = fhww.a(fhww.b(h3[i9], f2), sArr14[i9]);
            short[][] d = fhww.d(f2);
            short[][] b9 = fhww.b(d, a7);
            sArr17[i9] = b9;
            short[][] a8 = fhww.a(b9, h6[i9]);
            sArr17[i9] = a8;
            int length2 = a8.length;
            short[][] sArr22 = f;
            if (length2 != a8[0].length) {
                throw new RuntimeException("Computation to upper triangular matrix is not possible!");
            }
            short[][] sArr23 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, length2, length2);
            int i10 = 0;
            while (i10 < a8.length) {
                sArr23[i10][i10] = a8[i10][i10];
                short[][] sArr24 = a8;
                int i11 = i10 + 1;
                while (i11 < sArr24[0].length) {
                    int i12 = i11;
                    sArr23[i10][i12] = fhwx.a(sArr24[i10][i12], sArr24[i12][i10]);
                    i11 = i12 + 1;
                }
                a8 = sArr24;
                i10 = i11;
            }
            sArr17[i9] = sArr23;
            sArr18[i9] = fhww.b(d, sArr20[i9]);
            sArr18[i9] = fhww.a(sArr18[i9], fhww.b(fhww.d(sArr14[i9]), a5));
            short[][] a9 = fhww.a(sArr18[i9], fhww.b(fhww.e(h6[i9]), f4));
            sArr18[i9] = a9;
            sArr18[i9] = fhww.a(a9, h7[i9]);
            i9++;
            sArr16 = sArr20;
            sArr15 = sArr19;
            sArr12 = sArr21;
            f = sArr22;
        }
        fhxb fhxbVar = new fhxb(fhxaVar, c, f, f2, f4, a5, g4, sArr12, g5, sArr15, sArr16, sArr17, sArr18);
        this.p = fhxbVar.p;
        this.d = fhxbVar.d;
        this.e = fhxbVar.e;
        this.f = fhxbVar.f;
        this.g = fhxbVar.g;
        this.h = fhxbVar.h;
        this.i = fhxbVar.i;
        this.j = fhxbVar.j;
        this.k = fhxbVar.k;
        this.l = fhxbVar.l;
        this.m = fhxbVar.m;
        this.n = fhxbVar.n;
    }

    public fhxb(fhxa fhxaVar, byte[] bArr, short[][] sArr, short[][] sArr2, short[][] sArr3, short[][] sArr4, short[][][] sArr5, short[][][] sArr6, short[][][] sArr7, short[][][] sArr8, short[][][] sArr9, short[][][] sArr10, short[][][] sArr11) {
        super(true, fhxaVar);
        this.o = null;
        this.p = null;
        this.c = (byte[]) bArr.clone();
        this.d = fhxd.e(sArr);
        this.e = fhxd.e(sArr2);
        this.f = fhxd.e(sArr3);
        this.g = fhxd.e(sArr4);
        this.h = fhxd.g(sArr5);
        this.i = fhxd.g(sArr6);
        this.j = fhxd.g(sArr7);
        this.k = fhxd.g(sArr8);
        this.l = fhxd.g(sArr9);
        this.m = fhxd.g(sArr10);
        this.n = fhxd.g(sArr11);
    }
}
