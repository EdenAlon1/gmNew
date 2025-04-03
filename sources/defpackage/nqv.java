package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class nqv extends mea {
    protected long j;
    protected nsb k;
    protected npo l;
    protected boolean m;
    private lqc n;
    private lqc o;
    private final ntg p;
    private final npc q;
    private final lxz r;
    private boolean s;
    private boolean t;
    private boolean u;

    public nqv(int i, ntg ntgVar, npc npcVar) {
        super(i);
        this.p = ntgVar;
        this.q = npcVar;
        this.r = new lxz(0);
    }

    private final boolean ac() {
        if (this.k != null) {
            return true;
        }
        if (this.o == null) {
            if (this.l == null || ntl.b(this.n.o) != 1) {
                this.o = aa(this.n);
            } else {
                lqc b = this.l.b();
                if (b == null) {
                    return false;
                }
                this.o = aa(b);
            }
        }
        nsh i = ((nsi) this.q).i(this.o);
        if (i == null) {
            return false;
        }
        this.k = i;
        return true;
    }

    private final boolean ad(lxz lxzVar) {
        int c = c(j(), lxzVar, 0);
        if (c == -5) {
            throw new IllegalStateException("Format changes are not supported.");
        }
        if (c != -4) {
            return false;
        }
        lxzVar.i();
        if (lxzVar.eR()) {
            return true;
        }
        this.p.c(this.b, lxzVar.f);
        return true;
    }

    @Override // defpackage.mea
    protected final void A() {
        this.s = false;
    }

    @Override // defpackage.mea
    protected final void B(lqc[] lqcVarArr, long j, long j2, mtl mtlVar) {
        this.j = j;
    }

    @Override // defpackage.mig
    public final void S(long j, long j2) {
        boolean X;
        boolean z;
        try {
            if (!this.s || this.m) {
                return;
            }
            lqc lqcVar = this.n;
            if (lqcVar == null || this.t) {
                if (lqcVar == null) {
                    mgz j3 = j();
                    if (c(j3, this.r, 2) != -5) {
                        return;
                    }
                    lqc lqcVar2 = j3.b;
                    lti.f(lqcVar2);
                    lqc Z = Z(lqcVar2);
                    this.n = Z;
                    this.t = this.q.d(Z, 3);
                }
                if (this.t) {
                    if (ntl.b(this.n.o) == 2 && !ac()) {
                        return;
                    }
                    W(this.n);
                    this.t = false;
                }
            }
            if (this.l != null) {
                do {
                    X = ac() ? X() : false;
                    if (this.l.h(this.r) && ad(this.r)) {
                        if (!Y(this.r)) {
                            ab(this.r);
                            this.l.e(this.r);
                        }
                        z = true;
                    }
                    z = false;
                } while (X | z);
                return;
            }
            if (!ac()) {
                return;
            }
            while (true) {
                lxz c = this.k.c();
                if (c == null) {
                    return;
                }
                if (!this.u) {
                    if (!ad(c)) {
                        return;
                    }
                    if (Y(c)) {
                        continue;
                    } else {
                        this.u = true;
                    }
                }
                boolean eR = c.eR();
                this.k.j();
                this.u = false;
                this.m = eR;
                if (eR) {
                    return;
                }
            }
        } catch (nrd e) {
            this.s = false;
            this.q.b(e);
        }
    }

    @Override // defpackage.mig
    public final boolean T() {
        return this.m;
    }

    @Override // defpackage.mig
    public final boolean U() {
        return true;
    }

    @Override // defpackage.mij
    public final int V(lqc lqcVar) {
        return mih.a(lre.b(lqcVar.o) == this.b ? 4 : 0);
    }

    protected abstract void W(lqc lqcVar);

    protected abstract boolean X();

    protected abstract boolean Y(lxz lxzVar);

    @Override // defpackage.mea, defpackage.mig
    public final mhd k() {
        return this.p;
    }

    @Override // defpackage.mea
    protected final void v(boolean z, boolean z2) {
        this.p.c(this.b, 0L);
    }

    @Override // defpackage.mea
    protected final void y() {
        npo npoVar = this.l;
        if (npoVar != null) {
            npoVar.f();
        }
    }

    @Override // defpackage.mea
    protected final void z() {
        this.s = true;
    }

    protected lqc Z(lqc lqcVar) {
        return lqcVar;
    }

    protected lqc aa(lqc lqcVar) {
        return lqcVar;
    }

    protected void ab(lxz lxzVar) {
    }
}
