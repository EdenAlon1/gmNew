package defpackage;

import android.util.Log;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efbb {
    public static final Method a;
    private static final Method b;

    static {
        Method method;
        Method method2 = null;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            method = cls.getMethod("get", String.class, String.class);
            try {
                try {
                    cls.getMethod("getInt", String.class, Integer.TYPE);
                    cls.getMethod("getLong", String.class, Long.TYPE);
                    method2 = cls.getMethod("getBoolean", String.class, Boolean.TYPE);
                } catch (Exception e) {
                    e = e;
                    e.printStackTrace();
                    b = method;
                    a = method2;
                }
            } catch (Throwable th) {
                th = th;
                b = method;
                a = null;
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            method = null;
        } catch (Throwable th2) {
            th = th2;
            method = null;
            b = method;
            a = null;
            throw th;
        }
        b = method;
        a = method2;
    }

    public static String a(String str, String str2) {
        Exception e;
        String str3;
        try {
            Object[] objArr = {str, str2};
            str3 = null;
            String str4 = (String) b.invoke(null, objArr);
            if (str2 == null) {
                try {
                    if ("".equals(str4)) {
                        return null;
                    }
                } catch (Exception e2) {
                    e = e2;
                    Log.e("SystemProperties", "get error", e);
                    return str3;
                }
            }
            return str4;
        } catch (Exception e3) {
            e = e3;
            str3 = str2;
        }
    }
}
