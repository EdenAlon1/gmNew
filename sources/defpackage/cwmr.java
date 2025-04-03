package defpackage;

import android.app.Activity;
import android.os.Bundle;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwmr implements csiv {
    public static final /* synthetic */ int a = 0;
    private final ffbr b;

    public cwmr(ffbr ffbrVar) {
        this.b = ffbrVar;
    }

    private final void a(final Activity activity) {
        Optional a2 = ((cwmm) this.b.b()).a();
        final ffji ffjiVar = new ffji() { // from class: cwmp
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                Integer num = (Integer) obj;
                int i = cwmr.a;
                num.getClass();
                activity.getTheme().applyStyle(num.intValue(), true);
                return ffcu.a;
            }
        };
        a2.ifPresent(new Consumer() { // from class: cwmq
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i = cwmr.a;
                ffji.this.invoke(obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (ctid.c) {
            return;
        }
        a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (ctid.c) {
            a(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final /* synthetic */ void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final /* synthetic */ void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final /* synthetic */ void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final /* synthetic */ void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final /* synthetic */ void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final /* synthetic */ void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
