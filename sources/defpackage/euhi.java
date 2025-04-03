package defpackage;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euhi implements euix {
    private static final ThreadLocal b = new euhh();
    public final int a;
    private final SecretKeySpec c;
    private final int d;

    public euhi(byte[] bArr, int i) {
        if (!etmj.a(2)) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        eujq.a(bArr.length);
        this.c = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) b.get()).getBlockSize();
        this.d = blockSize;
        if (i > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.a = i;
    }

    public final void a(byte[] bArr, int i, int i2, byte[] bArr2, int i3, byte[] bArr3, boolean z) {
        Cipher cipher = (Cipher) b.get();
        int i4 = this.a;
        byte[] bArr4 = new byte[this.d];
        System.arraycopy(bArr3, 0, bArr4, 0, i4);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        if (z) {
            cipher.init(1, this.c, ivParameterSpec);
        } else {
            cipher.init(2, this.c, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i, i2, bArr2, i3) != i2) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }
}
