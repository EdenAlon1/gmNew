package defpackage;

import android.content.Context;
import android.os.StrictMode;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qmn {
    public static final String a(String str, Object... objArr) {
        return c(Locale.getDefault(), str, objArr);
    }

    public static final String b(Context context, int i, Object... objArr) {
        return c(Locale.getDefault(), context.getResources().getString(i), objArr);
    }

    public static final String c(Locale locale, String str, Object... objArr) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            int i = y.d;
            StringBuilder sb = new StringBuilder(str.length());
            new y(str, locale).b(0, null, null, null, objArr, new t(sb), null);
            return sb.toString();
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }
}
