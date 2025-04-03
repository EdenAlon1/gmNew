package defpackage;

import android.util.Log;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fief {
    public static void a(String str, String str2, Object... objArr) {
        if (Log.isLoggable(str, 3)) {
            int length = objArr.length;
            Throwable th = null;
            if (length != 0) {
                Object obj = objArr[0];
                if (obj instanceof Throwable) {
                    th = (Throwable) obj;
                }
            }
            if (th == null && length > 0) {
                str2 = String.format(Locale.US, str2, objArr);
            }
            String concat = "cn_".concat(String.valueOf(str));
            if (th != null) {
                Log.d(concat, str2, th);
            } else {
                Log.d(concat, str2);
            }
        }
    }
}
