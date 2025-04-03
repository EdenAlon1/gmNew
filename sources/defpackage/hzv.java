package defpackage;

import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hzv {
    public static final boolean a(FocusTargetNode focusTargetNode) {
        hne hneVar;
        ivu ivuVar;
        ivu ivuVar2;
        FocusOwnerImpl focusOwnerImpl = (FocusOwnerImpl) ((AndroidComposeView) isx.f(focusTargetNode)).d;
        FocusTargetNode focusTargetNode2 = focusOwnerImpl.g;
        hzo g = focusTargetNode.g();
        if (focusTargetNode2 == focusTargetNode) {
            focusTargetNode.j(g, g);
            return true;
        }
        if (focusTargetNode2 != null && !b(focusTargetNode2, false)) {
            return false;
        }
        if (focusTargetNode2 == null && !((AndroidComposeView) isx.f(focusTargetNode)).d.h(null)) {
            return false;
        }
        iwo.a(focusTargetNode, new hzu(focusTargetNode));
        int ordinal = focusTargetNode.g().ordinal();
        if (ordinal == 1 || ordinal == 3) {
            ((AndroidComposeView) isx.f(focusTargetNode)).d.e(focusTargetNode);
        }
        if (focusTargetNode2 != null) {
            hneVar = new hne(new FocusTargetNode[16]);
            if (!focusTargetNode2.p.z) {
                imn.c("visitAncestors called on an unattached node");
            }
            hvh hvhVar = focusTargetNode2.p.s;
            iui d = isx.d(focusTargetNode2);
            while (d != null) {
                if ((d.x.e.r & 1024) != 0) {
                    while (hvhVar != null) {
                        if ((hvhVar.q & 1024) != 0) {
                            hne hneVar2 = null;
                            hvh hvhVar2 = hvhVar;
                            while (hvhVar2 != null) {
                                if (hvhVar2 instanceof FocusTargetNode) {
                                    hneVar.n((FocusTargetNode) hvhVar2);
                                } else if ((hvhVar2.q & 1024) != 0 && (hvhVar2 instanceof isz)) {
                                    int i = 0;
                                    for (hvh hvhVar3 = ((isz) hvhVar2).n; hvhVar3 != null; hvhVar3 = hvhVar3.t) {
                                        if ((hvhVar3.q & 1024) != 0) {
                                            i++;
                                            if (i == 1) {
                                                hvhVar2 = hvhVar3;
                                            } else {
                                                if (hneVar2 == null) {
                                                    hneVar2 = new hne(new hvh[16]);
                                                }
                                                if (hvhVar2 != null) {
                                                    hneVar2.n(hvhVar2);
                                                }
                                                hneVar2.n(hvhVar3);
                                                hvhVar2 = null;
                                            }
                                        }
                                    }
                                    if (i != 1) {
                                    }
                                }
                                hvhVar2 = isx.a(hneVar2);
                            }
                        }
                        hvhVar = hvhVar.s;
                    }
                }
                d = d.u();
                hvhVar = (d == null || (ivuVar2 = d.x) == null) ? null : ivuVar2.d;
            }
        } else {
            hneVar = null;
        }
        hne hneVar3 = new hne(new FocusTargetNode[16]);
        if (!focusTargetNode.p.z) {
            imn.c("visitAncestors called on an unattached node");
        }
        hvh hvhVar4 = focusTargetNode.p.s;
        iui d2 = isx.d(focusTargetNode);
        while (d2 != null) {
            if ((d2.x.e.r & 1024) != 0) {
                while (hvhVar4 != null) {
                    if ((hvhVar4.q & 1024) != 0) {
                        hne hneVar4 = null;
                        hvh hvhVar5 = hvhVar4;
                        while (hvhVar5 != null) {
                            if (hvhVar5 instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode3 = (FocusTargetNode) hvhVar5;
                                Boolean valueOf = hneVar != null ? Boolean.valueOf(hneVar.m(focusTargetNode3)) : null;
                                if (valueOf == null || !valueOf.booleanValue()) {
                                    hneVar3.n(focusTargetNode3);
                                }
                            } else if ((hvhVar5.q & 1024) != 0 && (hvhVar5 instanceof isz)) {
                                int i2 = 0;
                                for (hvh hvhVar6 = ((isz) hvhVar5).n; hvhVar6 != null; hvhVar6 = hvhVar6.t) {
                                    if ((hvhVar6.q & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            hvhVar5 = hvhVar6;
                                        } else {
                                            if (hneVar4 == null) {
                                                hneVar4 = new hne(new hvh[16]);
                                            }
                                            if (hvhVar5 != null) {
                                                hneVar4.n(hvhVar5);
                                            }
                                            hneVar4.n(hvhVar6);
                                            hvhVar5 = null;
                                        }
                                    }
                                }
                                if (i2 != 1) {
                                }
                            }
                            hvhVar5 = isx.a(hneVar4);
                        }
                    }
                    hvhVar4 = hvhVar4.s;
                }
            }
            d2 = d2.u();
            hvhVar4 = (d2 == null || (ivuVar = d2.x) == null) ? null : ivuVar.d;
        }
        if (hneVar != null) {
            int i3 = hneVar.b - 1;
            Object[] objArr = hneVar.a;
            if (i3 < objArr.length) {
                while (i3 >= 0) {
                    FocusTargetNode focusTargetNode4 = (FocusTargetNode) objArr[i3];
                    if (focusOwnerImpl.g != focusTargetNode) {
                        return false;
                    }
                    focusTargetNode4.j(hzo.b, hzo.d);
                    i3--;
                }
            }
        }
        int i4 = hneVar3.b - 1;
        Object[] objArr2 = hneVar3.a;
        if (i4 < objArr2.length) {
            while (i4 >= 0) {
                FocusTargetNode focusTargetNode5 = (FocusTargetNode) objArr2[i4];
                if (focusOwnerImpl.g != focusTargetNode) {
                    return false;
                }
                focusTargetNode5.j(hzo.d, hzo.b);
                i4--;
            }
        }
        if (focusOwnerImpl.g != focusTargetNode) {
            return false;
        }
        focusTargetNode.j(g, hzo.a);
        if (focusOwnerImpl.g != focusTargetNode) {
            return false;
        }
        if (isx.d(focusTargetNode).q() != null) {
            return true;
        }
        ((AndroidComposeView) isx.f(focusTargetNode)).d.h(new hyh(1));
        return true;
    }

    public static final boolean b(FocusTargetNode focusTargetNode, boolean z) {
        int ordinal = focusTargetNode.g().ordinal();
        if (ordinal == 0) {
            ((AndroidComposeView) isx.f(focusTargetNode)).d.e(null);
            focusTargetNode.j(hzo.a, hzo.d);
            return true;
        }
        if (ordinal == 1) {
            FocusTargetNode b = hzw.b(focusTargetNode);
            if (b != null && !b(b, z)) {
                return false;
            }
            focusTargetNode.j(hzo.b, hzo.d);
            return true;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return true;
            }
            throw new ffcd();
        }
        if (!z) {
            return z;
        }
        ((AndroidComposeView) isx.f(focusTargetNode)).d.e(null);
        focusTargetNode.j(hzo.c, hzo.d);
        return true;
    }

    public static final int c(FocusTargetNode focusTargetNode, int i) {
        int ordinal = focusTargetNode.g().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                int c = c(e(focusTargetNode), i);
                if (c == 1) {
                    c = 0;
                }
                if (c != 0) {
                    return c;
                }
                if (focusTargetNode.a) {
                    return 1;
                }
                focusTargetNode.a = true;
                try {
                    hzc f = focusTargetNode.f();
                    hye hyeVar = new hye(i);
                    hzs.b(focusTargetNode);
                    hyv hyvVar = ((AndroidComposeView) isx.f(focusTargetNode)).d;
                    FocusTargetNode focusTargetNode2 = ((FocusOwnerImpl) hyvVar).g;
                    ((hzf) f).k.invoke(hyeVar);
                    FocusTargetNode focusTargetNode3 = ((FocusOwnerImpl) hyvVar).g;
                    if (hyeVar.b) {
                        return 2;
                    }
                    if (focusTargetNode2 == focusTargetNode3 || focusTargetNode3 == null) {
                        return 1;
                    }
                    return hzi.c == hzi.b ? 2 : 3;
                } finally {
                    focusTargetNode.a = false;
                }
            }
            if (ordinal == 2) {
                return 2;
            }
            if (ordinal != 3) {
                throw new ffcd();
            }
        }
        return 1;
    }

    public static final int d(FocusTargetNode focusTargetNode, int i) {
        hvh hvhVar;
        ivu ivuVar;
        int ordinal = focusTargetNode.g().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return c(e(focusTargetNode), i);
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    throw new ffcd();
                }
                if (!focusTargetNode.p.z) {
                    imn.c("visitAncestors called on an unattached node");
                }
                hvh hvhVar2 = focusTargetNode.p.s;
                iui d = isx.d(focusTargetNode);
                loop0: while (true) {
                    hvhVar = null;
                    if (d == null) {
                        break;
                    }
                    if ((d.x.e.r & 1024) != 0) {
                        while (hvhVar2 != null) {
                            if ((hvhVar2.q & 1024) != 0) {
                                hvh hvhVar3 = hvhVar2;
                                hne hneVar = null;
                                while (hvhVar3 != null) {
                                    if (hvhVar3 instanceof FocusTargetNode) {
                                        hvhVar = hvhVar3;
                                        break loop0;
                                    }
                                    if ((hvhVar3.q & 1024) != 0 && (hvhVar3 instanceof isz)) {
                                        int i2 = 0;
                                        for (hvh hvhVar4 = ((isz) hvhVar3).n; hvhVar4 != null; hvhVar4 = hvhVar4.t) {
                                            if ((hvhVar4.q & 1024) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    hvhVar3 = hvhVar4;
                                                } else {
                                                    if (hneVar == null) {
                                                        hneVar = new hne(new hvh[16]);
                                                    }
                                                    if (hvhVar3 != null) {
                                                        hneVar.n(hvhVar3);
                                                    }
                                                    hneVar.n(hvhVar4);
                                                    hvhVar3 = null;
                                                }
                                            }
                                        }
                                        if (i2 != 1) {
                                        }
                                    }
                                    hvhVar3 = isx.a(hneVar);
                                }
                            }
                            hvhVar2 = hvhVar2.s;
                        }
                    }
                    d = d.u();
                    hvhVar2 = (d == null || (ivuVar = d.x) == null) ? null : ivuVar.d;
                }
                FocusTargetNode focusTargetNode2 = (FocusTargetNode) hvhVar;
                if (focusTargetNode2 == null) {
                    return 1;
                }
                int ordinal2 = focusTargetNode2.g().ordinal();
                if (ordinal2 == 0) {
                    return f(focusTargetNode2, i);
                }
                if (ordinal2 == 1) {
                    return d(focusTargetNode2, i);
                }
                if (ordinal2 == 2) {
                    return 2;
                }
                if (ordinal2 != 3) {
                    throw new ffcd();
                }
                int d2 = d(focusTargetNode2, i);
                int i3 = d2 != 1 ? d2 : 0;
                return i3 == 0 ? f(focusTargetNode2, i) : i3;
            }
        }
        return 1;
    }

    private static final FocusTargetNode e(FocusTargetNode focusTargetNode) {
        FocusTargetNode b = hzw.b(focusTargetNode);
        if (b != null) {
            return b;
        }
        throw new IllegalArgumentException("ActiveParent with no focused child");
    }

    private static final int f(FocusTargetNode focusTargetNode, int i) {
        if (!focusTargetNode.b) {
            focusTargetNode.b = true;
            try {
                hzc f = focusTargetNode.f();
                hye hyeVar = new hye(i);
                hzs.b(focusTargetNode);
                hyv hyvVar = ((AndroidComposeView) isx.f(focusTargetNode)).d;
                FocusTargetNode focusTargetNode2 = ((FocusOwnerImpl) hyvVar).g;
                ((hzf) f).j.invoke(hyeVar);
                FocusTargetNode focusTargetNode3 = ((FocusOwnerImpl) hyvVar).g;
                boolean z = hyeVar.b;
                int i2 = 2;
                if (!z) {
                    if (focusTargetNode2 != focusTargetNode3 && focusTargetNode3 != null) {
                        if (hzi.c != hzi.b) {
                            i2 = 3;
                        }
                    }
                }
                return i2;
            } finally {
                focusTargetNode.b = false;
            }
        }
        return 1;
    }
}
