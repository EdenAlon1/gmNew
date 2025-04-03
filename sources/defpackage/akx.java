package defpackage;

import android.hardware.camera2.CameraDevice;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class akx extends CameraDevice.StateCallback {
    public static final /* synthetic */ int b = 0;
    final /* synthetic */ aky a;

    public akx(aky akyVar) {
        this.a = akyVar;
    }

    private final void a() {
        List c;
        synchronized (this.a.b) {
            c = this.a.c();
            this.a.e.clear();
            this.a.c.clear();
            this.a.d.clear();
        }
        Iterator it = c.iterator();
        while (it.hasNext()) {
            ((amt) it.next()).o();
        }
    }

    private final void b() {
        final LinkedHashSet linkedHashSet = new LinkedHashSet();
        synchronized (this.a.b) {
            linkedHashSet.addAll(this.a.e);
            linkedHashSet.addAll(this.a.c);
        }
        aky akyVar = this.a;
        akyVar.a.execute(new Runnable() { // from class: akv
            @Override // java.lang.Runnable
            public final void run() {
                int i = akx.b;
                for (amt amtVar : linkedHashSet) {
                    amtVar.k().h(amtVar);
                }
            }
        });
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        b();
        a();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        b();
        a();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, final int i) {
        b();
        final LinkedHashSet linkedHashSet = new LinkedHashSet();
        synchronized (this.a.b) {
            linkedHashSet.addAll(this.a.e);
            linkedHashSet.addAll(this.a.c);
        }
        aky akyVar = this.a;
        akyVar.a.execute(new Runnable() { // from class: akw
            @Override // java.lang.Runnable
            public final void run() {
                int i2 = akx.b;
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    ((amt) it.next()).p(i);
                }
            }
        });
        a();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
    }
}
