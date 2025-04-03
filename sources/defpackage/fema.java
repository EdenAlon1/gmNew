package defpackage;

import io.grpc.Status;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
class fema implements fejs {
    private volatile boolean a;
    private feju b;
    private Status c;
    private felz e;
    public fejs f;
    private long g;
    private long h;
    private List d = new ArrayList();
    private List i = new ArrayList();

    private final void s(Runnable runnable) {
        emxf.m(this.b != null, "May only be called after start");
        synchronized (this) {
            if (this.a) {
                runnable.run();
            } else {
                this.d.add(runnable);
            }
        }
    }

    private final void t(feju fejuVar) {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.i = null;
        this.f.m(fejuVar);
    }

    private final void u(fejs fejsVar) {
        fejs fejsVar2 = this.f;
        emxf.p(fejsVar2 == null, "realStream already set to %s", fejsVar2);
        this.f = fejsVar;
        this.h = System.nanoTime();
    }

    @Override // defpackage.fejs
    public final fdxd a() {
        throw null;
    }

    @Override // defpackage.fejs
    public void b(fenl fenlVar) {
        synchronized (this) {
            if (this.b == null) {
                return;
            }
            if (this.f != null) {
                fenlVar.b("buffered_nanos", Long.valueOf(this.h - this.g));
                this.f.b(fenlVar);
            } else {
                fenlVar.b("buffered_nanos", Long.valueOf(System.nanoTime() - this.g));
                fenlVar.a("waiting_for_connection");
            }
        }
    }

    @Override // defpackage.fejs
    public void c(Status status) {
        boolean z = true;
        emxf.m(this.b != null, "May only be called after start");
        status.getClass();
        synchronized (this) {
            if (this.f == null) {
                u(ferc.a);
                this.c = status;
                z = false;
            }
        }
        if (z) {
            s(new felt(this, status));
            return;
        }
        r();
        p();
        this.b.a(status, fejt.PROCESSED, new febo());
    }

    @Override // defpackage.fevp
    public final void d() {
        emxf.m(this.b != null, "May only be called after start");
        if (this.a) {
            this.f.d();
        } else {
            s(new fels(this));
        }
    }

    @Override // defpackage.fejs
    public final void e() {
        emxf.m(this.b != null, "May only be called after start");
        s(new felu(this));
    }

    @Override // defpackage.fevp
    public final void f() {
        emxf.m(this.b == null, "May only be called before start");
        this.i.add(new felk(this));
    }

    @Override // defpackage.fevp
    public final void g(int i) {
        emxf.m(this.b != null, "May only be called after start");
        if (this.a) {
            this.f.g(i);
        } else {
            s(new felj(this, i));
        }
    }

    @Override // defpackage.fevp
    public final void h(fdxy fdxyVar) {
        emxf.m(this.b == null, "May only be called before start");
        fdxyVar.getClass();
        this.i.add(new fell(this, fdxyVar));
    }

    @Override // defpackage.fejs
    public final void i(fdys fdysVar) {
        emxf.m(this.b == null, "May only be called before start");
        this.i.add(new felp(this, fdysVar));
    }

    @Override // defpackage.fejs
    public final void j(fdyv fdyvVar) {
        emxf.m(this.b == null, "May only be called before start");
        fdyvVar.getClass();
        this.i.add(new felm(this, fdyvVar));
    }

    @Override // defpackage.fejs
    public final void k(int i) {
        emxf.m(this.b == null, "May only be called before start");
        this.i.add(new feln(this, i));
    }

    @Override // defpackage.fejs
    public final void l(int i) {
        emxf.m(this.b == null, "May only be called before start");
        this.i.add(new felo(this, i));
    }

    @Override // defpackage.fejs
    public final void m(feju fejuVar) {
        Status status;
        boolean z;
        emxf.m(this.b == null, "already started");
        synchronized (this) {
            status = this.c;
            z = this.a;
            if (!z) {
                felz felzVar = new felz(fejuVar);
                this.e = felzVar;
                fejuVar = felzVar;
            }
            this.b = fejuVar;
            this.g = System.nanoTime();
        }
        if (status != null) {
            fejuVar.a(status, fejt.PROCESSED, new febo());
        } else if (z) {
            t(fejuVar);
        }
    }

    @Override // defpackage.fevp
    public final void n(InputStream inputStream) {
        emxf.m(this.b != null, "May only be called after start");
        if (this.a) {
            this.f.n(inputStream);
        } else {
            s(new felr(this, inputStream));
        }
    }

    @Override // defpackage.fevp
    public final boolean o() {
        if (this.a) {
            return this.f.o();
        }
        return false;
    }

    final Runnable q(fejs fejsVar) {
        synchronized (this) {
            if (this.f == null) {
                fejsVar.getClass();
                u(fejsVar);
                feju fejuVar = this.b;
                if (fejuVar == null) {
                    this.d = null;
                    this.a = true;
                }
                if (fejuVar != null) {
                    t(fejuVar);
                    return new felq(this);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005c, code lost:
    
        if (r0.hasNext() == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x005e, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0054, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r() {
        /*
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r6)
            java.util.List r1 = r6.d     // Catch: java.lang.Throwable -> L6d
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L6d
            if (r1 == 0) goto L4f
            r0 = 0
            r6.d = r0     // Catch: java.lang.Throwable -> L6d
            r1 = 1
            r6.a = r1     // Catch: java.lang.Throwable -> L6d
            felz r2 = r6.e     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6d
            if (r2 == 0) goto L4e
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L1e:
            monitor-enter(r2)
            java.util.List r4 = r2.c     // Catch: java.lang.Throwable -> L4b
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L4b
            if (r4 == 0) goto L2d
            r2.c = r0     // Catch: java.lang.Throwable -> L4b
            r2.b = r1     // Catch: java.lang.Throwable -> L4b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4b
            return
        L2d:
            java.util.List r4 = r2.c     // Catch: java.lang.Throwable -> L4b
            r2.c = r3     // Catch: java.lang.Throwable -> L4b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4b
            java.util.Iterator r3 = r4.iterator()
        L36:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L46
            java.lang.Object r5 = r3.next()
            java.lang.Runnable r5 = (java.lang.Runnable) r5
            r5.run()
            goto L36
        L46:
            r4.clear()
            r3 = r4
            goto L1e
        L4b:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4b
            throw r0
        L4e:
            return
        L4f:
            java.util.List r1 = r6.d     // Catch: java.lang.Throwable -> L6d
            r6.d = r0     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6d
            java.util.Iterator r0 = r1.iterator()
        L58:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L68
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L58
        L68:
            r1.clear()
            r0 = r1
            goto L5
        L6d:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6d
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fema.r():void");
    }

    protected void p() {
    }
}
