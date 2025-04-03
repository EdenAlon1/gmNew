package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.SecretKey;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etlv implements etfk {
    private final byte[] a;
    private final int b;
    private final etvo c;

    public etlv(byte[] bArr, eujt eujtVar, int i) {
        this.c = new euja(bArr);
        this.a = eujtVar.c();
        this.b = i;
    }

    private final byte[] c(byte[] bArr) {
        byte[] bArr2 = {0, 1, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        byte[] bArr3 = {0, 2, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int length = bArr.length;
        if (length > 12 || length < 8) {
            throw new GeneralSecurityException("invalid salt size");
        }
        System.arraycopy(bArr, 0, bArr2, 4, length);
        System.arraycopy(bArr, 0, bArr3, 4, length);
        byte[] bArr4 = new byte[32];
        System.arraycopy(this.c.a(bArr2, 16), 0, bArr4, 0, 16);
        System.arraycopy(this.c.a(bArr3, 16), 0, bArr4, 16, 16);
        return bArr4;
    }

    @Override // defpackage.etfk
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        byte[] bArr3 = this.a;
        if (bArr.length < bArr3.length + this.b + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!ettp.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = this.a;
        int i = this.b;
        int length = bArr4.length;
        int i2 = i + length;
        byte[] c = c(Arrays.copyOfRange(bArr, length, i2));
        if (!etmj.a(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i3 = i2 + 12;
        return etll.a(Arrays.copyOfRange(bArr, i2, i3), bArr, i3, etks.d(c));
    }

    @Override // defpackage.etfk
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("plaintext is null");
        }
        int i = this.b;
        byte[] b = ettg.b(i + 12);
        byte[] copyOf = Arrays.copyOf(b, i);
        int i2 = this.b;
        byte[] copyOfRange = Arrays.copyOfRange(b, i2, i2 + 12);
        byte[] c = c(copyOf);
        if (!etmj.a(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        SecretKey d = etks.d(c);
        byte[] bArr3 = this.a;
        int i3 = this.b;
        byte[] b2 = etll.b(copyOfRange, bArr, bArr3.length + i3 + copyOfRange.length, d);
        byte[] bArr4 = this.a;
        System.arraycopy(bArr4, 0, b2, 0, bArr4.length);
        byte[] bArr5 = this.a;
        System.arraycopy(b, 0, b2, bArr5.length, b.length);
        return b2;
    }
}
