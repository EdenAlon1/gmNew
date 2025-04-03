package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euja implements etvo {
    private static final ThreadLocal a = new euiz();
    private final SecretKey b;
    private final byte[] c;
    private final byte[] d;

    public euja(byte[] bArr) {
        eujq.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.b = secretKeySpec;
        Cipher b = b();
        b.init(1, secretKeySpec);
        byte[] b2 = etvf.b(b.doFinal(new byte[16]));
        this.c = b2;
        this.d = etvf.b(b2);
    }

    private static Cipher b() {
        if (etmj.a(1)) {
            return (Cipher) a.get();
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    private static void c(byte[] bArr, byte[] bArr2, int i, byte[] bArr3) {
        for (int i2 = 0; i2 < 16; i2++) {
            bArr3[i2] = (byte) (bArr[i2] ^ bArr2[i2 + i]);
        }
    }

    @Override // defpackage.etvo
    public final byte[] a(byte[] bArr, int i) {
        if (i > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        SecretKey secretKey = this.b;
        Cipher b = b();
        b.init(1, secretKey);
        int length = bArr.length;
        int i2 = length != 0 ? 1 + ((length - 1) >> 4) : 1;
        int i3 = i2 - 1;
        int i4 = i3 * 16;
        byte[] d = i2 * 16 == length ? euhs.d(bArr, i4, this.c, 16) : euhs.c(etvf.a(Arrays.copyOfRange(bArr, i4, length)), this.d);
        byte[] bArr2 = new byte[16];
        byte[] bArr3 = new byte[16];
        for (int i5 = 0; i5 < i3; i5++) {
            c(bArr2, bArr, i5 * 16, bArr3);
            if (b.doFinal(bArr3, 0, 16, bArr2) != 16) {
                throw new IllegalStateException("Cipher didn't write full block");
            }
        }
        c(bArr2, d, 0, bArr3);
        if (b.doFinal(bArr3, 0, 16, bArr2) == 16) {
            return i == 16 ? bArr2 : Arrays.copyOf(bArr2, i);
        }
        throw new IllegalStateException("Cipher didn't write full block");
    }
}
