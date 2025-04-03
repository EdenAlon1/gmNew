package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgwt {
    private static final ThreadLocal a = new dgws();

    public static SharedPreferences a(Context context, String str) {
        dgwl dgwlVar = dgwj.a;
        dgwr dgwrVar = str.equals("") ? new dgwr() : null;
        if (dgwrVar != null) {
            return dgwrVar;
        }
        ThreadLocal threadLocal = a;
        emxf.a(((Boolean) threadLocal.get()).booleanValue());
        threadLocal.set(Boolean.FALSE);
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            threadLocal.set(Boolean.TRUE);
            return sharedPreferences;
        } catch (Throwable th) {
            a.set(Boolean.TRUE);
            throw th;
        }
    }
}
