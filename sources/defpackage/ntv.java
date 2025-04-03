package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ntv {
    public final ScheduledExecutorService a = lvf.R("WatchdogTimer");
    private final long b;
    private ScheduledFuture c;
    private final nsn d;

    public ntv(long j, nsn nsnVar) {
        this.b = j;
        this.d = nsnVar;
    }

    public final void a() {
        ScheduledFuture scheduledFuture = this.c;
        lti.f(scheduledFuture);
        scheduledFuture.cancel(false);
    }

    public final void b() {
        final nsn nsnVar = this.d;
        this.c = this.a.schedule(new Runnable() { // from class: ntu
            @Override // java.lang.Runnable
            public final void run() {
                nsu nsuVar = nsn.this.a;
                nrd nrdVar = new nrd("Muxer error", new IllegalStateException(lvf.G("Abort: no output sample written in the last %d milliseconds. DebugTrace: %s", Long.valueOf(nsuVar.b), lyt.a())), 7002);
                ntf ntfVar = nsuVar.g;
                lti.f(ntfVar);
                ntfVar.b(nrdVar);
            }
        }, this.b, TimeUnit.MILLISECONDS);
    }
}
