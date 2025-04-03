package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecnw {
    private static final ecnv g = new ecnv() { // from class: ecnq
        @Override // defpackage.ecnv
        public final void a(int i, String str) {
        }
    };
    public final fazb a;
    public final Executor b;
    public final AtomicBoolean c = new AtomicBoolean(false);
    public volatile ecnv d = g;
    public ScheduledFuture e;
    public ScheduledFuture f;

    public ecnw(ecgt ecgtVar, errm errmVar, Executor executor, fazb fazbVar) {
        this.a = fazbVar;
        this.b = executor;
        ecgtVar.a(new ecnu(this, errmVar));
    }

    public final void a() {
        ScheduledFuture scheduledFuture = this.e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.e = null;
        }
        ScheduledFuture scheduledFuture2 = this.f;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(true);
            this.f = null;
        }
    }
}
