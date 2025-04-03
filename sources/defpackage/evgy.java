package defpackage;

import android.app.Service;
import android.os.IBinder;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evgy {
    private static final enru a = enru.c("com/google/frameworks/client/data/android/server/Endpoint");
    private final lkx b;
    private final ScheduledExecutorService c;
    private final fdzj d;
    private final emxc e;
    private final feeo f;

    public evgy(Service service, ScheduledExecutorService scheduledExecutorService, fdzj fdzjVar, emxc emxcVar) {
        emxf.b(service instanceof lkx, "A service hosting an Endpoint must be a LifecycleService");
        this.b = (lkx) service;
        this.c = scheduledExecutorService;
        this.d = fdzjVar;
        this.e = emxcVar;
        this.f = new feeo();
        ((enrr) ((enrr) a.h()).h("com/google/frameworks/client/data/android/server/Endpoint", "<init>", 59, "Endpoint.java")).t("Created gRPC endpoint for service %s", service.getClass());
    }

    public final IBinder a() {
        IBinder iBinder = this.f.a;
        iBinder.getClass();
        return iBinder;
    }

    public final void b(fefa fefaVar) {
        c(fefaVar, feeq.a);
    }

    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, java.util.List] */
    public final void c(fefa fefaVar, feeq feeqVar) {
        duip.a();
        feen feenVar = new feen(feef.b(this.b), this.f);
        feenVar.e(fefaVar);
        fefj fefjVar = feenVar.b;
        feeqVar.getClass();
        fefjVar.f = feeqVar;
        feva fevaVar = feenVar.a;
        ScheduledExecutorService scheduledExecutorService = this.c;
        fevaVar.i = scheduledExecutorService != null ? new femo(scheduledExecutorService) : feva.b;
        ScheduledExecutorService scheduledExecutorService2 = this.c;
        fefj fefjVar2 = feenVar.b;
        scheduledExecutorService2.getClass();
        fefjVar2.d = new femo(scheduledExecutorService2);
        fdzj fdzjVar = this.d;
        feva fevaVar2 = feenVar.a;
        if (fdzjVar == null) {
            fdzjVar = feva.c;
        }
        fevaVar2.h = fdzjVar;
        fdyv fdyvVar = new fdyv();
        feva fevaVar3 = feenVar.a;
        fevaVar3.j = fdyvVar;
        fevaVar3.k = fdxz.a();
        Iterator it = ((emxn) this.e).a.iterator();
        while (it.hasNext()) {
            feenVar.b((fecw) it.next());
        }
        fecr d = feenVar.d();
        try {
            d.b();
            fees.a(this.b.P(), d);
        } catch (IOException e) {
            throw new IllegalStateException("Failed to start Server for Endpoint Service ".concat(String.valueOf(String.valueOf(this.b.getClass()))), e);
        }
    }
}
