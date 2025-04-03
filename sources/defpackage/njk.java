package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
final class njk extends nji {
    private njj a;
    private int o;
    private boolean p;
    private ndz q;
    private ndx r;

    @Override // defpackage.nji
    protected final long a(luv luvVar) {
        byte b = luvVar.a[0];
        if ((b & 1) == 1) {
            return -1L;
        }
        njj njjVar = this.a;
        lti.g(njjVar);
        int i = !njjVar.d[(b >> 1) & (PrivateKeyType.INVALID >>> (8 - njjVar.e))].a ? njjVar.a.e : njjVar.a.f;
        int i2 = this.p ? (this.o + i) / 4 : 0;
        int c = luvVar.c();
        int i3 = luvVar.c + 4;
        if (c < i3) {
            luvVar.H(Arrays.copyOf(luvVar.a, i3));
        } else {
            luvVar.J(i3);
        }
        long j = i2;
        byte[] bArr = luvVar.a;
        int i4 = luvVar.c;
        bArr[i4 - 4] = (byte) (j & 255);
        bArr[i4 - 3] = (byte) ((j >>> 8) & 255);
        bArr[i4 - 2] = (byte) ((j >>> 16) & 255);
        bArr[i4 - 1] = (byte) ((j >>> 24) & 255);
        this.p = true;
        this.o = i;
        return j;
    }

    @Override // defpackage.nji
    protected final void b(boolean z) {
        super.b(z);
        if (z) {
            this.a = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.p = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.nji
    protected final boolean c(luv luvVar, long j, njg njgVar) {
        njj njjVar;
        int i;
        int i2;
        int i3;
        int[] iArr;
        int i4 = 0;
        if (this.a != null) {
            lti.f(njgVar.a);
            return false;
        }
        ndz ndzVar = this.q;
        int i5 = 1;
        if (ndzVar == null) {
            nea.d(1, luvVar, false);
            luvVar.g();
            int j2 = luvVar.j();
            int g = luvVar.g();
            int f = luvVar.f();
            int i6 = f <= 0 ? -1 : f;
            int f2 = luvVar.f();
            int i7 = f2 <= 0 ? -1 : f2;
            luvVar.f();
            int j3 = luvVar.j();
            int pow = (int) Math.pow(2.0d, j3 & 15);
            int pow2 = (int) Math.pow(2.0d, (j3 & 240) >> 4);
            luvVar.j();
            this.q = new ndz(j2, g, i6, i7, pow, pow2, Arrays.copyOf(luvVar.a, luvVar.c));
        } else {
            int i8 = 4;
            ndx ndxVar = this.r;
            if (ndxVar == null) {
                this.r = nea.c(luvVar, true, true);
            } else {
                int i9 = luvVar.c;
                byte[] bArr = new byte[i9];
                System.arraycopy(luvVar.a, 0, bArr, 0, i9);
                int i10 = ndzVar.a;
                int i11 = 5;
                nea.d(5, luvVar, false);
                int j4 = luvVar.j() + 1;
                ndw ndwVar = new ndw(luvVar.a);
                int i12 = 8;
                ndwVar.b(luvVar.b * 8);
                int i13 = 0;
                while (true) {
                    int i14 = 2;
                    int i15 = i4;
                    int i16 = 16;
                    if (i13 < j4) {
                        int i17 = i12;
                        if (ndwVar.a(24) != 5653314) {
                            throw new lrg("expected code book to start with [0x56, 0x43, 0x42] at " + ((ndwVar.a * 8) + ndwVar.b), null, true, 1);
                        }
                        int a = ndwVar.a(16);
                        int a2 = ndwVar.a(24);
                        if (ndwVar.c()) {
                            ndwVar.b(i11);
                            for (int i18 = i15; i18 < a2; i18 += ndwVar.a(nea.a(a2 - i18))) {
                            }
                        } else {
                            boolean c = ndwVar.c();
                            for (int i19 = i15; i19 < a2; i19++) {
                                if (!c) {
                                    ndwVar.b(i11);
                                } else if (ndwVar.c()) {
                                    ndwVar.b(i11);
                                }
                            }
                        }
                        int i20 = i8;
                        int a3 = ndwVar.a(i20);
                        if (a3 > 2) {
                            throw new lrg(a.h(a3, "lookup type greater than 2 not decodable: "), null, true, 1);
                        }
                        if (a3 == i5) {
                            i14 = a3;
                        } else if (a3 != 2) {
                            i13++;
                            i12 = i17;
                            i4 = i15;
                            i8 = 4;
                            i11 = 5;
                            i5 = 1;
                        }
                        ndwVar.b(32);
                        ndwVar.b(32);
                        int a4 = ndwVar.a(i20) + i5;
                        ndwVar.b(i5);
                        ndwVar.b((int) ((i14 == i5 ? a != 0 ? (long) Math.floor(Math.pow(a2, 1.0d / a)) : 0L : a * a2) * a4));
                        i13++;
                        i12 = i17;
                        i4 = i15;
                        i8 = 4;
                        i11 = 5;
                        i5 = 1;
                    } else {
                        int i21 = i12;
                        boolean z = i5;
                        int i22 = 6;
                        int a5 = ndwVar.a(6) + (z ? 1 : 0);
                        for (int i23 = i15; i23 < a5; i23++) {
                            if (ndwVar.a(16) != 0) {
                                throw new lrg("placeholder of time domain transforms not zeroed out", null, z, z ? 1 : 0);
                            }
                        }
                        int a6 = ndwVar.a(6) + (z ? 1 : 0);
                        int i24 = i15;
                        int i25 = z;
                        while (true) {
                            int i26 = 3;
                            if (i24 < a6) {
                                int a7 = ndwVar.a(i16);
                                if (a7 == 0) {
                                    int i27 = i21;
                                    ndwVar.b(i27);
                                    ndwVar.b(16);
                                    ndwVar.b(16);
                                    ndwVar.b(6);
                                    ndwVar.b(i27);
                                    int a8 = ndwVar.a(4) + i25;
                                    int i28 = i15;
                                    while (i28 < a8) {
                                        ndwVar.b(i27);
                                        i28++;
                                        i27 = 8;
                                    }
                                } else {
                                    if (a7 != i25) {
                                        throw new lrg(a.h(a7, "floor type greater than 1 not decodable: "), null, true, 1);
                                    }
                                    int a9 = ndwVar.a(5);
                                    int[] iArr2 = new int[a9];
                                    int i29 = -1;
                                    for (int i30 = i15; i30 < a9; i30++) {
                                        int a10 = ndwVar.a(4);
                                        iArr2[i30] = a10;
                                        if (a10 > i29) {
                                            i29 = a10;
                                        }
                                    }
                                    int i31 = i29 + 1;
                                    int[] iArr3 = new int[i31];
                                    int i32 = i15;
                                    while (i32 < i31) {
                                        int i33 = 1;
                                        iArr3[i32] = ndwVar.a(i26) + 1;
                                        int a11 = ndwVar.a(2);
                                        if (a11 > 0) {
                                            i3 = i21;
                                            ndwVar.b(i3);
                                        } else {
                                            i3 = i21;
                                        }
                                        int i34 = i31;
                                        int i35 = i15;
                                        while (true) {
                                            int i36 = i33 << a11;
                                            iArr = iArr2;
                                            if (i35 < i36) {
                                                ndwVar.b(i3);
                                                i35++;
                                                iArr2 = iArr;
                                                i3 = 8;
                                                i33 = 1;
                                            }
                                        }
                                        i32++;
                                        iArr2 = iArr;
                                        i31 = i34;
                                        i21 = 8;
                                        i26 = 3;
                                    }
                                    int[] iArr4 = iArr2;
                                    ndwVar.b(2);
                                    int a12 = ndwVar.a(4);
                                    int i37 = i15;
                                    int i38 = i37;
                                    int i39 = i38;
                                    while (i37 < a9) {
                                        i38 += iArr3[iArr4[i37]];
                                        while (i39 < i38) {
                                            ndwVar.b(a12);
                                            i39++;
                                        }
                                        i37++;
                                    }
                                }
                                i24++;
                                i21 = 8;
                                i22 = 6;
                                i16 = 16;
                                i25 = 1;
                            } else {
                                int i40 = 1;
                                int a13 = ndwVar.a(i22) + 1;
                                int i41 = i15;
                                while (i41 < a13) {
                                    if (ndwVar.a(16) > 2) {
                                        throw new lrg("residueType greater than 2 is not decodable", null, true, 1);
                                    }
                                    ndwVar.b(24);
                                    ndwVar.b(24);
                                    ndwVar.b(24);
                                    int a14 = ndwVar.a(i22) + i40;
                                    int i42 = 8;
                                    ndwVar.b(8);
                                    int[] iArr5 = new int[a14];
                                    for (int i43 = i15; i43 < a14; i43++) {
                                        iArr5[i43] = ((ndwVar.c() ? ndwVar.a(5) : i15) * 8) + ndwVar.a(3);
                                    }
                                    int i44 = i15;
                                    while (i44 < a14) {
                                        int i45 = i15;
                                        while (i45 < i42) {
                                            if ((iArr5[i44] & (1 << i45)) != 0) {
                                                ndwVar.b(i42);
                                            }
                                            i45++;
                                            i42 = 8;
                                        }
                                        i44++;
                                        i42 = 8;
                                    }
                                    i41++;
                                    i22 = 6;
                                    i40 = 1;
                                }
                                int a15 = ndwVar.a(i22) + i40;
                                for (int i46 = i15; i46 < a15; i46++) {
                                    int a16 = ndwVar.a(16);
                                    if (a16 != 0) {
                                        luj.c("VorbisUtil", a.h(a16, "mapping type other than 0 not supported: "));
                                    } else {
                                        if (ndwVar.c()) {
                                            i = 1;
                                            i2 = ndwVar.a(4) + 1;
                                        } else {
                                            i = 1;
                                            i2 = 1;
                                        }
                                        if (ndwVar.c()) {
                                            int a17 = ndwVar.a(8) + i;
                                            for (int i47 = i15; i47 < a17; i47++) {
                                                int i48 = i10 - 1;
                                                ndwVar.b(nea.a(i48));
                                                ndwVar.b(nea.a(i48));
                                            }
                                        }
                                        if (ndwVar.a(2) != 0) {
                                            throw new lrg("to reserved bits must be zero after mapping coupling steps", null, true, 1);
                                        }
                                        if (i2 > 1) {
                                            for (int i49 = i15; i49 < i10; i49++) {
                                                ndwVar.b(4);
                                            }
                                        }
                                        for (int i50 = i15; i50 < i2; i50++) {
                                            ndwVar.b(8);
                                            ndwVar.b(8);
                                            ndwVar.b(8);
                                        }
                                    }
                                }
                                int a18 = ndwVar.a(6);
                                int i51 = a18 + 1;
                                ndy[] ndyVarArr = new ndy[i51];
                                for (int i52 = i15; i52 < i51; i52++) {
                                    boolean c2 = ndwVar.c();
                                    ndwVar.a(16);
                                    ndwVar.a(16);
                                    ndwVar.a(8);
                                    ndyVarArr[i52] = new ndy(c2);
                                }
                                if (!ndwVar.c()) {
                                    throw new lrg("framing bit after modes not set as expected", null, true, 1);
                                }
                                njjVar = new njj(ndzVar, ndxVar, bArr, ndyVarArr, nea.a(a18));
                            }
                        }
                    }
                }
            }
        }
        njjVar = null;
        this.a = njjVar;
        if (njjVar == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        ndz ndzVar2 = njjVar.a;
        arrayList.add(ndzVar2.g);
        arrayList.add(njjVar.c);
        lrb b = nea.b(engw.p(njjVar.b.a));
        lqb lqbVar = new lqb();
        lqbVar.a("audio/ogg");
        lqbVar.c("audio/vorbis");
        lqbVar.h = ndzVar2.d;
        lqbVar.i = ndzVar2.c;
        lqbVar.C = ndzVar2.a;
        lqbVar.D = ndzVar2.b;
        lqbVar.p = arrayList;
        lqbVar.k = b;
        njgVar.a = new lqc(lqbVar);
        return true;
    }

    @Override // defpackage.nji
    protected final void g(long j) {
        this.h = j;
        this.p = j != 0;
        ndz ndzVar = this.q;
        this.o = ndzVar != null ? ndzVar.e : 0;
    }
}
