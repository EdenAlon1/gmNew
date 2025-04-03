package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyhr {
    public static void a(String str, String str2) {
        h(3, str, str2, null);
    }

    public static void b(String str, String str2, Throwable th) {
        h(3, str, str2, th);
    }

    public static void c(String str, String str2) {
        h(6, str, str2, null);
    }

    public static void d(String str, String str2, Throwable th) {
        h(6, str, str2, th);
    }

    public static void e(String str, String str2) {
        h(4, str, str2, null);
    }

    public static void f(String str, String str2) {
        h(5, str, str2, null);
    }

    public static void g(String str, String str2, Throwable th) {
        h(5, str, str2, th);
    }

    private static void h(int i, String str, String str2, Throwable th) {
        String concat = "LT_".concat(String.valueOf(str));
        if (concat.length() > 23) {
            Log.println(3, "LogUtils", a.a(concat, "Log tag ", " is longer than 23 chars."));
            concat = concat.substring(0, 23);
        }
        if (str2 == null) {
            str2 = "null";
        }
        Log.println(i, concat, str2);
        if (th != null) {
            Log.println(i, concat, Log.getStackTraceString(th));
        }
    }
}
