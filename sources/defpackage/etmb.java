package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etmb implements etfk {
    private final byte[] a;
    private final byte[] b;

    public etmb(byte[] bArr, byte[] bArr2) {
        if (!etmj.a(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (!c()) {
            throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
        }
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.a = bArr;
        this.b = bArr2;
    }

    public static boolean c() {
        return etle.c() != null;
    }

    static byte[] d(byte[] bArr) {
        byte[] bArr2 = new byte[12];
        System.arraycopy(bArr, 16, bArr2, 4, 8);
        return bArr2;
    }

    @Override // defpackage.etfk
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        byte[] bArr3 = this.b;
        if (bArr.length < bArr3.length + 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!ettp.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = new byte[24];
        System.arraycopy(bArr, this.b.length, bArr4, 0, 24);
        SecretKeySpec secretKeySpec = new SecretKeySpec(etlk.d(this.a, bArr4), "ChaCha20");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(d(bArr4));
        Cipher c = etle.c();
        c.init(2, secretKeySpec, ivParameterSpec);
        return c.doFinal(bArr, this.b.length + 24, (r0 - r7) - 24);
    }

    @Override // defpackage.etfk
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("plaintext is null");
        }
        byte[] bArr3 = this.a;
        byte[] b = ettg.b(24);
        SecretKeySpec secretKeySpec = new SecretKeySpec(etlk.d(bArr3, b), "ChaCha20");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(d(b));
        Cipher c = etle.c();
        c.init(1, secretKeySpec, ivParameterSpec);
        int length = bArr.length;
        int outputSize = c.getOutputSize(length);
        byte[] bArr4 = this.b;
        int length2 = bArr4.length;
        if (outputSize > 2147483623 - length2) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] copyOf = Arrays.copyOf(bArr4, length2 + 24 + outputSize);
        System.arraycopy(b, 0, copyOf, this.b.length, 24);
        if (c.doFinal(bArr, 0, length, copyOf, this.b.length + 24) == outputSize) {
            return copyOf;
        }
        throw new GeneralSecurityException("not enough data written");
    }
}
