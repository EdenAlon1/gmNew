package defpackage;

import android.app.Activity;
import android.os.Handler;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class echb extends echc {
    final /* synthetic */ echd a;

    public echb(echd echdVar) {
        this.a = echdVar;
    }

    @Override // defpackage.echc, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        echd echdVar = this.a;
        int i = echdVar.b - 1;
        echdVar.b = i;
        if (i == 0) {
            echdVar.h = ecda.b(activity.getClass());
            Handler handler = this.a.e;
            emyw.e(handler);
            Runnable runnable = this.a.f;
            emyw.e(runnable);
            handler.postDelayed(runnable, 700L);
        }
    }

    @Override // defpackage.echc, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        echd echdVar = this.a;
        int i = echdVar.b + 1;
        echdVar.b = i;
        if (i == 1) {
            if (echdVar.c) {
                Iterator it = echdVar.g.iterator();
                while (it.hasNext()) {
                    ((ecgm) it.next()).l(ecda.b(activity.getClass()));
                }
                this.a.c = false;
                return;
            }
            Handler handler = echdVar.e;
            emyw.e(handler);
            Runnable runnable = this.a.f;
            emyw.e(runnable);
            handler.removeCallbacks(runnable);
        }
    }

    @Override // defpackage.echc, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        echd echdVar = this.a;
        int i = echdVar.a + 1;
        echdVar.a = i;
        if (i == 1 && echdVar.d) {
            for (ecgm ecgmVar : echdVar.g) {
                ecda.b(activity.getClass());
            }
            this.a.d = false;
        }
    }

    @Override // defpackage.echc, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        echd echdVar = this.a;
        echdVar.a--;
        ecda.b(activity.getClass());
        echdVar.a();
    }
}
