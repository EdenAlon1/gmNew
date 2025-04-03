package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etle implements etfk {
    private static final byte[] a = euiv.b("808182838485868788898a8b8c8d8e8f909192939495969798999a9b9c9d9e9f");
    private static final byte[] b = euiv.b("070000004041424344454647");
    private static final byte[] c = euiv.b("a0784d7a4716f3feb4f64e7f4b39bf04");
    private static final ThreadLocal d = new etld();
    private final SecretKey e;
    private final byte[] f;

    public etle(byte[] bArr, byte[] bArr2) {
        if (!etmj.a(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (!d()) {
            throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
        }
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.e = new SecretKeySpec(bArr, "ChaCha20");
        this.f = bArr2;
    }

    public static Cipher c() {
        return (Cipher) d.get();
    }

    public static boolean d() {
        return d.get() != null;
    }

    public static boolean e(Cipher cipher) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(b);
            byte[] bArr = a;
            cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
            byte[] bArr2 = c;
            if (cipher.doFinal(bArr2).length != 0) {
                return false;
            }
            cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
            return cipher.doFinal(bArr2).length == 0;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // defpackage.etfk
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        byte[] bArr3 = this.f;
        if (bArr.length < bArr3.length + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!ettp.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = new byte[12];
        System.arraycopy(bArr, this.f.length, bArr4, 0, 12);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        Cipher cipher = (Cipher) d.get();
        cipher.init(2, this.e, ivParameterSpec);
        return cipher.doFinal(bArr, this.f.length + 12, (r0 - r7) - 12);
    }

    @Override // defpackage.etfk
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("plaintext is null");
        }
        byte[] b2 = ettg.b(12);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(b2);
        Cipher cipher = (Cipher) d.get();
        cipher.init(1, this.e, ivParameterSpec);
        int length = bArr.length;
        int outputSize = cipher.getOutputSize(length);
        byte[] bArr3 = this.f;
        int length2 = bArr3.length;
        if (outputSize > 2147483635 - length2) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] copyOf = Arrays.copyOf(bArr3, length2 + 12 + outputSize);
        System.arraycopy(b2, 0, copyOf, this.f.length, 12);
        if (cipher.doFinal(bArr, 0, length, copyOf, this.f.length + 12) == outputSize) {
            return copyOf;
        }
        throw new GeneralSecurityException("not enough data written");
    }
}
