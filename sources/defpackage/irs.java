package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class irs {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [hvh] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [hvh] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [hne] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [hne] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public static Object a(irt irtVar, irn irnVar) {
        ivu ivuVar;
        if (!irtVar.C().z) {
            imn.b("ModifierLocal accessed from an unattached node");
        }
        if (!irtVar.C().z) {
            imn.c("visitAncestors called on an unattached node");
        }
        hvh hvhVar = irtVar.C().s;
        iui d = isx.d(irtVar);
        while (d != null) {
            if ((d.x.e.r & 32) != 0) {
                while (hvhVar != null) {
                    if ((hvhVar.q & 32) != 0) {
                        isz iszVar = hvhVar;
                        ?? r3 = 0;
                        while (iszVar != 0) {
                            if (iszVar instanceof irt) {
                                irt irtVar2 = (irt) iszVar;
                                if (irtVar2.q().c(irnVar)) {
                                    return irtVar2.q().a(irnVar);
                                }
                            } else if ((iszVar.q & 32) != 0 && (iszVar instanceof isz)) {
                                hvh hvhVar2 = iszVar.n;
                                int i = 0;
                                iszVar = iszVar;
                                r3 = r3;
                                while (hvhVar2 != null) {
                                    if ((hvhVar2.q & 32) != 0) {
                                        i++;
                                        r3 = r3;
                                        if (i == 1) {
                                            iszVar = hvhVar2;
                                        } else {
                                            if (r3 == 0) {
                                                r3 = new hne(new hvh[16]);
                                            }
                                            if (iszVar != 0) {
                                                r3.n(iszVar);
                                            }
                                            r3.n(hvhVar2);
                                            iszVar = 0;
                                        }
                                    }
                                    hvhVar2 = hvhVar2.t;
                                    iszVar = iszVar;
                                    r3 = r3;
                                }
                                if (i != 1) {
                                }
                            }
                            iszVar = isx.a(r3);
                        }
                    }
                    hvhVar = hvhVar.s;
                }
            }
            d = d.u();
            hvhVar = (d == null || (ivuVar = d.x) == null) ? null : ivuVar.d;
        }
        return irnVar.a.invoke();
    }

    public static void b(irt irtVar, irn irnVar, Object obj) {
        cuy cuyVar = (cuy) irtVar;
        if (cuyVar.c == irm.a) {
            imn.b("In order to provide locals you must override providedValues: ModifierLocalMap");
        }
        if (!cuyVar.c.c(irnVar)) {
            imn.b(a.i(irnVar, "Any provided key must be initially provided in the overridden providedValues: ModifierLocalMap property. Key ", " was not found."));
        }
        cuyVar.c.b(irnVar, obj);
    }
}
