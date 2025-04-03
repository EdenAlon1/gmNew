package defpackage;

import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iwk {
    private static final cog a;

    static {
        int i = cow.a;
        a = new cog((byte[]) null);
    }

    public static final int a(hvg hvgVar) {
        int i = true == (hvgVar instanceof ion) ? 3 : 1;
        if (hvgVar instanceof hxr) {
            i |= 4;
        }
        if (hvgVar instanceof jjr) {
            i |= 8;
        }
        if (hvgVar instanceof ili) {
            i |= 16;
        }
        if ((hvgVar instanceof iro) || (hvgVar instanceof irv)) {
            i |= 32;
        }
        if (hvgVar instanceof hyi) {
            i |= 4096;
        }
        if (hvgVar instanceof hyt) {
            i |= 2048;
        }
        if (hvgVar instanceof ehr) {
            i |= 256;
        }
        if (hvgVar instanceof iqg) {
            i |= 64;
        }
        if ((hvgVar instanceof ipz) || (hvgVar instanceof iqc)) {
            i |= 128;
        }
        return hvgVar instanceof jhw ? 524288 | i : i;
    }

    public static final int b(hvh hvhVar) {
        int i = hvhVar.q;
        if (i != 0) {
            return i;
        }
        cog cogVar = a;
        Class<?> cls = hvhVar.getClass();
        int e = cogVar.e(cls);
        if (e >= 0) {
            return cogVar.c[e];
        }
        int i2 = true == (hvhVar instanceof itu) ? 3 : 1;
        if (hvhVar instanceof itg) {
            i2 |= 4;
        }
        if (hvhVar instanceof ixn) {
            i2 |= 8;
        }
        if (hvhVar instanceof ixl) {
            i2 |= 16;
        }
        if (hvhVar instanceof irt) {
            i2 |= 32;
        }
        if (hvhVar instanceof ixi) {
            i2 |= 64;
        }
        if (hvhVar instanceof its) {
            i2 |= 128;
        }
        if (hvhVar instanceof iti) {
            i2 |= 256;
        }
        if (hvhVar instanceof imx) {
            i2 |= 512;
        }
        if (hvhVar instanceof FocusTargetNode) {
            i2 |= 1024;
        }
        if (hvhVar instanceof hzg) {
            i2 |= 2048;
        }
        if (hvhVar instanceof hyk) {
            i2 |= 4096;
        }
        if (hvhVar instanceof ijb) {
            i2 |= 8192;
        }
        if (hvhVar instanceof iml) {
            i2 |= 16384;
        }
        if (hvhVar instanceof isu) {
            i2 |= 32768;
        }
        if (hvhVar instanceof ije) {
            i2 |= 131072;
        }
        if (hvhVar instanceof ixv) {
            i2 |= 262144;
        }
        if (hvhVar instanceof jhw) {
            i2 |= 524288;
        }
        if (hvhVar instanceof iwt) {
            i2 |= 1048576;
        }
        cogVar.c(cls, i2);
        return i2;
    }

    public static final int c(hvh hvhVar) {
        if (!(hvhVar instanceof isz)) {
            return b(hvhVar);
        }
        isz iszVar = (isz) hvhVar;
        int i = iszVar.m;
        for (hvh hvhVar2 = iszVar.n; hvhVar2 != null; hvhVar2 = hvhVar2.t) {
            i |= c(hvhVar2);
        }
        return i;
    }

    public static final void d(hvh hvhVar) {
        if (!hvhVar.z) {
            imn.c("autoInvalidateInsertedNode called on unattached node");
        }
        e(hvhVar, -1, 1);
    }

    public static final void e(hvh hvhVar, int i, int i2) {
        if (!(hvhVar instanceof isz)) {
            i(hvhVar, i & hvhVar.q, i2);
            return;
        }
        isz iszVar = (isz) hvhVar;
        i(hvhVar, iszVar.m & i, i2);
        int i3 = (~iszVar.m) & i;
        for (hvh hvhVar2 = iszVar.n; hvhVar2 != null; hvhVar2 = hvhVar2.t) {
            e(hvhVar2, i3, i2);
        }
    }

    public static final void f(hvh hvhVar) {
        if (!hvhVar.z) {
            imn.c("autoInvalidateRemovedNode called on unattached node");
        }
        e(hvhVar, -1, 2);
    }

    public static final void g(hvh hvhVar) {
        if (!hvhVar.z) {
            imn.c("autoInvalidateUpdatedNode called on unattached node");
        }
        e(hvhVar, -1, 0);
    }

    public static final boolean h(int i) {
        return (i & 128) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void i(hvh hvhVar, int i, int i2) {
        if (i2 != 0 || hvhVar.dM()) {
            if ((i & 2) != 0 && (hvhVar instanceof itu)) {
                itz.b((itu) hvhVar);
                if (i2 == 2) {
                    isx.e(hvhVar, 2).ao();
                }
            }
            if ((i & 128) != 0 && (hvhVar instanceof its) && i2 != 2) {
                isx.d(hvhVar).S();
            }
            if ((i & 256) != 0 && (hvhVar instanceof iti) && i2 != 2) {
                iui d = isx.d(hvhVar);
                if (!d.al() && !d.ao() && !d.C) {
                    ium.a(d).z(d);
                }
            }
            if ((i & 4) != 0 && (hvhVar instanceof itg)) {
                ith.a((itg) hvhVar);
            }
            if ((i & 8) != 0 && (hvhVar instanceof ixn)) {
                isx.d(hvhVar).p = true;
            }
            if ((i & 64) != 0 && (hvhVar instanceof ixi)) {
                iun iunVar = isx.d((ixi) hvhVar).y;
                iunVar.o.q = true;
                ivd ivdVar = iunVar.p;
                if (ivdVar != null) {
                    ivdVar.t = true;
                }
            }
            if ((i & 2048) != 0 && (hvhVar instanceof hzg)) {
                hzg hzgVar = (hzg) hvhVar;
                isl.b = null;
                hzgVar.p(isl.a);
                if (isl.b != null) {
                    if (!hzgVar.C().z) {
                        imn.c("visitChildren called on an unattached node");
                    }
                    hne hneVar = new hne(new hvh[16]);
                    hvh hvhVar2 = hzgVar.C().t;
                    if (hvhVar2 == null) {
                        isx.j(hneVar, hzgVar.C());
                    } else {
                        hneVar.n(hvhVar2);
                    }
                    while (true) {
                        int i3 = hneVar.b;
                        if (i3 == 0) {
                            break;
                        }
                        hvh hvhVar3 = (hvh) hneVar.c(i3 - 1);
                        if ((hvhVar3.r & 1024) == 0) {
                            isx.j(hneVar, hvhVar3);
                        } else {
                            while (true) {
                                if (hvhVar3 == null) {
                                    break;
                                }
                                if ((hvhVar3.q & 1024) != 0) {
                                    hne hneVar2 = null;
                                    while (hvhVar3 != null) {
                                        if (hvhVar3 instanceof FocusTargetNode) {
                                            FocusTargetNode focusTargetNode = (FocusTargetNode) hvhVar3;
                                            hyp hypVar = ((FocusOwnerImpl) ((AndroidComposeView) isx.f(focusTargetNode)).d).c;
                                            hypVar.a(hypVar.c, focusTargetNode);
                                        } else if ((hvhVar3.q & 1024) != 0 && (hvhVar3 instanceof isz)) {
                                            int i4 = 0;
                                            for (hvh hvhVar4 = ((isz) hvhVar3).n; hvhVar4 != null; hvhVar4 = hvhVar4.t) {
                                                if ((hvhVar4.q & 1024) != 0) {
                                                    i4++;
                                                    if (i4 == 1) {
                                                        hvhVar3 = hvhVar4;
                                                    } else {
                                                        if (hneVar2 == null) {
                                                            hneVar2 = new hne(new hvh[16]);
                                                        }
                                                        if (hvhVar3 != null) {
                                                            hneVar2.n(hvhVar3);
                                                        }
                                                        hneVar2.n(hvhVar4);
                                                        hvhVar3 = null;
                                                    }
                                                }
                                            }
                                            if (i4 != 1) {
                                            }
                                        }
                                        hvhVar3 = isx.a(hneVar2);
                                    }
                                } else {
                                    hvhVar3 = hvhVar3.t;
                                }
                            }
                        }
                    }
                }
            }
            if ((i & 4096) == 0 || !(hvhVar instanceof hyk)) {
                return;
            }
            hyk hykVar = (hyk) hvhVar;
            hyp hypVar2 = ((FocusOwnerImpl) ((AndroidComposeView) isx.f(hykVar)).d).c;
            hypVar2.a(hypVar2.d, hykVar);
        }
    }
}
