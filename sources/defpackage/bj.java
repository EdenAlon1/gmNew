package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bj extends bh {
    public float af = -1.0f;
    public int ag = -1;
    public int ah = -1;
    private bg aj = this.j;
    public int ai = 0;

    public bj() {
        this.q.clear();
        this.q.add(this.aj);
    }

    public final void A(int i) {
        if (this.ai == i) {
            return;
        }
        this.ai = i;
        this.q.clear();
        if (this.ai == 1) {
            this.aj = this.i;
        } else {
            this.aj = this.j;
        }
        this.q.add(this.aj);
    }

    @Override // defpackage.bh
    public final bg u(int i) {
        int i2 = i - 1;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        return null;
                    }
                }
            }
            if (this.ai != 0) {
                return null;
            }
            return this.aj;
        }
        if (this.ai != 1) {
            return null;
        }
        return this.aj;
    }

    @Override // defpackage.bh
    public final void y(bc bcVar) {
        bh bhVar = this.r;
        if (bhVar == null) {
            return;
        }
        bg u = bhVar.u(2);
        bg u2 = bhVar.u(4);
        if (this.ai == 0) {
            u = bhVar.u(3);
            u2 = bhVar.u(5);
        }
        if (this.ag != -1) {
            bcVar.g(bc.c(bcVar, bcVar.e(this.aj), bcVar.e(u), this.ag, false));
            return;
        }
        if (this.ah != -1) {
            bcVar.g(bc.c(bcVar, bcVar.e(this.aj), bcVar.e(u2), -this.ah, false));
            return;
        }
        if (this.af != -1.0f) {
            be e = bcVar.e(this.aj);
            be e2 = bcVar.e(u);
            be e3 = bcVar.e(u2);
            float f = this.af;
            az a = bcVar.a();
            a.d.f(e, -1.0f);
            a.d.f(e2, 1.0f - f);
            a.d.f(e3, f);
            bcVar.g(a);
        }
    }

    @Override // defpackage.bh
    public final void z() {
        if (this.r == null) {
            return;
        }
        int p = bc.p(this.aj);
        if (this.ai == 1) {
            this.w = p;
            this.x = 0;
            k(this.r.d());
            q(0);
            return;
        }
        this.w = 0;
        this.x = p;
        q(this.r.h());
        k(0);
    }
}
