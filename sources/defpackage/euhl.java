package defpackage;

import androidx.car.app.model.Alert;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euhl implements etfk {
    public static final /* synthetic */ int a = 0;
    private static final ThreadLocal b = new euhj();
    private static final ThreadLocal c = new euhk();
    private final byte[] d;
    private final byte[] e;
    private final byte[] f;
    private final SecretKeySpec g;
    private final int h;

    public euhl(byte[] bArr, int i, byte[] bArr2) {
        if (!etmj.a(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i != 12 && i != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.h = i;
        eujq.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.g = secretKeySpec;
        Cipher cipher = (Cipher) b.get();
        cipher.init(1, secretKeySpec);
        byte[] d = d(cipher.doFinal(new byte[16]));
        this.d = d;
        this.e = d(d);
        this.f = bArr2;
    }

    private static void c(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            bArr[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
    }

    private static byte[] d(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        while (i < 15) {
            byte b2 = bArr[i];
            int i2 = i + 1;
            bArr2[i] = (byte) (((b2 + b2) ^ ((bArr[i2] & 255) >>> 7)) & PrivateKeyType.INVALID);
            i = i2;
        }
        byte b3 = bArr[15];
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (b3 + b3));
        return bArr2;
    }

    private final byte[] e(Cipher cipher, int i, byte[] bArr, int i2, int i3) {
        int length;
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i;
        if (i3 == 0) {
            c(bArr2, this.d);
            return cipher.doFinal(bArr2);
        }
        byte[] bArr3 = new byte[16];
        cipher.doFinal(bArr2, 0, 16, bArr3);
        byte[] bArr4 = bArr3;
        byte[] bArr5 = bArr2;
        int i4 = 0;
        while (i3 - i4 > 16) {
            for (int i5 = 0; i5 < 16; i5++) {
                bArr4[i5] = (byte) (bArr[(i2 + i4) + i5] ^ bArr4[i5]);
            }
            cipher.doFinal(bArr4, 0, 16, bArr5);
            i4 += 16;
            byte[] bArr6 = bArr4;
            bArr4 = bArr5;
            bArr5 = bArr6;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i4 + i2, i2 + i3);
        if (copyOfRange.length == 16) {
            c(copyOfRange, this.d);
        } else {
            byte[] copyOf = Arrays.copyOf(this.e, 16);
            int i6 = 0;
            while (true) {
                length = copyOfRange.length;
                if (i6 >= length) {
                    break;
                }
                copyOf[i6] = (byte) (copyOf[i6] ^ copyOfRange[i6]);
                i6++;
            }
            copyOf[length] = (byte) (copyOf[length] ^ 128);
            copyOfRange = copyOf;
        }
        c(bArr4, copyOfRange);
        cipher.doFinal(bArr4, 0, 16, bArr5);
        return bArr5;
    }

    @Override // defpackage.etfk
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.f;
        int length = bArr.length;
        int length2 = ((length - bArr3.length) - this.h) - 16;
        if (length2 < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!ettp.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        Cipher cipher = (Cipher) b.get();
        cipher.init(1, this.g);
        byte[] e = e(cipher, 0, bArr, this.f.length, this.h);
        byte[] e2 = e(cipher, 1, new byte[0], 0, 0);
        byte[] e3 = e(cipher, 2, bArr, this.f.length + this.h, length2);
        int i = length - 16;
        byte b2 = 0;
        for (int i2 = 0; i2 < 16; i2++) {
            b2 = (byte) (b2 | (((bArr[i + i2] ^ e2[i2]) ^ e[i2]) ^ e3[i2]));
        }
        if (b2 != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher2 = (Cipher) c.get();
        cipher2.init(1, this.g, new IvParameterSpec(e));
        return cipher2.doFinal(bArr, this.f.length + this.h, length2);
    }

    @Override // defpackage.etfk
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.f;
        int length = bArr3.length;
        int i = Alert.DURATION_SHOW_INDEFINITELY - length;
        int i2 = this.h;
        int length2 = bArr.length;
        if (length2 > (i - i2) - 16) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] copyOf = Arrays.copyOf(bArr3, length + i2 + length2 + 16);
        int i3 = this.h;
        byte[] bArr4 = this.f;
        byte[] b2 = ettg.b(i3);
        System.arraycopy(b2, 0, copyOf, bArr4.length, i3);
        Cipher cipher = (Cipher) b.get();
        cipher.init(1, this.g);
        byte[] e = e(cipher, 0, b2, 0, b2.length);
        byte[] e2 = e(cipher, 1, new byte[0], 0, 0);
        Cipher cipher2 = (Cipher) c.get();
        cipher2.init(1, this.g, new IvParameterSpec(e));
        cipher2.doFinal(bArr, 0, length2, copyOf, this.f.length + this.h);
        byte[] e3 = e(cipher, 2, copyOf, this.h + this.f.length, length2);
        byte[] bArr5 = this.f;
        int i4 = this.h;
        for (int i5 = 0; i5 < 16; i5++) {
            copyOf[bArr5.length + length2 + i4 + i5] = (byte) ((e2[i5] ^ e[i5]) ^ e3[i5]);
        }
        return copyOf;
    }
}
