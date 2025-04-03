package defpackage;

import androidx.car.app.model.Alert;
import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgic extends Thread {
    public final fgim a;
    public final ffql b;
    public boolean c;
    final /* synthetic */ fgid d;
    public int e;
    private final fflb f;
    private long g;
    private long h;
    private int i;
    public volatile int indexInArray;
    public volatile Object nextParkedWorker;

    public fgic(fgid fgidVar, int i) {
        this.d = fgidVar;
        setDaemon(true);
        setContextClassLoader(fgidVar.getClass().getClassLoader());
        this.a = new fgim();
        this.f = new fflb();
        this.e = 4;
        this.b = new ffql(0, ffqo.a);
        this.nextParkedWorker = fgid.a;
        int nanoTime = (int) System.nanoTime();
        this.i = nanoTime == 0 ? 42 : nanoTime;
        c(i);
    }

    private final fgii e() {
        if (a(2) == 0) {
            fgii fgiiVar = (fgii) this.d.f.b();
            return fgiiVar != null ? fgiiVar : (fgii) this.d.g.b();
        }
        fgii fgiiVar2 = (fgii) this.d.g.b();
        return fgiiVar2 != null ? fgiiVar2 : (fgii) this.d.f.b();
    }

    private final fgii f(int i) {
        long j;
        fgii fgiiVar;
        long j2;
        long j3;
        long j4;
        int i2 = (int) (this.d.j.c & 2097151);
        if (i2 < 2) {
            return null;
        }
        int a = a(i2);
        fgid fgidVar = this.d;
        long j5 = Long.MAX_VALUE;
        for (int i3 = 0; i3 < i2; i3++) {
            a++;
            if (a > i2) {
                a = 1;
            }
            fgic fgicVar = (fgic) fgidVar.i.a(a);
            if (fgicVar != null && fgicVar != this) {
                fgim fgimVar = fgicVar.a;
                fflb fflbVar = this.f;
                if (i == 3) {
                    fgiiVar = fgimVar.c();
                    j = 0;
                } else {
                    int i4 = fgimVar.c.c;
                    int i5 = fgimVar.b.c;
                    while (true) {
                        if (i4 == i5) {
                            j = 0;
                            break;
                        }
                        boolean z = i == 1;
                        j = 0;
                        if (z && fgimVar.d.c == 0) {
                            break;
                        }
                        int i6 = i4 + 1;
                        fgiiVar = fgimVar.d(i4, z);
                        if (fgiiVar != null) {
                            break;
                        }
                        i4 = i6;
                    }
                    fgiiVar = null;
                }
                if (fgiiVar != null) {
                    fflbVar.a = fgiiVar;
                    j4 = -1;
                    j3 = -1;
                } else {
                    while (true) {
                        fgii fgiiVar2 = (fgii) fgimVar.a.a;
                        j2 = -2;
                        if (fgiiVar2 == null) {
                            break;
                        }
                        if (((true != fgiiVar2.h ? 2 : 1) & i) == 0) {
                            break;
                        }
                        String str = fgik.a;
                        j3 = -1;
                        long nanoTime = System.nanoTime() - fgiiVar2.g;
                        long j6 = fgik.b;
                        if (nanoTime < j6) {
                            j2 = j6 - nanoTime;
                            break;
                        }
                        if (fgimVar.a.d(fgiiVar2, null)) {
                            fflbVar.a = fgiiVar2;
                            j2 = -1;
                            break;
                        }
                    }
                    j3 = -1;
                    j4 = j2;
                }
                if (j4 == j3) {
                    fflb fflbVar2 = this.f;
                    fgii fgiiVar3 = (fgii) fflbVar2.a;
                    fflbVar2.a = null;
                    return fgiiVar3;
                }
                if (j4 > j) {
                    j5 = Math.min(j5, j4);
                }
            }
        }
        if (j5 == Long.MAX_VALUE) {
            j5 = 0;
        }
        this.h = j5;
        return null;
    }

    private final boolean g() {
        return this.nextParkedWorker != fgid.a;
    }

    public final int a(int i) {
        int i2 = this.i;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.i = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i5 & i6 : (i5 & Alert.DURATION_SHOW_INDEFINITELY) % i;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0060 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.fgii b(boolean r9) {
        /*
            r8 = this;
            int r0 = r8.e
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L8
            goto L71
        L8:
            fgid r0 = r8.d
        La:
            ffqm r3 = r0.j
            long r3 = r3.c
            r5 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r5 = r5 & r3
            r7 = 42
            long r5 = r5 >> r7
            int r5 = (int) r5
            if (r5 != 0) goto L61
            fgim r9 = r8.a
        L1c:
            ffqn r0 = r9.a
            java.lang.Object r0 = r0.a
            fgii r0 = (defpackage.fgii) r0
            if (r0 != 0) goto L25
            goto L33
        L25:
            boolean r3 = r0.h
            if (r3 != r2) goto L33
            ffqn r3 = r9.a
            boolean r3 = r3.d(r0, r1)
            if (r3 == 0) goto L1c
            r1 = r0
            goto L4d
        L33:
            ffql r0 = r9.c
            int r0 = r0.c
            ffql r3 = r9.b
            int r3 = r3.c
        L3b:
            if (r0 == r3) goto L4d
            ffql r4 = r9.d
            int r4 = r4.c
            if (r4 != 0) goto L44
            goto L4d
        L44:
            int r3 = r3 + (-1)
            fgii r4 = r9.d(r3, r2)
            if (r4 == 0) goto L3b
            r1 = r4
        L4d:
            if (r1 != 0) goto L60
            fgid r9 = r8.d
            fgig r9 = r9.g
            java.lang.Object r9 = r9.b()
            fgii r9 = (defpackage.fgii) r9
            if (r9 != 0) goto L5f
            fgii r9 = r8.f(r2)
        L5f:
            return r9
        L60:
            return r1
        L61:
            r5 = -4398046511104(0xfffffc0000000000, double:NaN)
            long r5 = r5 + r3
            ffqm r7 = r0.j
            boolean r3 = r7.c(r3, r5)
            if (r3 == 0) goto La
            r8.e = r2
        L71:
            if (r9 == 0) goto La5
            fgid r9 = r8.d
            int r9 = r9.b
            int r9 = r9 + r9
            int r9 = r8.a(r9)
            if (r9 != 0) goto L7f
            goto L80
        L7f:
            r2 = 0
        L80:
            if (r2 == 0) goto L89
            fgii r9 = r8.e()
            if (r9 == 0) goto L89
            return r9
        L89:
            fgim r9 = r8.a
            ffqn r0 = r9.a
            java.lang.Object r0 = r0.a(r1)
            fgii r0 = (defpackage.fgii) r0
            if (r0 != 0) goto L99
            fgii r0 = r9.c()
        L99:
            if (r0 == 0) goto L9c
            return r0
        L9c:
            if (r2 != 0) goto Lac
            fgii r9 = r8.e()
            if (r9 == 0) goto Lac
            return r9
        La5:
            fgii r9 = r8.e()
            if (r9 == 0) goto Lac
            return r9
        Lac:
            r9 = 3
            fgii r9 = r8.f(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgic.b(boolean):fgii");
    }

    public final void c(int i) {
        String valueOf = i == 0 ? "TERMINATED" : String.valueOf(i);
        setName(this.d.e + "-worker-" + valueOf);
        this.indexInArray = i;
    }

    public final boolean d(int i) {
        int i2 = this.e;
        boolean z = i2 == 1;
        if (z) {
            this.d.j.a(4398046511104L);
        }
        if (i2 != i) {
            this.e = i;
        }
        return z;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        long j;
        loop0: while (true) {
            boolean z = false;
            while (!this.d.d() && this.e != 5) {
                fgii b = b(this.c);
                long j2 = -2097152;
                if (b != null) {
                    this.h = 0L;
                    this.g = 0L;
                    if (this.e == 3) {
                        boolean z2 = ffso.a;
                        this.e = 2;
                    }
                    if (b.h) {
                        if (d(2)) {
                            this.d.c();
                        }
                        fgid.f(b);
                        this.d.j.a(-2097152L);
                        if (this.e != 5) {
                            boolean z3 = ffso.a;
                            this.e = 4;
                        }
                    } else {
                        fgid.f(b);
                    }
                } else {
                    this.c = false;
                    if (this.h == 0) {
                        long j3 = 2097151;
                        if (g()) {
                            this.b.c = -1;
                            while (g() && this.b.c == -1 && !this.d.d() && this.e != 5) {
                                d(3);
                                Thread.interrupted();
                                if (this.g == 0) {
                                    j = j3;
                                    this.g = System.nanoTime() + this.d.d;
                                } else {
                                    j = j3;
                                }
                                LockSupport.parkNanos(this.d.d);
                                if (System.nanoTime() - this.g >= 0) {
                                    this.g = 0L;
                                    fgid fgidVar = this.d;
                                    synchronized (fgidVar.i) {
                                        if (!fgidVar.d()) {
                                            if (((int) (fgidVar.j.c & j)) > fgidVar.b) {
                                                if (this.b.c(-1, 1)) {
                                                    int i = this.indexInArray;
                                                    c(0);
                                                    fgidVar.b(this, i, 0);
                                                    int andDecrement = (int) (ffqm.a.getAndDecrement(fgidVar.j) & j);
                                                    if (andDecrement != i) {
                                                        Object a = fgidVar.i.a(andDecrement);
                                                        a.getClass();
                                                        fgic fgicVar = (fgic) a;
                                                        fgidVar.i.b(i, fgicVar);
                                                        fgicVar.c(i);
                                                        fgidVar.b(fgicVar, andDecrement, i);
                                                    }
                                                    fgidVar.i.b(andDecrement, null);
                                                    this.e = 5;
                                                }
                                            }
                                        }
                                    }
                                }
                                j3 = j;
                            }
                        } else {
                            fgid fgidVar2 = this.d;
                            if (this.nextParkedWorker == fgid.a) {
                                ffqm ffqmVar = fgidVar2.h;
                                while (true) {
                                    long j4 = ffqmVar.c;
                                    int i2 = this.indexInArray;
                                    boolean z4 = ffso.a;
                                    long j5 = j2;
                                    this.nextParkedWorker = fgidVar2.i.a((int) (j4 & 2097151));
                                    if (fgidVar2.h.c(j4, ((2097152 + j4) & j5) | i2)) {
                                        break;
                                    } else {
                                        j2 = j5;
                                    }
                                }
                            }
                        }
                    } else if (z) {
                        d(3);
                        Thread.interrupted();
                        LockSupport.parkNanos(this.h);
                        this.h = 0L;
                    } else {
                        z = true;
                    }
                }
            }
        }
        d(5);
    }
}
