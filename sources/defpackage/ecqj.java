package defpackage;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecqj implements Application.ActivityLifecycleCallbacks {
    public final Application a;
    final /* synthetic */ ecqk b;

    public ecqj(ecqk ecqkVar, Application application) {
        this.b = ecqkVar;
        this.a = application;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        ecqb ecqbVar = this.b.o.b == null ? this.b.o : this.b.p;
        ecqbVar.a = activity.getClass().getSimpleName();
        ecqbVar.b = ecjl.d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        ecqb ecqbVar = this.b.p.b == null ? this.b.o : this.b.p;
        if (ecqbVar.d == null) {
            ecqbVar.d = ecjl.d();
        }
        try {
            View findViewById = activity.findViewById(R.id.content);
            ViewTreeObserver viewTreeObserver = findViewById.getViewTreeObserver();
            viewTreeObserver.addOnDrawListener(new ecqf(this, findViewById));
            viewTreeObserver.addOnPreDrawListener(new ecqi(this, findViewById));
        } catch (RuntimeException e) {
            Log.d("PrimesStartupMeasure", "Error handling StartupMeasure's onActivityResume", e);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        ecqb ecqbVar = this.b.p.b == null ? this.b.o : this.b.p;
        if (ecqbVar.c == null) {
            ecqbVar.c = ecjl.d();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
