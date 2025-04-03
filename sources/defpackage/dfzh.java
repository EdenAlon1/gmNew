package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfzh {
    private static Context a;
    private static Boolean b;

    public static synchronized boolean a(Context context) {
        boolean isInstantApp;
        Boolean bool;
        synchronized (dfzh.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = a;
            if (context2 != null && (bool = b) != null && context2 == applicationContext) {
                return bool.booleanValue();
            }
            b = null;
            isInstantApp = applicationContext.getPackageManager().isInstantApp();
            Boolean valueOf = Boolean.valueOf(isInstantApp);
            b = valueOf;
            a = applicationContext;
            return valueOf.booleanValue();
        }
    }
}
