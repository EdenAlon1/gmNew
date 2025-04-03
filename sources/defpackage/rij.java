package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rij implements rid, rib {
    public volatile rib a;
    public volatile rib b;
    private final rid c;
    private final Object d;
    private ric e = ric.CLEARED;
    private ric f = ric.CLEARED;
    private boolean g;

    public rij(Object obj, rid ridVar) {
        this.d = obj;
        this.c = ridVar;
    }

    @Override // defpackage.rid
    public final rid a() {
        rid a;
        synchronized (this.d) {
            rid ridVar = this.c;
            a = ridVar != null ? ridVar.a() : this;
        }
        return a;
    }

    @Override // defpackage.rib
    public final void b() {
        synchronized (this.d) {
            this.g = true;
            try {
                if (this.e != ric.SUCCESS) {
                    ric ricVar = this.f;
                    ric ricVar2 = ric.RUNNING;
                    if (ricVar != ricVar2) {
                        this.f = ricVar2;
                        this.b.b();
                    }
                }
                if (this.g) {
                    ric ricVar3 = this.e;
                    ric ricVar4 = ric.RUNNING;
                    if (ricVar3 != ricVar4) {
                        this.e = ricVar4;
                        this.a.b();
                    }
                }
            } finally {
                this.g = false;
            }
        }
    }

    @Override // defpackage.rib
    public final void c() {
        synchronized (this.d) {
            this.g = false;
            this.e = ric.CLEARED;
            this.f = ric.CLEARED;
            this.b.c();
            this.a.c();
        }
    }

    @Override // defpackage.rid
    public final void d(rib ribVar) {
        synchronized (this.d) {
            if (!ribVar.equals(this.a)) {
                this.f = ric.FAILED;
                return;
            }
            this.e = ric.FAILED;
            rid ridVar = this.c;
            if (ridVar != null) {
                ridVar.d(this);
            }
        }
    }

    @Override // defpackage.rid
    public final void e(rib ribVar) {
        synchronized (this.d) {
            if (ribVar.equals(this.b)) {
                this.f = ric.SUCCESS;
                return;
            }
            this.e = ric.SUCCESS;
            rid ridVar = this.c;
            if (ridVar != null) {
                ridVar.e(this);
            }
            if (!this.f.f) {
                this.b.c();
            }
        }
    }

    @Override // defpackage.rib
    public final void f() {
        synchronized (this.d) {
            if (!this.f.f) {
                this.f = ric.PAUSED;
                this.b.f();
            }
            if (!this.e.f) {
                this.e = ric.PAUSED;
                this.a.f();
            }
        }
    }

    @Override // defpackage.rid
    public final boolean g(rib ribVar) {
        boolean z;
        synchronized (this.d) {
            rid ridVar = this.c;
            z = false;
            if ((ridVar == null || ridVar.g(this)) && ribVar.equals(this.a) && this.e != ric.PAUSED) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.rid
    public final boolean h(rib ribVar) {
        boolean z;
        synchronized (this.d) {
            rid ridVar = this.c;
            z = false;
            if ((ridVar == null || ridVar.h(this)) && ribVar.equals(this.a) && !j()) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.rid
    public final boolean i(rib ribVar) {
        boolean z;
        synchronized (this.d) {
            rid ridVar = this.c;
            z = false;
            if ((ridVar == null || ridVar.i(this)) && (ribVar.equals(this.a) || this.e != ric.SUCCESS)) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.rid, defpackage.rib
    public final boolean j() {
        boolean z;
        synchronized (this.d) {
            z = true;
            if (!this.b.j() && !this.a.j()) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.rib
    public final boolean k() {
        boolean z;
        synchronized (this.d) {
            z = this.e == ric.CLEARED;
        }
        return z;
    }

    @Override // defpackage.rib
    public final boolean l() {
        boolean z;
        synchronized (this.d) {
            z = this.e == ric.SUCCESS;
        }
        return z;
    }

    @Override // defpackage.rib
    public final boolean m(rib ribVar) {
        if (ribVar instanceof rij) {
            rij rijVar = (rij) ribVar;
            if (this.a != null ? this.a.m(rijVar.a) : rijVar.a == null) {
                if (this.b == null) {
                    if (rijVar.b == null) {
                        return true;
                    }
                } else if (this.b.m(rijVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.rib
    public final boolean n() {
        boolean z;
        synchronized (this.d) {
            z = this.e == ric.RUNNING;
        }
        return z;
    }
}
