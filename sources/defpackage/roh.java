package defpackage;

import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class roh {
    public static volatile rog a;

    public static String a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace();
        printWriter.flush();
        return stringWriter.toString();
    }

    public static void b(String str) {
        c(6, str);
    }

    public static void c(int i, String str) {
        Log.println(i, "stetho", str);
    }

    public static void d(String str) {
        c(5, str);
    }
}
