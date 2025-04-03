package defpackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fhmq extends fhnx {
    public static final ReentrantLock b;
    public static final Condition c;
    public static final long d;
    public static final long e;
    public static fhmq f;
    public int g;
    public fhmq h;
    public long i;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        b = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        newCondition.getClass();
        c = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        d = millis;
        e = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final long c(long j) {
        return this.i - j;
    }

    protected IOException d(IOException iOException) {
        throw null;
    }

    public final void e() {
        fhmq fhmqVar;
        long o = o();
        boolean h = h();
        if (o == 0) {
            if (!h) {
                return;
            } else {
                o = 0;
            }
        }
        ReentrantLock reentrantLock = b;
        reentrantLock.lock();
        try {
            if (this.g != 0) {
                throw new IllegalStateException("Unbalanced enter/exit");
            }
            this.g = 1;
            if (f == null) {
                f = new fhmq();
                new fhmn().start();
            }
            long nanoTime = System.nanoTime();
            if (o != 0 && h) {
                this.i = Math.min(o, j() - nanoTime) + nanoTime;
            } else if (o != 0) {
                this.i = o + nanoTime;
            } else {
                if (!h) {
                    throw new AssertionError();
                }
                this.i = j();
            }
            long c2 = c(nanoTime);
            fhmq fhmqVar2 = f;
            fhmqVar2.getClass();
            while (true) {
                fhmqVar = fhmqVar2.h;
                if (fhmqVar == null || c2 < fhmqVar.c(nanoTime)) {
                    break;
                } else {
                    fhmqVar2 = fhmqVar;
                }
            }
            this.h = fhmqVar;
            fhmqVar2.h = this;
            if (fhmqVar2 == f) {
                c.signal();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean f() {
        ReentrantLock reentrantLock = b;
        reentrantLock.lock();
        try {
            int i = this.g;
            this.g = 0;
            if (i != 1) {
                return i == 2;
            }
            fhmq fhmqVar = f;
            while (fhmqVar != null) {
                fhmq fhmqVar2 = fhmqVar.h;
                if (fhmqVar2 == this) {
                    fhmqVar.h = this.h;
                    this.h = null;
                    return false;
                }
                fhmqVar = fhmqVar2;
            }
            throw new IllegalStateException("node was not found in the queue");
        } finally {
            reentrantLock.unlock();
        }
    }

    protected void a() {
    }
}
