package androidx.compose.ui.focus;

import android.os.Trace;
import androidx.compose.ui.platform.AndroidComposeView;
import defpackage.ffcd;
import defpackage.ffjm;
import defpackage.ffkj;
import defpackage.fflb;
import defpackage.hne;
import defpackage.hvh;
import defpackage.hyk;
import defpackage.hyv;
import defpackage.hzc;
import defpackage.hzf;
import defpackage.hzg;
import defpackage.hzo;
import defpackage.hzq;
import defpackage.hzr;
import defpackage.hzv;
import defpackage.hzx;
import defpackage.iiu;
import defpackage.iiv;
import defpackage.imn;
import defpackage.ind;
import defpackage.inf;
import defpackage.irm;
import defpackage.irn;
import defpackage.irr;
import defpackage.irs;
import defpackage.irt;
import defpackage.isu;
import defpackage.isv;
import defpackage.isx;
import defpackage.isz;
import defpackage.iui;
import defpackage.ivp;
import defpackage.ivu;
import defpackage.iwn;
import defpackage.iwo;
import defpackage.jdr;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class FocusTargetNode extends hvh implements isu, hzq, iwn, irt {
    public boolean a;
    public boolean b;
    private final ffjm c;
    private final int d;

    /* compiled from: PG */
    public static final class FocusTargetElement extends ivp<FocusTargetNode> {
        public static final FocusTargetElement a = new FocusTargetElement();

        private FocusTargetElement() {
        }

        @Override // defpackage.ivp
        public final /* synthetic */ hvh d() {
            return new FocusTargetNode(0, null, 7);
        }

        @Override // defpackage.ivp
        public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        }

        public final boolean equals(Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            return 1739042953;
        }
    }

    public /* synthetic */ FocusTargetNode(int i, ffjm ffjmVar, int i2) {
        this.c = (i2 & 2) != 0 ? null : ffjmVar;
        this.d = 1 == (i2 & 1) ? 1 : i;
    }

    @Override // defpackage.iwn
    public final void a() {
        i();
    }

    @Override // defpackage.hzq
    public final boolean b(int i) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            boolean z = false;
            if (((hzf) f()).a) {
                int d = hzv.d(this, i);
                int i2 = d - 1;
                if (d == 0) {
                    throw null;
                }
                if (i2 == 0) {
                    z = hzv.a(this);
                } else if (i2 != 1) {
                    if (i2 != 2) {
                        throw new ffcd();
                    }
                    z = true;
                }
            }
            return z;
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.hvh
    public final boolean dM() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [hvh] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [hvh] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [hne] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [hne] */
    public final hzc f() {
        boolean z;
        ivu ivuVar;
        hzf hzfVar = new hzf();
        int i = this.d;
        if (hzx.a(i, 1)) {
            z = true;
        } else if (hzx.a(i, 0)) {
            z = !iiu.a(((iiu) ((iiv) isv.a(this, jdr.i)).a.a()).a, 1);
        } else {
            if (!hzx.a(i, 2)) {
                throw new IllegalStateException("Unknown Focusability");
            }
            z = false;
        }
        hzfVar.a = z;
        hvh hvhVar = this.p;
        if (!hvhVar.z) {
            imn.c("visitAncestors called on an unattached node");
        }
        hvh hvhVar2 = this.p;
        iui d = isx.d(this);
        loop0: while (d != null) {
            if ((d.x.e.r & 3072) != 0) {
                while (hvhVar2 != null) {
                    int i2 = hvhVar2.q;
                    if ((i2 & 3072) != 0) {
                        if (hvhVar2 != hvhVar && (i2 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i2 & 2048) != 0) {
                            isz iszVar = hvhVar2;
                            ?? r8 = 0;
                            while (iszVar != 0) {
                                if (iszVar instanceof hzg) {
                                    ((hzg) iszVar).p(hzfVar);
                                } else if ((iszVar.q & 2048) != 0 && (iszVar instanceof isz)) {
                                    hvh hvhVar3 = iszVar.n;
                                    int i3 = 0;
                                    iszVar = iszVar;
                                    r8 = r8;
                                    while (hvhVar3 != null) {
                                        if ((hvhVar3.q & 2048) != 0) {
                                            i3++;
                                            r8 = r8;
                                            if (i3 == 1) {
                                                iszVar = hvhVar3;
                                            } else {
                                                if (r8 == 0) {
                                                    r8 = new hne(new hvh[16]);
                                                }
                                                if (iszVar != 0) {
                                                    r8.n(iszVar);
                                                }
                                                r8.n(hvhVar3);
                                                iszVar = 0;
                                            }
                                        }
                                        hvhVar3 = hvhVar3.t;
                                        iszVar = iszVar;
                                        r8 = r8;
                                    }
                                    if (i3 != 1) {
                                    }
                                }
                                iszVar = isx.a(r8);
                            }
                        }
                    }
                    hvhVar2 = hvhVar2.s;
                }
            }
            d = d.u();
            hvhVar2 = (d == null || (ivuVar = d.x) == null) ? null : ivuVar.d;
        }
        return hzfVar;
    }

    public final hzo g() {
        FocusTargetNode focusTargetNode;
        ivu ivuVar;
        if (!this.z || (focusTargetNode = ((FocusOwnerImpl) ((AndroidComposeView) isx.f(this)).d).g) == null) {
            return hzo.d;
        }
        if (this == focusTargetNode) {
            return hzo.a;
        }
        if (focusTargetNode.z) {
            if (!focusTargetNode.p.z) {
                imn.c("visitAncestors called on an unattached node");
            }
            hvh hvhVar = focusTargetNode.p.s;
            iui d = isx.d(focusTargetNode);
            while (d != null) {
                if ((d.x.e.r & 1024) != 0) {
                    while (hvhVar != null) {
                        if ((hvhVar.q & 1024) != 0) {
                            hvh hvhVar2 = hvhVar;
                            hne hneVar = null;
                            while (hvhVar2 != null) {
                                if (hvhVar2 instanceof FocusTargetNode) {
                                    if (this == ((FocusTargetNode) hvhVar2)) {
                                        return hzo.b;
                                    }
                                } else if ((hvhVar2.q & 1024) != 0 && (hvhVar2 instanceof isz)) {
                                    int i = 0;
                                    for (hvh hvhVar3 = ((isz) hvhVar2).n; hvhVar3 != null; hvhVar3 = hvhVar3.t) {
                                        if ((hvhVar3.q & 1024) != 0) {
                                            i++;
                                            if (i == 1) {
                                                hvhVar2 = hvhVar3;
                                            } else {
                                                if (hneVar == null) {
                                                    hneVar = new hne(new hvh[16]);
                                                }
                                                if (hvhVar2 != null) {
                                                    hneVar.n(hvhVar2);
                                                }
                                                hneVar.n(hvhVar3);
                                                hvhVar2 = null;
                                            }
                                        }
                                    }
                                    if (i != 1) {
                                    }
                                }
                                hvhVar2 = isx.a(hneVar);
                            }
                        }
                        hvhVar = hvhVar.s;
                    }
                }
                d = d.u();
                hvhVar = (d == null || (ivuVar = d.x) == null) ? null : ivuVar.d;
            }
        }
        return hzo.d;
    }

    public final ind h() {
        return (ind) irs.a(this, inf.a);
    }

    public final void i() {
        hzc hzcVar;
        int ordinal = g().ordinal();
        if (ordinal == 0 || ordinal == 2) {
            fflb fflbVar = new fflb();
            iwo.a(this, new hzr(fflbVar, this));
            Object obj = fflbVar.a;
            if (obj == null) {
                ffkj.c("focusProperties");
                hzcVar = null;
            } else {
                hzcVar = (hzc) obj;
            }
            if (hzcVar.d()) {
                return;
            }
            ((AndroidComposeView) isx.f(this)).d.a(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [hvh] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [hvh] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [hne] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [hne] */
    public final void j(hzo hzoVar, hzo hzoVar2) {
        ivu ivuVar;
        ffjm ffjmVar;
        FocusOwnerImpl focusOwnerImpl = (FocusOwnerImpl) ((AndroidComposeView) isx.f(this)).d;
        FocusTargetNode focusTargetNode = focusOwnerImpl.g;
        if (!ffkj.e(hzoVar, hzoVar2) && (ffjmVar = this.c) != null) {
            ffjmVar.a(hzoVar, hzoVar2);
        }
        hvh hvhVar = this.p;
        if (!hvhVar.z) {
            imn.c("visitAncestors called on an unattached node");
        }
        hvh hvhVar2 = this.p;
        iui d = isx.d(this);
        while (d != null) {
            if ((d.x.e.r & 5120) != 0) {
                while (hvhVar2 != null) {
                    int i = hvhVar2.q;
                    if ((i & 5120) != 0) {
                        if (hvhVar2 != hvhVar && (i & 1024) != 0) {
                            return;
                        }
                        if ((i & 4096) != 0) {
                            isz iszVar = hvhVar2;
                            ?? r6 = 0;
                            while (iszVar != 0) {
                                if (iszVar instanceof hyk) {
                                    hyk hykVar = (hyk) iszVar;
                                    if (focusTargetNode == focusOwnerImpl.g) {
                                        hykVar.dP(hzoVar2);
                                    }
                                } else if ((iszVar.q & 4096) != 0 && (iszVar instanceof isz)) {
                                    hvh hvhVar3 = iszVar.n;
                                    int i2 = 0;
                                    iszVar = iszVar;
                                    r6 = r6;
                                    while (hvhVar3 != null) {
                                        if ((hvhVar3.q & 4096) != 0) {
                                            i2++;
                                            r6 = r6;
                                            if (i2 == 1) {
                                                iszVar = hvhVar3;
                                            } else {
                                                if (r6 == 0) {
                                                    r6 = new hne(new hvh[16]);
                                                }
                                                if (iszVar != 0) {
                                                    r6.n(iszVar);
                                                }
                                                r6.n(hvhVar3);
                                                iszVar = 0;
                                            }
                                        }
                                        hvhVar3 = hvhVar3.t;
                                        iszVar = iszVar;
                                        r6 = r6;
                                    }
                                    if (i2 != 1) {
                                    }
                                }
                                iszVar = isx.a(r6);
                            }
                        }
                    }
                    hvhVar2 = hvhVar2.s;
                }
            }
            d = d.u();
            hvhVar2 = (d == null || (ivuVar = d.x) == null) ? null : ivuVar.d;
        }
    }

    @Override // defpackage.irt
    public final /* synthetic */ irr q() {
        return irm.a;
    }

    @Override // defpackage.irw
    public final /* synthetic */ Object r(irn irnVar) {
        return irs.a(this, irnVar);
    }

    @Override // defpackage.hvh
    public final void t() {
        int ordinal = g().ordinal();
        if (ordinal == 0 || ordinal == 2) {
            hyv hyvVar = ((AndroidComposeView) isx.f(this)).d;
            hyvVar.g(true, false, 8);
            ((FocusOwnerImpl) hyvVar).c.b();
        }
    }

    @Override // defpackage.hvh
    public final void dT() {
    }
}
