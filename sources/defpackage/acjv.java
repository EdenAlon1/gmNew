package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acjv implements ServiceConnection {
    final /* synthetic */ acjw a;

    public acjv(acjw acjwVar) {
        this.a = acjwVar;
    }

    private final void a() {
        AtomicReference atomicReference;
        Optional of = Optional.of(this);
        Optional empty = Optional.empty();
        do {
            atomicReference = this.a.f;
            if (atomicReference.compareAndSet(of, empty)) {
                this.a.b.unbindService(this);
                return;
            }
        } while (atomicReference.get() == of);
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        ((ensz) ((ensz) acjw.a.h()).h("com/google/android/apps/messaging/dittosatellite/backgroundhandler/SatelliteBackgroundHandlerManagerImpl$SatelliteBackgroundHealthMonitoringConnection", "onBindingDied", 289, "SatelliteBackgroundHandlerManagerImpl.java")).q("HealthMonitoringConnection died");
        a();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ((ensz) ((ensz) acjw.a.h()).h("com/google/android/apps/messaging/dittosatellite/backgroundhandler/SatelliteBackgroundHandlerManagerImpl$SatelliteBackgroundHealthMonitoringConnection", "onServiceConnected", 278, "SatelliteBackgroundHandlerManagerImpl.java")).q("HealthMonitoringConnection established");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ((ensz) ((ensz) acjw.a.h()).h("com/google/android/apps/messaging/dittosatellite/backgroundhandler/SatelliteBackgroundHandlerManagerImpl$SatelliteBackgroundHealthMonitoringConnection", "onServiceDisconnected", 283, "SatelliteBackgroundHandlerManagerImpl.java")).q("HealthMonitoringConnection disconnected");
        a();
    }
}
