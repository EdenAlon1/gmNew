package defpackage;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euhp implements etfk {
    private final SecretKey a;
    private final byte[] b;

    public euhp(byte[] bArr) {
        this(bArr, eujt.b(new byte[0]));
    }

    @Override // defpackage.etfk
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        byte[] bArr3 = this.b;
        if (bArr.length < bArr3.length + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!ettp.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        AlgorithmParameterSpec b = etks.b(bArr, this.b.length, 12);
        SecretKey secretKey = this.a;
        Cipher c = etks.c();
        c.init(2, secretKey, b);
        return c.doFinal(bArr, this.b.length + 12, (r0 - r7) - 12);
    }

    @Override // defpackage.etfk
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("plaintext is null");
        }
        byte[] b = ettg.b(12);
        AlgorithmParameterSpec a = etks.a(b);
        SecretKey secretKey = this.a;
        Cipher c = etks.c();
        c.init(1, secretKey, a);
        int length = bArr.length;
        int outputSize = c.getOutputSize(length);
        byte[] bArr3 = this.b;
        int length2 = bArr3.length;
        if (outputSize > 2147483635 - length2) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] copyOf = Arrays.copyOf(bArr3, length2 + 12 + outputSize);
        System.arraycopy(b, 0, copyOf, this.b.length, 12);
        if (c.doFinal(bArr, 0, length, copyOf, this.b.length + 12) == outputSize) {
            return copyOf;
        }
        throw new GeneralSecurityException("not enough data written");
    }

    public euhp(byte[] bArr, eujt eujtVar) {
        if (!etmj.a(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.a = etks.d(bArr);
        this.b = eujtVar.c();
    }
}
