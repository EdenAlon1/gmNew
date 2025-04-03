package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Looper;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rpa implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ rpb a;

    public rpa(rpb rpbVar) {
        this.a = rpbVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        rok.c(activity);
        rok.b(Looper.myLooper() == Looper.getMainLooper());
        rpe rpeVar = this.a.b;
        rpeVar.b.add(activity);
        Iterator it = rpeVar.c.iterator();
        while (it.hasNext()) {
            ((rpd) it.next()).a();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        rok.c(activity);
        rok.b(Looper.myLooper() == Looper.getMainLooper());
        rpe rpeVar = this.a.b;
        if (rpeVar.b.remove(activity)) {
            Iterator it = rpeVar.c.iterator();
            while (it.hasNext()) {
                ((rpd) it.next()).b();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
