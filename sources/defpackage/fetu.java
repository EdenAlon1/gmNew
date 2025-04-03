package defpackage;

import io.grpc.Status;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes6.dex */
abstract class fetu implements fejs {
    static final febj e;
    static final febj f;
    public static final Status g;
    public static final Random h;
    public static final boolean i;
    public feth A;
    public long B;
    public feju C;
    public fete D;
    public fete E;
    public long F;
    public boolean G;
    private final febo a;
    private Status b;
    public final febs j;
    public final Executor k;
    public final ScheduledExecutorService m;
    public final fetv n;
    public final fene o;
    public final boolean p;
    public final fetd r;
    public final long s;
    public final long t;
    public final fett u;
    public final Executor l = new feds(new fesl());
    public final Object q = new Object();
    public final fenl v = new fenl();
    public volatile fetj w = new fetj(new ArrayList(8), Collections.EMPTY_LIST, null, null, false, false, false, 0);
    public final AtomicBoolean x = new AtomicBoolean();
    public final AtomicInteger y = new AtomicInteger();
    public final AtomicInteger z = new AtomicInteger();

    static {
        febf febfVar = febo.c;
        int i2 = febj.d;
        e = new febe("grpc-previous-rpc-attempts", febfVar);
        f = new febe("grpc-retry-pushback-ms", febo.c);
        g = Status.c.withDescription("Stream thrown away because RetriableStream committed");
        h = new Random();
        i = fend.i("GRPC_EXPERIMENTAL_XDS_RLS_LB", true);
    }

    public fetu(febs febsVar, febo feboVar, fetd fetdVar, long j, long j2, Executor executor, ScheduledExecutorService scheduledExecutorService, fetv fetvVar, fene feneVar, fett fettVar) {
        this.j = febsVar;
        this.r = fetdVar;
        this.s = j;
        this.t = j2;
        this.k = executor;
        this.m = scheduledExecutorService;
        this.a = feboVar;
        this.n = fetvVar;
        if (fetvVar != null) {
            this.F = fetvVar.b;
        }
        this.o = feneVar;
        emxf.b(fetvVar == null || feneVar == null, "Should not provide both retryPolicy and hedgingPolicy");
        this.p = feneVar != null;
        this.u = fettVar;
    }

    @Override // defpackage.fejs
    public final fdxd a() {
        throw null;
    }

    @Override // defpackage.fejs
    public final void b(fenl fenlVar) {
        fetj fetjVar;
        synchronized (this.q) {
            fenlVar.b("closed", this.v);
            fetjVar = this.w;
        }
        if (fetjVar.f != null) {
            fenl fenlVar2 = new fenl();
            fetjVar.f.a.b(fenlVar2);
            fenlVar.b("committed", fenlVar2);
            return;
        }
        fenl fenlVar3 = new fenl();
        for (fets fetsVar : fetjVar.c) {
            fenl fenlVar4 = new fenl();
            fetsVar.a.b(fenlVar4);
            fenlVar3.a(fenlVar4);
        }
        fenlVar.b("open", fenlVar3);
    }

    @Override // defpackage.fejs
    public final void c(Status status) {
        fets fetsVar;
        fets fetsVar2 = new fets(0);
        fetsVar2.a = new ferc();
        Runnable t = t(fetsVar2);
        if (t != null) {
            synchronized (this.q) {
                this.w = this.w.c(fetsVar2);
            }
            t.run();
            y(status, fejt.PROCESSED, new febo());
            return;
        }
        synchronized (this.q) {
            if (this.w.c.contains(this.w.f)) {
                fetsVar = this.w.f;
            } else {
                this.b = status;
                fetsVar = null;
            }
            fetj fetjVar = this.w;
            this.w = new fetj(fetjVar.b, fetjVar.c, fetjVar.d, fetjVar.f, true, fetjVar.a, fetjVar.h, fetjVar.e);
        }
        if (fetsVar != null) {
            fetsVar.a.c(status);
        }
    }

    @Override // defpackage.fevp
    public final void d() {
        fetj fetjVar = this.w;
        if (fetjVar.a) {
            fetjVar.f.a.d();
        } else {
            v(new fesr());
        }
    }

    @Override // defpackage.fejs
    public final void e() {
        v(new fess());
    }

    @Override // defpackage.fevp
    public final void f() {
        v(new fesv());
    }

    @Override // defpackage.fevp
    public final void g(int i2) {
        fetj fetjVar = this.w;
        if (fetjVar.a) {
            fetjVar.f.a.g(i2);
        } else {
            v(new fesw(i2));
        }
    }

    @Override // defpackage.fevp
    public final void h(fdxy fdxyVar) {
        v(new feso(fdxyVar));
    }

    @Override // defpackage.fejs
    public final void i(fdys fdysVar) {
        v(new fesp(fdysVar));
    }

    @Override // defpackage.fejs
    public final void j(fdyv fdyvVar) {
        v(new fesq(fdyvVar));
    }

    @Override // defpackage.fejs
    public final void k(int i2) {
        v(new fest(i2));
    }

    @Override // defpackage.fejs
    public final void l(int i2) {
        v(new fesu(i2));
    }

    @Override // defpackage.fejs
    public final void m(feju fejuVar) {
        fete feteVar;
        fett fettVar;
        this.C = fejuVar;
        Status p = p();
        if (p != null) {
            c(p);
            return;
        }
        synchronized (this.q) {
            this.w.b.add(new feti(this));
        }
        fets s = s(0, false);
        if (s == null) {
            return;
        }
        if (this.p) {
            synchronized (this.q) {
                this.w = this.w.a(s);
                feteVar = null;
                if (z(this.w) && ((fettVar = this.u) == null || fettVar.a())) {
                    feteVar = new fete(this.q);
                    this.E = feteVar;
                }
            }
            if (feteVar != null) {
                feteVar.b(this.m.schedule(new fetg(this, feteVar), this.o.b, TimeUnit.NANOSECONDS));
            }
        }
        w(s);
    }

    @Override // defpackage.fevp
    public final void n(InputStream inputStream) {
        throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }

    @Override // defpackage.fevp
    public final boolean o() {
        Iterator it = this.w.c.iterator();
        while (it.hasNext()) {
            if (((fets) it.next()).a.o()) {
                return true;
            }
        }
        return false;
    }

    public abstract Status p();

    public abstract fejs q(febo feboVar, fdxs fdxsVar, int i2, boolean z);

    public abstract void r();

    public final fets s(int i2, boolean z) {
        int i3;
        do {
            i3 = this.z.get();
            if (i3 < 0) {
                return null;
            }
        } while (!this.z.compareAndSet(i3, i3 + 1));
        fets fetsVar = new fets(i2);
        fesy fesyVar = new fesy(new fetc(this, fetsVar));
        febo feboVar = this.a;
        febo feboVar2 = new febo();
        feboVar2.f(feboVar);
        if (i2 > 0) {
            feboVar2.g(e, String.valueOf(i2));
        }
        fetsVar.a = q(feboVar2, fesyVar, i2, z);
        return fetsVar;
    }

    public final Runnable t(fets fetsVar) {
        List list;
        Collection collection;
        boolean z;
        Future future;
        Future future2;
        synchronized (this.q) {
            if (this.w.f != null) {
                return null;
            }
            Collection collection2 = this.w.c;
            fetj fetjVar = this.w;
            emxf.m(fetjVar.f == null, "Already committed");
            List list2 = fetjVar.b;
            if (fetjVar.c.contains(fetsVar)) {
                list = null;
                collection = Collections.singleton(fetsVar);
                z = true;
            } else {
                list = list2;
                collection = Collections.EMPTY_LIST;
                z = false;
            }
            this.w = new fetj(list, collection, fetjVar.d, fetsVar, fetjVar.g, z, fetjVar.h, fetjVar.e);
            this.r.a(-this.B);
            fete feteVar = this.D;
            boolean z2 = feteVar != null ? feteVar.c : false;
            if (feteVar != null) {
                Future a = feteVar.a();
                this.D = null;
                future = a;
            } else {
                future = null;
            }
            fete feteVar2 = this.E;
            if (feteVar2 != null) {
                Future a2 = feteVar2.a();
                this.E = null;
                future2 = a2;
            } else {
                future2 = null;
            }
            return new fesn(this, collection2, fetsVar, future, z2, future2);
        }
    }

    public final void u(fets fetsVar) {
        Runnable t = t(fetsVar);
        if (t != null) {
            this.k.execute(t);
        }
    }

    public final void v(fetb fetbVar) {
        Collection collection;
        synchronized (this.q) {
            if (!this.w.a) {
                this.w.b.add(fetbVar);
            }
            collection = this.w.c;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            fetbVar.a((fets) it.next());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        if (r1 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        r9.l.execute(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        if (r4 != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        r10.a.m(new defpackage.fetr(r9, r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        r0 = r10.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        if (r9.w.f != r10) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        r10 = r9.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        r0.c(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
    
        r10 = defpackage.fetu.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0086, code lost:
    
        r2 = r3.size();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008b, code lost:
    
        if (r5 >= r2) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008d, code lost:
    
        r6 = (defpackage.fetb) r3.get(r5);
        r6.a(r10);
        r4 = r4 | (r6 instanceof defpackage.feti);
        r6 = r9.w;
        r8 = r6.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009d, code lost:
    
        if (r8 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009f, code lost:
    
        if (r8 != r10) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a1, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a5, code lost:
    
        if (r6.g == false) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(defpackage.fets r10) {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            r2 = r0
            r4 = r2
            r3 = r1
        L5:
            java.lang.Object r5 = r9.q
            monitor-enter(r5)
            fetj r6 = r9.w     // Catch: java.lang.Throwable -> Laa
            fets r7 = r6.f     // Catch: java.lang.Throwable -> Laa
            if (r7 == 0) goto L12
            if (r7 == r10) goto L12
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Laa
            goto L34
        L12:
            boolean r7 = r6.g     // Catch: java.lang.Throwable -> Laa
            if (r7 == 0) goto L18
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Laa
            goto L34
        L18:
            java.util.List r7 = r6.b     // Catch: java.lang.Throwable -> Laa
            int r7 = r7.size()     // Catch: java.lang.Throwable -> Laa
            if (r2 != r7) goto L59
            fetj r0 = r6.c(r10)     // Catch: java.lang.Throwable -> Laa
            r9.w = r0     // Catch: java.lang.Throwable -> Laa
            boolean r0 = r9.o()     // Catch: java.lang.Throwable -> Laa
            if (r0 != 0) goto L2e
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Laa
            return
        L2e:
            fesz r1 = new fesz     // Catch: java.lang.Throwable -> Laa
            r1.<init>(r9)     // Catch: java.lang.Throwable -> Laa
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Laa
        L34:
            if (r1 == 0) goto L3c
            java.util.concurrent.Executor r10 = r9.l
            r10.execute(r1)
            return
        L3c:
            if (r4 != 0) goto L48
            fejs r0 = r10.a
            fetr r1 = new fetr
            r1.<init>(r9, r10)
            r0.m(r1)
        L48:
            fejs r0 = r10.a
            fetj r1 = r9.w
            fets r1 = r1.f
            if (r1 != r10) goto L53
            io.grpc.Status r10 = r9.b
            goto L55
        L53:
            io.grpc.Status r10 = defpackage.fetu.g
        L55:
            r0.c(r10)
            return
        L59:
            boolean r7 = r10.b     // Catch: java.lang.Throwable -> Laa
            if (r7 == 0) goto L5f
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Laa
            return
        L5f:
            int r7 = r2 + 128
            java.util.List r8 = r6.b     // Catch: java.lang.Throwable -> Laa
            int r8 = r8.size()     // Catch: java.lang.Throwable -> Laa
            int r7 = java.lang.Math.min(r7, r8)     // Catch: java.lang.Throwable -> Laa
            if (r3 != 0) goto L79
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Laa
            java.util.List r6 = r6.b     // Catch: java.lang.Throwable -> Laa
            java.util.List r2 = r6.subList(r2, r7)     // Catch: java.lang.Throwable -> Laa
            r3.<init>(r2)     // Catch: java.lang.Throwable -> Laa
            goto L85
        L79:
            r3.clear()     // Catch: java.lang.Throwable -> Laa
            java.util.List r6 = r6.b     // Catch: java.lang.Throwable -> Laa
            java.util.List r2 = r6.subList(r2, r7)     // Catch: java.lang.Throwable -> Laa
            r3.addAll(r2)     // Catch: java.lang.Throwable -> Laa
        L85:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Laa
            int r2 = r3.size()
            r5 = r0
        L8b:
            if (r5 >= r2) goto La7
            java.lang.Object r6 = r3.get(r5)
            fetb r6 = (defpackage.fetb) r6
            r6.a(r10)
            boolean r6 = r6 instanceof defpackage.feti
            r4 = r4 | r6
            fetj r6 = r9.w
            fets r8 = r6.f
            if (r8 == 0) goto La1
            if (r8 != r10) goto La7
        La1:
            boolean r6 = r6.g
            int r5 = r5 + 1
            if (r6 == 0) goto L8b
        La7:
            r2 = r7
            goto L5
        Laa:
            r10 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Laa
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fetu.w(fets):void");
    }

    public final void x() {
        Future future;
        synchronized (this.q) {
            fete feteVar = this.E;
            future = null;
            if (feteVar != null) {
                Future a = feteVar.a();
                this.E = null;
                future = a;
            }
            this.w = this.w.b();
        }
        if (future != null) {
            future.cancel(false);
        }
    }

    public final void y(Status status, fejt fejtVar, febo feboVar) {
        this.A = new feth(status, fejtVar, feboVar);
        if (this.z.addAndGet(Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            this.l.execute(new feta(this, status, fejtVar, feboVar));
        }
    }

    public final boolean z(fetj fetjVar) {
        return fetjVar.f == null && fetjVar.e < this.o.a && !fetjVar.h;
    }
}
