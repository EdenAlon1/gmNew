package defpackage;

import androidx.car.app.model.Alert;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etll {
    public static final byte[] a(byte[] bArr, byte[] bArr2, int i, SecretKey secretKey) {
        if (bArr.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        int length = bArr2.length;
        if (length < i + 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec a = etks.a(bArr);
        Cipher c = etks.c();
        c.init(2, secretKey, a);
        return c.doFinal(bArr2, i, length - i);
    }

    public static final byte[] b(byte[] bArr, byte[] bArr2, int i, SecretKey secretKey) {
        if (bArr.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        AlgorithmParameterSpec a = etks.a(bArr);
        Cipher c = etks.c();
        c.init(1, secretKey, a);
        int length = bArr2.length;
        int outputSize = c.getOutputSize(length);
        if (outputSize > Alert.DURATION_SHOW_INDEFINITELY - i) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[i + outputSize];
        if (c.doFinal(bArr2, 0, length, bArr3, i) == outputSize) {
            return bArr3;
        }
        throw new GeneralSecurityException("not enough data written");
    }
}
