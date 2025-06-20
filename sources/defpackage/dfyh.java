package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfyh {
    private static final Object b = new Object();
    private static volatile dfyh c;
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    private dfyh() {
    }

    public static dfyh a() {
        if (c == null) {
            synchronized (b) {
                if (c == null) {
                    c = new dfyh();
                }
            }
        }
        dfyh dfyhVar = c;
        dfwv.n(dfyhVar);
        return dfyhVar;
    }

    private static void e(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    private static boolean f(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof dfwi);
    }

    public final void b(Context context, ServiceConnection serviceConnection) {
        if (!f(serviceConnection) || !this.a.containsKey(serviceConnection)) {
            e(context, serviceConnection);
            return;
        }
        try {
            e(context, (ServiceConnection) this.a.get(serviceConnection));
        } finally {
            this.a.remove(serviceConnection);
        }
    }

    public final boolean c(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return d(context, context.getClass().getName(), intent, serviceConnection, i);
    }

    public final boolean d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((dfzj.b(context).a(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!f(serviceConnection)) {
            return context.bindService(intent, serviceConnection, i);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) this.a.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        try {
            boolean bindService = context.bindService(intent, serviceConnection, i);
            if (bindService) {
                return bindService;
            }
            return false;
        } finally {
            this.a.remove(serviceConnection, serviceConnection);
        }
    }
}
