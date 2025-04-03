package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eujj implements etgi {
    private final RSAPublicKey a;
    private final euiu b;
    private final euiu c;
    private final int d;
    private final byte[] e;
    private final byte[] f;

    public eujj(RSAPublicKey rSAPublicKey, euiu euiuVar, euiu euiuVar2, int i, byte[] bArr, byte[] bArr2) {
        if (etmk.a()) {
            throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        eujq.d(euiuVar);
        if (!euiuVar.equals(euiuVar2)) {
            throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
        }
        eujq.b(rSAPublicKey.getModulus().bitLength());
        eujq.c(rSAPublicKey.getPublicExponent());
        this.a = rSAPublicKey;
        this.b = euiuVar;
        this.c = euiuVar2;
        this.d = i;
        this.e = bArr;
        this.f = bArr2;
    }

    private final void b(byte[] bArr, byte[] bArr2) {
        RSAPublicKey rSAPublicKey = this.a;
        BigInteger publicExponent = rSAPublicKey.getPublicExponent();
        BigInteger modulus = rSAPublicKey.getModulus();
        int bitLength = modulus.bitLength() + 7;
        int bitLength2 = modulus.bitLength() + 6;
        if (bitLength / 8 != bArr.length) {
            throw new GeneralSecurityException("invalid signature's length");
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bigInteger.compareTo(modulus) >= 0) {
            throw new GeneralSecurityException("signature out of range");
        }
        byte[] b = etqq.b(bigInteger.modPow(publicExponent, modulus), bitLength2 / 8);
        int bitLength3 = modulus.bitLength() - 1;
        eujq.d(this.b);
        MessageDigest messageDigest = (MessageDigest) euil.d.a(eujp.a(this.b));
        messageDigest.update(bArr2);
        byte[] bArr3 = this.f;
        if (bArr3.length != 0) {
            messageDigest.update(bArr3);
        }
        byte[] digest = messageDigest.digest();
        int digestLength = messageDigest.getDigestLength();
        int length = b.length;
        if (length < this.d + digestLength + 2) {
            throw new GeneralSecurityException("inconsistent");
        }
        if (b[length - 1] != -68) {
            throw new GeneralSecurityException("inconsistent");
        }
        int i = length - digestLength;
        int i2 = i - 1;
        byte[] copyOf = Arrays.copyOf(b, i2);
        int length2 = copyOf.length;
        byte[] copyOfRange = Arrays.copyOfRange(b, length2, length2 + digestLength);
        int i3 = 8;
        int i4 = 0;
        while (true) {
            int i5 = digestLength;
            long j = (length * 8) - bitLength3;
            if (i4 < j) {
                if (((copyOf[i4 / 8] >> (7 - (i4 % 8))) & 1) != 0) {
                    throw new GeneralSecurityException("inconsistent");
                }
                i4++;
                digestLength = i5;
            } else {
                MessageDigest messageDigest2 = (MessageDigest) euil.d.a(eujp.a(this.c));
                int digestLength2 = messageDigest2.getDigestLength();
                byte[] bArr4 = new byte[i2];
                int i6 = 0;
                int i7 = 0;
                while (i6 <= (i - 2) / digestLength2) {
                    messageDigest2.reset();
                    messageDigest2.update(copyOfRange);
                    messageDigest2.update(etqq.b(BigInteger.valueOf(i6), 4));
                    byte[] digest2 = messageDigest2.digest();
                    int length3 = digest2.length;
                    System.arraycopy(digest2, 0, bArr4, i7, Math.min(length3, i2 - i7));
                    i7 += length3;
                    i6++;
                    i3 = i3;
                    messageDigest2 = messageDigest2;
                }
                int i8 = i3;
                byte[] bArr5 = new byte[i2];
                for (int i9 = 0; i9 < i2; i9++) {
                    bArr5[i9] = (byte) (bArr4[i9] ^ copyOf[i9]);
                }
                for (int i10 = 0; i10 <= j; i10++) {
                    int i11 = i10 / 8;
                    bArr5[i11] = (byte) ((~(1 << (7 - (i10 % 8)))) & bArr5[i11]);
                }
                int i12 = 0;
                while (true) {
                    int i13 = this.d;
                    int i14 = (i - i13) - 2;
                    if (i12 >= i14) {
                        if (bArr5[i14] != 1) {
                            throw new GeneralSecurityException("inconsistent");
                        }
                        byte[] copyOfRange2 = Arrays.copyOfRange(bArr5, i2 - i13, i2);
                        int i15 = i5 + 8;
                        byte[] bArr6 = new byte[this.d + i15];
                        System.arraycopy(digest, 0, bArr6, i8, digest.length);
                        System.arraycopy(copyOfRange2, 0, bArr6, i15, copyOfRange2.length);
                        if (!MessageDigest.isEqual(messageDigest.digest(bArr6), copyOfRange)) {
                            throw new GeneralSecurityException("inconsistent");
                        }
                        return;
                    }
                    if (bArr5[i12] != 0) {
                        throw new GeneralSecurityException("inconsistent");
                    }
                    i12++;
                }
            }
        }
    }

    @Override // defpackage.etgi
    public final void a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.e;
        if (bArr3.length == 0) {
            b(bArr, bArr2);
        } else {
            if (!ettp.e(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            byte[] bArr4 = this.e;
            b(Arrays.copyOfRange(bArr, bArr4.length, bArr.length), bArr2);
        }
    }
}
