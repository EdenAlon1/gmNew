package defpackage;

import java.nio.ByteBuffer;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crvx {
    public static final byte[] a(byte[] bArr, byte[] bArr2) {
        ekzz f = eleg.f("CmsCipher#decryptCms");
        try {
            int length = bArr2.length;
            emxf.b(length == 32, a.h(length, "Wrong encryption key length, expected 32 bytes but is "));
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            byte[] bArr3 = new byte[12];
            wrap.get(bArr3);
            byte[] bArr4 = new byte[wrap.remaining()];
            wrap.get(bArr4);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, new SecretKeySpec(bArr2, "AES"), new GCMParameterSpec(128, bArr3));
            byte[] doFinal = cipher.doFinal(bArr4);
            f.close();
            return doFinal;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static final byte[] b(byte[] bArr, byte[] bArr2) {
        ekzz f = eleg.f("CmsCipher#encryptCms");
        try {
            int length = bArr2.length;
            emxf.b(length == 32, a.h(length, "Wrong encryption key length, expected 32 bytes but is "));
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            byte[] bArr3 = new byte[12];
            emxr.a.nextBytes(bArr3);
            cipher.init(1, new SecretKeySpec(bArr2, "AES"), new GCMParameterSpec(128, bArr3));
            byte[] doFinal = cipher.doFinal(bArr);
            ByteBuffer allocate = ByteBuffer.allocate(doFinal.length + 12);
            allocate.put(bArr3);
            allocate.put(doFinal);
            byte[] array = allocate.array();
            f.close();
            return array;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
