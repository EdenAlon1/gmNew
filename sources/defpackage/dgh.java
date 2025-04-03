package defpackage;

import androidx.compose.ui.focus.FocusTargetNode;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dgh extends isz implements ixn, iti, isu, iwn, ixv {
    private static final dga f = new dga();
    public final ffji a;
    public dwf b;
    public final hzq c;
    public dwn d;
    public ejy e;
    private ioc g;
    private ffix h;

    public dgh(dwn dwnVar, int i, ffji ffjiVar) {
        this.d = dwnVar;
        this.a = ffjiVar;
        FocusTargetNode focusTargetNode = new FocusTargetNode(i, new dge(this), 4);
        M(focusTargetNode);
        this.c = focusTargetNode;
    }

    @Override // defpackage.iwn
    public final void a() {
        ejy i = i();
        if (((FocusTargetNode) this.c).g().b()) {
            ejy ejyVar = this.e;
            if (ejyVar != null) {
                ejyVar.a();
            }
            if (i != null) {
                i.c();
            } else {
                i = null;
            }
            this.e = i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [hvh] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [hvh] */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [hne] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [hne] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public final dgj b() {
        ixv ixvVar;
        ivu ivuVar;
        if (this.z) {
            dgi dgiVar = dgj.a;
            if (!this.p.z) {
                imn.c("visitAncestors called on an unattached node");
            }
            hvh hvhVar = this.p.s;
            iui d = isx.d(this);
            loop0: while (true) {
                if (d == null) {
                    ixvVar = null;
                    break;
                }
                if ((d.x.e.r & 262144) != 0) {
                    while (hvhVar != null) {
                        if ((hvhVar.q & 262144) != 0) {
                            ?? r6 = 0;
                            isz iszVar = hvhVar;
                            while (iszVar != 0) {
                                if (iszVar instanceof ixv) {
                                    ixvVar = (ixv) iszVar;
                                    if (ffkj.e(dgiVar, ixvVar.e())) {
                                        break loop0;
                                    }
                                } else if ((iszVar.q & 262144) != 0 && (iszVar instanceof isz)) {
                                    hvh hvhVar2 = iszVar.n;
                                    int i = 0;
                                    iszVar = iszVar;
                                    r6 = r6;
                                    while (hvhVar2 != null) {
                                        if ((hvhVar2.q & 262144) != 0) {
                                            i++;
                                            r6 = r6;
                                            if (i == 1) {
                                                iszVar = hvhVar2;
                                            } else {
                                                if (r6 == 0) {
                                                    r6 = new hne(new hvh[16]);
                                                }
                                                if (iszVar != 0) {
                                                    r6.n(iszVar);
                                                }
                                                r6.n(hvhVar2);
                                                iszVar = 0;
                                            }
                                        }
                                        hvhVar2 = hvhVar2.t;
                                        iszVar = iszVar;
                                        r6 = r6;
                                    }
                                    if (i != 1) {
                                    }
                                }
                                iszVar = isx.a(r6);
                            }
                        }
                        hvhVar = hvhVar.s;
                    }
                }
                d = d.u();
                hvhVar = (d == null || (ivuVar = d.x) == null) ? null : ivuVar.d;
            }
            if (ixvVar instanceof dgj) {
                return (dgj) ixvVar;
            }
        }
        return null;
    }

    @Override // defpackage.hvh
    public final boolean dM() {
        return false;
    }

    @Override // defpackage.ixn
    public final void dO(jkv jkvVar) {
        boolean b = ((FocusTargetNode) this.c).g().b();
        ffmx[] ffmxVarArr = jkr.a;
        jku jkuVar = jkm.a;
        jku jkuVar2 = jkm.k;
        ffmx ffmxVar = jkr.a[4];
        jkuVar2.a(jkvVar, Boolean.valueOf(b));
        if (this.h == null) {
            this.h = new dgb(this);
        }
        jkr.G(jkvVar, this.h);
    }

    @Override // defpackage.iti
    public final void dQ(ioc iocVar) {
        this.g = iocVar;
        if (((FocusTargetNode) this.c).g().b()) {
            if (iocVar.t()) {
                f();
                return;
            }
            dgj b = b();
            if (b != null) {
                b.a(null);
            }
        }
    }

    @Override // defpackage.hvh
    public final void dS() {
        ejy ejyVar = this.e;
        if (ejyVar != null) {
            ejyVar.a();
        }
        this.e = null;
    }

    @Override // defpackage.ixn
    public final /* synthetic */ boolean dZ() {
        return false;
    }

    @Override // defpackage.ixv
    public final Object e() {
        return f;
    }

    @Override // defpackage.ixn
    public final /* synthetic */ boolean ea() {
        return false;
    }

    public final void f() {
        dgj b;
        ioc iocVar = this.g;
        if (iocVar == null || !iocVar.t() || (b = b()) == null) {
            return;
        }
        b.a(this.g);
    }

    public final ejy i() {
        fflb fflbVar = new fflb();
        iwo.a(this, new dgg(fflbVar, this));
        return (ejy) fflbVar.a;
    }

    public final void j(dwn dwnVar, dwm dwmVar) {
        if (!this.z) {
            dwnVar.b(dwmVar);
        } else {
            ffud ffudVar = (ffud) ((fggf) D()).a.get(ffud.c);
            ffqy.d(D(), null, null, new dgc(dwnVar, dwmVar, ffudVar != null ? ffudVar.hZ(new dgd(dwnVar, dwmVar)) : null, null), 3);
        }
    }

    public final void k(dwn dwnVar) {
        dwf dwfVar;
        if (ffkj.e(this.d, dwnVar)) {
            return;
        }
        dwn dwnVar2 = this.d;
        if (dwnVar2 != null && (dwfVar = this.b) != null) {
            dwnVar2.b(new dwg(dwfVar));
        }
        this.b = null;
        this.d = dwnVar;
    }
}
