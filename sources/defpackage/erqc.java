package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class erqc extends erra {
    public static erqc o(ListenableFuture listenableFuture) {
        return listenableFuture instanceof erqc ? (erqc) listenableFuture : new erqe(listenableFuture);
    }

    public final erqc p(long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return (erqc) erqt.p(this, j, timeUnit, scheduledExecutorService);
    }
}
