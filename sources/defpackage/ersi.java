package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ersi extends erqb {
    public ListenableFuture a;
    public ScheduledFuture b;

    public ersi(ListenableFuture listenableFuture) {
        listenableFuture.getClass();
        this.a = listenableFuture;
    }

    @Override // defpackage.ernr
    protected final String gP() {
        ListenableFuture listenableFuture = this.a;
        ScheduledFuture scheduledFuture = this.b;
        if (listenableFuture == null) {
            return null;
        }
        String b = a.b(listenableFuture, "inputFuture=[", "]");
        if (scheduledFuture == null) {
            return b;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return b;
        }
        return b + ", remaining delay=[" + delay + " ms]";
    }

    @Override // defpackage.ernr
    protected final void gQ() {
        l(this.a);
        ScheduledFuture scheduledFuture = this.b;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.a = null;
        this.b = null;
    }
}
