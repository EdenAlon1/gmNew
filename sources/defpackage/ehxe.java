package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehxe implements ServiceConnection {
    private static final cfva a = cfvl.q(146527691);
    private final elbx b;
    private final Class c;
    private final ServiceConnection d;

    public ehxe(elbx elbxVar, Class cls, ServiceConnection serviceConnection) {
        this.b = elbxVar;
        this.c = cls;
        this.d = serviceConnection;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        if (!((Boolean) a.e()).booleanValue()) {
            this.d.onBindingDied(componentName);
            return;
        }
        ekzm a2 = this.b.a(this.c, "onBindingDied");
        try {
            this.d.onBindingDied(componentName);
            a2.close();
        } catch (Throwable th) {
            try {
                a2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        if (!((Boolean) a.e()).booleanValue()) {
            this.d.onNullBinding(componentName);
            return;
        }
        ekzm a2 = this.b.a(this.c, "onNullBinding");
        try {
            this.d.onNullBinding(componentName);
            a2.close();
        } catch (Throwable th) {
            try {
                a2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (!((Boolean) a.e()).booleanValue()) {
            this.d.onServiceConnected(componentName, iBinder);
            return;
        }
        ekzm a2 = this.b.a(this.c, "onServiceConnected");
        try {
            this.d.onServiceConnected(componentName, iBinder);
            a2.close();
        } catch (Throwable th) {
            try {
                a2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (!((Boolean) a.e()).booleanValue()) {
            this.d.onServiceDisconnected(componentName);
            return;
        }
        ekzm a2 = this.b.a(this.c, "onServiceDisconnected");
        try {
            this.d.onServiceDisconnected(componentName);
            a2.close();
        } catch (Throwable th) {
            try {
                a2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
