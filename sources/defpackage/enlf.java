package defpackage;

import java.lang.ref.ReferenceQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes5.dex */
class enlf extends ReentrantLock {
    final enme a;
    volatile int b;
    int c;
    int d;
    volatile AtomicReferenceArray e;
    final AtomicInteger f = new AtomicInteger();

    public enlf(enme enmeVar, int i) {
        this.a = enmeVar;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(i);
        this.d = (atomicReferenceArray.length() * 3) / 4;
        this.e = atomicReferenceArray;
    }

    static boolean m(enlb enlbVar) {
        return enlbVar.d() == null;
    }

    static final void n(ReferenceQueue referenceQueue) {
        while (referenceQueue.poll() != null) {
        }
    }

    final enlb a(enlb enlbVar, enlb enlbVar2) {
        return this.a.g.a(this, enlbVar, enlbVar2);
    }

    final enlb b(Object obj, int i) {
        if (this.b == 0) {
            return null;
        }
        for (enlb enlbVar = (enlb) this.e.get((r0.length() - 1) & i); enlbVar != null; enlbVar = enlbVar.b()) {
            if (enlbVar.a() == i) {
                Object c = enlbVar.c();
                if (c == null) {
                    l();
                } else if (this.a.f.d(obj, c)) {
                    return enlbVar;
                }
            }
        }
        return null;
    }

    final enlb c(enlb enlbVar, enlb enlbVar2) {
        int i = this.b;
        enlb b = enlbVar2.b();
        while (enlbVar != enlbVar2) {
            enlb a = a(enlbVar, b);
            if (a != null) {
                b = a;
            } else {
                i--;
            }
            enlbVar = enlbVar.b();
        }
        this.b = i;
        return b;
    }

    final Object d(Object obj, int i, Object obj2, boolean z) {
        Object obj3;
        lock();
        try {
            j();
            int i2 = this.b + 1;
            if (i2 > this.d) {
                AtomicReferenceArray atomicReferenceArray = this.e;
                int length = atomicReferenceArray.length();
                if (length < 1073741824) {
                    int i3 = this.b;
                    AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(length + length);
                    this.d = (atomicReferenceArray2.length() * 3) / 4;
                    int length2 = atomicReferenceArray2.length() - 1;
                    for (int i4 = 0; i4 < length; i4++) {
                        enlb enlbVar = (enlb) atomicReferenceArray.get(i4);
                        if (enlbVar != null) {
                            enlb b = enlbVar.b();
                            int a = enlbVar.a() & length2;
                            if (b == null) {
                                atomicReferenceArray2.set(a, enlbVar);
                            } else {
                                enlb enlbVar2 = enlbVar;
                                while (b != null) {
                                    int a2 = b.a() & length2;
                                    int i5 = a2 != a ? a2 : a;
                                    if (a2 != a) {
                                        enlbVar2 = b;
                                    }
                                    b = b.b();
                                    a = i5;
                                }
                                atomicReferenceArray2.set(a, enlbVar2);
                                while (enlbVar != enlbVar2) {
                                    int a3 = enlbVar.a() & length2;
                                    enlb a4 = a(enlbVar, (enlb) atomicReferenceArray2.get(a3));
                                    if (a4 != null) {
                                        atomicReferenceArray2.set(a3, a4);
                                    } else {
                                        i3--;
                                    }
                                    enlbVar = enlbVar.b();
                                }
                            }
                        }
                    }
                    this.e = atomicReferenceArray2;
                    this.b = i3;
                }
                i2 = this.b + 1;
            }
            AtomicReferenceArray atomicReferenceArray3 = this.e;
            int length3 = (atomicReferenceArray3.length() - 1) & i;
            enlb enlbVar3 = (enlb) atomicReferenceArray3.get(length3);
            enlb enlbVar4 = enlbVar3;
            while (true) {
                obj3 = null;
                if (enlbVar4 == null) {
                    this.c++;
                    enlb b2 = this.a.g.b(this, obj, i, enlbVar3);
                    k(b2, obj2);
                    atomicReferenceArray3.set(length3, b2);
                    this.b = i2;
                    break;
                }
                Object c = enlbVar4.c();
                if (enlbVar4.a() == i && c != null && this.a.f.d(obj, c)) {
                    Object d = enlbVar4.d();
                    if (d == null) {
                        this.c++;
                        k(enlbVar4, obj2);
                        this.b = this.b;
                    } else {
                        if (!z) {
                            this.c++;
                            k(enlbVar4, obj2);
                        }
                        obj3 = d;
                    }
                } else {
                    enlbVar4 = enlbVar4.b();
                }
            }
            return obj3;
        } finally {
            unlock();
        }
    }

    final void e(ReferenceQueue referenceQueue) {
        int i = 0;
        do {
            Object poll = referenceQueue.poll();
            if (poll == null) {
                return;
            }
            enme enmeVar = this.a;
            enlb enlbVar = (enlb) poll;
            int a = enlbVar.a();
            enlf c = enmeVar.c(a);
            c.lock();
            try {
                int i2 = c.b;
                AtomicReferenceArray atomicReferenceArray = c.e;
                int length = a & (atomicReferenceArray.length() - 1);
                enlb enlbVar2 = (enlb) atomicReferenceArray.get(length);
                enlb enlbVar3 = enlbVar2;
                while (true) {
                    if (enlbVar3 == null) {
                        break;
                    }
                    if (enlbVar3 == enlbVar) {
                        c.c++;
                        enlb c2 = c.c(enlbVar2, enlbVar3);
                        int i3 = c.b - 1;
                        atomicReferenceArray.set(length, c2);
                        c.b = i3;
                        break;
                    }
                    enlbVar3 = enlbVar3.b();
                }
                c.unlock();
                i++;
            } catch (Throwable th) {
                c.unlock();
                throw th;
            }
        } while (i != 16);
    }

    final void f(ReferenceQueue referenceQueue) {
        int i = 0;
        do {
            Object poll = referenceQueue.poll();
            if (poll == null) {
                return;
            }
            enme enmeVar = this.a;
            enmb enmbVar = (enmb) poll;
            enlb a = enmbVar.a();
            int a2 = a.a();
            enlf c = enmeVar.c(a2);
            Object c2 = a.c();
            c.lock();
            try {
                int i2 = c.b;
                AtomicReferenceArray atomicReferenceArray = c.e;
                int length = (atomicReferenceArray.length() - 1) & a2;
                enlb enlbVar = (enlb) atomicReferenceArray.get(length);
                enlb enlbVar2 = enlbVar;
                while (true) {
                    if (enlbVar2 == null) {
                        break;
                    }
                    Object c3 = enlbVar2.c();
                    if (enlbVar2.a() != a2 || c3 == null || !c.a.f.d(c2, c3)) {
                        enlbVar2 = enlbVar2.b();
                    } else if (((enma) enlbVar2).e() == enmbVar) {
                        c.c++;
                        enlb c4 = c.c(enlbVar, enlbVar2);
                        int i3 = c.b - 1;
                        atomicReferenceArray.set(length, c4);
                        c.b = i3;
                    }
                }
                c.unlock();
                i++;
            } catch (Throwable th) {
                c.unlock();
                throw th;
            }
        } while (i != 16);
    }

    final void i() {
        if ((this.f.incrementAndGet() & 63) == 0) {
            j();
        }
    }

    final void j() {
        if (tryLock()) {
            try {
                h();
                this.f.set(0);
            } finally {
                unlock();
            }
        }
    }

    final void k(enlb enlbVar, Object obj) {
        this.a.g.f(this, enlbVar, obj);
    }

    final void l() {
        if (tryLock()) {
            try {
                h();
            } finally {
                unlock();
            }
        }
    }

    public void g() {
    }

    public void h() {
    }
}
