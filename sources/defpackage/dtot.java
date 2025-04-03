package defpackage;

import android.os.Process;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtot {
    public final Thread a;
    public int b;
    public final boolean c;
    public boolean d;
    public boolean e;
    public final AtomicLong f;
    private final boolean g;

    public /* synthetic */ dtot(Thread thread, int i, boolean z, int i2, boolean z2, int i3) {
        thread.getClass();
        this.a = thread;
        this.b = (i3 & 2) != 0 ? -1 : i;
        boolean z3 = (i3 & 16) != 0;
        this.c = z3;
        this.g = ((i3 & 32) == 0) & z2;
        this.d = !z3;
        this.f = new AtomicLong(dtou.a(z, false, false, (i3 & 8) != 0 ? -21 : i2, -21, -21, 0L));
    }

    private final void e(long j) {
        if (dtos.g(j)) {
            boolean z = false;
            while (true) {
                try {
                    LockSupport.park(this);
                    if (!dtos.f(this.f.get())) {
                        break;
                    } else {
                        z |= Thread.interrupted();
                    }
                } catch (Throwable th) {
                    if (z) {
                        this.a.interrupt();
                    }
                    throw th;
                }
            }
            if (z) {
                this.a.interrupt();
            }
        }
    }

    public final void a(int i) {
        long j;
        do {
            j = this.f.get();
            int d = dtos.d(j);
            if (!dtos.g(j)) {
                throw new IllegalStateException("Unexpected not set, saw " + ("State{started=" + dtos.h(j) + ", setting=" + dtos.g(j) + ", pool=" + dtos.c(j) + ", local=" + dtos.b(j) + ", inherited=" + dtos.a(j) + "}") + " " + Long.toBinaryString(j));
            }
            if (!dtos.h(j)) {
                int a = dtnz.a(d);
                if (a != dtnz.a(i)) {
                    this.a.setPriority(a);
                }
            } else if (d != i) {
                Process.setThreadPriority(this.b, d);
                i = d;
            }
        } while (!this.f.compareAndSet(j, dtos.i(j, false, false, false, 0, 0, 0L, 121)));
        if (dtos.f(j)) {
            LockSupport.unpark(this.a);
        }
    }

    public final void b() {
        long j;
        while (true) {
            j = this.f.get();
            long i = dtos.i(j, false, false, (!this.g) & dtos.g(j), 0, -21, dtos.e(j) + 1, 27);
            if (dtos.g(j)) {
                if (this.f.compareAndSet(j, i)) {
                    break;
                }
            } else if (dtos.d(j) == dtos.d(i)) {
                if (this.f.compareAndSet(j, i)) {
                    break;
                }
            } else if (this.f.compareAndSet(j, dtos.i(i, false, true, false, 0, 0, 0L, 125))) {
                a(dtos.d(j));
                break;
            }
        }
        if (this.g) {
            return;
        }
        e(j);
    }

    public final void c() {
        AtomicLong atomicLong;
        long j;
        do {
            atomicLong = this.f;
            j = atomicLong.get();
        } while (!atomicLong.compareAndSet(j, dtos.i(j, false, false, dtos.g(j), 0, 0, 0L, 122)));
        e(j);
    }

    public final void d() {
        long j;
        do {
            j = this.f.get();
            if (!dtos.f(j)) {
                return;
            }
        } while (!this.f.compareAndSet(j, dtos.i(j, false, false, false, 0, 0, 0L, 123)));
    }

    public final String toString() {
        return this.a.getName() + " " + this.b;
    }
}
