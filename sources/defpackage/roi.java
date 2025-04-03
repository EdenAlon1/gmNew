package defpackage;

import android.util.Log;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class roi {
    public static String a(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static void b(Throwable th, String str) {
        roh.b(str + "\n" + roh.a(th));
    }

    public static void c(String str) {
        if (f(4)) {
            roh.c(4, str);
        }
    }

    public static void d(String str) {
        roh.d(str);
    }

    public static void e(Throwable th, String str) {
        roh.d(str + "\n" + roh.a(th));
    }

    public static boolean f(int i) {
        rog rogVar = roh.a;
        return Log.isLoggable("stetho", i);
    }
}
