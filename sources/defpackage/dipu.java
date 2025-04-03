package defpackage;

import com.google.android.ims.events.EventHubProxy;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dipu implements Runnable {
    final /* synthetic */ EventHubProxy a;

    public dipu(EventHubProxy eventHubProxy) {
        this.a = eventHubProxy;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        long j2;
        synchronized (this) {
            while (true) {
                long longValue = dkvj.a().longValue();
                j = this.a.e;
                if (longValue < j) {
                    try {
                        j2 = this.a.e;
                        wait(j2 - dkvj.a().longValue());
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        dkty.i(e, "timer interrupted", new Object[0]);
                    }
                } else {
                    this.a.e = Long.MAX_VALUE;
                }
            }
        }
        this.a.postQueuedEvents();
    }
}
