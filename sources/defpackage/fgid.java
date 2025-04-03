package defpackage;

import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgid implements Executor, Closeable {
    public static final fgho a = new fgho("NOT_IN_STACK");
    public final int b;
    public final int c;
    public final long d;
    public final String e;
    public final fgig f;
    public final fgig g;
    public final ffqm h;
    public final fghj i;
    public final ffqm j;
    private final ffqk k;

    public fgid(int i, int i2, long j, String str) {
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = str;
        if (i <= 0) {
            throw new IllegalArgumentException(a.f(i, "Core pool size ", " should be at least 1"));
        }
        if (i2 < i) {
            throw new IllegalArgumentException(a.r(i, i2, "Max pool size ", " should be greater than or equals to core pool size "));
        }
        if (i2 > 2097150) {
            throw new IllegalArgumentException(a.f(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150"));
        }
        if (j <= 0) {
            throw new IllegalArgumentException(a.y(j, "Idle worker keep alive time ", " must be positive"));
        }
        this.f = new fgig();
        this.g = new fgig();
        this.h = new ffqm(0L, ffqo.a);
        int i3 = i + 1;
        this.i = new fghj(i3 + i3);
        ffqo ffqoVar = ffqo.a;
        this.j = new ffqm(i << 42, ffqoVar);
        this.k = new ffqk(false, ffqoVar);
    }

    public static /* synthetic */ void e(fgid fgidVar, Runnable runnable, boolean z, int i) {
        fgidVar.a(runnable, false, z & ((i & 4) == 0));
    }

    public static final void f(fgii fgiiVar) {
        try {
            fgiiVar.run();
        } catch (Throwable th) {
            Thread currentThread = Thread.currentThread();
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
        }
    }

    private final int g() {
        synchronized (this.i) {
            if (d()) {
                return -1;
            }
            long j = this.j.c;
            int i = (int) (j & 2097151);
            int f = ffmk.f(i - ((int) ((j & 4398044413952L) >> 21)), 0);
            if (f >= this.b) {
                return 0;
            }
            if (i >= this.c) {
                return 0;
            }
            int i2 = ((int) (this.j.c & 2097151)) + 1;
            if (this.i.a(i2) != null) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            fgic fgicVar = new fgic(this, i2);
            this.i.b(i2, fgicVar);
            if (i2 != ((int) (2097151 & ffqm.a.incrementAndGet(this.j)))) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            int i3 = f + 1;
            fgicVar.start();
            return i3;
        }
    }

    private final fgic h() {
        Thread currentThread = Thread.currentThread();
        fgic fgicVar = currentThread instanceof fgic ? (fgic) currentThread : null;
        if (fgicVar == null || !ffkj.e(fgicVar.d, this)) {
            return null;
        }
        return fgicVar;
    }

    private final boolean i(long j) {
        if (ffmk.f(((int) (j & 2097151)) - ((int) ((4398044413952L & j) >> 21)), 0) < this.b) {
            int g = g();
            if (g == 1) {
                if (this.b > 1) {
                    g();
                }
            } else if (g <= 0) {
            }
            return true;
        }
        return false;
    }

    private final boolean j() {
        fgic fgicVar;
        do {
            ffqm ffqmVar = this.h;
            while (true) {
                long j = ffqmVar.c;
                fgicVar = (fgic) this.i.a((int) (2097151 & j));
                if (fgicVar != null) {
                    long j2 = 2097152 + j;
                    int k = k(fgicVar);
                    if (k >= 0 && this.h.c(j, (j2 & (-2097152)) | k)) {
                        fgicVar.nextParkedWorker = a;
                        break;
                    }
                } else {
                    fgicVar = null;
                    break;
                }
            }
            if (fgicVar == null) {
                return false;
            }
        } while (!fgicVar.b.c(-1, 0));
        LockSupport.unpark(fgicVar);
        return true;
    }

    private static final int k(fgic fgicVar) {
        int i;
        do {
            Object obj = fgicVar.nextParkedWorker;
            if (obj == a) {
                return -1;
            }
            if (obj == null) {
                return 0;
            }
            fgicVar = (fgic) obj;
            i = fgicVar.indexInArray;
        } while (i == 0);
        return i;
    }

    public final void a(Runnable runnable, boolean z, boolean z2) {
        fgii fgijVar;
        int i;
        String str = fgik.a;
        long nanoTime = System.nanoTime();
        if (runnable instanceof fgii) {
            fgijVar = (fgii) runnable;
            fgijVar.g = nanoTime;
            fgijVar.h = z;
        } else {
            fgijVar = new fgij(runnable, nanoTime, z);
        }
        boolean z3 = fgijVar.h;
        long a2 = z3 ? this.j.a(2097152L) : 0L;
        fgic h = h();
        if (h != null && (i = h.e) != 5 && (fgijVar.h || i != 2)) {
            h.c = true;
            fgim fgimVar = h.a;
            if (z2) {
                fgijVar = fgimVar.b(fgijVar);
            } else {
                fgii fgiiVar = (fgii) fgimVar.a.a(fgijVar);
                fgijVar = fgiiVar == null ? null : fgimVar.b(fgiiVar);
            }
        }
        if (fgijVar != null) {
            if (!(fgijVar.h ? this.g.d(fgijVar) : this.f.d(fgijVar))) {
                throw new RejectedExecutionException(String.valueOf(this.e).concat(" was terminated"));
            }
        }
        boolean z4 = z2 && h != null;
        if (!z3) {
            if (z4) {
                return;
            }
            c();
        } else {
            if (z4 || j() || i(a2)) {
                return;
            }
            j();
        }
    }

    public final void b(fgic fgicVar, int i, int i2) {
        while (true) {
            long j = this.h.c;
            long j2 = 2097152 + j;
            int i3 = (int) (2097151 & j);
            if (i3 == i) {
                i3 = i2 == 0 ? k(fgicVar) : i2;
            }
            if (i3 >= 0 && this.h.c(j, (j2 & (-2097152)) | i3)) {
                return;
            }
        }
    }

    public final void c() {
        if (j() || i(this.j.c)) {
            return;
        }
        j();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        fgii fgiiVar;
        if (this.k.b()) {
            fgic h = h();
            synchronized (this.i) {
                j = this.j.c & 2097151;
            }
            int i = (int) j;
            if (i > 0) {
                int i2 = 1;
                while (true) {
                    Object a2 = this.i.a(i2);
                    a2.getClass();
                    fgic fgicVar = (fgic) a2;
                    if (fgicVar != h) {
                        while (fgicVar.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(fgicVar);
                            fgicVar.join(10000L);
                        }
                        boolean z = ffso.a;
                        fgim fgimVar = fgicVar.a;
                        fgig fgigVar = this.g;
                        fgii fgiiVar2 = (fgii) fgimVar.a.a(null);
                        if (fgiiVar2 != null) {
                            fgigVar.d(fgiiVar2);
                        }
                        while (true) {
                            fgii c = fgimVar.c();
                            if (c == null) {
                                break;
                            } else {
                                fgigVar.d(c);
                            }
                        }
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.g.c();
            this.f.c();
            while (true) {
                if (h != null) {
                    fgiiVar = h.b(true);
                    if (fgiiVar != null) {
                        continue;
                        f(fgiiVar);
                    }
                }
                fgiiVar = (fgii) this.f.b();
                if (fgiiVar == null && (fgiiVar = (fgii) this.g.b()) == null) {
                    break;
                }
                f(fgiiVar);
            }
            if (h != null) {
                h.d(5);
            }
            boolean z2 = ffso.a;
            this.h.c = 0L;
            this.j.c = 0L;
        }
    }

    public final boolean d() {
        return this.k.a();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        e(this, runnable, false, 6);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        int length = this.i.array.length();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < length; i6++) {
            fgic fgicVar = (fgic) this.i.a(i6);
            if (fgicVar != null) {
                fgim fgimVar = fgicVar.a;
                int a2 = fgimVar.a.a != null ? fgimVar.a() + 1 : fgimVar.a();
                int i7 = fgicVar.e;
                int i8 = i7 - 1;
                if (i7 == 0) {
                    throw null;
                }
                if (i8 == 0) {
                    arrayList.add(a.B(a2, "c"));
                    i++;
                } else if (i8 == 1) {
                    arrayList.add(a.B(a2, "b"));
                    i2++;
                } else if (i8 == 2) {
                    i3++;
                } else if (i8 == 3) {
                    i4++;
                    if (a2 > 0) {
                        arrayList.add(a.B(a2, "d"));
                    }
                } else {
                    if (i8 != 4) {
                        throw new ffcd();
                    }
                    i5++;
                }
            }
        }
        ffqm ffqmVar = this.j;
        String str = this.e;
        long j = ffqmVar.c;
        String b = ffsp.b(this);
        int i9 = this.b;
        int i10 = this.c;
        fgig fgigVar = this.f;
        fgig fgigVar2 = this.g;
        return str + "@" + b + "[Pool Size {core = " + i9 + ", max = " + i10 + "}, Worker States {CPU = " + i + ", blocking = " + i2 + ", parked = " + i3 + ", dormant = " + i4 + ", terminated = " + i5 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + fgigVar.a() + ", global blocking queue size = " + fgigVar2.a() + ", Control State {created workers= " + ((int) (j & 2097151)) + ", blocking tasks = " + ((int) ((j & 4398044413952L) >> 21)) + ", CPUs acquired = " + (i9 - ((int) ((j & 9223367638808264704L) >> 42))) + "}]";
    }
}
