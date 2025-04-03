package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dton extends AtomicInteger {
    public final dtot a;
    public final long b;
    public final AtomicReference c;
    private final ListenableFuture d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dton(long j, dtot dtotVar, ListenableFuture listenableFuture) {
        super(dtoo.a(dtor.a(j), false, false));
        dtotVar.getClass();
        this.a = dtotVar;
        this.d = listenableFuture;
        this.b = dtor.c(j);
        this.c = new AtomicReference();
    }

    public final void a() {
        int i;
        do {
            i = get();
        } while (!compareAndSet(i, dtoo.e(i, 0, false, true, 3)));
        if (dtoo.d(i)) {
            dtot dtotVar = this.a;
            if (!dtotVar.d) {
                throw new IllegalStateException("Could not have been boosted while not holding a lock.");
            }
            dtotVar.e = dtotVar.c;
        }
        for (dtol dtolVar = (dtol) this.c.getAndSet(dtok.a); dtolVar != null; dtolVar = dtolVar.b) {
            LockSupport.unpark(dtolVar.a.a);
        }
    }

    @Override // java.lang.Number
    public final /* bridge */ byte byteValue() {
        throw new UnsupportedOperationException();
    }

    @Override // java.lang.Number
    public final /* bridge */ short shortValue() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger
    public final String toString() {
        return "Booster[Thread=[" + this.a.a + ", future=[" + this.d + "]]";
    }
}
