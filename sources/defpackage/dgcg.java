package defpackage;

import android.os.Build;
import android.util.Base64;
import android.util.Log;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgcg {
    public static String a(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    public static byte[] b(String str) {
        return d(str, Build.VERSION.SDK_INT, null);
    }

    public static byte[] c(String str, Throwable th) {
        return d(str, Build.VERSION.SDK_INT, th);
    }

    public static byte[] d(String str, int i, Throwable th) {
        String format = String.format(Locale.US, "ERROR : %s\nAPI_LEVEL: %d\nGMSCORE_VERSION: %s", str, Integer.valueOf(i), "25.08.99-000");
        if (th != null) {
            format = String.valueOf(format).concat(String.valueOf(String.format(Locale.US, "\nEXCEPTION: %s\nSTACK_TRACE: %s", th, Log.getStackTraceString(th))));
        }
        return String.valueOf(format).concat(String.valueOf(String.format(Locale.US, "\nBuild.FINGERPRINT: %s", Build.FINGERPRINT))).getBytes(StandardCharsets.UTF_8);
    }
}
