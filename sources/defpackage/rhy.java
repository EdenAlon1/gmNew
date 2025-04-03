package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rhy implements rid, rib {
    public volatile rib a;
    public volatile rib b;
    private final Object c;
    private final rid d;
    private ric e = ric.CLEARED;
    private ric f = ric.CLEARED;

    public rhy(Object obj, rid ridVar) {
        this.c = obj;
        this.d = ridVar;
    }

    @Override // defpackage.rid
    public final rid a() {
        rid a;
        synchronized (this.c) {
            rid ridVar = this.d;
            a = ridVar != null ? ridVar.a() : this;
        }
        return a;
    }

    @Override // defpackage.rib
    public final void b() {
        synchronized (this.c) {
            if (this.e != ric.RUNNING) {
                this.e = ric.RUNNING;
                this.a.b();
            }
        }
    }

    @Override // defpackage.rib
    public final void c() {
        synchronized (this.c) {
            this.e = ric.CLEARED;
            this.a.c();
            ric ricVar = this.f;
            ric ricVar2 = ric.CLEARED;
            if (ricVar != ricVar2) {
                this.f = ricVar2;
                this.b.c();
            }
        }
    }

    @Override // defpackage.rid
    public final void d(rib ribVar) {
        synchronized (this.c) {
            if (ribVar.equals(this.b)) {
                this.f = ric.FAILED;
                rid ridVar = this.d;
                if (ridVar != null) {
                    ridVar.d(this);
                }
                return;
            }
            this.e = ric.FAILED;
            ric ricVar = this.f;
            ric ricVar2 = ric.RUNNING;
            if (ricVar != ricVar2) {
                this.f = ricVar2;
                this.b.b();
            }
        }
    }

    @Override // defpackage.rid
    public final void e(rib ribVar) {
        synchronized (this.c) {
            if (ribVar.equals(this.a)) {
                this.e = ric.SUCCESS;
            } else if (ribVar.equals(this.b)) {
                this.f = ric.SUCCESS;
            }
            rid ridVar = this.d;
            if (ridVar != null) {
                ridVar.e(this);
            }
        }
    }

    @Override // defpackage.rib
    public final void f() {
        synchronized (this.c) {
            if (this.e == ric.RUNNING) {
                this.e = ric.PAUSED;
                this.a.f();
            }
            if (this.f == ric.RUNNING) {
                this.f = ric.PAUSED;
                this.b.f();
            }
        }
    }

    @Override // defpackage.rid
    public final boolean g(rib ribVar) {
        boolean z;
        synchronized (this.c) {
            rid ridVar = this.d;
            z = false;
            if ((ridVar == null || ridVar.g(this)) && ribVar.equals(this.a)) {
                z = true;
            }
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        if (r6 != false) goto L21;
     */
    @Override // defpackage.rid
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(defpackage.rib r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.c
            monitor-enter(r0)
            rid r1 = r5.d     // Catch: java.lang.Throwable -> L37
            r2 = 0
            if (r1 == 0) goto Le
            boolean r1 = r1.h(r5)     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L35
        Le:
            ric r1 = r5.e     // Catch: java.lang.Throwable -> L37
            ric r3 = defpackage.ric.FAILED     // Catch: java.lang.Throwable -> L37
            r4 = 1
            if (r1 == r3) goto L1c
            rib r1 = r5.a     // Catch: java.lang.Throwable -> L37
            boolean r6 = r6.equals(r1)     // Catch: java.lang.Throwable -> L37
            goto L32
        L1c:
            rib r1 = r5.b     // Catch: java.lang.Throwable -> L37
            boolean r6 = r6.equals(r1)     // Catch: java.lang.Throwable -> L37
            if (r6 == 0) goto L31
            ric r6 = r5.f     // Catch: java.lang.Throwable -> L37
            ric r1 = defpackage.ric.SUCCESS     // Catch: java.lang.Throwable -> L37
            if (r6 == r1) goto L2f
            ric r1 = defpackage.ric.FAILED     // Catch: java.lang.Throwable -> L37
            if (r6 != r1) goto L31
            goto L34
        L2f:
            r6 = r4
            goto L32
        L31:
            r6 = r2
        L32:
            if (r6 == 0) goto L35
        L34:
            r2 = r4
        L35:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            return r2
        L37:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rhy.h(rib):boolean");
    }

    @Override // defpackage.rid
    public final boolean i(rib ribVar) {
        boolean z;
        synchronized (this.c) {
            rid ridVar = this.d;
            z = true;
            if (ridVar != null && !ridVar.i(this)) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.rid, defpackage.rib
    public final boolean j() {
        boolean z;
        synchronized (this.c) {
            z = true;
            if (!this.a.j() && !this.b.j()) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.rib
    public final boolean k() {
        boolean z;
        synchronized (this.c) {
            z = false;
            if (this.e == ric.CLEARED && this.f == ric.CLEARED) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.rib
    public final boolean l() {
        boolean z;
        synchronized (this.c) {
            z = true;
            if (this.e != ric.SUCCESS && this.f != ric.SUCCESS) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.rib
    public final boolean m(rib ribVar) {
        if (ribVar instanceof rhy) {
            rhy rhyVar = (rhy) ribVar;
            if (this.a.m(rhyVar.a) && this.b.m(rhyVar.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.rib
    public final boolean n() {
        boolean z;
        synchronized (this.c) {
            z = true;
            if (this.e != ric.RUNNING && this.f != ric.RUNNING) {
                z = false;
            }
        }
        return z;
    }
}
