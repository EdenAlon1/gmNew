package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class avw {
    public static int a = 3;

    public static void a(String str, String str2) {
        if (i(str, 3)) {
            Log.d(str, str2);
        }
    }

    public static void b(String str, String str2, Throwable th) {
        if (i(str, 3)) {
            Log.d(str, str2, th);
        }
    }

    public static void c(String str, String str2) {
        if (i(str, 6)) {
            Log.e(str, str2);
        }
    }

    public static void d(String str, String str2, Throwable th) {
        if (i(str, 6)) {
            Log.e(str, str2, th);
        }
    }

    public static void e(String str, String str2) {
        if (i(str, 4)) {
            Log.i(str, str2);
        }
    }

    public static void f(String str, String str2) {
        if (i(str, 5)) {
            Log.w(str, str2);
        }
    }

    public static void g(String str, String str2, Throwable th) {
        if (i(str, 5)) {
            Log.w(str, str2, th);
        }
    }

    public static boolean h(String str) {
        return i(str, 3);
    }

    public static boolean i(String str, int i) {
        return a <= i || Log.isLoggable(str, i);
    }
}
