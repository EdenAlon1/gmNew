package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class irq {
    public final hne a = new hne(new isg[16]);
    public final hne b = new hne(new irn[16]);
    public final hne c = new hne(new iui[16]);
    public final hne d = new hne(new irn[16]);
    public boolean e;
    private final iwx f;

    public irq(iwx iwxVar) {
        this.f = iwxVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [hvh] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [hvh] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [hne] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [hne] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static final void b(hvh hvhVar, irn irnVar, Set set) {
        if (!hvhVar.C().z) {
            imn.c("visitSubtreeIf called on an unattached node");
        }
        hne hneVar = new hne(new hvh[16]);
        hvh hvhVar2 = hvhVar.C().t;
        if (hvhVar2 == null) {
            isx.j(hneVar, hvhVar.C());
        } else {
            hneVar.n(hvhVar2);
        }
        while (true) {
            int i = hneVar.b;
            if (i == 0) {
                return;
            }
            hvh hvhVar3 = (hvh) hneVar.c(i - 1);
            if ((hvhVar3.r & 32) != 0) {
                for (hvh hvhVar4 = hvhVar3; hvhVar4 != null; hvhVar4 = hvhVar4.t) {
                    if ((hvhVar4.q & 32) != 0) {
                        isz iszVar = hvhVar4;
                        ?? r5 = 0;
                        while (iszVar != 0) {
                            if (iszVar instanceof irt) {
                                irt irtVar = (irt) iszVar;
                                if (irtVar instanceof isg) {
                                    isg isgVar = (isg) irtVar;
                                    if ((isgVar.a instanceof iro) && isgVar.c.contains(irnVar)) {
                                        set.add(irtVar);
                                    }
                                }
                                if (irtVar.q().c(irnVar)) {
                                    break;
                                }
                            } else if ((iszVar.q & 32) != 0 && (iszVar instanceof isz)) {
                                hvh hvhVar5 = iszVar.n;
                                int i2 = 0;
                                iszVar = iszVar;
                                r5 = r5;
                                while (hvhVar5 != null) {
                                    if ((hvhVar5.q & 32) != 0) {
                                        i2++;
                                        r5 = r5;
                                        if (i2 == 1) {
                                            iszVar = hvhVar5;
                                        } else {
                                            if (r5 == 0) {
                                                r5 = new hne(new hvh[16]);
                                            }
                                            if (iszVar != 0) {
                                                r5.n(iszVar);
                                            }
                                            r5.n(hvhVar5);
                                            iszVar = 0;
                                        }
                                    }
                                    hvhVar5 = hvhVar5.t;
                                    iszVar = iszVar;
                                    r5 = r5;
                                }
                                if (i2 != 1) {
                                }
                            }
                            iszVar = isx.a(r5);
                        }
                    }
                }
            }
            isx.j(hneVar, hvhVar3);
        }
    }

    public final void a() {
        if (this.e) {
            return;
        }
        this.e = true;
        this.f.y(new irp(this));
    }
}
