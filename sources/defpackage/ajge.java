package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajge {
    private static final enru c = enru.c("com/google/android/apps/messaging/penpal/telemetry/PenpalBotResponseTrackerImpl");
    public final ffbr a;
    public final AtomicInteger b;

    public ajge(ffbr ffbrVar) {
        ffbrVar.getClass();
        this.a = ffbrVar;
        this.b = new AtomicInteger(0);
    }

    public final int a() {
        return this.b.get();
    }

    public final void b() {
        if (this.b.get() > 0) {
            this.b.decrementAndGet();
        } else {
            ((enrr) c.j().h("com/google/android/apps/messaging/penpal/telemetry/PenpalBotResponseTrackerImpl", "decrementPendingResponse", 38, "PenpalBotResponseTrackerImpl.kt")).q("No pending response to decrement.");
        }
    }

    public final void c() {
        this.b.incrementAndGet();
    }
}
