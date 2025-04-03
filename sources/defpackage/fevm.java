package defpackage;

import java.util.IdentityHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fevm {
    private static final fevm c = new fevm();
    public final IdentityHashMap a = new IdentityHashMap();
    public ScheduledExecutorService b;

    public static Object a(fevl fevlVar) {
        return c.b(fevlVar);
    }

    public static void d(fevl fevlVar, Object obj) {
        c.e(fevlVar, obj);
    }

    final synchronized Object b(fevl fevlVar) {
        fevk fevkVar;
        fevkVar = (fevk) this.a.get(fevlVar);
        if (fevkVar == null) {
            fevkVar = new fevk(fevlVar.a());
            this.a.put(fevlVar, fevkVar);
        }
        ScheduledFuture scheduledFuture = fevkVar.c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            fevkVar.c = null;
        }
        fevkVar.b++;
        return fevkVar.a;
    }

    final synchronized void e(fevl fevlVar, Object obj) {
        fevk fevkVar = (fevk) this.a.get(fevlVar);
        if (fevkVar == null) {
            throw new IllegalArgumentException("No cached instance found for ".concat(String.valueOf(String.valueOf(fevlVar))));
        }
        boolean z = true;
        emxf.b(obj == fevkVar.a, "Releasing the wrong instance");
        emxf.m(fevkVar.b > 0, "Refcount has already reached zero");
        int i = fevkVar.b - 1;
        fevkVar.b = i;
        if (i == 0) {
            if (fevkVar.c != null) {
                z = false;
            }
            emxf.m(z, "Destroy task already scheduled");
            if (this.b == null) {
                this.b = Executors.newSingleThreadScheduledExecutor(fend.k("grpc-shared-destroyer-%d"));
            }
            fevkVar.c = this.b.schedule(new feoq(new fevj(this, fevkVar, fevlVar, obj)), 1L, TimeUnit.SECONDS);
        }
    }
}
