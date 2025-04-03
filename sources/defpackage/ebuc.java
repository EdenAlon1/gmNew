package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebuc {
    public boolean a = true;
    private final ScheduledExecutorService b;

    public ebuc(ScheduledExecutorService scheduledExecutorService) {
        this.b = scheduledExecutorService;
    }

    public final void a(final Runnable runnable) {
        if (this.a) {
            this.b.schedule(new Runnable() { // from class: ebub
                @Override // java.lang.Runnable
                public final void run() {
                    runnable.run();
                    this.a = false;
                }
            }, 5L, TimeUnit.SECONDS).getClass();
        } else {
            runnable.run();
        }
    }
}
