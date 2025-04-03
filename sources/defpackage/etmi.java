package defpackage;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etmi implements etfk {
    private static final byte[] a = euiv.b("7a806c");
    private static final byte[] b = euiv.b("46bb91c3c5");
    private static final byte[] c = euiv.b("36864200e0eaf5284d884a0e77d31646");
    private static final byte[] d = euiv.b("bae8e37fc83441b16034566b");
    private static final byte[] e = euiv.b("af60eb711bd85bc1e4d3e0a462e074eea428a8");
    private static final ThreadLocal f = new etmh();
    private final SecretKey g;
    private final byte[] h;

    public etmi(byte[] bArr, byte[] bArr2) {
        this.h = bArr2;
        eujq.a(bArr.length);
        this.g = new SecretKeySpec(bArr, "AES");
    }

    public static boolean c(Cipher cipher) {
        try {
            cipher.init(2, new SecretKeySpec(c, "AES"), d(d));
            cipher.updateAAD(b);
            byte[] bArr = e;
            return MessageDigest.isEqual(cipher.doFinal(bArr, 0, bArr.length), a);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    private static AlgorithmParameterSpec d(byte[] bArr) {
        return new GCMParameterSpec(128, bArr, 0, bArr.length);
    }

    private static final Cipher e() {
        Cipher cipher = (Cipher) f.get();
        if (cipher != null) {
            return cipher;
        }
        throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.");
    }

    private final byte[] f(byte[] bArr) {
        Cipher e2 = e();
        int length = bArr.length;
        if (length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        e2.init(2, this.g, new GCMParameterSpec(128, bArr, 0, 12));
        return e2.doFinal(bArr, 12, length - 12);
    }

    @Override // defpackage.etfk
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.h;
        if (bArr3.length == 0) {
            return f(bArr);
        }
        if (!ettp.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = this.h;
        return f(Arrays.copyOfRange(bArr, bArr4.length, bArr.length));
    }

    @Override // defpackage.etfk
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        Cipher e2 = e();
        int length = bArr.length;
        if (length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[length + 28];
        byte[] b2 = ettg.b(12);
        System.arraycopy(b2, 0, bArr3, 0, 12);
        e2.init(1, this.g, d(b2));
        int doFinal = e2.doFinal(bArr, 0, length, bArr3, 12);
        if (doFinal != length + 16) {
            throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(doFinal - length)));
        }
        byte[] bArr4 = this.h;
        return bArr4.length == 0 ? bArr3 : euhs.b(bArr4, bArr3);
    }
}
