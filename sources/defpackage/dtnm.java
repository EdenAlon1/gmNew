package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtnm extends ernr implements Runnable, errk {
    final /* synthetic */ dtnn a;
    private Callable b;
    private final long c;

    public dtnm(dtnn dtnnVar, Callable callable, long j) {
        this.a = dtnnVar;
        this.b = callable;
        this.c = j;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Delayed delayed) {
        return dtnn.h(this, delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return Math.max(0L, TimeUnit.MILLISECONDS.convert(this.c - this.a.a.a(), timeUnit));
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean booleanValue;
        RuntimeException runtimeException;
        if (isDone()) {
            return;
        }
        try {
            Callable callable = this.b;
            this.b = null;
            set(callable.call());
        } finally {
            if (booleanValue) {
            }
        }
    }
}
