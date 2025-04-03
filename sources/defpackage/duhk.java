package defpackage;

import android.net.TrafficStats;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duhk implements Executor {
    private final Executor a;

    public duhk(Executor executor) {
        this.a = executor;
        Integer num = 0;
        num.getClass();
        Integer num2 = -1;
        num2.getClass();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        this.a.execute(eldl.l(new Runnable() { // from class: duhj
            @Override // java.lang.Runnable
            public final void run() {
                TrafficStats.setThreadStatsTag(0);
                try {
                    runnable.run();
                } finally {
                    TrafficStats.clearThreadStatsTag();
                }
            }
        }));
    }
}
