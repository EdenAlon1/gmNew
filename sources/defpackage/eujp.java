package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eujp {
    public static String a(euiu euiuVar) {
        int ordinal = euiuVar.ordinal();
        if (ordinal == 0) {
            return "SHA-1";
        }
        if (ordinal == 1) {
            return "SHA-224";
        }
        if (ordinal == 2) {
            return "SHA-256";
        }
        if (ordinal == 3) {
            return "SHA-384";
        }
        if (ordinal == 4) {
            return "SHA-512";
        }
        throw new GeneralSecurityException("Unsupported hash ".concat(euiuVar.toString()));
    }

    public static String b(euiu euiuVar) {
        eujq.d(euiuVar);
        return euiuVar.toString().concat("withECDSA");
    }

    public static void c(ByteBuffer byteBuffer, long j) {
        if (j < 0 || j >= 4294967296L) {
            throw new GeneralSecurityException("Index out of range");
        }
        byteBuffer.putInt((int) j);
    }

    public static boolean d() {
        return "The Android Project".equals(System.getProperty("java.vendor"));
    }
}
