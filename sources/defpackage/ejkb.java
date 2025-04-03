package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejkb implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ ejkc a;

    public ejkb(ejkc ejkcVar) {
        this.a = ejkcVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        ejkc ejkcVar = this.a;
        int i = ejkcVar.c + 1;
        ejkcVar.c = i;
        if (i == 1) {
            ejkcVar.a(true);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        ejkc ejkcVar = this.a;
        int i = ejkcVar.c - 1;
        ejkcVar.c = i;
        if (i != 0 || activity.isChangingConfigurations()) {
            return;
        }
        this.a.a(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
