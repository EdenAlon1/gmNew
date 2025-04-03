package defpackage;

import j$.util.concurrent.ConcurrentLinkedQueue;
import java.lang.ref.ReferenceQueue;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enal extends ReentrantLock {
    final enbf a;
    volatile int b;
    long c;
    int d;
    int e;
    volatile AtomicReferenceArray f;
    final long g;
    final ReferenceQueue h;
    final ReferenceQueue i;
    final Queue j;
    final AtomicInteger k = new AtomicInteger();
    final Queue l;
    final Queue m;
    final emza n;

    public enal(enbf enbfVar, int i, long j, emza emzaVar) {
        this.a = enbfVar;
        this.g = j;
        emzaVar.getClass();
        this.n = emzaVar;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(i);
        this.e = (atomicReferenceArray.length() * 3) / 4;
        if (!enbfVar.g()) {
            int i2 = this.e;
            if (i2 == j) {
                this.e = i2 + 1;
            }
        }
        this.f = atomicReferenceArray;
        this.h = enbfVar.n() ? new ReferenceQueue() : null;
        this.i = enbfVar.o() ? new ReferenceQueue() : null;
        this.j = enbfVar.m() ? new ConcurrentLinkedQueue() : enbf.c;
        this.l = enbfVar.j() ? new enbd() : enbf.c;
        this.m = enbfVar.m() ? new emzs() : enbf.c;
    }

    final enbg a(enbg enbgVar, enbg enbgVar2) {
        Object j = enbgVar.j();
        if (j == null) {
            return null;
        }
        enau d = enbgVar.d();
        Object obj = d.get();
        if (obj == null && d.f()) {
            return null;
        }
        enbg a = this.a.q.a(this, enbgVar, enbgVar2, j);
        a.p(d.b(this.i, obj, a));
        return a;
    }

    final enbg b(Object obj, int i) {
        for (enbg enbgVar = (enbg) this.f.get((r0.length() - 1) & i); enbgVar != null; enbgVar = enbgVar.e()) {
            if (enbgVar.a() == i) {
                Object j = enbgVar.j();
                if (j == null) {
                    u();
                } else if (this.a.h.d(obj, j)) {
                    return enbgVar;
                }
            }
        }
        return null;
    }

    final enbg c(Object obj, int i, long j) {
        enbg b = b(obj, i);
        if (b == null) {
            return null;
        }
        if (!this.a.k(b, j)) {
            return b;
        }
        v(j);
        return null;
    }

    final enbg d(Object obj, int i, enbg enbgVar) {
        return this.a.q.b(this, obj, i, enbgVar);
    }

    final enbg e(enbg enbgVar, enbg enbgVar2) {
        int i = this.b;
        enbg e = enbgVar2.e();
        while (enbgVar != enbgVar2) {
            enbg a = a(enbgVar, e);
            if (a != null) {
                e = a;
            } else {
                r(enbgVar);
                i--;
            }
            enbgVar = enbgVar.e();
        }
        this.b = i;
        return e;
    }

    final Object f(Object obj, int i) {
        long a;
        enbg c;
        try {
            Object obj2 = null;
            if (this.b != 0 && (c = c(obj, i, (a = this.a.p.a()))) != null) {
                Object obj3 = c.d().get();
                if (obj3 != null) {
                    q(c, a);
                    c.j();
                    emzi emziVar = this.a.r;
                    obj2 = obj3;
                } else {
                    u();
                }
            }
            return obj2;
        } finally {
            o();
        }
    }

    final Object g(enbg enbgVar, long j) {
        if (enbgVar.j() == null) {
            u();
            return null;
        }
        Object obj = enbgVar.d().get();
        if (obj == null) {
            u();
            return null;
        }
        if (!this.a.k(enbgVar, j)) {
            return obj;
        }
        v(j);
        return null;
    }

    final Object h(Object obj, int i, Object obj2, boolean z) {
        Object obj3;
        int i2;
        lock();
        try {
            long a = this.a.p.a();
            s(a);
            if (this.b + 1 > this.e) {
                m();
            }
            AtomicReferenceArray atomicReferenceArray = this.f;
            int length = (atomicReferenceArray.length() - 1) & i;
            enbg enbgVar = (enbg) atomicReferenceArray.get(length);
            enbg enbgVar2 = enbgVar;
            while (true) {
                obj3 = null;
                if (enbgVar2 == null) {
                    this.d++;
                    enbg d = d(obj, i, enbgVar);
                    z(d, obj2, a);
                    atomicReferenceArray.set(length, d);
                    this.b++;
                    l(d);
                    break;
                }
                Object j = enbgVar2.j();
                if (enbgVar2.a() == i && j != null && this.a.h.d(obj, j)) {
                    enau d2 = enbgVar2.d();
                    Object obj4 = d2.get();
                    if (obj4 == null) {
                        this.d++;
                        if (d2.f()) {
                            x(obj, null, d2.a(), 3);
                            z(enbgVar2, obj2, a);
                            i2 = this.b;
                        } else {
                            z(enbgVar2, obj2, a);
                            i2 = this.b + 1;
                        }
                        this.b = i2;
                        l(enbgVar2);
                    } else {
                        if (z) {
                            p(enbgVar2, a);
                        } else {
                            this.d++;
                            x(obj, obj4, d2.a(), 2);
                            z(enbgVar2, obj2, a);
                            l(enbgVar2);
                        }
                        obj3 = obj4;
                    }
                } else {
                    enbgVar2 = enbgVar2.e();
                }
            }
            return obj3;
        } finally {
            unlock();
            t();
        }
    }

    final Object i(enbg enbgVar, Object obj, enau enauVar) {
        if (!enauVar.g()) {
            throw new AssertionError();
        }
        emxf.p(!Thread.holdsLock(enbgVar), "Recursive load of: %s", obj);
        Object d = enauVar.d();
        if (d == null) {
            throw new emzh(a.b(obj, "CacheLoader returned null for key ", "."));
        }
        q(enbgVar, this.a.p.a());
        return d;
    }

    final void j() {
        while (true) {
            enbg enbgVar = (enbg) this.j.poll();
            if (enbgVar == null) {
                return;
            }
            if (this.m.contains(enbgVar)) {
                this.m.add(enbgVar);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cd, code lost:
    
        if (r6.d() != r9) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cf, code lost:
    
        r3.d++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00db, code lost:
    
        r0 = r3.y(r5, r6, r7, r9.get(), r9, 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00df, code lost:
    
        r4 = r3.b - 1;
        r11.set(r12, r0);
        r3.b = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e8, code lost:
    
        r3.unlock();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ef, code lost:
    
        if (r3.isHeldByCurrentThread() != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f2, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f3, code lost:
    
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0116, code lost:
    
        r3.unlock();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x011d, code lost:
    
        if (r3.isHeldByCurrentThread() == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0120, code lost:
    
        r3.t();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0123, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f5, code lost:
    
        r3.unlock();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00fc, code lost:
    
        if (r3.isHeldByCurrentThread() != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x010b, code lost:
    
        if (r3.isHeldByCurrentThread() == false) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void k() {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.enal.k():void");
    }

    final void l(enbg enbgVar) {
        if (this.a.h()) {
            j();
            if (enbgVar.d().a() > this.g && !w(enbgVar, enbgVar.a(), 5)) {
                throw new AssertionError();
            }
            while (this.c > this.g) {
                for (enbg enbgVar2 : this.m) {
                    if (enbgVar2.d().a() > 0) {
                        if (!w(enbgVar2, enbgVar2.a(), 5)) {
                            throw new AssertionError();
                        }
                    }
                }
                throw new AssertionError();
            }
        }
    }

    final void m() {
        AtomicReferenceArray atomicReferenceArray = this.f;
        int length = atomicReferenceArray.length();
        if (length >= 1073741824) {
            return;
        }
        int i = this.b;
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(length + length);
        this.e = (atomicReferenceArray2.length() * 3) / 4;
        int length2 = atomicReferenceArray2.length() - 1;
        for (int i2 = 0; i2 < length; i2++) {
            enbg enbgVar = (enbg) atomicReferenceArray.get(i2);
            if (enbgVar != null) {
                enbg e = enbgVar.e();
                int a = enbgVar.a() & length2;
                if (e == null) {
                    atomicReferenceArray2.set(a, enbgVar);
                } else {
                    enbg enbgVar2 = enbgVar;
                    while (e != null) {
                        int a2 = e.a() & length2;
                        int i3 = a2 != a ? a2 : a;
                        if (a2 != a) {
                            enbgVar2 = e;
                        }
                        e = e.e();
                        a = i3;
                    }
                    atomicReferenceArray2.set(a, enbgVar2);
                    while (enbgVar != enbgVar2) {
                        int a3 = enbgVar.a() & length2;
                        enbg a4 = a(enbgVar, (enbg) atomicReferenceArray2.get(a3));
                        if (a4 != null) {
                            atomicReferenceArray2.set(a3, a4);
                        } else {
                            r(enbgVar);
                            i--;
                        }
                        enbgVar = enbgVar.e();
                    }
                }
            }
        }
        this.f = atomicReferenceArray2;
        this.b = i;
    }

    final void n(long j) {
        enbg enbgVar;
        enbg enbgVar2;
        j();
        do {
            enbgVar = (enbg) this.l.peek();
            if (enbgVar == null || !this.a.k(enbgVar, j)) {
                do {
                    enbgVar2 = (enbg) this.m.peek();
                    if (enbgVar2 == null || !this.a.k(enbgVar2, j)) {
                        return;
                    }
                } while (w(enbgVar2, enbgVar2.a(), 4));
                throw new AssertionError();
            }
        } while (w(enbgVar, enbgVar.a(), 4));
        throw new AssertionError();
    }

    final void o() {
        if ((this.k.incrementAndGet() & 63) == 0) {
            s(this.a.p.a());
            t();
        }
    }

    final void p(enbg enbgVar, long j) {
        if (this.a.i()) {
            enbgVar.k(j);
        }
        this.m.add(enbgVar);
    }

    final void q(enbg enbgVar, long j) {
        if (this.a.i()) {
            enbgVar.k(j);
        }
        this.j.add(enbgVar);
    }

    final void r(enbg enbgVar) {
        Object j = enbgVar.j();
        enbgVar.a();
        x(j, enbgVar.d().get(), enbgVar.d().a(), 3);
        this.l.remove(enbgVar);
        this.m.remove(enbgVar);
    }

    final void s(long j) {
        if (tryLock()) {
            try {
                k();
                n(j);
                this.k.set(0);
            } finally {
                unlock();
            }
        }
    }

    final void t() {
        if (isHeldByCurrentThread()) {
            return;
        }
        enbf enbfVar = this.a;
        while (((enbh) enbfVar.o.poll()) != null) {
            try {
                emzd emzdVar = enbfVar.w;
            } catch (Throwable th) {
                enbf.a.logp(Level.WARNING, "com.google.common.cache.LocalCache", "processPendingNotifications", "Exception thrown by removal listener", th);
            }
        }
    }

    final void u() {
        if (tryLock()) {
            try {
                k();
            } finally {
                unlock();
            }
        }
    }

    final void v(long j) {
        if (tryLock()) {
            try {
                n(j);
            } finally {
                unlock();
            }
        }
    }

    final boolean w(enbg enbgVar, int i, int i2) {
        AtomicReferenceArray atomicReferenceArray = this.f;
        int length = i & (atomicReferenceArray.length() - 1);
        enbg enbgVar2 = (enbg) atomicReferenceArray.get(length);
        for (enbg enbgVar3 = enbgVar2; enbgVar3 != null; enbgVar3 = enbgVar3.e()) {
            if (enbgVar3 == enbgVar) {
                this.d++;
                enbg y = y(enbgVar2, enbgVar3, enbgVar3.j(), enbgVar3.d().get(), enbgVar3.d(), i2);
                int i3 = this.b - 1;
                atomicReferenceArray.set(length, y);
                this.b = i3;
                return true;
            }
        }
        return false;
    }

    final void x(Object obj, Object obj2, int i, int i2) {
        this.c -= i;
        if (this.a.o != enbf.c) {
            this.a.o.offer(new enbh(obj, obj2));
        }
    }

    final enbg y(enbg enbgVar, enbg enbgVar2, Object obj, Object obj2, enau enauVar, int i) {
        x(obj, obj2, enauVar.a(), i);
        this.l.remove(enbgVar2);
        this.m.remove(enbgVar2);
        if (!enauVar.g()) {
            return e(enbgVar, enbgVar2);
        }
        enauVar.e(null);
        return enbgVar;
    }

    final void z(enbg enbgVar, Object obj, long j) {
        enau enarVar;
        enbf enbfVar = this.a;
        enau d = enbgVar.d();
        emze emzeVar = enbfVar.v;
        emxf.m(true, "Weights must be non-negative");
        int ordinal = this.a.k.ordinal();
        if (ordinal == 0) {
            enarVar = new enar(obj);
        } else if (ordinal == 1) {
            enarVar = new enam(this.i, obj, enbgVar);
        } else {
            if (ordinal != 2) {
                throw null;
            }
            enarVar = new enaz(this.i, obj, enbgVar);
        }
        enbgVar.p(enarVar);
        j();
        this.c++;
        if (this.a.i()) {
            enbgVar.k(j);
        }
        if (this.a.l()) {
            enbgVar.q(j);
        }
        this.m.add(enbgVar);
        this.l.add(enbgVar);
        d.e(obj);
    }
}
