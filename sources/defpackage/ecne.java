package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window$OnFrameMetricsAvailableListener;
import androidx.car.app.hardware.info.EnergyProfile;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ecne implements ecgw {
    private final Window$OnFrameMetricsAvailableListener a;
    private final fazb b;
    private Activity c;
    private boolean d;
    private final Set e = Collections.newSetFromMap(new WeakHashMap());

    public ecne(fazb<Handler> fazbVar, errm errmVar, Window$OnFrameMetricsAvailableListener window$OnFrameMetricsAvailableListener) {
        this.a = window$OnFrameMetricsAvailableListener;
        this.b = fazbVar;
    }

    private final synchronized void k() {
        Activity activity = this.c;
        if (activity != null && this.e.add(activity.getWindow())) {
            activity.getWindow().addOnFrameMetricsAvailableListener(this.a, (Handler) this.b.b());
            return;
        }
        ((enrr) ((enrr) ecdj.a.e()).h("com/google/android/libraries/performance/primes/metrics/jank/WindowTracker", "attachToCurrentActivity", 91, "WindowTracker.java")).q("Activity is null or already being tracked");
    }

    private final synchronized void l(Activity activity) {
        if (activity != null) {
            if (this.e.remove(activity.getWindow())) {
                try {
                    activity.getWindow().removeOnFrameMetricsAvailableListener(this.a);
                    return;
                } catch (RuntimeException e) {
                    ((enrr) ((enrr) ((enrr) ecdj.a.j()).g(e)).h("com/google/android/libraries/performance/primes/metrics/jank/WindowTracker", "detachFromActivity", 'm', "WindowTracker.java")).q("Failed to detach the frame metrics listener");
                    return;
                }
            }
        }
        ((enrr) ((enrr) ecdj.a.e()).h("com/google/android/libraries/performance/primes/metrics/jank/WindowTracker", "detachFromActivity", EnergyProfile.EVCONNECTOR_TYPE_OTHER, "WindowTracker.java")).q("Activity is null or isn't being tracked");
    }

    @Override // defpackage.ecgw
    public void b(Activity activity) {
        synchronized (this) {
            l(activity);
        }
    }

    @Override // defpackage.ecgw
    public void c(Activity activity) {
        synchronized (this) {
            this.c = null;
        }
    }

    @Override // defpackage.ecgw
    public void d(Activity activity) {
        synchronized (this) {
            this.c = activity;
            if (this.d) {
                k();
            }
        }
    }

    public synchronized void i() {
        this.d = true;
        k();
    }

    public synchronized void j() {
        this.d = false;
    }

    @Override // defpackage.ecgw
    public /* synthetic */ void f(Activity activity) {
    }

    @Override // defpackage.ecgw
    public /* synthetic */ void g(Activity activity) {
    }

    @Override // defpackage.ecgw
    public /* synthetic */ void h(int i) {
    }

    @Override // defpackage.ecgw
    public /* synthetic */ void a(Activity activity, Bundle bundle) {
    }

    @Override // defpackage.ecgw
    public /* synthetic */ void e(Activity activity, Bundle bundle) {
    }
}
