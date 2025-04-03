package defpackage;

import android.os.Looper;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhrt {
    @Deprecated
    public static dhre a(Executor executor, Callable callable) {
        dfwv.o(executor, "Executor must not be null");
        dhrm dhrmVar = new dhrm();
        executor.execute(new dhrp(dhrmVar, callable));
        return dhrmVar;
    }

    public static dhre b(Exception exc) {
        dhrm dhrmVar = new dhrm();
        dhrmVar.u(exc);
        return dhrmVar;
    }

    public static dhre c(Object obj) {
        dhrm dhrmVar = new dhrm();
        dhrmVar.v(obj);
        return dhrmVar;
    }

    public static dhre d(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return c(null);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((dhre) it.next()) == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        dhrm dhrmVar = new dhrm();
        dhrs dhrsVar = new dhrs(collection.size(), dhrmVar);
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            i((dhre) it2.next(), dhrsVar);
        }
        return dhrmVar;
    }

    public static dhre e(dhre dhreVar, long j, TimeUnit timeUnit) {
        dfwv.b(j > 0, "Timeout must be positive");
        dfwv.o(timeUnit, "TimeUnit must not be null");
        final dhqf dhqfVar = new dhqf();
        final dhri dhriVar = new dhri(dhqfVar);
        final dgxx dgxxVar = new dgxx(Looper.getMainLooper());
        dgxxVar.postDelayed(new Runnable() { // from class: dhrn
            @Override // java.lang.Runnable
            public final void run() {
                dhri.this.c(new TimeoutException());
            }
        }, timeUnit.toMillis(j));
        dhreVar.s(new dhqs() { // from class: dhro
            @Override // defpackage.dhqs
            public final void a(dhre dhreVar2) {
                dgxx.this.removeCallbacksAndMessages(null);
                dhri dhriVar2 = dhriVar;
                if (dhreVar2.m()) {
                    dhriVar2.d(dhreVar2.i());
                } else {
                    if (((dhrm) dhreVar2).d) {
                        dhqfVar.b();
                        return;
                    }
                    Exception h = dhreVar2.h();
                    h.getClass();
                    dhriVar2.c(h);
                }
            }
        });
        return dhriVar.a;
    }

    public static Object f(dhre dhreVar) {
        dfwv.g();
        dfwv.f();
        if (dhreVar.l()) {
            return h(dhreVar);
        }
        dhrq dhrqVar = new dhrq();
        i(dhreVar, dhrqVar);
        dhrqVar.a.await();
        return h(dhreVar);
    }

    public static Object g(dhre dhreVar, long j, TimeUnit timeUnit) {
        dfwv.g();
        dfwv.f();
        dfwv.o(timeUnit, "TimeUnit must not be null");
        if (dhreVar.l()) {
            return h(dhreVar);
        }
        dhrq dhrqVar = new dhrq();
        i(dhreVar, dhrqVar);
        if (dhrqVar.a.await(j, timeUnit)) {
            return h(dhreVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    private static Object h(dhre dhreVar) {
        if (dhreVar.m()) {
            return dhreVar.i();
        }
        if (dhreVar.k()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(dhreVar.h());
    }

    private static void i(dhre dhreVar, dhrr dhrrVar) {
        dhreVar.q(dhrl.b, dhrrVar);
        dhreVar.p(dhrl.b, dhrrVar);
        dhreVar.n(dhrl.b, dhrrVar);
    }
}
