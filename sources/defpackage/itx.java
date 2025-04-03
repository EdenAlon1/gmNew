package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class itx extends iwi {
    private static final ict D;
    private ina E;
    public itu f;
    public jzk g;
    public iuw h;

    static {
        iba ibaVar = new iba();
        ibaVar.k(ibw.f);
        ibaVar.r(1.0f);
        ibaVar.s(1);
        D = ibaVar;
    }

    public itx(iui iuiVar, itu ituVar) {
        super(iuiVar);
        this.f = ituVar;
        this.h = iuiVar.k != null ? new itv(this) : null;
        this.E = (ituVar.C().q & 512) != 0 ? new ina(this, (imx) ituVar) : null;
    }

    private final void aC() {
        boolean z;
        if (this.j) {
            return;
        }
        an();
        ina inaVar = this.E;
        if (inaVar != null) {
            imx imxVar = inaVar.b;
            this.h.getClass();
            imxVar.x();
            if (!inaVar.c) {
                long j = this.c;
                iuw iuwVar = this.h;
                if (kaf.d(j, iuwVar != null ? new kaf(iuwVar.u()) : null)) {
                    long j2 = G().c;
                    iuw C = G().C();
                    if (kaf.d(j2, C != null ? new kaf(C.u()) : null)) {
                        z = true;
                        G().s = z;
                    }
                }
            }
            z = false;
            G().s = z;
        }
        K().o();
        G().s = false;
    }

    @Override // defpackage.iwi
    public final hvh B() {
        return this.f.C();
    }

    @Override // defpackage.iwi
    public final iuw C() {
        return this.h;
    }

    @Override // defpackage.iwi
    public final void D() {
        if (this.h == null) {
            this.h = new itv(this);
        }
    }

    @Override // defpackage.iwi
    public final void F(ibt ibtVar, iga igaVar) {
        G().ad(ibtVar, igaVar);
        if (((AndroidComposeView) ium.a(this.r)).w) {
            ae(ibtVar, D);
        }
    }

    public final iwi G() {
        iwi iwiVar = this.u;
        iwiVar.getClass();
        return iwiVar;
    }

    public final void H(itu ituVar) {
        if (!ffkj.e(ituVar, this.f)) {
            if ((ituVar.C().q & 512) != 0) {
                imx imxVar = (imx) ituVar;
                ina inaVar = this.E;
                if (inaVar != null) {
                    inaVar.b = imxVar;
                } else {
                    inaVar = new ina(this, imxVar);
                }
                this.E = inaVar;
            } else {
                this.E = null;
            }
        }
        this.f = ituVar;
    }

    @Override // defpackage.inx
    public final int a(int i) {
        ina inaVar = this.E;
        return inaVar != null ? inaVar.b.a(inaVar, G(), i) : this.f.e(this, G(), i);
    }

    @Override // defpackage.inx
    public final int b(int i) {
        ina inaVar = this.E;
        return inaVar != null ? inaVar.b.i(inaVar, G(), i) : this.f.f(this, G(), i);
    }

    @Override // defpackage.inx
    public final int c(int i) {
        ina inaVar = this.E;
        return inaVar != null ? inaVar.b.j(inaVar, G(), i) : this.f.g(this, G(), i);
    }

    @Override // defpackage.inx
    public final int d(int i) {
        ina inaVar = this.E;
        return inaVar != null ? inaVar.b.k(inaVar, G(), i) : this.f.h(this, G(), i);
    }

    @Override // defpackage.ipl
    public final iqk e(long j) {
        ipo b;
        if (this.t) {
            jzk jzkVar = this.g;
            if (jzkVar == null) {
                throw new IllegalArgumentException("Lookahead constraints cannot be null in approach pass.");
            }
            j = jzkVar.a;
        }
        z(j);
        ina inaVar = this.E;
        if (inaVar != null) {
            itx itxVar = inaVar.a;
            imx imxVar = inaVar.b;
            iuw iuwVar = itxVar.h;
            iuwVar.getClass();
            ipo K = iuwVar.K();
            K.k();
            K.j();
            boolean z = false;
            boolean z2 = imxVar.w() || !jzk.f(j, this.g);
            inaVar.c = z2;
            if (!z2) {
                G().t = true;
            }
            b = imxVar.p(inaVar, G(), j);
            G().t = false;
            int k = b.k();
            iuw iuwVar2 = this.h;
            iuwVar2.getClass();
            if (k == iuwVar2.a) {
                int j2 = b.j();
                iuw iuwVar3 = this.h;
                iuwVar3.getClass();
                if (j2 == iuwVar3.b) {
                    z = true;
                }
            }
            if (!inaVar.c) {
                long j3 = G().c;
                iuw C = G().C();
                if (kaf.d(j3, C != null ? new kaf(C.u()) : null) && !z) {
                    b = new itw(b, this);
                }
            }
        } else {
            b = this.f.b(this, G(), j);
        }
        at(b);
        am();
        return this;
    }

    @Override // defpackage.iwi, defpackage.iqk
    protected final void ee(long j, float f, ffji ffjiVar) {
        super.ee(j, f, ffjiVar);
        aC();
    }

    @Override // defpackage.iuv
    public final int s(imq imqVar) {
        iuw iuwVar = this.h;
        return iuwVar != null ? iuwVar.o.g(imqVar, Integer.MIN_VALUE) : ity.a(this, imqVar);
    }

    @Override // defpackage.iwi, defpackage.iqk
    public final void x(long j, float f, iga igaVar) {
        super.x(j, f, igaVar);
        aC();
    }
}
