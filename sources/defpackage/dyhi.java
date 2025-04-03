package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dyhi {
    public final errl a;

    public dyhi() {
        ersf ersfVar = new ersf();
        ersfVar.c(true);
        ersfVar.d("LIT-TimeoutScheduler");
        this.a = a(new ScheduledThreadPoolExecutor(1, ersf.b(ersfVar)));
    }

    protected abstract errl a(ScheduledExecutorService scheduledExecutorService);
}
