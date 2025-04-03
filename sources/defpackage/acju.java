package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acju implements ServiceConnection {
    public kfb a;
    private final AtomicReference c = new AtomicReference(Optional.empty());
    public final elfl b = elfl.g(kfg.a(new kfd() { // from class: acjt
        @Override // defpackage.kfd
        public final Object a(kfb kfbVar) {
            acju.this.a = kfbVar;
            return null;
        }
    }));

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        ((ensz) ((ensz) acjw.a.h()).h("com/google/android/apps/messaging/dittosatellite/backgroundhandler/SatelliteBackgroundHandlerManagerImpl$SatelliteBackgroundHandlerServiceConnection", "onBindingDied", 345, "SatelliteBackgroundHandlerManagerImpl.java")).q("SatelliteBackgroundHandlerService binding died");
        this.c.set(Optional.empty());
        this.a.d();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (componentName == null || iBinder == null) {
            this.a.c(new IllegalStateException("Could not start background service"));
            return;
        }
        ((ensz) ((ensz) acjw.a.h()).h("com/google/android/apps/messaging/dittosatellite/backgroundhandler/SatelliteBackgroundHandlerManagerImpl$SatelliteBackgroundHandlerServiceConnection", "onServiceConnected", 328, "SatelliteBackgroundHandlerManagerImpl.java")).q("SatelliteBackgroundHandlerService bound");
        ackb ackbVar = ((acka) iBinder).a;
        AtomicReference atomicReference = this.c;
        Optional of = Optional.of(ackbVar);
        atomicReference.set(of);
        this.a.b(of);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ((ensz) ((ensz) acjw.a.h()).h("com/google/android/apps/messaging/dittosatellite/backgroundhandler/SatelliteBackgroundHandlerManagerImpl$SatelliteBackgroundHandlerServiceConnection", "onServiceDisconnected", 338, "SatelliteBackgroundHandlerManagerImpl.java")).q("SatelliteBackgroundHandlerService unbound");
        this.c.set(Optional.empty());
        this.a.d();
    }
}
