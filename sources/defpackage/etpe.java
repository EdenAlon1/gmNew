package defpackage;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class etpe implements etpg {
    private final int a;

    public etpe(ethw ethwVar) {
        int i = ethwVar.b;
        int i2 = ethwVar.c;
        if (ethwVar.d != ethv.c) {
            throw new GeneralSecurityException("invalid variant");
        }
        this.a = ethwVar.a;
    }

    @Override // defpackage.etpg
    public final int a() {
        return this.a;
    }

    @Override // defpackage.etpg
    public final byte[] b(byte[] bArr, byte[] bArr2, int i) {
        int length = bArr2.length;
        if (length < i) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (bArr.length != this.a) {
            throw new GeneralSecurityException("invalid key size");
        }
        SecretKey d = etks.d(bArr);
        if (length < i + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec b = etks.b(bArr2, i, 12);
        Cipher c = etks.c();
        c.init(2, d, b);
        return c.doFinal(bArr2, i + 12, (length - i) - 12);
    }

    @Override // defpackage.etpg
    public final byte[] c(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if (bArr.length != this.a) {
            throw new GeneralSecurityException("invalid key size");
        }
        SecretKey d = etks.d(bArr);
        byte[] b = ettg.b(12);
        AlgorithmParameterSpec a = etks.a(b);
        Cipher c = etks.c();
        c.init(1, d, a);
        int length = bArr4.length;
        int outputSize = c.getOutputSize(length);
        int length2 = bArr2.length;
        int length3 = bArr3.length;
        int i = length2 + length3;
        if (outputSize > 2147483635 - i) {
            throw new GeneralSecurityException("plaintext too long");
        }
        int i2 = i + 12;
        byte[] copyOf = Arrays.copyOf(bArr2, i2 + outputSize);
        System.arraycopy(bArr3, 0, copyOf, length2, length3);
        System.arraycopy(b, 0, copyOf, i, 12);
        if (c.doFinal(bArr4, 0, length, copyOf, i2) == outputSize) {
            return copyOf;
        }
        throw new GeneralSecurityException("not enough data written");
    }
}
