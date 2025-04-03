package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfsc implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    public static final dfsc a = new dfsc();
    public final AtomicBoolean b = new AtomicBoolean();
    public final AtomicBoolean c = new AtomicBoolean();
    private final ArrayList d = new ArrayList();
    private boolean e = false;

    private dfsc() {
    }

    public static void b(Application application) {
        dfsc dfscVar = a;
        synchronized (dfscVar) {
            if (!dfscVar.e) {
                application.registerActivityLifecycleCallbacks(dfscVar);
                application.registerComponentCallbacks(dfscVar);
                dfscVar.e = true;
            }
        }
    }

    private final void d(boolean z) {
        synchronized (a) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((dfsb) it.next()).a(z);
            }
        }
    }

    public final void a(dfsb dfsbVar) {
        synchronized (a) {
            this.d.add(dfsbVar);
        }
    }

    public final boolean c() {
        return this.b.get();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.c;
        boolean compareAndSet = this.b.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            d(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.c;
        boolean compareAndSet = this.b.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            d(false);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20 && this.b.compareAndSet(false, true)) {
            this.c.set(true);
            d(true);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
