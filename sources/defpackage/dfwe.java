package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dfwe {
    public static int a = 4225;
    public static final Object b = new Object();
    public static HandlerThread c;
    private static dfwh d;

    public static dfwe a(Context context) {
        synchronized (b) {
            if (d == null) {
                d = new dfwh(context.getApplicationContext(), context.getMainLooper());
            }
        }
        return d;
    }

    public abstract ConnectionResult b(dfwd dfwdVar, ServiceConnection serviceConnection, String str);

    public final void c(ComponentName componentName, ServiceConnection serviceConnection) {
        d(new dfwd(componentName, a), serviceConnection);
    }

    protected abstract void d(dfwd dfwdVar, ServiceConnection serviceConnection);

    public final void e(String str, String str2, int i, ServiceConnection serviceConnection, boolean z) {
        d(new dfwd(str, str2, i, z), serviceConnection);
    }
}
