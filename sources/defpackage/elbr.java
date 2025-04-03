package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class elbr implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ Application.ActivityLifecycleCallbacks a;
    final /* synthetic */ elbx b;

    public elbr(elbx elbxVar, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.a = activityLifecycleCallbacks;
        this.b = elbxVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (ekyf.v()) {
            this.a.onActivityCreated(activity, bundle);
            return;
        }
        ekzm b = this.b.b(String.valueOf(activity.getClass().getName()).concat("#onActivityCreated"));
        try {
            this.a.onActivityCreated(activity, bundle);
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (ekyf.v()) {
            this.a.onActivityDestroyed(activity);
            return;
        }
        ekzm b = this.b.b(String.valueOf(activity.getClass().getName()).concat("#onActivityDestroyed"));
        try {
            this.a.onActivityDestroyed(activity);
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (ekyf.v()) {
            this.a.onActivityPaused(activity);
            return;
        }
        ekzm b = this.b.b(String.valueOf(activity.getClass().getName()).concat("#onActivityPaused"));
        try {
            this.a.onActivityPaused(activity);
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostCreated(Activity activity, Bundle bundle) {
        if (ekyf.v()) {
            this.a.onActivityPostCreated(activity, bundle);
            return;
        }
        ekzm b = this.b.b(String.valueOf(activity.getClass().getName()).concat("#onActivityPostCreated"));
        try {
            this.a.onActivityPostCreated(activity, bundle);
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostDestroyed(Activity activity) {
        if (ekyf.v()) {
            this.a.onActivityPostDestroyed(activity);
            return;
        }
        ekzm b = this.b.b(String.valueOf(activity.getClass().getName()).concat("#onActivityPostDestroyed"));
        try {
            this.a.onActivityPostDestroyed(activity);
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostPaused(Activity activity) {
        if (ekyf.v()) {
            this.a.onActivityPostPaused(activity);
            return;
        }
        ekzm b = this.b.b(String.valueOf(activity.getClass().getName()).concat("#onActivityPostPaused"));
        try {
            this.a.onActivityPostPaused(activity);
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        if (ekyf.v()) {
            this.a.onActivityPostResumed(activity);
            return;
        }
        ekzm b = this.b.b(String.valueOf(activity.getClass().getName()).concat("#onActivityPostResumed"));
        try {
            this.a.onActivityPostResumed(activity);
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostSaveInstanceState(Activity activity, Bundle bundle) {
        if (ekyf.v()) {
            this.a.onActivityPostSaveInstanceState(activity, bundle);
            return;
        }
        ekzm b = this.b.b(String.valueOf(activity.getClass().getName()).concat("#onActivityPostSaveInstanceState"));
        try {
            this.a.onActivityPostSaveInstanceState(activity, bundle);
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        if (ekyf.v()) {
            this.a.onActivityPostStarted(activity);
            return;
        }
        ekzm b = this.b.b(String.valueOf(activity.getClass().getName()).concat("#onActivityPostStarted"));
        try {
            this.a.onActivityPostStarted(activity);
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStopped(Activity activity) {
        if (ekyf.v()) {
            this.a.onActivityPostStopped(activity);
            return;
        }
        ekzm b = this.b.b(String.valueOf(activity.getClass().getName()).concat("#onActivityPostStopped"));
        try {
            this.a.onActivityPostStopped(activity);
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        if (ekyf.v()) {
            this.a.onActivityPreCreated(activity, bundle);
            return;
        }
        ekzm b = this.b.b(String.valueOf(activity.getClass().getName()).concat("#onActivityPreCreated"));
        try {
            this.a.onActivityPreCreated(activity, bundle);
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreDestroyed(Activity activity) {
        if (ekyf.v()) {
            this.a.onActivityPreDestroyed(activity);
            return;
        }
        ekzm b = this.b.b(String.valueOf(activity.getClass().getName()).concat("#onActivityPreDestroyed"));
        try {
            this.a.onActivityPreDestroyed(activity);
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPrePaused(Activity activity) {
        if (ekyf.v()) {
            this.a.onActivityPrePaused(activity);
            return;
        }
        ekzm b = this.b.b(String.valueOf(activity.getClass().getName()).concat("#onActivityPrePaused"));
        try {
            this.a.onActivityPrePaused(activity);
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreResumed(Activity activity) {
        if (ekyf.v()) {
            this.a.onActivityPreResumed(activity);
            return;
        }
        ekzm b = this.b.b(String.valueOf(activity.getClass().getName()).concat("#onActivityPreResumed"));
        try {
            this.a.onActivityPreResumed(activity);
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreSaveInstanceState(Activity activity, Bundle bundle) {
        if (ekyf.v()) {
            this.a.onActivityPreSaveInstanceState(activity, bundle);
            return;
        }
        ekzm b = this.b.b(String.valueOf(activity.getClass().getName()).concat("#onActivityPreSaveInstanceState"));
        try {
            this.a.onActivityPreSaveInstanceState(activity, bundle);
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStarted(Activity activity) {
        if (ekyf.v()) {
            this.a.onActivityPreStarted(activity);
            return;
        }
        ekzm b = this.b.b(String.valueOf(activity.getClass().getName()).concat("#onActivityPreStarted"));
        try {
            this.a.onActivityPreStarted(activity);
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStopped(Activity activity) {
        if (ekyf.v()) {
            this.a.onActivityPreStopped(activity);
            return;
        }
        ekzm b = this.b.b(String.valueOf(activity.getClass().getName()).concat("#onActivityPreStopped"));
        try {
            this.a.onActivityPreStopped(activity);
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (ekyf.v()) {
            this.a.onActivityResumed(activity);
            return;
        }
        ekzm b = this.b.b(String.valueOf(activity.getClass().getName()).concat("#onActivityResumed"));
        try {
            this.a.onActivityResumed(activity);
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        if (ekyf.v()) {
            this.a.onActivitySaveInstanceState(activity, bundle);
            return;
        }
        ekzm b = this.b.b(String.valueOf(activity.getClass().getName()).concat("#onActivitySaveInstanceState"));
        try {
            this.a.onActivitySaveInstanceState(activity, bundle);
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (ekyf.v()) {
            this.a.onActivityStarted(activity);
            return;
        }
        ekzm b = this.b.b(String.valueOf(activity.getClass().getName()).concat("#onActivityStarted"));
        try {
            this.a.onActivityStarted(activity);
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if (ekyf.v()) {
            this.a.onActivityStopped(activity);
            return;
        }
        ekzm b = this.b.b(String.valueOf(activity.getClass().getName()).concat("#onActivityStopped"));
        try {
            this.a.onActivityStopped(activity);
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
