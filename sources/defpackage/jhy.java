package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jhy {
    public static final Object a(isw iswVar, ffix ffixVar, ffgu ffguVar) {
        Object obj;
        ioc b;
        Object b2;
        ivu ivuVar;
        if (iswVar.C().z) {
            if (!iswVar.C().z) {
                imn.c("visitAncestors called on an unattached node");
            }
            hvh hvhVar = iswVar.C().s;
            iui d = isx.d(iswVar);
            loop0: while (true) {
                obj = null;
                if (d == null) {
                    break;
                }
                if ((d.x.e.r & 524288) != 0) {
                    while (hvhVar != null) {
                        if ((hvhVar.q & 524288) != 0) {
                            hvh hvhVar2 = hvhVar;
                            hne hneVar = null;
                            while (hvhVar2 != null) {
                                if (hvhVar2 instanceof jhw) {
                                    obj = hvhVar2;
                                    break loop0;
                                }
                                if ((hvhVar2.q & 524288) != 0 && (hvhVar2 instanceof isz)) {
                                    int i = 0;
                                    for (hvh hvhVar3 = ((isz) hvhVar2).n; hvhVar3 != null; hvhVar3 = hvhVar3.t) {
                                        if ((hvhVar3.q & 524288) != 0) {
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
            jhw jhwVar = (jhw) obj;
            if (jhwVar != null && (b2 = jhwVar.b((b = isx.b(iswVar)), new jhx(ffixVar, b), ffguVar)) == ffhh.a) {
                return b2;
            }
        }
        return ffcu.a;
    }
}
