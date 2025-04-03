package defpackage;

import defpackage.kez;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eurk extends kez implements ScheduledFuture {
    private final ScheduledFuture c;

    public eurk(eurj eurjVar) {
        this.c = eurjVar.a(new euri(this));
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.c.compareTo(delayed);
    }

    @Override // defpackage.kez
    protected final void e() {
        Object obj = this.value;
        boolean z = false;
        if ((obj instanceof kez.b) && ((kez.b) obj).c) {
            z = true;
        }
        this.c.cancel(z);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.c.getDelay(timeUnit);
    }
}
