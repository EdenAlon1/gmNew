package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ixw {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [hvh] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [hvh] */
    /* JADX WARN: Type inference failed for: r3v9 */
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
    public static final ixv a(ixv ixvVar) {
        ivu ivuVar;
        if (!ixvVar.C().z) {
            imn.c("visitAncestors called on an unattached node");
        }
        hvh hvhVar = ixvVar.C().s;
        iui d = isx.d(ixvVar);
        while (d != null) {
            if ((d.x.e.r & 262144) != 0) {
                while (hvhVar != null) {
                    if ((hvhVar.q & 262144) != 0) {
                        isz iszVar = hvhVar;
                        ?? r5 = 0;
                        while (iszVar != 0) {
                            if (iszVar instanceof ixv) {
                                ixv ixvVar2 = (ixv) iszVar;
                                if (ffkj.e(ixvVar.e(), ixvVar2.e()) && hul.a(ixvVar, ixvVar2)) {
                                    return ixvVar2;
                                }
                            } else if ((iszVar.q & 262144) != 0 && (iszVar instanceof isz)) {
                                hvh hvhVar2 = iszVar.n;
                                int i = 0;
                                iszVar = iszVar;
                                r5 = r5;
                                while (hvhVar2 != null) {
                                    if ((hvhVar2.q & 262144) != 0) {
                                        i++;
                                        r5 = r5;
                                        if (i == 1) {
                                            iszVar = hvhVar2;
                                        } else {
                                            if (r5 == 0) {
                                                r5 = new hne(new hvh[16]);
                                            }
                                            if (iszVar != 0) {
                                                r5.n(iszVar);
                                            }
                                            r5.n(hvhVar2);
                                            iszVar = 0;
                                        }
                                    }
                                    hvhVar2 = hvhVar2.t;
                                    iszVar = iszVar;
                                    r5 = r5;
                                }
                                if (i != 1) {
                                }
                            }
                            iszVar = isx.a(r5);
                        }
                    }
                    hvhVar = hvhVar.s;
                }
            }
            d = d.u();
            hvhVar = (d == null || (ivuVar = d.x) == null) ? null : ivuVar.d;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [hvh] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [hvh] */
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
    public static final void b(ixv ixvVar, ffji ffjiVar) {
        ivu ivuVar;
        if (!ixvVar.C().z) {
            imn.c("visitAncestors called on an unattached node");
        }
        hvh hvhVar = ixvVar.C().s;
        iui d = isx.d(ixvVar);
        while (d != null) {
            if ((d.x.e.r & 262144) != 0) {
                while (hvhVar != null) {
                    if ((hvhVar.q & 262144) != 0) {
                        isz iszVar = hvhVar;
                        ?? r5 = 0;
                        while (iszVar != 0) {
                            if (iszVar instanceof ixv) {
                                ixv ixvVar2 = (ixv) iszVar;
                                if (ffkj.e(ixvVar.e(), ixvVar2.e()) && hul.a(ixvVar, ixvVar2) && !((Boolean) ffjiVar.invoke(ixvVar2)).booleanValue()) {
                                    return;
                                }
                            } else if ((iszVar.q & 262144) != 0 && (iszVar instanceof isz)) {
                                hvh hvhVar2 = iszVar.n;
                                int i = 0;
                                iszVar = iszVar;
                                r5 = r5;
                                while (hvhVar2 != null) {
                                    if ((hvhVar2.q & 262144) != 0) {
                                        i++;
                                        r5 = r5;
                                        if (i == 1) {
                                            iszVar = hvhVar2;
                                        } else {
                                            if (r5 == 0) {
                                                r5 = new hne(new hvh[16]);
                                            }
                                            if (iszVar != 0) {
                                                r5.n(iszVar);
                                            }
                                            r5.n(hvhVar2);
                                            iszVar = 0;
                                        }
                                    }
                                    hvhVar2 = hvhVar2.t;
                                    iszVar = iszVar;
                                    r5 = r5;
                                }
                                if (i != 1) {
                                }
                            }
                            iszVar = isx.a(r5);
                        }
                    }
                    hvhVar = hvhVar.s;
                }
            }
            d = d.u();
            hvhVar = (d == null || (ivuVar = d.x) == null) ? null : ivuVar.d;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [hvh] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [hvh] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [hne] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [hne] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static final void c(isw iswVar, Object obj, ffji ffjiVar) {
        ivu ivuVar;
        if (!iswVar.C().z) {
            imn.c("visitAncestors called on an unattached node");
        }
        hvh hvhVar = iswVar.C().s;
        iui d = isx.d(iswVar);
        while (d != null) {
            if ((d.x.e.r & 262144) != 0) {
                while (hvhVar != null) {
                    if ((hvhVar.q & 262144) != 0) {
                        isz iszVar = hvhVar;
                        ?? r4 = 0;
                        while (iszVar != 0) {
                            if (iszVar instanceof ixv) {
                                ixv ixvVar = (ixv) iszVar;
                                if (ffkj.e(obj, ixvVar.e()) && !((Boolean) ffjiVar.invoke(ixvVar)).booleanValue()) {
                                    return;
                                }
                            } else if ((iszVar.q & 262144) != 0 && (iszVar instanceof isz)) {
                                hvh hvhVar2 = iszVar.n;
                                int i = 0;
                                iszVar = iszVar;
                                r4 = r4;
                                while (hvhVar2 != null) {
                                    if ((hvhVar2.q & 262144) != 0) {
                                        i++;
                                        r4 = r4;
                                        if (i == 1) {
                                            iszVar = hvhVar2;
                                        } else {
                                            if (r4 == 0) {
                                                r4 = new hne(new hvh[16]);
                                            }
                                            if (iszVar != 0) {
                                                r4.n(iszVar);
                                            }
                                            r4.n(hvhVar2);
                                            iszVar = 0;
                                        }
                                    }
                                    hvhVar2 = hvhVar2.t;
                                    iszVar = iszVar;
                                    r4 = r4;
                                }
                                if (i != 1) {
                                }
                            }
                            iszVar = isx.a(r4);
                        }
                    }
                    hvhVar = hvhVar.s;
                }
            }
            d = d.u();
            hvhVar = (d == null || (ivuVar = d.x) == null) ? null : ivuVar.d;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [hvh] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [hvh] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [hne] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [hne] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public static final void d(ixv ixvVar, ffji ffjiVar) {
        if (!ixvVar.C().z) {
            imn.c("visitSubtreeIf called on an unattached node");
        }
        hne hneVar = new hne(new hvh[16]);
        hvh hvhVar = ixvVar.C().t;
        if (hvhVar == null) {
            isx.j(hneVar, ixvVar.C());
        } else {
            hneVar.n(hvhVar);
        }
        while (true) {
            int i = hneVar.b;
            if (i == 0) {
                return;
            }
            hvh hvhVar2 = (hvh) hneVar.c(i - 1);
            if ((hvhVar2.r & 262144) != 0) {
                for (hvh hvhVar3 = hvhVar2; hvhVar3 != null; hvhVar3 = hvhVar3.t) {
                    if ((hvhVar3.q & 262144) != 0) {
                        isz iszVar = hvhVar3;
                        ?? r7 = 0;
                        while (iszVar != 0) {
                            if (iszVar instanceof ixv) {
                                ixv ixvVar2 = (ixv) iszVar;
                                ixu ixuVar = (ffkj.e(ixvVar.e(), ixvVar2.e()) && hul.a(ixvVar, ixvVar2)) ? (ixu) ffjiVar.invoke(ixvVar2) : ixu.a;
                                if (ixuVar == ixu.c) {
                                    return;
                                }
                                if (ixuVar == ixu.b) {
                                    break;
                                }
                            } else if ((iszVar.q & 262144) != 0 && (iszVar instanceof isz)) {
                                hvh hvhVar4 = iszVar.n;
                                int i2 = 0;
                                iszVar = iszVar;
                                r7 = r7;
                                while (hvhVar4 != null) {
                                    if ((hvhVar4.q & 262144) != 0) {
                                        i2++;
                                        r7 = r7;
                                        if (i2 == 1) {
                                            iszVar = hvhVar4;
                                        } else {
                                            if (r7 == 0) {
                                                r7 = new hne(new hvh[16]);
                                            }
                                            if (iszVar != 0) {
                                                r7.n(iszVar);
                                            }
                                            r7.n(hvhVar4);
                                            iszVar = 0;
                                        }
                                    }
                                    hvhVar4 = hvhVar4.t;
                                    iszVar = iszVar;
                                    r7 = r7;
                                }
                                if (i2 != 1) {
                                }
                            }
                            iszVar = isx.a(r7);
                        }
                    }
                }
            }
            isx.j(hneVar, hvhVar2);
        }
    }
}
