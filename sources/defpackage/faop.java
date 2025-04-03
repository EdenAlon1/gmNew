package defpackage;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class faop {
    static {
        b();
    }

    public static byte[] a(SecretKey secretKey, byte[] bArr, byte[] bArr2) {
        if (secretKey == null || bArr == null || bArr2 == null) {
            throw null;
        }
        if (bArr.length == 0) {
            bArr = new byte[32];
        }
        return d(c(secretKey, bArr), bArr2);
    }

    public static void b() {
        try {
            try {
                MessageDigest.getInstance("SHA-256").digest("SecureMessage".getBytes("UTF-8"));
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException("No security provider initialized yet?", e2);
        }
    }

    private static byte[] c(SecretKey secretKey, byte[] bArr) {
        Mac mac = Mac.getInstance("HmacSHA256");
        try {
            mac.init(new SecretKeySpec(bArr, "AES"));
            byte[] encoded = secretKey.getEncoded();
            if (encoded != null) {
                return mac.doFinal(encoded);
            }
            throw new InvalidKeyException("Cannot get encoded form of SecretKey");
        } catch (InvalidKeyException e) {
            throw new AssertionError(e);
        }
    }

    private static byte[] d(byte[] bArr, byte[] bArr2) {
        Mac mac = Mac.getInstance("HmacSHA256");
        try {
            mac.init(new SecretKeySpec(bArr, "AES"));
            byte[] bArr3 = new byte[32];
            mac.reset();
            mac.update(bArr2);
            System.arraycopy(mac.doFinal(new byte[]{1}), 0, bArr3, 0, 32);
            byte[] bArr4 = new byte[32];
            System.arraycopy(bArr3, 0, bArr4, 0, 32);
            return bArr4;
        } catch (InvalidKeyException e) {
            throw new AssertionError(e);
        }
    }
}
