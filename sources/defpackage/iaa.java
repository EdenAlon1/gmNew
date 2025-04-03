package defpackage;

import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iaa {
    public static final boolean a(FocusTargetNode focusTargetNode, ffji ffjiVar) {
        int ordinal = focusTargetNode.g().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                FocusTargetNode b = hzw.b(focusTargetNode);
                if (b == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                int ordinal2 = b.g().ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 == 1) {
                        if (a(b, ffjiVar) || d(focusTargetNode, b, 2, ffjiVar)) {
                            return true;
                        }
                        return ((hzf) b.f()).a && ((Boolean) ffjiVar.invoke(b)).booleanValue();
                    }
                    if (ordinal2 != 2) {
                        if (ordinal2 != 3) {
                            throw new ffcd();
                        }
                        throw new IllegalStateException("ActiveParent must have a focusedChild");
                    }
                }
                return d(focusTargetNode, b, 2, ffjiVar);
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    throw new ffcd();
                }
                if (e(focusTargetNode, ffjiVar)) {
                    return true;
                }
                return ((hzf) focusTargetNode.f()).a && ((Boolean) ffjiVar.invoke(focusTargetNode)).booleanValue();
            }
        }
        return e(focusTargetNode, ffjiVar);
    }

    public static final boolean b(FocusTargetNode focusTargetNode, ffji ffjiVar) {
        int ordinal = focusTargetNode.g().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                FocusTargetNode b = hzw.b(focusTargetNode);
                if (b != null) {
                    return b(b, ffjiVar) || d(focusTargetNode, b, 1, ffjiVar);
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return ((hzf) focusTargetNode.f()).a ? ((Boolean) ffjiVar.invoke(focusTargetNode)).booleanValue() : f(focusTargetNode, ffjiVar);
                }
                throw new ffcd();
            }
        }
        return f(focusTargetNode, ffjiVar);
    }

    public static final boolean c(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i, ffji ffjiVar) {
        hvh hvhVar;
        ivu ivuVar;
        if (focusTargetNode.g() != hzo.b) {
            throw new IllegalStateException("This function should only be used within a parent that has focus.");
        }
        hne hneVar = new hne(new FocusTargetNode[16]);
        if (!focusTargetNode.p.z) {
            imn.c("visitChildren called on an unattached node");
        }
        hne hneVar2 = new hne(new hvh[16]);
        hvh hvhVar2 = focusTargetNode.p;
        hvh hvhVar3 = hvhVar2.t;
        if (hvhVar3 == null) {
            isx.j(hneVar2, hvhVar2);
        } else {
            hneVar2.n(hvhVar3);
        }
        while (true) {
            int i2 = hneVar2.b;
            hvhVar = null;
            if (i2 == 0) {
                break;
            }
            hvh hvhVar4 = (hvh) hneVar2.c(i2 - 1);
            if ((hvhVar4.r & 1024) == 0) {
                isx.j(hneVar2, hvhVar4);
            } else {
                while (true) {
                    if (hvhVar4 == null) {
                        break;
                    }
                    if ((hvhVar4.q & 1024) != 0) {
                        hne hneVar3 = null;
                        while (hvhVar4 != null) {
                            if (hvhVar4 instanceof FocusTargetNode) {
                                hneVar.n((FocusTargetNode) hvhVar4);
                            } else if ((hvhVar4.q & 1024) != 0 && (hvhVar4 instanceof isz)) {
                                int i3 = 0;
                                for (hvh hvhVar5 = ((isz) hvhVar4).n; hvhVar5 != null; hvhVar5 = hvhVar5.t) {
                                    if ((hvhVar5.q & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            hvhVar4 = hvhVar5;
                                        } else {
                                            if (hneVar3 == null) {
                                                hneVar3 = new hne(new hvh[16]);
                                            }
                                            if (hvhVar4 != null) {
                                                hneVar3.n(hvhVar4);
                                            }
                                            hneVar3.n(hvhVar5);
                                            hvhVar4 = null;
                                        }
                                    }
                                }
                                if (i3 != 1) {
                                }
                            }
                            hvhVar4 = isx.a(hneVar3);
                        }
                    } else {
                        hvhVar4 = hvhVar4.t;
                    }
                }
            }
        }
        hneVar.j(hzy.a);
        if (hyh.b(i, 1)) {
            ffmj q = ffmk.q(0, hneVar.b);
            int i4 = q.a;
            int i5 = q.b;
            if (i4 <= i5) {
                boolean z = false;
                while (true) {
                    if (z) {
                        FocusTargetNode focusTargetNode3 = (FocusTargetNode) hneVar.a[i4];
                        if (hzw.d(focusTargetNode3) && b(focusTargetNode3, ffjiVar)) {
                            return true;
                        }
                    }
                    z |= ffkj.e(hneVar.a[i4], focusTargetNode2);
                    if (i4 == i5) {
                        break;
                    }
                    i4++;
                }
            }
        } else {
            if (!hyh.b(i, 2)) {
                throw new IllegalStateException("This function should only be used for 1-D focus search");
            }
            ffmj q2 = ffmk.q(0, hneVar.b);
            int i6 = q2.a;
            int i7 = q2.b;
            if (i6 <= i7) {
                boolean z2 = false;
                while (true) {
                    if (z2) {
                        FocusTargetNode focusTargetNode4 = (FocusTargetNode) hneVar.a[i7];
                        if (hzw.d(focusTargetNode4) && a(focusTargetNode4, ffjiVar)) {
                            return true;
                        }
                    }
                    z2 |= ffkj.e(hneVar.a[i7], focusTargetNode2);
                    if (i7 == i6) {
                        break;
                    }
                    i7--;
                }
            }
        }
        if (!hyh.b(i, 1) && ((hzf) focusTargetNode.f()).a) {
            if (!focusTargetNode.p.z) {
                imn.c("visitAncestors called on an unattached node");
            }
            hvh hvhVar6 = focusTargetNode.p.s;
            iui d = isx.d(focusTargetNode);
            loop5: while (true) {
                if (d == null) {
                    break;
                }
                if ((d.x.e.r & 1024) != 0) {
                    while (hvhVar6 != null) {
                        if ((hvhVar6.q & 1024) != 0) {
                            hvh hvhVar7 = hvhVar6;
                            hne hneVar4 = null;
                            while (hvhVar7 != null) {
                                if (hvhVar7 instanceof FocusTargetNode) {
                                    hvhVar = hvhVar7;
                                    break loop5;
                                }
                                if ((hvhVar7.q & 1024) != 0 && (hvhVar7 instanceof isz)) {
                                    int i8 = 0;
                                    for (hvh hvhVar8 = ((isz) hvhVar7).n; hvhVar8 != null; hvhVar8 = hvhVar8.t) {
                                        if ((hvhVar8.q & 1024) != 0) {
                                            i8++;
                                            if (i8 == 1) {
                                                hvhVar7 = hvhVar8;
                                            } else {
                                                if (hneVar4 == null) {
                                                    hneVar4 = new hne(new hvh[16]);
                                                }
                                                if (hvhVar7 != null) {
                                                    hneVar4.n(hvhVar7);
                                                }
                                                hneVar4.n(hvhVar8);
                                                hvhVar7 = null;
                                            }
                                        }
                                    }
                                    if (i8 != 1) {
                                    }
                                }
                                hvhVar7 = isx.a(hneVar4);
                            }
                        }
                        hvhVar6 = hvhVar6.s;
                    }
                }
                d = d.u();
                hvhVar6 = (d == null || (ivuVar = d.x) == null) ? null : ivuVar.d;
            }
            if (hvhVar != null) {
                return ((Boolean) ffjiVar.invoke(focusTargetNode)).booleanValue();
            }
        }
        return false;
    }

    private static final boolean d(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i, ffji ffjiVar) {
        if (c(focusTargetNode, focusTargetNode2, i, ffjiVar)) {
            return true;
        }
        hzt a = hzs.a(focusTargetNode);
        int i2 = a.b;
        Boolean bool = (Boolean) hyd.a(focusTargetNode, i, new hzz(a, ((FocusOwnerImpl) ((AndroidComposeView) isx.f(focusTargetNode)).d).g, focusTargetNode, focusTargetNode2, i, ffjiVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static final boolean e(FocusTargetNode focusTargetNode, ffji ffjiVar) {
        hne hneVar = new hne(new FocusTargetNode[16]);
        if (!focusTargetNode.p.z) {
            imn.c("visitChildren called on an unattached node");
        }
        hne hneVar2 = new hne(new hvh[16]);
        hvh hvhVar = focusTargetNode.p;
        hvh hvhVar2 = hvhVar.t;
        if (hvhVar2 == null) {
            isx.j(hneVar2, hvhVar);
        } else {
            hneVar2.n(hvhVar2);
        }
        while (true) {
            int i = hneVar2.b;
            if (i == 0) {
                break;
            }
            hvh hvhVar3 = (hvh) hneVar2.c(i - 1);
            if ((hvhVar3.r & 1024) == 0) {
                isx.j(hneVar2, hvhVar3);
            } else {
                while (true) {
                    if (hvhVar3 == null) {
                        break;
                    }
                    if ((hvhVar3.q & 1024) != 0) {
                        hne hneVar3 = null;
                        while (hvhVar3 != null) {
                            if (hvhVar3 instanceof FocusTargetNode) {
                                hneVar.n((FocusTargetNode) hvhVar3);
                            } else if ((hvhVar3.q & 1024) != 0 && (hvhVar3 instanceof isz)) {
                                int i2 = 0;
                                for (hvh hvhVar4 = ((isz) hvhVar3).n; hvhVar4 != null; hvhVar4 = hvhVar4.t) {
                                    if ((hvhVar4.q & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            hvhVar3 = hvhVar4;
                                        } else {
                                            if (hneVar3 == null) {
                                                hneVar3 = new hne(new hvh[16]);
                                            }
                                            if (hvhVar3 != null) {
                                                hneVar3.n(hvhVar3);
                                            }
                                            hneVar3.n(hvhVar4);
                                            hvhVar3 = null;
                                        }
                                    }
                                }
                                if (i2 != 1) {
                                }
                            }
                            hvhVar3 = isx.a(hneVar3);
                        }
                    } else {
                        hvhVar3 = hvhVar3.t;
                    }
                }
            }
        }
        hneVar.j(hzy.a);
        int i3 = hneVar.b - 1;
        Object[] objArr = hneVar.a;
        if (i3 < objArr.length) {
            while (i3 >= 0) {
                FocusTargetNode focusTargetNode2 = (FocusTargetNode) objArr[i3];
                if (hzw.d(focusTargetNode2) && a(focusTargetNode2, ffjiVar)) {
                    return true;
                }
                i3--;
            }
        }
        return false;
    }

    private static final boolean f(FocusTargetNode focusTargetNode, ffji ffjiVar) {
        hne hneVar = new hne(new FocusTargetNode[16]);
        if (!focusTargetNode.p.z) {
            imn.c("visitChildren called on an unattached node");
        }
        hne hneVar2 = new hne(new hvh[16]);
        hvh hvhVar = focusTargetNode.p;
        hvh hvhVar2 = hvhVar.t;
        if (hvhVar2 == null) {
            isx.j(hneVar2, hvhVar);
        } else {
            hneVar2.n(hvhVar2);
        }
        while (true) {
            int i = hneVar2.b;
            if (i == 0) {
                break;
            }
            hvh hvhVar3 = (hvh) hneVar2.c(i - 1);
            if ((hvhVar3.r & 1024) == 0) {
                isx.j(hneVar2, hvhVar3);
            } else {
                while (true) {
                    if (hvhVar3 == null) {
                        break;
                    }
                    if ((hvhVar3.q & 1024) != 0) {
                        hne hneVar3 = null;
                        while (hvhVar3 != null) {
                            if (hvhVar3 instanceof FocusTargetNode) {
                                hneVar.n((FocusTargetNode) hvhVar3);
                            } else if ((hvhVar3.q & 1024) != 0 && (hvhVar3 instanceof isz)) {
                                int i2 = 0;
                                for (hvh hvhVar4 = ((isz) hvhVar3).n; hvhVar4 != null; hvhVar4 = hvhVar4.t) {
                                    if ((hvhVar4.q & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            hvhVar3 = hvhVar4;
                                        } else {
                                            if (hneVar3 == null) {
                                                hneVar3 = new hne(new hvh[16]);
                                            }
                                            if (hvhVar3 != null) {
                                                hneVar3.n(hvhVar3);
                                            }
                                            hneVar3.n(hvhVar4);
                                            hvhVar3 = null;
                                        }
                                    }
                                }
                                if (i2 != 1) {
                                }
                            }
                            hvhVar3 = isx.a(hneVar3);
                        }
                    } else {
                        hvhVar3 = hvhVar3.t;
                    }
                }
            }
        }
        hneVar.j(hzy.a);
        Object[] objArr = hneVar.a;
        int i3 = hneVar.b;
        for (int i4 = 0; i4 < i3; i4++) {
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) objArr[i4];
            if (hzw.d(focusTargetNode2) && b(focusTargetNode2, ffjiVar)) {
                return true;
            }
        }
        return false;
    }
}
