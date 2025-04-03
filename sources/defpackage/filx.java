package defpackage;

import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class filx {
    private static final String a = "filv";
    private static final MessageDigest b = c();

    public static long a(String str) {
        if (b == null || str == null || str.isEmpty()) {
            return 0L;
        }
        return b(str.getBytes(StandardCharsets.UTF_8));
    }

    public static long b(byte[] bArr) {
        MessageDigest messageDigest = b;
        if (messageDigest == null || bArr == null || bArr.length == 0) {
            return 0L;
        }
        return ByteBuffer.wrap(messageDigest.digest(bArr)).getLong();
    }

    private static MessageDigest c() {
        try {
            return MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            String str = a;
            if (!Log.isLoggable(str, 3)) {
                return null;
            }
            Log.d(str, "Error while instantiating messageDigest", e);
            return null;
        }
    }
}
