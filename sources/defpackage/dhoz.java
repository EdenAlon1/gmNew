package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhoz {
    private static final Object a;
    private static Method b;
    private static boolean c;

    static {
        int i = dfpj.c;
        a = new Object();
        b = null;
        c = false;
    }

    public static void a(Context context) {
        Context context2;
        dfwv.o(context, "Context must not be null");
        dfqf.d(context, 11925000);
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (a) {
            Context context3 = null;
            if (!c) {
                try {
                    context2 = DynamiteModule.d(context, DynamiteModule.b, "com.google.android.gms.providerinstaller.dynamite").c;
                } catch (dggy e) {
                    Log.w("ProviderInstaller", "Failed to load providerinstaller module: ".concat(String.valueOf(e.getMessage())));
                    context2 = null;
                }
                if (context2 != null) {
                    b(context2, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
                    return;
                }
            }
            boolean z = c;
            Context c2 = dfqf.c(context);
            if (c2 != null) {
                c = true;
                if (!z) {
                    try {
                        dgya.a(c2.getClassLoader().loadClass("com.google.android.gms.common.security.ProviderInstallerImpl"), "reportRequestStats2", new dgxz(Context.class, context), dgxy.a(uptimeMillis), dgxy.a(SystemClock.uptimeMillis()));
                    } catch (Exception e2) {
                        Log.w("ProviderInstaller", "Failed to report request stats: ".concat(e2.toString()));
                    }
                }
                context3 = c2;
            }
            if (context3 != null) {
                b(context3, "com.google.android.gms.common.security.ProviderInstallerImpl");
            } else {
                Log.e("ProviderInstaller", "Failed to get remote context");
                throw new dfqc(8);
            }
        }
    }

    private static void b(Context context, String str) {
        try {
            if (b == null) {
                b = context.getClassLoader().loadClass(str).getMethod("insertProvider", Context.class);
            }
            b.invoke(null, context);
        } catch (Exception e) {
            Throwable cause = e.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                Log.e("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(cause == null ? e.toString() : cause.toString())));
            }
            throw new dfqc(8);
        }
    }
}
