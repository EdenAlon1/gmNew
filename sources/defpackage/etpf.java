package defpackage;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class etpf implements etpg {
    private final etmt a;
    private final int b;

    public etpf(etmt etmtVar) {
        this.a = etmtVar;
        this.b = etmtVar.a;
    }

    private final etfp d(byte[] bArr) {
        return euhr.a(etml.a(this.a, eujv.c(bArr), null));
    }

    @Override // defpackage.etpg
    public final int a() {
        return this.b;
    }

    @Override // defpackage.etpg
    public final byte[] b(byte[] bArr, byte[] bArr2, int i) {
        int length = bArr2.length;
        if (length < i) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr2, i, length);
        etfp d = d(bArr);
        int length2 = copyOfRange.length;
        euhr euhrVar = (euhr) d;
        byte[] bArr3 = euhrVar.c;
        if (length2 < bArr3.length + 16) {
            throw new GeneralSecurityException("Ciphertext too short.");
        }
        if (!ettp.e(bArr3, copyOfRange)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        Cipher cipher = (Cipher) euhr.a.get();
        int length3 = euhrVar.c.length;
        byte[] copyOfRange2 = Arrays.copyOfRange(copyOfRange, length3, length3 + 16);
        byte[] bArr4 = (byte[]) copyOfRange2.clone();
        bArr4[8] = (byte) (bArr4[8] & Byte.MAX_VALUE);
        bArr4[12] = (byte) (bArr4[12] & Byte.MAX_VALUE);
        cipher.init(2, new SecretKeySpec(euhrVar.b, "AES"), new IvParameterSpec(bArr4));
        int length4 = euhrVar.c.length + 16;
        int i2 = length2 - length4;
        byte[] doFinal = cipher.doFinal(copyOfRange, length4, i2);
        if (i2 == 0 && doFinal == null && eujp.d()) {
            doFinal = new byte[0];
        }
        if (MessageDigest.isEqual(copyOfRange2, euhrVar.b(etph.a, doFinal))) {
            return doFinal;
        }
        throw new AEADBadTagException("Integrity check failed.");
    }

    @Override // defpackage.etpg
    public final byte[] c(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        euhr euhrVar = (euhr) d(bArr);
        int length = euhrVar.c.length;
        int length2 = bArr4.length;
        if (length2 > 2147483631 - length) {
            throw new GeneralSecurityException("plaintext too long");
        }
        Cipher cipher = (Cipher) euhr.a.get();
        byte[] b = euhrVar.b(etph.a, bArr4);
        byte[] bArr5 = (byte[]) b.clone();
        bArr5[8] = (byte) (bArr5[8] & Byte.MAX_VALUE);
        bArr5[12] = (byte) (bArr5[12] & Byte.MAX_VALUE);
        cipher.init(1, new SecretKeySpec(euhrVar.b, "AES"), new IvParameterSpec(bArr5));
        byte[] bArr6 = euhrVar.c;
        int length3 = b.length;
        int length4 = bArr6.length;
        byte[] copyOf = Arrays.copyOf(bArr6, length4 + length3 + length2);
        System.arraycopy(b, 0, copyOf, length4, length3);
        if (cipher.doFinal(bArr4, 0, length2, copyOf, euhrVar.c.length + length3) == length2) {
            return euhs.b(bArr2, bArr3, copyOf);
        }
        throw new GeneralSecurityException("not enough data written");
    }
}
