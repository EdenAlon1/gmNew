package defpackage;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ozg {
    public static long a;
    public static Method b;
    public static Method c;
    private static Method d;
    private static Method e;

    public static final void a(String str) {
        str.getClass();
        Trace.beginSection(e(str));
    }

    public static final void b(String str, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter(e(str), i);
            return;
        }
        String e2 = e(str);
        try {
            if (e == null) {
                e = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            }
            Method method = e;
            if (method == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            method.invoke(null, Long.valueOf(a), e2, Integer.valueOf(i));
        } catch (Exception e3) {
            d("traceCounter", e3);
        }
    }

    public static final boolean c() {
        boolean isEnabled;
        if (Build.VERSION.SDK_INT >= 29) {
            isEnabled = Trace.isEnabled();
            return isEnabled;
        }
        try {
            if (d == null) {
                a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                d = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            Method method = d;
            if (method == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Object invoke = method.invoke(null, Long.valueOf(a));
            invoke.getClass();
            return ((Boolean) invoke).booleanValue();
        } catch (Exception e2) {
            d("isTagEnabled", e2);
            return false;
        }
    }

    public static final void d(String str, Exception exc) {
        if (!(exc instanceof InvocationTargetException)) {
            Log.v("Trace", a.a(str, "Unable to call ", " via reflection"), exc);
            return;
        }
        Throwable cause = exc.getCause();
        if (!(cause instanceof RuntimeException)) {
            throw new RuntimeException(cause);
        }
        throw cause;
    }

    public static final String e(String str) {
        String str2 = str.length() <= 127 ? str : null;
        if (str2 != null) {
            return str2;
        }
        String substring = str.substring(0, 127);
        substring.getClass();
        return substring;
    }
}
