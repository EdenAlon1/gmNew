package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class isz extends hvh {
    public final int m = iwk.b(this);
    public hvh n;

    private final void dN(int i, boolean z) {
        hvh hvhVar;
        int i2 = this.q;
        this.q = i;
        if (i2 != i) {
            if (C() == this) {
                this.r = i;
            }
            if (this.z) {
                hvh hvhVar2 = this.p;
                hvh hvhVar3 = this;
                while (hvhVar3 != null) {
                    i |= hvhVar3.q;
                    hvhVar3.q = i;
                    if (hvhVar3 == hvhVar2) {
                        break;
                    } else {
                        hvhVar3 = hvhVar3.s;
                    }
                }
                if (z && hvhVar3 == hvhVar2) {
                    i = iwk.c(hvhVar2);
                    hvhVar2.q = i;
                }
                int i3 = 0;
                if (hvhVar3 != null && (hvhVar = hvhVar3.t) != null) {
                    i3 = hvhVar.r;
                }
                int i4 = i | i3;
                while (hvhVar3 != null) {
                    i4 |= hvhVar3.q;
                    hvhVar3.r = i4;
                    hvhVar3 = hvhVar3.s;
                }
            }
        }
    }

    @Override // defpackage.hvh
    public final void E() {
        super.E();
        for (hvh hvhVar = this.n; hvhVar != null; hvhVar = hvhVar.t) {
            hvhVar.K(this.v);
            if (!hvhVar.z) {
                hvhVar.E();
            }
        }
    }

    @Override // defpackage.hvh
    public final void F() {
        for (hvh hvhVar = this.n; hvhVar != null; hvhVar = hvhVar.t) {
            hvhVar.F();
        }
        super.F();
    }

    @Override // defpackage.hvh
    public final void G() {
        super.G();
        for (hvh hvhVar = this.n; hvhVar != null; hvhVar = hvhVar.t) {
            hvhVar.G();
        }
    }

    @Override // defpackage.hvh
    public final void H() {
        for (hvh hvhVar = this.n; hvhVar != null; hvhVar = hvhVar.t) {
            hvhVar.H();
        }
        super.H();
    }

    @Override // defpackage.hvh
    public final void I() {
        super.I();
        for (hvh hvhVar = this.n; hvhVar != null; hvhVar = hvhVar.t) {
            hvhVar.I();
        }
    }

    @Override // defpackage.hvh
    public final void J(hvh hvhVar) {
        this.p = hvhVar;
        for (hvh hvhVar2 = this.n; hvhVar2 != null; hvhVar2 = hvhVar2.t) {
            hvhVar2.J(hvhVar);
        }
    }

    @Override // defpackage.hvh
    public final void K(iwi iwiVar) {
        this.v = iwiVar;
        for (hvh hvhVar = this.n; hvhVar != null; hvhVar = hvhVar.t) {
            hvhVar.K(iwiVar);
        }
    }

    public final void L(isw iswVar) {
        hvh hvhVar = null;
        for (hvh hvhVar2 = this.n; hvhVar2 != null; hvhVar2 = hvhVar2.t) {
            if (hvhVar2 == iswVar) {
                if (hvhVar2.z) {
                    iwk.f(hvhVar2);
                    hvhVar2.I();
                    hvhVar2.F();
                }
                hvhVar2.J(hvhVar2);
                hvhVar2.r = 0;
                if (hvhVar == null) {
                    this.n = hvhVar2.t;
                } else {
                    hvhVar.t = hvhVar2.t;
                }
                hvhVar2.t = null;
                hvhVar2.s = null;
                int i = this.q;
                int c = iwk.c(this);
                dN(c, true);
                if (this.z && (i & 2) != 0 && (c & 2) == 0) {
                    ivu ivuVar = isx.d(this).x;
                    this.p.K(null);
                    ivuVar.i();
                    return;
                }
                return;
            }
            hvhVar = hvhVar2;
        }
        Objects.toString(iswVar);
        throw new IllegalStateException("Could not find delegate: ".concat(String.valueOf(iswVar)));
    }

    public final void M(isw iswVar) {
        hvh C = iswVar.C();
        if (C != iswVar) {
            if (true != (iswVar instanceof hvh)) {
                iswVar = null;
            }
            hvh hvhVar = iswVar != null ? ((hvh) iswVar).s : null;
            if (C != this.p || !ffkj.e(hvhVar, this)) {
                throw new IllegalStateException("Cannot delegate to an already delegated node");
            }
            return;
        }
        if (C.z) {
            imn.c("Cannot delegate to an already attached node");
        }
        C.J(this.p);
        int i = this.q;
        int c = iwk.c(C);
        C.q = c;
        int i2 = c & 2;
        int i3 = this.q;
        if (i2 != 0 && (i3 & 2) != 0 && !(this instanceof itu)) {
            imn.c(a.j(C, this, "Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: ", "\nDelegate Node: "));
        }
        C.t = this.n;
        this.n = C;
        C.s = this;
        dN(c | this.q, false);
        if (this.z) {
            if (i2 == 0 || (i & 2) != 0) {
                K(this.v);
            } else {
                ivu ivuVar = isx.d(this).x;
                this.p.K(null);
                ivuVar.i();
            }
            C.E();
            C.H();
            iwk.d(C);
        }
    }
}
