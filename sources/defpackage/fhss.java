package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fhss extends fhsu {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected fhss(int r6, int r7, int r8, int r9) {
        /*
            r5 = this;
            java.lang.String r0 = "org.bouncycastle.ec.max_f2m_field_size"
            java.lang.String r0 = defpackage.ficz.a(r0)
            if (r0 == 0) goto Ld
            int r0 = java.lang.Integer.parseInt(r0)
            goto Lf
        Ld:
            r0 = 1142(0x476, float:1.6E-42)
        Lf:
            if (r6 > r0) goto L85
            r0 = r8 | r9
            r1 = 3
            r2 = 2
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L22
            int[] r8 = new int[r1]
            r8[r4] = r4
            r8[r3] = r7
            r8[r2] = r6
            goto L31
        L22:
            r0 = 5
            int[] r0 = new int[r0]
            r0[r4] = r4
            r0[r3] = r7
            r0[r2] = r8
            r0[r1] = r9
            r7 = 4
            r0[r7] = r6
            r8 = r0
        L31:
            fhtd r6 = defpackage.fhte.a
            r6 = r8[r4]
            if (r6 != 0) goto L7d
        L37:
            int r6 = r8.length
            if (r3 >= r6) goto L4d
            r6 = r8[r3]
            int r7 = r3 + (-1)
            r7 = r8[r7]
            if (r6 <= r7) goto L45
            int r3 = r3 + 1
            goto L37
        L45:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Polynomial exponents must be monotonically increasing"
            r6.<init>(r7)
            throw r6
        L4d:
            fhtg r6 = new fhtg
            fhtd r7 = defpackage.fhte.a
            fhtf r9 = new fhtf
            r9.<init>(r8)
            r6.<init>(r7, r9)
            r5.<init>(r6)
            java.lang.String r6 = "org.bouncycastle.ec.disable"
            boolean r6 = defpackage.ficz.b(r6)
            if (r6 != 0) goto L75
            java.lang.String r6 = "org.bouncycastle.ec.disable_f2m"
            boolean r6 = defpackage.ficz.b(r6)
            if (r6 != 0) goto L6d
            return
        L6d:
            java.lang.UnsupportedOperationException r6 = new java.lang.UnsupportedOperationException
            java.lang.String r7 = "F2M disabled by \"org.bouncycastle.ec.disable_f2m\""
            r6.<init>(r7)
            throw r6
        L75:
            java.lang.UnsupportedOperationException r6 = new java.lang.UnsupportedOperationException
            java.lang.String r7 = "F2M disabled by \"org.bouncycastle.ec.disable\""
            r6.<init>(r7)
            throw r6
        L7d:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Irreducible polynomials in GF(2) must have constant term"
            r6.<init>(r7)
            throw r6
        L85:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "field size out of range: "
            java.lang.String r6 = defpackage.a.h(r6, r8)
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhss.<init>(int, int, int, int):void");
    }

    public static BigInteger a(SecureRandom secureRandom, int i) {
        BigInteger bigInteger;
        do {
            BigInteger bigInteger2 = fict.a;
            if (i <= 0) {
                throw new IllegalArgumentException("bitLength must be at least 1");
            }
            int i2 = (i + 7) >> 3;
            byte[] bArr = new byte[i2];
            secureRandom.nextBytes(bArr);
            bArr[0] = (byte) (((byte) (PrivateKeyType.INVALID >>> ((i2 * 8) - i))) & bArr[0]);
            bigInteger = new BigInteger(1, bArr);
        } while (bigInteger.signum() <= 0);
        return bigInteger;
    }

    @Override // defpackage.fhsu
    public final fhta b(BigInteger bigInteger, BigInteger bigInteger2) {
        fhsx c = c(bigInteger);
        fhsx c2 = c(bigInteger2);
        int i = this.h;
        if (i == 5 || i == 6) {
            if (!c.o()) {
                c2 = c2.f(c).d(c);
            } else if (!c2.k().equals(this.e)) {
                throw new IllegalArgumentException();
            }
        }
        return d(c, c2);
    }
}
