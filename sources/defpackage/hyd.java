package defpackage;

import androidx.compose.ui.focus.FocusTargetNode;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hyd {
    public static final Object a(FocusTargetNode focusTargetNode, int i, ffji ffjiVar) {
        int i2;
        hvh hvhVar;
        ind h;
        ivu ivuVar;
        if (!focusTargetNode.p.z) {
            imn.c("visitAncestors called on an unattached node");
        }
        hvh hvhVar2 = focusTargetNode.p.s;
        iui d = isx.d(focusTargetNode);
        loop0: while (true) {
            i2 = 1;
            if (d == null) {
                hvhVar = null;
                break;
            }
            if ((d.x.e.r & 1024) != 0) {
                while (hvhVar2 != null) {
                    if ((hvhVar2.q & 1024) != 0) {
                        hvhVar = hvhVar2;
                        hne hneVar = null;
                        while (hvhVar != null) {
                            if (hvhVar instanceof FocusTargetNode) {
                                break loop0;
                            }
                            if ((hvhVar.q & 1024) != 0 && (hvhVar instanceof isz)) {
                                int i3 = 0;
                                for (hvh hvhVar3 = ((isz) hvhVar).n; hvhVar3 != null; hvhVar3 = hvhVar3.t) {
                                    if ((hvhVar3.q & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            hvhVar = hvhVar3;
                                        } else {
                                            if (hneVar == null) {
                                                hneVar = new hne(new hvh[16]);
                                            }
                                            if (hvhVar != null) {
                                                hneVar.n(hvhVar);
                                            }
                                            hneVar.n(hvhVar3);
                                            hvhVar = null;
                                        }
                                    }
                                }
                                if (i3 != 1) {
                                }
                            }
                            hvhVar = isx.a(hneVar);
                        }
                    }
                    hvhVar2 = hvhVar2.s;
                }
            }
            d = d.u();
            hvhVar2 = (d == null || (ivuVar = d.x) == null) ? null : ivuVar.d;
        }
        FocusTargetNode focusTargetNode2 = (FocusTargetNode) hvhVar;
        if ((focusTargetNode2 != null && ffkj.e(focusTargetNode2.h(), focusTargetNode.h())) || (h = focusTargetNode.h()) == null) {
            return null;
        }
        int i4 = 5;
        if (!hyh.b(i, 5)) {
            i4 = 6;
            if (!hyh.b(i, 6)) {
                i4 = 3;
                if (!hyh.b(i, 3)) {
                    i4 = 4;
                    if (!hyh.b(i, 4)) {
                        if (hyh.b(i, 1)) {
                            i2 = 2;
                        } else if (!hyh.b(i, 2)) {
                            throw new IllegalStateException("Unsupported direction for beyond bounds layout");
                        }
                        return h.a(i2, ffjiVar);
                    }
                }
            }
        }
        i2 = i4;
        return h.a(i2, ffjiVar);
    }
}
