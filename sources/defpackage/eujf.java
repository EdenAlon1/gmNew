package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eujf implements etgi {
    private final RSAPublicKey a;
    private final euiu b;
    private final byte[] c;
    private final byte[] d;

    public eujf(RSAPublicKey rSAPublicKey, euiu euiuVar, byte[] bArr, byte[] bArr2) {
        if (etmk.a()) {
            throw new GeneralSecurityException("Conscrypt is not available, and we cannot use Java Implementation of RSA-PKCS1.5 in FIPS-mode.");
        }
        eujq.d(euiuVar);
        eujq.b(rSAPublicKey.getModulus().bitLength());
        eujq.c(rSAPublicKey.getPublicExponent());
        this.a = rSAPublicKey;
        this.b = euiuVar;
        this.c = bArr;
        this.d = bArr2;
    }

    private final void b(byte[] bArr, byte[] bArr2) {
        byte[] b;
        int i;
        RSAPublicKey rSAPublicKey = this.a;
        BigInteger publicExponent = rSAPublicKey.getPublicExponent();
        BigInteger modulus = rSAPublicKey.getModulus();
        int bitLength = (modulus.bitLength() + 7) / 8;
        if (bitLength != bArr.length) {
            throw new GeneralSecurityException("invalid signature's length");
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bigInteger.compareTo(modulus) >= 0) {
            throw new GeneralSecurityException("signature out of range");
        }
        byte[] b2 = etqq.b(bigInteger.modPow(publicExponent, modulus), bitLength);
        euiu euiuVar = this.b;
        eujq.d(euiuVar);
        MessageDigest messageDigest = (MessageDigest) euil.d.a(eujp.a(this.b));
        messageDigest.update(bArr2);
        byte[] bArr3 = this.d;
        if (bArr3.length != 0) {
            messageDigest.update(bArr3);
        }
        byte[] digest = messageDigest.digest();
        int ordinal = euiuVar.ordinal();
        int i2 = 2;
        if (ordinal == 2) {
            b = euiv.b("3031300d060960864801650304020105000420");
        } else if (ordinal == 3) {
            b = euiv.b("3041300d060960864801650304020205000430");
        } else {
            if (ordinal != 4) {
                throw new GeneralSecurityException("Unsupported hash ".concat(euiuVar.toString()));
            }
            b = euiv.b("3051300d060960864801650304020305000440");
        }
        if (bitLength < b.length + digest.length + 11) {
            throw new GeneralSecurityException("intended encoded message length too short");
        }
        byte[] bArr4 = new byte[bitLength];
        bArr4[0] = 0;
        bArr4[1] = 1;
        int i3 = 0;
        while (true) {
            i = i2 + 1;
            if (i3 >= (bitLength - r5) - 3) {
                break;
            }
            bArr4[i2] = -1;
            i3++;
            i2 = i;
        }
        bArr4[i2] = 0;
        int length = b.length;
        System.arraycopy(b, 0, bArr4, i, length);
        System.arraycopy(digest, 0, bArr4, i + length, digest.length);
        if (!MessageDigest.isEqual(b2, bArr4)) {
            throw new GeneralSecurityException("invalid signature");
        }
    }

    @Override // defpackage.etgi
    public final void a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.c;
        if (bArr3.length == 0) {
            b(bArr, bArr2);
        } else {
            if (!ettp.e(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            byte[] bArr4 = this.c;
            b(Arrays.copyOfRange(bArr, bArr4.length, bArr.length), bArr2);
        }
    }
}
