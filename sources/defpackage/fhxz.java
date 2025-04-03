package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhxz {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v19 */
    public static PrivateKeyInfo a(fhqo fhqoVar, ASN1Set aSN1Set) {
        int i;
        int i2;
        int i3;
        byte[][] bArr;
        int i4;
        byte b;
        int i5;
        long[] jArr;
        int i6;
        long c;
        int i7;
        int i8;
        short[] sArr;
        int i9;
        if (fhqoVar instanceof ficf) {
            ficf ficfVar = (ficf) fhqoVar;
            return new PrivateKeyInfo(fhyy.s(ficfVar.b), new DEROctetString(fics.c(ficfVar.c)), aSN1Set);
        }
        if (fhqoVar instanceof fhxm) {
            fhxm fhxmVar = (fhxm) fhqoVar;
            return new PrivateKeyInfo(new AlgorithmIdentifier(fhtq.d, new fhtr(fhyy.t(fhxmVar.b))), new DEROctetString(fhxmVar.a()));
        }
        if (fhqoVar instanceof fhwe) {
            AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(fhtq.e);
            short[] a = ((fhwe) fhqoVar).a();
            int length = a.length;
            byte[] bArr2 = new byte[length + length];
            for (int i10 = 0; i10 != a.length; i10++) {
                short s = a[i10];
                int i11 = i10 + i10;
                bArr2[i11] = (byte) s;
                bArr2[i11 + 1] = (byte) (s >>> 8);
            }
            return new PrivateKeyInfo(algorithmIdentifier, new DEROctetString(bArr2));
        }
        if (fhqoVar instanceof fhvy) {
            fhvy fhvyVar = (fhvy) fhqoVar;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            fhvo.d(1, byteArrayOutputStream);
            fhvo.a(fhvyVar, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            fhvo.d(1, byteArrayOutputStream2);
            fhvo.a(fhvyVar.b(), byteArrayOutputStream2);
            return new PrivateKeyInfo(new AlgorithmIdentifier(PKCSObjectIdentifiers.E), new DEROctetString(byteArray), aSN1Set, byteArrayOutputStream2.toByteArray());
        }
        if (fhqoVar instanceof fhvr) {
            fhvr fhvrVar = (fhvr) fhqoVar;
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            fhvo.d(fhvrVar.b, byteArrayOutputStream3);
            fhvo.a(fhvrVar, byteArrayOutputStream3);
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            fhvo.d(fhvrVar.b, byteArrayOutputStream4);
            fhvo.a(fhvrVar.b().c, byteArrayOutputStream4);
            return new PrivateKeyInfo(new AlgorithmIdentifier(PKCSObjectIdentifiers.E), new DEROctetString(byteArray2), aSN1Set, byteArrayOutputStream4.toByteArray());
        }
        if (fhqoVar instanceof fhxw) {
            fhxw fhxwVar = (fhxw) fhqoVar;
            AlgorithmIdentifier algorithmIdentifier2 = new AlgorithmIdentifier(fhyy.q(fhxwVar.b));
            DEROctetString dEROctetString = new DEROctetString(fhxwVar.a());
            fhxo fhxoVar = fhxwVar.d;
            return new PrivateKeyInfo(algorithmIdentifier2, dEROctetString, aSN1Set, fics.e(fhxoVar.a, fhxoVar.b));
        }
        if (fhqoVar instanceof fhwu) {
            fhwu fhwuVar = (fhwu) fhqoVar;
            return new PrivateKeyInfo(new AlgorithmIdentifier(fhyy.m(fhwuVar.b)), new DEROctetString(fhwuVar.a()), aSN1Set);
        }
        if (!(fhqoVar instanceof fhui)) {
            if (fhqoVar instanceof fiae) {
                fiae fiaeVar = (fiae) fhqoVar;
                AlgorithmIdentifier algorithmIdentifier3 = new AlgorithmIdentifier(fhtq.f, new fhtu(fiaeVar.c.c, fhyy.u(fiaeVar.b)));
                byte[] s2 = fiaeVar.s();
                fiac fiacVar = fiaeVar.c;
                int i12 = fiacVar.f;
                int i13 = fiacVar.c;
                int l = (int) fiai.l(s2, 4);
                if (!fiai.f(i13, l)) {
                    throw new IllegalArgumentException("index out of bounds");
                }
                byte[] h = fiai.h(s2, 4, i12);
                int i14 = i12 + 4;
                byte[] h2 = fiai.h(s2, i14, i12);
                int i15 = i14 + i12;
                byte[] h3 = fiai.h(s2, i15, i12);
                int i16 = i15 + i12;
                byte[] h4 = fiai.h(s2, i16, i12);
                int i17 = i16 + i12;
                byte[] h5 = fiai.h(s2, i17, s2.length - i17);
                try {
                    int i18 = ((fhyz) fiai.c(h5, fhyz.class)).b;
                    return new PrivateKeyInfo(algorithmIdentifier3, i18 != (1 << i13) + (-1) ? new fhty(l, h, h2, h3, h4, h5, i18) : new fhty(l, h, h2, h3, h4, h5), aSN1Set);
                } catch (ClassNotFoundException e) {
                    throw new IOException("cannot parse BDS: ".concat(String.valueOf(e.getMessage())));
                }
            }
            if (fhqoVar instanceof fhzw) {
                fhzw fhzwVar = (fhzw) fhqoVar;
                fhzu fhzuVar = fhzwVar.c;
                AlgorithmIdentifier algorithmIdentifier4 = new AlgorithmIdentifier(fhtq.g, new fhtv(fhzuVar.d, fhzuVar.e, fhyy.u(fhzwVar.b)));
                byte[] s3 = fhzwVar.s();
                fhzu fhzuVar2 = fhzwVar.c;
                int a2 = fhzuVar2.a();
                int i19 = fhzuVar2.d;
                int i20 = (i19 + 7) / 8;
                long l2 = (int) fiai.l(s3, i20);
                if (!fiai.f(i19, l2)) {
                    throw new IllegalArgumentException("index out of bounds");
                }
                byte[] h6 = fiai.h(s3, i20, a2);
                int i21 = i20 + a2;
                byte[] h7 = fiai.h(s3, i21, a2);
                int i22 = i21 + a2;
                byte[] h8 = fiai.h(s3, i22, a2);
                int i23 = i22 + a2;
                byte[] h9 = fiai.h(s3, i23, a2);
                int i24 = i23 + a2;
                byte[] h10 = fiai.h(s3, i24, s3.length - i24);
                try {
                    long j = ((fhza) fiai.c(h10, fhza.class)).b;
                    return new PrivateKeyInfo(algorithmIdentifier4, j != (1 << i19) + (-1) ? new fhtw(l2, h6, h7, h8, h9, h10, j) : new fhtw(l2, h6, h7, h8, h9, h10), aSN1Set);
                } catch (ClassNotFoundException e2) {
                    throw new IOException("cannot parse BDSStateMap: ".concat(String.valueOf(e2.getMessage())));
                }
            }
            if (fhqoVar instanceof ficd) {
                ficd ficdVar = (ficd) fhqoVar;
                return new PrivateKeyInfo(new AlgorithmIdentifier(fhtq.c), new fhto(ficdVar.c, ficdVar.d, ficdVar.e, ficdVar.f, ficdVar.g, fhyy.r(ficdVar.b)));
            }
            if (fhqoVar instanceof fhvi) {
                fhvi fhviVar = (fhvi) fhqoVar;
                return new PrivateKeyInfo(new AlgorithmIdentifier(fhyy.g(fhviVar.b)), new DEROctetString(fics.c(fhviVar.c)), aSN1Set);
            }
            if (fhqoVar instanceof fhxh) {
                fhxh fhxhVar = (fhxh) fhqoVar;
                return new PrivateKeyInfo(new AlgorithmIdentifier(fhyy.o(fhxhVar.b)), new DEROctetString(fics.c(fhxhVar.c)), aSN1Set);
            }
            if (fhqoVar instanceof fhwi) {
                fhwi fhwiVar = (fhwi) fhqoVar;
                return new PrivateKeyInfo(new AlgorithmIdentifier(fhyy.k(fhwiVar.b)), new DEROctetString(fhwiVar.a()), aSN1Set);
            }
            if (fhqoVar instanceof fhve) {
                fhve fhveVar = (fhve) fhqoVar;
                return new PrivateKeyInfo(new AlgorithmIdentifier(fhyy.f(fhveVar.b)), new fhtl(fics.c(fhveVar.d), fics.c(fhveVar.e), fics.c(fhveVar.f), new fhtm(fics.c(fhveVar.c))), aSN1Set);
            }
            if (fhqoVar instanceof fhuy) {
                fhuy fhuyVar = (fhuy) fhqoVar;
                return new PrivateKeyInfo(new AlgorithmIdentifier(fhyy.i(fhuyVar.b)), new DEROctetString(fics.d(new byte[][]{fhuyVar.c, fhuyVar.f, fhuyVar.g, fhuyVar.d, fhuyVar.e})), aSN1Set);
            }
            if (fhqoVar instanceof fhwm) {
                fhwm fhwmVar = (fhwm) fhqoVar;
                ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
                aSN1EncodableVector.b(new DEROctetString(fics.c(fhwmVar.c)));
                aSN1EncodableVector.b(new DEROctetString(fics.c(fhwmVar.d)));
                aSN1EncodableVector.b(new DEROctetString(fics.c(fhwmVar.e)));
                aSN1EncodableVector.b(new DEROctetString(fics.c(fhwmVar.f)));
                return new PrivateKeyInfo(new AlgorithmIdentifier(fhyy.l(fhwmVar.b)), new DERSequence(aSN1EncodableVector), aSN1Set);
            }
            if (fhqoVar instanceof fhwq) {
                fhwq fhwqVar = (fhwq) fhqoVar;
                ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
                aSN1EncodableVector2.b(new DEROctetString(fics.c(fhwqVar.c)));
                aSN1EncodableVector2.b(new DEROctetString(fics.c(fhwqVar.d)));
                aSN1EncodableVector2.b(new DEROctetString(fics.c(fhwqVar.e)));
                aSN1EncodableVector2.b(new DEROctetString(fics.c(fhwqVar.f)));
                aSN1EncodableVector2.b(new DEROctetString(fics.c(fhwqVar.g)));
                return new PrivateKeyInfo(new AlgorithmIdentifier(fhyy.p(fhwqVar.b)), new DERSequence(aSN1EncodableVector2), aSN1Set);
            }
            if (fhqoVar instanceof fhur) {
                fhur fhurVar = (fhur) fhqoVar;
                return new PrivateKeyInfo(new AlgorithmIdentifier(fhyy.e(fhurVar.b)), new DEROctetString(fics.d(new byte[][]{fhurVar.c, fhurVar.d, fhurVar.e, fhurVar.f, fhurVar.g, fhurVar.h})), aSN1Set, new fhus(fhurVar.b, fhurVar.c, fhurVar.i).a());
            }
            if (fhqoVar instanceof fhuc) {
                fhuc fhucVar = (fhuc) fhqoVar;
                return new PrivateKeyInfo(new AlgorithmIdentifier(fhyy.d(fhucVar.b)), new DEROctetString(fhucVar.a()), aSN1Set);
            }
            if (fhqoVar instanceof fhvm) {
                fhvm fhvmVar = (fhvm) fhqoVar;
                return new PrivateKeyInfo(new AlgorithmIdentifier(fhyy.h(fhvmVar.b)), new DEROctetString(fhvmVar.a()), aSN1Set);
            }
            if (!(fhqoVar instanceof fhxb)) {
                throw new IOException("key parameters not recognized");
            }
            fhxb fhxbVar = (fhxb) fhqoVar;
            return new PrivateKeyInfo(new AlgorithmIdentifier(fhyy.n(fhxbVar.b)), new DEROctetString(fhxbVar.b.m == 3 ? fics.e(fhxbVar.o, fhxbVar.c) : fics.e(fics.e(fics.e(fics.e(fics.e(fics.e(fics.e(fics.e(fics.e(fics.e(fics.e(fics.e(fhxbVar.c, fhxd.c(fhxbVar.d)), fhxd.c(fhxbVar.e)), fhxd.c(fhxbVar.g)), fhxd.c(fhxbVar.f)), fhxd.d(fhxbVar.h, true)), fhxd.d(fhxbVar.i, false)), fhxd.d(fhxbVar.j, true)), fhxd.d(fhxbVar.k, false)), fhxd.d(fhxbVar.l, false)), fhxd.d(fhxbVar.m, true)), fhxd.d(fhxbVar.n, false)), fhxbVar.p)), aSN1Set);
        }
        fhui fhuiVar = (fhui) fhqoVar;
        AlgorithmIdentifier algorithmIdentifier5 = new AlgorithmIdentifier(fhyy.j(fhuiVar.b));
        fhuf fhufVar = fhuiVar.b.m;
        byte[] bArr3 = new byte[fhufVar.a()];
        byte[] bArr4 = fhuiVar.c;
        byte[] bArr5 = new byte[fhufVar.a()];
        int i25 = 1 << fhufVar.c;
        short[] sArr2 = new short[i25];
        long[] jArr2 = {0};
        int[] iArr = new int[i25];
        int i26 = i25 * 4;
        int i27 = (fhufVar.a >> 3) + i26;
        int i28 = 8;
        byte[] bArr6 = new byte[i27];
        int i29 = fhufVar.d;
        fhqk fhqkVar = new fhqk(256);
        fhqkVar.f((byte) 64);
        fhqkVar.g(bArr4, 0, 32);
        fhqkVar.l(bArr6, 0, i27);
        for (int i30 = 0; i30 < (1 << fhufVar.c); i30++) {
            iArr[i30] = ficw.b(bArr6, (((i27 - 32) - i29) - i26) + (i30 * 4));
        }
        int i31 = fhufVar.b;
        short[] sArr3 = new short[i31 + 1];
        sArr3[i31] = 1;
        for (int i32 = 0; i32 < fhufVar.b; i32++) {
            sArr3[i32] = (short) (ficw.d(bArr4, i32 + i32 + 40) & fhufVar.f);
        }
        int i33 = 1 << fhufVar.c;
        long[] jArr3 = new long[i33];
        for (int i34 = 0; i34 < (1 << fhufVar.c); i34++) {
            long j2 = iArr[i34];
            jArr3[i34] = j2;
            long j3 = j2 << 31;
            jArr3[i34] = j3;
            long j4 = j3 | i34;
            jArr3[i34] = j4;
            jArr3[i34] = j4 & Long.MAX_VALUE;
        }
        int i35 = 1;
        while (i35 < i33 - i35) {
            i35 += i35;
        }
        for (int i36 = i35; i36 > 0; i36 >>>= 1) {
            int i37 = 0;
            while (i37 < i33 - i36) {
                if ((i37 & i36) == 0) {
                    int i38 = i37 + i36;
                    long j5 = jArr3[i38];
                    long j6 = jArr3[i37];
                    i9 = i37;
                    long j7 = (-((j5 - j6) >>> 63)) & (j6 ^ j5);
                    jArr3[i9] = j6 ^ j7;
                    jArr3[i38] = jArr3[i38] ^ j7;
                } else {
                    i9 = i37;
                }
                i37 = i9 + 1;
            }
            int i39 = 0;
            for (int i40 = i35; i40 > i36; i40 >>>= 1) {
                while (i39 < i33 - i40) {
                    if ((i39 & i36) == 0) {
                        int i41 = i39 + i36;
                        long j8 = jArr3[i41];
                        i8 = i33;
                        int i42 = i40;
                        while (i42 > i36) {
                            int i43 = i39 + i42;
                            long j9 = jArr3[i43];
                            int i44 = i42;
                            long j10 = (-((j9 - j8) >>> 63)) & (j8 ^ j9);
                            j8 ^= j10;
                            jArr3[i43] = j9 ^ j10;
                            i42 = i44 >>> 1;
                            sArr3 = sArr3;
                        }
                        sArr = sArr3;
                        jArr3[i41] = j8;
                    } else {
                        i8 = i33;
                        sArr = sArr3;
                    }
                    i39++;
                    i33 = i8;
                    sArr3 = sArr;
                }
            }
        }
        short[] sArr4 = sArr3;
        int i45 = 1;
        while (true) {
            if (i45 >= (1 << fhufVar.c)) {
                short[] sArr5 = new short[fhufVar.a];
                for (int i46 = 0; i46 < (1 << fhufVar.c); i46++) {
                    sArr2[i46] = (short) (jArr3[i46] & fhufVar.f);
                }
                int i47 = 0;
                while (true) {
                    i = fhufVar.a;
                    if (i47 >= i) {
                        break;
                    }
                    short s4 = sArr2[i47];
                    int i48 = fhufVar.c;
                    short s5 = (short) (((s4 >> 8) & PrivateKeyType.INVALID) | ((s4 & 255) << 8));
                    short s6 = (short) (((s5 & 3855) << 4) | ((s5 >> 4) & 3855));
                    short s7 = (short) (((s6 & 13107) << 2) | ((s6 >> 2) & 13107));
                    int i49 = s7 >> 1;
                    int i50 = s7 & 21845;
                    short s8 = (short) ((i50 + i50) | (i49 & 21845));
                    sArr5[i47] = (short) (i48 == 12 ? s8 >> 4 : s8 >> 3);
                    i47++;
                }
                short[] sArr6 = new short[i];
                for (int i51 = 0; i51 < fhufVar.a; i51++) {
                    short s9 = sArr5[i51];
                    int i52 = fhufVar.b;
                    short s10 = sArr4[i52];
                    while (true) {
                        i52--;
                        if (i52 >= 0) {
                            s10 = (short) (fhufVar.g.b(s10, s9) ^ sArr4[i52]);
                        }
                    }
                    sArr6[i51] = s10;
                }
                int i53 = 0;
                while (true) {
                    i2 = fhufVar.a;
                    if (i53 >= i2) {
                        break;
                    }
                    sArr6[i53] = fhufVar.g.a(sArr6[i53]);
                    i53++;
                }
                byte[][] bArr7 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, fhufVar.e, i2 >> 3);
                for (int i54 = 0; i54 < fhufVar.e; i54++) {
                    for (int i55 = 0; i55 < (fhufVar.a >> 3); i55++) {
                        bArr7[i54][i55] = 0;
                    }
                }
                int i56 = 0;
                while (i56 < fhufVar.b) {
                    for (int i57 = 0; i57 < fhufVar.a; i57 += 8) {
                        int i58 = 0;
                        while (true) {
                            int i59 = fhufVar.c;
                            if (i58 < i59) {
                                int i60 = (sArr6[i57 + 7] >>> i58) & 1;
                                int i61 = (sArr6[i57 + 6] >>> i58) & 1;
                                int i62 = (i60 + i60) | i61;
                                int i63 = (i62 + i62) | ((sArr6[i57 + 5] >>> i58) & 1);
                                int i64 = (i63 + i63) | ((sArr6[i57 + 4] >>> i58) & 1);
                                int i65 = (i64 + i64) | ((sArr6[i57 + 3] >>> i58) & 1);
                                int i66 = (i65 + i65) | ((sArr6[i57 + 2] >>> i58) & 1);
                                int i67 = (i66 + i66) | ((sArr6[i57 + 1] >>> i58) & 1);
                                bArr7[(i59 * i56) + i58][i57 / 8] = (byte) (((byte) (i67 + i67)) | ((sArr6[i57] >>> i58) & 1));
                                i58++;
                            }
                        }
                    }
                    for (int i68 = 0; i68 < fhufVar.a; i68++) {
                        sArr6[i68] = fhufVar.g.b(sArr6[i68], sArr5[i68]);
                    }
                    i56++;
                }
                int i69 = 0;
                loop22: while (true) {
                    int i70 = fhufVar.e;
                    if (i69 >= i70) {
                        byte[][] bArr8 = bArr7;
                        if (!fhufVar.h) {
                            int i71 = ((fhufVar.a - i70) + 7) >> 3;
                            int i72 = 0;
                            while (true) {
                                int i73 = fhufVar.e;
                                if (i72 >= i73) {
                                    break;
                                }
                                System.arraycopy(bArr8[i72], i73 >> 3, bArr5, i71 * i72, i71);
                                i72++;
                            }
                        } else {
                            int i74 = i70 & 7;
                            if (i74 != 0) {
                                int i75 = 0;
                                int i76 = 0;
                                while (true) {
                                    int i77 = fhufVar.e;
                                    if (i75 >= i77) {
                                        break;
                                    }
                                    int i78 = (i77 - 1) >> 3;
                                    while (true) {
                                        i3 = i76 + 1;
                                        if (i78 < (fhufVar.a >> 3) - 1) {
                                            byte[] bArr9 = bArr8[i75];
                                            int i79 = (bArr9[i78] & 255) >>> i74;
                                            i78++;
                                            bArr5[i76] = (byte) ((bArr9[i78] << (8 - i74)) | i79);
                                            i76 = i3;
                                        }
                                    }
                                    bArr5[i76] = (byte) ((bArr8[i75][i78] & 255) >>> i74);
                                    i75++;
                                    i76 = i3;
                                }
                            } else {
                                System.arraycopy(bArr8[i56], (i70 - 1) >> 3, bArr5, 0, fhufVar.a >> 3);
                            }
                        }
                    } else {
                        int i80 = i69 >>> 3;
                        ?? r9 = i69 & 7;
                        if (fhufVar.i && i69 == i70 - 32) {
                            long[] jArr4 = new long[64];
                            long[] jArr5 = new long[32];
                            int i81 = i5 & 7;
                            int i82 = i5 >> 3;
                            bArr = bArr7;
                            i4 = i80;
                            byte[] bArr10 = new byte[9];
                            if (fhufVar.h) {
                                int i83 = 0;
                                while (true) {
                                    jArr = jArr5;
                                    if (i83 >= 32) {
                                        break;
                                    }
                                    for (int i84 = 0; i84 < 9; i84++) {
                                        bArr10[i84] = bArr[i5 + i83][i82 + i84];
                                    }
                                    int i85 = 0;
                                    for (int i86 = i28; i85 < i86; i86 = 8) {
                                        int i87 = i85;
                                        int i88 = i87 + 1;
                                        bArr10[i87] = (byte) (((bArr10[i87] & 255) >> i81) | (bArr10[i88] << (8 - i81)));
                                        i85 = i88;
                                    }
                                    jArr4[i83] = ficw.c(bArr10, 0);
                                    i83++;
                                    jArr5 = jArr;
                                    i28 = 8;
                                }
                                i6 = 32;
                            } else {
                                jArr = jArr5;
                                i6 = 32;
                                for (int i89 = 0; i89 < 32; i89++) {
                                    jArr4[i89] = ficw.c(bArr[i5 + i89], i82);
                                }
                            }
                            jArr2[0] = 0;
                            int i90 = 0;
                            byte b2 = r9;
                            while (i90 < i6) {
                                int i91 = i90 + 1;
                                byte b3 = b2;
                                long j11 = jArr4[i90];
                                int i92 = i90;
                                int i93 = i91;
                                while (i93 < i6) {
                                    j11 |= jArr4[i93];
                                    i93++;
                                    i6 = 32;
                                }
                                if (j11 == 0) {
                                    break loop22;
                                }
                                long j12 = ~j11;
                                long j13 = 72340172838076673L;
                                long j14 = 0;
                                for (int i94 = 0; i94 < 8; i94++) {
                                    j13 &= j12 >>> i94;
                                    j14 += j13;
                                }
                                long j15 = j14 & 578721382704613384L;
                                long j16 = j15 | (j15 >>> 1);
                                long j17 = j14 >>> 8;
                                long j18 = j16 | (j16 >>> 2);
                                long j19 = j18;
                                long j20 = j14 + (j17 & j18);
                                int i95 = 2;
                                for (int i96 = 8; i95 < i96; i96 = 8) {
                                    j19 &= j19 >>> i96;
                                    j17 >>>= i96;
                                    j20 += j17 & j19;
                                    i95++;
                                }
                                int i97 = ((int) j20) & PrivateKeyType.INVALID;
                                long j21 = i97;
                                jArr[i92] = j21;
                                jArr2[0] = jArr2[0] | (1 << ((int) j21));
                                int i98 = i91;
                                while (true) {
                                    i6 = 32;
                                    if (i98 >= 32) {
                                        break;
                                    }
                                    jArr4[i92] = jArr4[i92] ^ (jArr4[i98] & (((r9 >> i97) & 1) - 1));
                                    i98++;
                                }
                                int i99 = i91;
                                while (i99 < i6) {
                                    long j22 = jArr4[i99];
                                    int i100 = i99;
                                    jArr4[i100] = j22 ^ (jArr4[i92] & (-((j22 >> i97) & 1)));
                                    i99 = i100 + 1;
                                    i6 = 32;
                                }
                                b2 = b3;
                                i90 = i91;
                            }
                            b = b2;
                            int i101 = 0;
                            while (i101 < i6) {
                                int i102 = i101 + 1;
                                int i103 = i102;
                                while (i103 < 64) {
                                    int i104 = i5 + i101;
                                    short s11 = sArr2[i104];
                                    int i105 = i102;
                                    long j23 = (-(((((short) i103) ^ ((short) jArr[r40])) - 1) >>> 63)) & (s11 ^ sArr2[r38]);
                                    sArr2[i104] = (short) (s11 ^ j23);
                                    sArr2[i5 + i103] = (short) (j23 ^ sArr2[r38]);
                                    i103++;
                                    i102 = i105;
                                    i101 = i101;
                                }
                                i101 = i102;
                                i6 = 32;
                            }
                            int i106 = 0;
                            while (i106 < fhufVar.e) {
                                if (fhufVar.h) {
                                    for (int i107 = 0; i107 < 9; i107++) {
                                        bArr10[i107] = bArr[i106][i82 + i107];
                                    }
                                    int i108 = 0;
                                    while (i108 < 8) {
                                        int i109 = i108 + 1;
                                        bArr10[i108] = (byte) ((bArr10[i109] << (8 - i81)) | ((bArr10[i108] & 255) >> i81));
                                        i108 = i109;
                                    }
                                    c = ficw.c(bArr10, 0);
                                } else {
                                    c = ficw.c(bArr[i106], i82);
                                }
                                int i110 = 0;
                                while (i110 < 32) {
                                    long j24 = c >> i110;
                                    int i111 = i110;
                                    int i112 = (int) jArr[i111];
                                    long j25 = (j24 ^ (c >> i112)) & 1;
                                    long j26 = ((j25 << i112) ^ c) ^ (j25 << i111);
                                    i110 = i111 + 1;
                                    c = j26;
                                }
                                if (fhufVar.h) {
                                    int i113 = 8 - i81;
                                    fhun.a(bArr10, 0, c);
                                    byte[] bArr11 = bArr[i106];
                                    int i114 = i82 + 8;
                                    i7 = i106;
                                    bArr11[i114] = (byte) (((bArr10[7] & 255) >>> i113) | (((bArr11[i114] & 255) >>> i81) << i81));
                                    bArr11[i82] = (byte) (((bArr10[0] & 255) << i81) | (((bArr11[i82] & 255) << i113) >>> i113));
                                    int i115 = 7;
                                    while (i115 > 0) {
                                        byte[] bArr12 = bArr[i7];
                                        int i116 = i82 + i115;
                                        int i117 = (bArr10[i115] & 255) << i81;
                                        int i118 = i115 - 1;
                                        bArr12[i116] = (byte) (((bArr10[i118] & 255) >>> i113) | i117);
                                        i115 = i118;
                                    }
                                } else {
                                    i7 = i106;
                                    fhun.a(bArr[i7], i82, c);
                                }
                                i106 = i7 + 1;
                            }
                        } else {
                            bArr = bArr7;
                            i4 = i80;
                            b = r9 == true ? 1 : 0;
                        }
                        int i119 = i69 + 1;
                        for (int i120 = i119; i120 < fhufVar.e; i120++) {
                            int i121 = (((byte) (bArr[i69][i4] ^ bArr[i120][i4])) >> b) & 1;
                            for (int i122 = 0; i122 < (fhufVar.a >> 3); i122++) {
                                byte[] bArr13 = bArr[i69];
                                bArr13[i122] = (byte) ((bArr[i120][i122] & (-i121)) ^ bArr13[i122]);
                            }
                        }
                        if (((bArr[i69][i4] >> b) & 1) == 0) {
                            break;
                        }
                        for (int i123 = 0; i123 < fhufVar.e; i123++) {
                            if (i123 != i69) {
                                int i124 = (bArr[i123][i4] >> b) & 1;
                                for (int i125 = 0; i125 < (fhufVar.a >> 3); i125++) {
                                    byte[] bArr14 = bArr[i123];
                                    bArr14[i125] = (byte) ((bArr[i69][i125] & (-i124)) ^ bArr14[i125]);
                                }
                            }
                        }
                        i69 = i119;
                        bArr7 = bArr;
                        i56 = i4;
                        i28 = 8;
                    }
                }
            } else {
                if ((jArr3[i45 - 1] >> 31) == (jArr3[i45] >> 31)) {
                    break;
                }
                i45++;
            }
        }
        fhtk fhtkVar = new fhtk(bArr3);
        byte[] g = fics.g(fhuiVar.c, 0, 32);
        byte[] g2 = fics.g(fhuiVar.c, 32, 40);
        byte[] bArr15 = fhuiVar.c;
        int i126 = fhuiVar.b.l;
        byte[] g3 = fics.g(bArr15, 40, i126 + i126 + 40);
        byte[] bArr16 = fhuiVar.c;
        int i127 = fhuiVar.b.l;
        byte[] g4 = fics.g(bArr16, i127 + i127 + 40, bArr16.length - 32);
        byte[] bArr17 = fhuiVar.c;
        int length2 = bArr17.length;
        return new PrivateKeyInfo(algorithmIdentifier5, new fhtj(g, g2, g3, g4, fics.g(bArr17, length2 - 32, length2), fhtkVar), aSN1Set);
    }
}
