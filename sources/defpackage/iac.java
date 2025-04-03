package defpackage;

import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iac {
    public static final Boolean a(FocusTargetNode focusTargetNode, int i, iam iamVar, ffji ffjiVar) {
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
                        Boolean a = a(b, i, iamVar, ffjiVar);
                        if (!ffkj.e(a, false)) {
                            return a;
                        }
                        if (iamVar == null) {
                            if (b.g() != hzo.b) {
                                throw new IllegalStateException("Searching for active node in inactive hierarchy");
                            }
                            FocusTargetNode a2 = hzw.a(b);
                            if (a2 == null) {
                                throw new IllegalStateException("ActiveParent must have a focusedChild");
                            }
                            iamVar = hzw.c(a2);
                        }
                        return Boolean.valueOf(j(focusTargetNode, iamVar, i, ffjiVar));
                    }
                    if (ordinal2 != 2) {
                        if (ordinal2 != 3) {
                            throw new ffcd();
                        }
                        throw new IllegalStateException("ActiveParent must have a focusedChild");
                    }
                }
                if (iamVar == null) {
                    iamVar = hzw.c(b);
                }
                return Boolean.valueOf(j(focusTargetNode, iamVar, i, ffjiVar));
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return (Boolean) (((hzf) focusTargetNode.f()).a ? ffjiVar.invoke(focusTargetNode) : iamVar == null ? Boolean.valueOf(b(focusTargetNode, i, ffjiVar)) : Boolean.valueOf(d(focusTargetNode, iamVar, i, ffjiVar)));
                }
                throw new ffcd();
            }
        }
        return Boolean.valueOf(b(focusTargetNode, i, ffjiVar));
    }

    public static final boolean b(FocusTargetNode focusTargetNode, int i, ffji ffjiVar) {
        iam iamVar;
        hne hneVar = new hne(new FocusTargetNode[16]);
        g(focusTargetNode, hneVar);
        int i2 = hneVar.b;
        if (i2 <= 1) {
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) (i2 == 0 ? null : hneVar.a[0]);
            if (focusTargetNode2 != null) {
                return ((Boolean) ffjiVar.invoke(focusTargetNode2)).booleanValue();
            }
        } else {
            if (true == hyh.b(i, 7)) {
                i = 4;
            }
            if (hyh.b(i, 4) || hyh.b(i, 6)) {
                iam c = hzw.c(focusTargetNode);
                float f = c.b;
                float f2 = c.c;
                iamVar = new iam(f, f2, f, f2);
            } else {
                if (!hyh.b(i, 3) && !hyh.b(i, 5)) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                iam c2 = hzw.c(focusTargetNode);
                float f3 = c2.d;
                float f4 = c2.e;
                iamVar = new iam(f3, f4, f3, f4);
            }
            FocusTargetNode f5 = f(hneVar, iamVar, i);
            if (f5 != null) {
                return ((Boolean) ffjiVar.invoke(f5)).booleanValue();
            }
        }
        return false;
    }

    public static final boolean c(iam iamVar, iam iamVar2, iam iamVar3, int i) {
        if (!k(iamVar, i, iamVar3)) {
            return false;
        }
        if (k(iamVar2, i, iamVar3) && !h(iamVar3, iamVar, iamVar2, i)) {
            return !h(iamVar3, iamVar2, iamVar, i) && e(i, iamVar3, iamVar) < e(i, iamVar3, iamVar2);
        }
        return true;
    }

    public static final boolean d(FocusTargetNode focusTargetNode, iam iamVar, int i, ffji ffjiVar) {
        FocusTargetNode f;
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
            int i2 = hneVar2.b;
            if (i2 == 0) {
                break;
            }
            hvh hvhVar3 = (hvh) hneVar2.c(i2 - 1);
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
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) hvhVar3;
                                if (focusTargetNode2.z) {
                                    hneVar.n(focusTargetNode2);
                                }
                            } else if ((hvhVar3.q & 1024) != 0 && (hvhVar3 instanceof isz)) {
                                int i3 = 0;
                                for (hvh hvhVar4 = ((isz) hvhVar3).n; hvhVar4 != null; hvhVar4 = hvhVar4.t) {
                                    if ((hvhVar4.q & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
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
                                if (i3 != 1) {
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
        while (hneVar.b != 0 && (f = f(hneVar, iamVar, i)) != null) {
            if (((hzf) f.f()).a) {
                return ((Boolean) ffjiVar.invoke(f)).booleanValue();
            }
            if (j(f, iamVar, i, ffjiVar)) {
                return true;
            }
            hneVar.m(f);
        }
        return false;
    }

    private static final long e(int i, iam iamVar, iam iamVar2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        if (hyh.b(i, 3)) {
            f = iamVar.b;
            f2 = iamVar2.d;
        } else if (hyh.b(i, 4)) {
            f = iamVar2.b;
            f2 = iamVar.d;
        } else if (hyh.b(i, 5)) {
            f = iamVar.c;
            f2 = iamVar2.e;
        } else {
            if (!hyh.b(i, 6)) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f = iamVar2.c;
            f2 = iamVar.e;
        }
        float f6 = f - f2;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        if (hyh.b(i, 3) || hyh.b(i, 4)) {
            float f7 = iamVar.c;
            f3 = f7 + ((iamVar.e - f7) / 2.0f);
            f4 = iamVar2.c;
            f5 = iamVar2.e;
        } else {
            if (!hyh.b(i, 5) && !hyh.b(i, 6)) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            float f8 = iamVar.b;
            f3 = f8 + ((iamVar.d - f8) / 2.0f);
            f4 = iamVar2.b;
            f5 = iamVar2.d;
        }
        float f9 = f3 - (f4 + ((f5 - f4) / 2.0f));
        long j = (long) f6;
        long j2 = (long) f9;
        return (13 * j * j) + (j2 * j2);
    }

    private static final FocusTargetNode f(hne hneVar, iam iamVar, int i) {
        iam e;
        if (hyh.b(i, 3)) {
            e = iamVar.e((iamVar.d - iamVar.b) + 1.0f, 0.0f);
        } else if (hyh.b(i, 4)) {
            e = iamVar.e(-((iamVar.d - iamVar.b) + 1.0f), 0.0f);
        } else if (hyh.b(i, 5)) {
            e = iamVar.e(0.0f, (iamVar.e - iamVar.c) + 1.0f);
        } else {
            if (!hyh.b(i, 6)) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            e = iamVar.e(0.0f, -((iamVar.e - iamVar.c) + 1.0f));
        }
        Object[] objArr = hneVar.a;
        int i2 = hneVar.b;
        FocusTargetNode focusTargetNode = null;
        for (int i3 = 0; i3 < i2; i3++) {
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) objArr[i3];
            if (hzw.d(focusTargetNode2)) {
                iam c = hzw.c(focusTargetNode2);
                if (c(c, e, iamVar, i)) {
                    focusTargetNode = focusTargetNode2;
                    e = c;
                }
            }
        }
        return focusTargetNode;
    }

    private static final void g(isw iswVar, hne hneVar) {
        hvh hvhVar = (hvh) iswVar;
        if (!hvhVar.p.z) {
            imn.c("visitChildren called on an unattached node");
        }
        hne hneVar2 = new hne(new hvh[16]);
        hvh hvhVar2 = hvhVar.p;
        hvh hvhVar3 = hvhVar2.t;
        if (hvhVar3 == null) {
            isx.j(hneVar2, hvhVar2);
        } else {
            hneVar2.n(hvhVar3);
        }
        while (true) {
            int i = hneVar2.b;
            if (i == 0) {
                return;
            }
            hvh hvhVar4 = (hvh) hneVar2.c(i - 1);
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
                                FocusTargetNode focusTargetNode = (FocusTargetNode) hvhVar4;
                                if (focusTargetNode.z && !isx.d(focusTargetNode).D) {
                                    if (((hzf) focusTargetNode.f()).a) {
                                        hneVar.n(focusTargetNode);
                                    } else {
                                        g(focusTargetNode, hneVar);
                                    }
                                }
                            } else if ((hvhVar4.q & 1024) != 0 && (hvhVar4 instanceof isz)) {
                                int i2 = 0;
                                for (hvh hvhVar5 = ((isz) hvhVar4).n; hvhVar5 != null; hvhVar5 = hvhVar5.t) {
                                    if ((hvhVar5.q & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
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
                                if (i2 != 1) {
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
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final boolean h(defpackage.iam r9, defpackage.iam r10, defpackage.iam r11, int r12) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iac.h(iam, iam, iam, int):boolean");
    }

    private static final boolean i(iam iamVar, int i, iam iamVar2) {
        if (hyh.b(i, 3) || hyh.b(i, 4)) {
            return iamVar.e > iamVar2.c && iamVar.c < iamVar2.e;
        }
        if (hyh.b(i, 5) || hyh.b(i, 6)) {
            return iamVar.d > iamVar2.b && iamVar.b < iamVar2.d;
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    private static final boolean j(FocusTargetNode focusTargetNode, iam iamVar, int i, ffji ffjiVar) {
        if (d(focusTargetNode, iamVar, i, ffjiVar)) {
            return true;
        }
        hzt a = hzs.a(focusTargetNode);
        int i2 = a.b;
        Boolean bool = (Boolean) hyd.a(focusTargetNode, i, new iab(a, ((FocusOwnerImpl) ((AndroidComposeView) isx.f(focusTargetNode)).d).g, focusTargetNode, iamVar, i, ffjiVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static final boolean k(iam iamVar, int i, iam iamVar2) {
        if (hyh.b(i, 3)) {
            float f = iamVar2.d;
            float f2 = iamVar.d;
            return (f > f2 || iamVar2.b >= f2) && iamVar2.b > iamVar.b;
        }
        if (hyh.b(i, 4)) {
            float f3 = iamVar2.b;
            float f4 = iamVar.b;
            return (f3 < f4 || iamVar2.d <= f4) && iamVar2.d < iamVar.d;
        }
        if (hyh.b(i, 5)) {
            float f5 = iamVar2.e;
            float f6 = iamVar.e;
            return (f5 > f6 || iamVar2.c >= f6) && iamVar2.c > iamVar.c;
        }
        if (!hyh.b(i, 6)) {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        float f7 = iamVar2.c;
        float f8 = iamVar.c;
        return (f7 < f8 || iamVar2.e <= f8) && iamVar2.e < iamVar.e;
    }
}
