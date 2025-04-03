package defpackage;

import android.net.TrafficStats;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cimn extends ernv {
    public static final cfva a = cfvl.i(cfvl.b, "enable_silent_feedback_on_traffic_executor_failure", false);
    public final ffbr b;
    private final errl c;
    private boolean d = false;
    private final int e;

    public cimn(ffbr ffbrVar, int i, errl errlVar) {
        this.b = ffbrVar;
        this.e = i;
        this.c = errlVar;
    }

    public final int a() {
        int i = this.e;
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.d;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        elfl f = elfo.f(new Runnable() { // from class: cimm
            @Override // java.lang.Runnable
            public final void run() {
                cimn cimnVar = cimn.this;
                int threadStatsTag = TrafficStats.getThreadStatsTag();
                TrafficStats.setThreadStatsTag(cimnVar.a());
                try {
                    runnable.run();
                } finally {
                    TrafficStats.setThreadStatsTag(threadStatsTag);
                }
            }
        }, this.c);
        if (((Boolean) a.e()).booleanValue()) {
            f.f(Throwable.class, new eroh() { // from class: ciml
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    return ((cfyt) cimn.this.b.b()).b((Throwable) obj);
                }
            }, erpp.a);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.d;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.d;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.d = true;
    }

    @Override // java.util.concurrent.ExecutorService
    public final /* bridge */ /* synthetic */ List shutdownNow() {
        shutdown();
        int i = engw.d;
        return enou.a;
    }
}
