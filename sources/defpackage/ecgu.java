package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ecgu extends ecgl implements ecgw {
    private final AtomicBoolean b = new AtomicBoolean(false);
    private final ecgn c;
    private ecda d;

    public ecgu(ecgn ecgnVar) {
        this.c = ecgnVar;
    }

    @Override // defpackage.ecgw
    public final void a(Activity activity, Bundle bundle) {
        this.d = null;
    }

    @Override // defpackage.ecgw
    public final void b(Activity activity) {
        this.d = null;
    }

    @Override // defpackage.ecgw
    public final void d(Activity activity) {
        this.d = null;
    }

    @Override // defpackage.ecgw
    public final void f(Activity activity) {
        this.d = null;
        Context applicationContext = activity.getApplicationContext();
        if (echh.d(applicationContext, echh.a(applicationContext, "Primes.onActivityStarted"))) {
            l(ecda.b(activity.getClass()));
        } else {
            if (this.b.getAndSet(true)) {
                return;
            }
            ((enrr) ((enrr) ecdj.a.j()).h("com/google/android/libraries/performance/primes/foreground/ProcessImportanceForegroundSignalAdapter", "onActivityStarted", 58, "ProcessImportanceForegroundSignalAdapter.java")).q("Activity started with background importance");
        }
    }

    @Override // defpackage.ecgw
    public final void g(Activity activity) {
        ecda b = ecda.b(activity.getClass());
        this.d = b;
        Context applicationContext = activity.getApplicationContext();
        if (echh.d(applicationContext, echh.a(applicationContext, "Primes.onActivityStopped"))) {
            return;
        }
        k(b);
    }

    @Override // defpackage.ecgw
    public final void h(int i) {
        ecda ecdaVar;
        if (i >= 20 && (ecdaVar = this.d) != null) {
            k(ecdaVar);
        }
        this.d = null;
    }

    @Override // defpackage.ecgl
    public final void i(ecda ecdaVar) {
        this.c.i(ecdaVar);
    }

    @Override // defpackage.ecgl
    public final void j(ecda ecdaVar) {
        this.c.j(ecdaVar);
    }

    @Override // defpackage.ecgw
    public final /* synthetic */ void c(Activity activity) {
    }

    @Override // defpackage.ecgw
    public final /* synthetic */ void e(Activity activity, Bundle bundle) {
    }
}
