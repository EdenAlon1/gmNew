package defpackage;

import java.io.IOException;
import java.lang.reflect.Array;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhxy {
    public static fhqo a(PrivateKeyInfo privateKeyInfo) {
        if (privateKeyInfo == null) {
            throw new IllegalArgumentException("keyInfo array null");
        }
        AlgorithmIdentifier algorithmIdentifier = privateKeyInfo.a;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = algorithmIdentifier.a;
        if (aSN1ObjectIdentifier.m(fhtq.h)) {
            return new ficf(fhyy.a(algorithmIdentifier), ASN1OctetString.f(privateKeyInfo.a()).c);
        }
        if (aSN1ObjectIdentifier.w(fhtq.d)) {
            return new fhxm(ASN1OctetString.f(privateKeyInfo.a()).c, fhyy.c(fhtr.a(algorithmIdentifier.b)));
        }
        int i = 0;
        int i2 = 1;
        if (aSN1ObjectIdentifier.w(fhtq.e)) {
            byte[] bArr = ASN1OctetString.f(privateKeyInfo.a()).c;
            int length = bArr.length >> 1;
            short[] sArr = new short[length];
            while (i != length) {
                sArr[i] = ficw.d(bArr, i + i);
                i++;
            }
            return new fhwe(sArr);
        }
        if (aSN1ObjectIdentifier.w(PKCSObjectIdentifiers.E)) {
            byte[] bArr2 = ASN1OctetString.f(privateKeyInfo.a()).c;
            ASN1BitString aSN1BitString = privateKeyInfo.c;
            if (ficw.a(bArr2, 0) != 1) {
                if (aSN1BitString == null) {
                    return fhvr.a(fics.g(bArr2, 4, bArr2.length));
                }
                byte[] n = aSN1BitString.n();
                fhvr a = fhvr.a(fics.g(bArr2, 4, bArr2.length));
                a.c = fhvs.a(n);
                return a;
            }
            if (aSN1BitString == null) {
                return fhvy.a(fics.g(bArr2, 4, bArr2.length));
            }
            byte[] n2 = aSN1BitString.n();
            byte[] g = fics.g(bArr2, 4, bArr2.length);
            byte[] g2 = fics.g(n2, 4, n2.length);
            fhvy a2 = fhvy.a(g);
            a2.b = fhvz.a(g2);
            return a2;
        }
        if (aSN1ObjectIdentifier.m(BCObjectIdentifiers.n) || aSN1ObjectIdentifier.m(BCObjectIdentifiers.Y)) {
            fhxv J = fhyy.J(aSN1ObjectIdentifier);
            ASN1Encodable a3 = privateKeyInfo.a();
            if (!(a3 instanceof ASN1Sequence)) {
                return new fhxw(J, ASN1OctetString.f(a3).c);
            }
            fhts fhtsVar = a3 != null ? new fhts(ASN1Sequence.j(a3)) : null;
            fhtt fhttVar = fhtsVar.c;
            return new fhxw(J, fics.c(fhtsVar.a), fics.c(fhtsVar.b), fhttVar.b(), fhttVar.a());
        }
        if (aSN1ObjectIdentifier.m(BCObjectIdentifiers.al)) {
            return new fhwu(fhyy.G(aSN1ObjectIdentifier), ASN1OctetString.f(privateKeyInfo.a()).c);
        }
        if (aSN1ObjectIdentifier.m(BCObjectIdentifiers.aT)) {
            ASN1Encodable a4 = privateKeyInfo.a();
            fhtj fhtjVar = a4 != null ? new fhtj(ASN1Sequence.j(a4)) : null;
            return new fhui(fhyy.x(aSN1ObjectIdentifier), fics.c(fhtjVar.a), fics.c(fhtjVar.b), fics.c(fhtjVar.c), fics.c(fhtjVar.d), fics.c(fhtjVar.e));
        }
        if (aSN1ObjectIdentifier.m(BCObjectIdentifiers.be)) {
            return new fhvi(fhyy.B(aSN1ObjectIdentifier), ASN1OctetString.f(privateKeyInfo.a()).c);
        }
        if (aSN1ObjectIdentifier.m(BCObjectIdentifiers.bl)) {
            return new fhxh(fhyy.I(aSN1ObjectIdentifier), ASN1OctetString.f(privateKeyInfo.a()).c);
        }
        if (aSN1ObjectIdentifier.m(BCObjectIdentifiers.bF)) {
            return new fhwi(fhyy.D(aSN1ObjectIdentifier), ASN1OctetString.f(privateKeyInfo.a()).c);
        }
        if (aSN1ObjectIdentifier.m(BCObjectIdentifiers.bM)) {
            return new fhuy(fhyy.z(aSN1ObjectIdentifier), ASN1OctetString.f(privateKeyInfo.a()).c);
        }
        if (aSN1ObjectIdentifier.m(BCObjectIdentifiers.bU)) {
            ASN1Sequence j = ASN1Sequence.j(privateKeyInfo.a());
            return new fhwm(fhyy.E(aSN1ObjectIdentifier), ASN1OctetString.f(j.h(0)).c, ASN1OctetString.f(j.h(1)).c, ASN1OctetString.f(j.h(2)).c, ASN1OctetString.f(j.h(3)).c);
        }
        if (aSN1ObjectIdentifier.m(BCObjectIdentifiers.cb)) {
            ASN1Sequence j2 = ASN1Sequence.j(privateKeyInfo.a());
            return new fhwq(fhyy.F(aSN1ObjectIdentifier), ASN1OctetString.f(j2.h(0)).c, ASN1OctetString.f(j2.h(1)).c, ASN1OctetString.f(j2.h(2)).c, ASN1OctetString.f(j2.h(3)).c, ASN1OctetString.f(j2.h(4)).c);
        }
        if (aSN1ObjectIdentifier.w(BCObjectIdentifiers.aC) || aSN1ObjectIdentifier.w(BCObjectIdentifiers.aD) || aSN1ObjectIdentifier.w(BCObjectIdentifiers.aE)) {
            ASN1Encodable a5 = privateKeyInfo.a();
            fhuq y = fhyy.y(aSN1ObjectIdentifier);
            if (!(a5 instanceof ASN1Sequence)) {
                if (!(a5 instanceof DEROctetString)) {
                    throw new IOException("not supported");
                }
                byte[] bArr3 = ASN1OctetString.f(a5).c;
                ASN1BitString aSN1BitString2 = privateKeyInfo.c;
                return aSN1BitString2 != null ? new fhur(y, bArr3, fhyc.b(y, aSN1BitString2)) : new fhur(y, bArr3, null);
            }
            ASN1Sequence j3 = ASN1Sequence.j(a5);
            int f = ASN1Integer.m(j3.h(0)).f();
            if (f != 0) {
                throw new IOException(a.h(f, "unknown private key version: "));
            }
            ASN1BitString aSN1BitString3 = privateKeyInfo.c;
            return aSN1BitString3 != null ? new fhur(y, ASN1BitString.i(j3.h(1)).n(), ASN1BitString.i(j3.h(2)).n(), ASN1BitString.i(j3.h(3)).n(), ASN1BitString.i(j3.h(4)).n(), ASN1BitString.i(j3.h(5)).n(), ASN1BitString.i(j3.h(6)).n(), fhyc.b(y, aSN1BitString3).b()) : new fhur(y, ASN1BitString.i(j3.h(1)).n(), ASN1BitString.i(j3.h(2)).n(), ASN1BitString.i(j3.h(3)).n(), ASN1BitString.i(j3.h(4)).n(), ASN1BitString.i(j3.h(5)).n(), ASN1BitString.i(j3.h(6)).n(), null);
        }
        if (aSN1ObjectIdentifier.w(BCObjectIdentifiers.aA) || aSN1ObjectIdentifier.w(BCObjectIdentifiers.aB)) {
            ASN1Encodable a6 = privateKeyInfo.a();
            fhtl fhtlVar = a6 != null ? new fhtl(ASN1Sequence.j(a6)) : null;
            return new fhve(fhyy.A(aSN1ObjectIdentifier), fics.c(fhtlVar.a), fics.c(fhtlVar.b), fics.c(fhtlVar.c), fhtlVar.d.a);
        }
        if (aSN1ObjectIdentifier.m(BCObjectIdentifiers.ci)) {
            byte[] bArr4 = ASN1OctetString.f(privateKeyInfo.a()).c;
            fhub w = fhyy.w(aSN1ObjectIdentifier);
            byte[] g3 = fics.g(bArr4, 0, w.a());
            int a7 = w.a();
            int a8 = w.a();
            byte[] g4 = fics.g(bArr4, a7, a8 + a8);
            int a9 = w.a();
            return new fhuc(w, g3, g4, fics.g(bArr4, a9 + a9, bArr4.length));
        }
        if (aSN1ObjectIdentifier.m(BCObjectIdentifiers.cm)) {
            return new fhvm(fhyy.C(aSN1ObjectIdentifier), ASN1OctetString.f(privateKeyInfo.a()).c);
        }
        if (aSN1ObjectIdentifier.m(BCObjectIdentifiers.aI)) {
            return new fhxb(fhyy.H(aSN1ObjectIdentifier), ASN1OctetString.f(privateKeyInfo.a()).c);
        }
        if (aSN1ObjectIdentifier.w(fhtq.f)) {
            fhtu a10 = fhtu.a(algorithmIdentifier.b);
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = a10.b.a;
            ASN1Encodable a11 = privateKeyInfo.a();
            fhty fhtyVar = a11 != null ? new fhty(ASN1Sequence.j(a11)) : null;
            try {
                fiad fiadVar = new fiad(new fiac(a10.a, fhyy.v(aSN1ObjectIdentifier2)));
                fiadVar.b = fhtyVar.b;
                fiadVar.d = fiai.g(fics.c(fhtyVar.c));
                fiadVar.e = fiai.g(fics.c(fhtyVar.d));
                fiadVar.f = fiai.g(fics.c(fhtyVar.e));
                fiadVar.g = fiai.g(fics.c(fhtyVar.f));
                if (fhtyVar.a != 0) {
                    fiadVar.c = fhtyVar.g;
                }
                if (fhtyVar.a() != null) {
                    fiadVar.h = new fhyz((fhyz) fiai.c(fhtyVar.a(), fhyz.class), aSN1ObjectIdentifier2);
                }
                return new fiae(fiadVar);
            } catch (ClassNotFoundException e) {
                throw new IOException("ClassNotFoundException processing BDS state: ".concat(String.valueOf(e.getMessage())));
            }
        }
        if (aSN1ObjectIdentifier.w(fhtq.g)) {
            fhtv a12 = fhtv.a(algorithmIdentifier.b);
            ASN1ObjectIdentifier aSN1ObjectIdentifier3 = a12.c.a;
            try {
                ASN1Encodable a13 = privateKeyInfo.a();
                fhtw fhtwVar = a13 != null ? new fhtw(ASN1Sequence.j(a13)) : null;
                fhzv fhzvVar = new fhzv(new fhzu(a12.a, a12.b, fhyy.v(aSN1ObjectIdentifier3)));
                fhzvVar.b = fhtwVar.b;
                fhzvVar.d = fiai.g(fics.c(fhtwVar.d));
                fhzvVar.e = fiai.g(fics.c(fhtwVar.e));
                fhzvVar.f = fiai.g(fics.c(fhtwVar.f));
                fhzvVar.g = fiai.g(fics.c(fhtwVar.g));
                if (fhtwVar.a != 0) {
                    fhzvVar.c = fhtwVar.c;
                }
                if (fhtwVar.a() != null) {
                    fhza fhzaVar = (fhza) fiai.c(fhtwVar.a(), fhza.class);
                    fhza fhzaVar2 = new fhza(fhzaVar.b);
                    for (Integer num : fhzaVar.a.keySet()) {
                        fhzaVar2.a.put(num, new fhyz((fhyz) fhzaVar.a.get(num), aSN1ObjectIdentifier3));
                    }
                    if (fhzaVar2.b == 0) {
                        fhzvVar.h = new fhza(fhzaVar2, (1 << fhzvVar.a.d) - 1);
                    } else {
                        fhzvVar.h = fhzaVar2;
                    }
                }
                return new fhzw(fhzvVar);
            } catch (ClassNotFoundException e2) {
                throw new IOException("ClassNotFoundException processing BDS state: ".concat(String.valueOf(e2.getMessage())));
            }
        }
        if (!aSN1ObjectIdentifier.w(fhtq.c)) {
            throw new RuntimeException("algorithm identifier in private key not recognised");
        }
        ASN1Encodable a14 = privateKeyInfo.a();
        fhto fhtoVar = a14 != null ? new fhto(ASN1Sequence.j(a14)) : null;
        int i3 = fhtoVar.a;
        int i4 = fhtoVar.b;
        fici a15 = fhtoVar.a();
        fico ficoVar = new fico(fhtoVar.a(), fhtoVar.c);
        ficn ficnVar = new ficn(fhtoVar.d);
        String b = fhyy.b(fhtoVar.e.a);
        int i5 = a15.a;
        int i6 = 1 << i5;
        int c = ficoVar.c();
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, c, i6);
        int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, c, i6);
        int i7 = 0;
        while (i7 < i6) {
            int[] iArr3 = iArr2[i];
            int[] iArr4 = ficoVar.c;
            int i8 = i2;
            int i9 = ficoVar.b;
            int i10 = iArr4[i9];
            int i11 = i9 - 1;
            while (i11 >= 0) {
                i10 = ficoVar.c[i11] ^ ficoVar.a.b(i10, i7);
                i11--;
                i = i;
            }
            iArr3[i7] = a15.a(i10);
            i7++;
            i2 = i8;
            i = i;
        }
        int i12 = i;
        int i13 = i2;
        for (int i14 = i13; i14 < c; i14++) {
            for (int i15 = i12; i15 < i6; i15++) {
                iArr2[i14][i15] = a15.b(iArr2[i14 - 1][i15], i15);
            }
        }
        for (int i16 = i12; i16 < c; i16++) {
            for (int i17 = i12; i17 < i6; i17++) {
                int i18 = i12;
                while (i18 <= i16) {
                    int[] iArr5 = iArr[i16];
                    iArr5[i17] = iArr5[i17] ^ a15.b(iArr2[i18][i17], ficoVar.b((c + i18) - i16));
                    i18++;
                    ficnVar = ficnVar;
                }
            }
        }
        ficn ficnVar2 = ficnVar;
        int[] iArr6 = new int[2];
        iArr6[i13] = (i6 + 31) >>> 5;
        iArr6[i12] = c * i5;
        int[][] iArr7 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, iArr6);
        for (int i19 = i12; i19 < i6; i19++) {
            int i20 = i19 >>> 5;
            int i21 = i13 << (i19 & 31);
            int i22 = i12;
            while (i22 < c) {
                int i23 = i22 + 1;
                int i24 = iArr[i22][i19];
                for (int i25 = i12; i25 < i5; i25++) {
                    if (((i24 >>> i25) & 1) != 0) {
                        int[] iArr8 = iArr7[((i23 * i5) - i25) - 1];
                        iArr8[i20] = iArr8[i20] ^ i21;
                    }
                }
                i22 = i23;
            }
        }
        new fich(i6, iArr7);
        return new ficd(i3, i4, a15, ficoVar, ficnVar2, b);
    }
}
