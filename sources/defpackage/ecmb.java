package defpackage;

import android.app.Activity;
import android.os.Bundle;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecmb implements ecgw {
    private final fazb a;
    private boolean b = false;
    private Activity c;

    public ecmb(fazb<ecml> fazbVar, final emxc<ffbr<Boolean>> emxcVar, Executor executor) {
        this.a = fazbVar;
        executor.execute(new Runnable() { // from class: ecma
            @Override // java.lang.Runnable
            public final void run() {
                ecmb.i(ecmb.this, emxcVar);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [ffbr, java.lang.Object] */
    public static /* synthetic */ void i(ecmb ecmbVar, emxc emxcVar) {
        if (((Boolean) ((emxn) emxcVar).a.b()).booleanValue()) {
            synchronized (ecmbVar) {
                ecmbVar.b = true;
                Activity activity = ecmbVar.c;
                if (activity != null) {
                    ecmbVar.d(activity);
                }
                ecmbVar.c = null;
            }
        }
    }

    @Override // defpackage.ecgw
    public synchronized void c(Activity activity) {
        if (this.b) {
            ((ecml) this.a.b()).a(activity);
        } else if (!activity.equals(this.c)) {
            ((enrr) ((enrr) ecdj.a.e()).h("com/google/android/libraries/performance/primes/metrics/jank/ActivityLevelJankMonitor", "onActivityPaused", 86, "ActivityLevelJankMonitor.java")).D("Activity mismatch (currentActivity=%s, activity=%s)", this.c, activity);
        }
        this.c = null;
    }

    @Override // defpackage.ecgw
    public synchronized void d(Activity activity) {
        if (this.b) {
            ((ecml) this.a.b()).c(activity);
        } else {
            this.c = activity;
        }
    }

    @Override // defpackage.ecgw
    public /* synthetic */ void b(Activity activity) {
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
