package defpackage;

import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dunl implements duof {
    public static final enru a = enru.c("com/google/android/libraries/inputmethod/concurrent/Executors");
    public static volatile dunl b;
    public final List c = new ArrayList();
    public final errm d;
    public final errm e;
    public final errm f;
    public volatile errm g;
    private final errm h;
    private final dunr i;

    public dunl(errm errmVar, errm errmVar2, errm errmVar3, errm errmVar4) {
        dunl dunlVar;
        if (errmVar == null) {
            ersf ersfVar = new ersf();
            ersfVar.d("ImeScheduler-%d");
            ersfVar.c(true);
            errmVar = errs.b(Executors.newScheduledThreadPool(1, ersf.b(ersfVar)));
        }
        this.h = errmVar;
        this.i = duzy.a ? new dunr(errmVar, new emwl() { // from class: dunk
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                enrr a2 = dunl.a.a(duwj.a);
                a2.W(1, TimeUnit.SECONDS);
                ((enrr) a2.h("com/google/android/libraries/inputmethod/concurrent/Executors", "createStalledTaskDetector", 471, "Executors.java")).t("Long-running task detected: %s", (String) obj);
                return null;
            }
        }) : null;
        this.d = errmVar2 == null ? new duni(e("Light-P0", 0, Math.max(2, Runtime.getRuntime().availableProcessors() - 2)), errmVar) : errmVar2;
        this.e = errmVar3 == null ? new duni(e("Back-P10", 10, 4), errmVar) : errmVar3;
        if (errmVar4 == null) {
            dunlVar = this;
            errmVar4 = new duni(dunlVar.g("Block-P11", 11, 0, Alert.DURATION_SHOW_INDEFINITELY, new SynchronousQueue(), false), errmVar);
        } else {
            dunlVar = this;
        }
        dunlVar.f = errmVar4;
        duoe.a.a(this);
    }

    public static dunl a() {
        dunl dunlVar;
        dunl dunlVar2 = b;
        if (dunlVar2 != null) {
            return dunlVar2;
        }
        synchronized (dunl.class) {
            dunlVar = b;
            if (dunlVar == null) {
                dunlVar = new dunl(null, null, null, null);
                b = dunlVar;
            }
        }
        return dunlVar;
    }

    public static Executor b(Executor executor) {
        return c(executor) ? executor : new ersb(executor);
    }

    public static boolean c(Executor executor) {
        return d(executor) || executor == erpp.a || (executor instanceof dunj) || (executor instanceof duno);
    }

    public static boolean d(Executor executor) {
        if (executor != duoc.b) {
            return executor == (duzy.a ? dumx.a : erpp.a) || executor == duoc.a;
        }
        return true;
    }

    public static dunu f() {
        return duzy.a ? new dumy() : new dumz();
    }

    private final errl g(String str, int i, int i2, int i3, BlockingQueue blockingQueue, boolean z) {
        if (str.length() > 16) {
            ((enrr) ((enrr) a.j()).h("com/google/android/libraries/inputmethod/concurrent/Executors", "createThreadPoolExecutor", 592, "Executors.java")).t("createThreadPoolExecutor(): name[%s] exceeds limit", str);
            str = str.substring(0, 16);
        }
        dunu f = f();
        duob duobVar = new duob(z ? this.i : null, i2, i3, TimeUnit.MINUTES, blockingQueue, new dunn(str, i, f));
        if (i2 > 0) {
            duobVar.allowCoreThreadTimeOut(true);
        }
        synchronized (this.c) {
            this.c.add(f);
            this.c.add(duobVar);
        }
        return errs.a(duobVar);
    }

    final errl e(String str, int i, int i2) {
        return g(str, i, i2, i2, new LinkedBlockingQueue(), true);
    }
}
