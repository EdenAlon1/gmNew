package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class edyv implements Application.ActivityLifecycleCallbacks {
    boolean a = false;
    final /* synthetic */ Application b;
    final /* synthetic */ ffbr c;
    final /* synthetic */ emxc d;

    public edyv(Application application, ffbr ffbrVar, emxc emxcVar) {
        this.b = application;
        this.c = ffbrVar;
        this.d = emxcVar;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [emwl, java.lang.Object] */
    private final engw a() {
        if (this.a) {
            int i = engw.d;
            return enou.a;
        }
        this.a = true;
        this.b.unregisterActivityLifecycleCallbacks(this);
        Set set = (Set) this.c.b();
        engr d = engw.d(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) ((emxn) this.d).a.apply((Application.ActivityLifecycleCallbacks) it.next());
            this.b.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
            d.h(activityLifecycleCallbacks);
        }
        return d.g();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        engw a = a();
        int i = ((enou) a).c;
        for (int i2 = 0; i2 < i; i2++) {
            ((Application.ActivityLifecycleCallbacks) a.get(i2)).onActivityCreated(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        emxf.l(this.a);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        emxf.l(this.a);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        engw a = a();
        int i = ((enou) a).c;
        for (int i2 = 0; i2 < i; i2++) {
            ((Application.ActivityLifecycleCallbacks) a.get(i2)).onActivityPreCreated(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        emxf.l(this.a);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        emxf.l(this.a);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        emxf.l(this.a);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        emxf.l(this.a);
    }
}
