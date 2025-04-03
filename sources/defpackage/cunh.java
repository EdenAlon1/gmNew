package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cunh {
    public static final byte[] a = {-101, 14, 65, 13, 51, -117, 50, -50, -5, 9, -70, -113, -39, -64, -85, 117};

    public final byte[] a(byte[] bArr) {
        ekzz f = eleg.f("TemplatesProtoCipher#decryptCore");
        try {
            if (bArr.length <= 28) {
                throw new IllegalStateException("Check failed.");
            }
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            byte[] bArr2 = new byte[16];
            wrap.get(bArr2);
            byte[] bArr3 = new byte[12];
            wrap.get(bArr3);
            byte[] bArr4 = new byte[wrap.remaining()];
            wrap.get(bArr4);
            int i = eodh.a;
            eodc eodcVar = eodf.a;
            byte[] copyOf = Arrays.copyOf(a, 32);
            System.arraycopy(bArr2, 0, copyOf, 16, 16);
            copyOf.getClass();
            SecretKeySpec secretKeySpec = new SecretKeySpec(eodcVar.b(copyOf).e(), "AES");
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, secretKeySpec, new GCMParameterSpec(128, bArr3));
            byte[] doFinal = cipher.doFinal(bArr4);
            doFinal.getClass();
            ffig.a(f, null);
            return doFinal;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ffig.a(f, th);
                throw th2;
            }
        }
    }
}
