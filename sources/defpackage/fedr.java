package defpackage;

import java.util.concurrent.ScheduledFuture;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fedr {
    private final fedq a;
    private final ScheduledFuture b;

    public fedr(fedq fedqVar, ScheduledFuture scheduledFuture) {
        this.a = fedqVar;
        scheduledFuture.getClass();
        this.b = scheduledFuture;
    }

    public final void a() {
        this.a.b = true;
        this.b.cancel(false);
    }

    public final boolean b() {
        fedq fedqVar = this.a;
        return (fedqVar.c || fedqVar.b) ? false : true;
    }
}
