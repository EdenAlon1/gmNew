package defpackage;

import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kjm {
    public static final kje a = new kje();
    public static int b = 0;
    public static int c = 0;

    public static void a(int i, kiu kiuVar, kjf kjfVar, boolean z) {
        kit kitVar;
        kit kitVar2;
        float f;
        kit kitVar3;
        kit kitVar4;
        if (kiuVar.x) {
            return;
        }
        b++;
        if (!(kiuVar instanceof kiv) && kiuVar.U() && c(kiuVar)) {
            kiv.al(kiuVar, kjfVar, new kje());
        }
        kit V = kiuVar.V(2);
        kit V2 = kiuVar.V(4);
        int a2 = V.a();
        int a3 = V2.a();
        HashSet hashSet = V.a;
        if (hashSet != null && V.c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                int i2 = i + 1;
                kit kitVar5 = (kit) it.next();
                kiu kiuVar2 = kitVar5.d;
                boolean c2 = c(kiuVar2);
                if (kiuVar2.U() && c2) {
                    f = 0.0f;
                    kiv.al(kiuVar2, kjfVar, new kje());
                } else {
                    f = 0.0f;
                }
                kit kitVar6 = kiuVar2.T;
                boolean z2 = (kitVar5 == kitVar6 && (kitVar4 = kiuVar2.V.e) != null && kitVar4.c) || (kitVar5 == kiuVar2.V && (kitVar3 = kitVar6.e) != null && kitVar3.c);
                if (kiuVar2.X() != 3 || c2) {
                    if (!kiuVar2.U()) {
                        kit kitVar7 = kiuVar2.T;
                        if (kitVar5 == kitVar7 && kiuVar2.V.e == null) {
                            int b2 = kitVar7.b() + a2;
                            kiuVar2.A(b2, kiuVar2.j() + b2);
                            a(i2, kiuVar2, kjfVar, z);
                        } else {
                            kit kitVar8 = kiuVar2.V;
                            if (kitVar5 == kitVar8 && kitVar7.e == null) {
                                int b3 = a2 - kitVar8.b();
                                kiuVar2.A(b3 - kiuVar2.j(), b3);
                                a(i2, kiuVar2, kjfVar, z);
                            } else if (z2 && !kiuVar2.S()) {
                                e(i2, kjfVar, kiuVar2, z);
                            }
                        }
                    }
                } else if (kiuVar2.X() == 3 && kiuVar2.G >= 0 && kiuVar2.F >= 0 && (kiuVar2.ar == 8 || (kiuVar2.C == 0 && kiuVar2.ah == f))) {
                    if (!kiuVar2.S() && !kiuVar2.Q && z2 && !kiuVar2.S()) {
                        f(i2, kiuVar, kjfVar, kiuVar2, z);
                    }
                }
            }
        }
        if (kiuVar instanceof kiy) {
            return;
        }
        HashSet hashSet2 = V2.a;
        if (hashSet2 != null && V2.c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                int i3 = i + 1;
                kit kitVar9 = (kit) it2.next();
                kiu kiuVar3 = kitVar9.d;
                boolean c3 = c(kiuVar3);
                if (kiuVar3.U() && c3) {
                    kiv.al(kiuVar3, kjfVar, new kje());
                }
                kit kitVar10 = kiuVar3.T;
                boolean z3 = (kitVar9 == kitVar10 && (kitVar2 = kiuVar3.V.e) != null && kitVar2.c) || (kitVar9 == kiuVar3.V && (kitVar = kitVar10.e) != null && kitVar.c);
                if (kiuVar3.X() != 3 || c3) {
                    if (!kiuVar3.U()) {
                        kit kitVar11 = kiuVar3.T;
                        if (kitVar9 == kitVar11 && kiuVar3.V.e == null) {
                            int b4 = kitVar11.b() + a3;
                            kiuVar3.A(b4, kiuVar3.j() + b4);
                            a(i3, kiuVar3, kjfVar, z);
                        } else {
                            kit kitVar12 = kiuVar3.V;
                            if (kitVar9 == kitVar12 && kitVar11.e == null) {
                                int b5 = a3 - kitVar12.b();
                                kiuVar3.A(b5 - kiuVar3.j(), b5);
                                a(i3, kiuVar3, kjfVar, z);
                            } else if (z3 && !kiuVar3.S()) {
                                e(i3, kjfVar, kiuVar3, z);
                            }
                        }
                    }
                } else if (kiuVar3.X() == 3 && kiuVar3.G >= 0 && kiuVar3.F >= 0 && (kiuVar3.ar == 8 || (kiuVar3.C == 0 && kiuVar3.ah == 0.0f))) {
                    if (!kiuVar3.S() && !kiuVar3.Q && z3 && !kiuVar3.S()) {
                        f(i3, kiuVar, kjfVar, kiuVar3, z);
                    }
                }
            }
        }
        kiuVar.x = true;
    }

    public static void b(int i, kiu kiuVar, kjf kjfVar) {
        kit kitVar;
        kit kitVar2;
        kit kitVar3;
        kit kitVar4;
        if (kiuVar.y) {
            return;
        }
        c++;
        if (!(kiuVar instanceof kiv) && kiuVar.U() && c(kiuVar)) {
            kiv.al(kiuVar, kjfVar, new kje());
        }
        kit V = kiuVar.V(3);
        kit V2 = kiuVar.V(5);
        int a2 = V.a();
        int a3 = V2.a();
        HashSet hashSet = V.a;
        if (hashSet != null && V.c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                int i2 = i + 1;
                kit kitVar5 = (kit) it.next();
                kiu kiuVar2 = kitVar5.d;
                boolean c2 = c(kiuVar2);
                if (kiuVar2.U() && c2) {
                    kiv.al(kiuVar2, kjfVar, new kje());
                }
                kit kitVar6 = kiuVar2.U;
                boolean z = (kitVar5 == kitVar6 && (kitVar4 = kiuVar2.W.e) != null && kitVar4.c) || (kitVar5 == kiuVar2.W && (kitVar3 = kitVar6.e) != null && kitVar3.c);
                if (kiuVar2.Y() != 3 || c2) {
                    if (!kiuVar2.U()) {
                        kit kitVar7 = kiuVar2.U;
                        if (kitVar5 == kitVar7 && kiuVar2.W.e == null) {
                            int b2 = kitVar7.b() + a2;
                            kiuVar2.B(b2, kiuVar2.h() + b2);
                            b(i2, kiuVar2, kjfVar);
                        } else {
                            kit kitVar8 = kiuVar2.W;
                            if (kitVar5 == kitVar8 && kitVar7.e == null) {
                                int b3 = a2 - kitVar8.b();
                                kiuVar2.B(b3 - kiuVar2.h(), b3);
                                b(i2, kiuVar2, kjfVar);
                            } else if (z && !kiuVar2.T()) {
                                g(i2, kjfVar, kiuVar2);
                            }
                        }
                    }
                } else if (kiuVar2.Y() == 3 && kiuVar2.J >= 0 && kiuVar2.I >= 0 && (kiuVar2.ar == 8 || (kiuVar2.D == 0 && kiuVar2.ah == 0.0f))) {
                    if (!kiuVar2.T() && !kiuVar2.Q && z && !kiuVar2.T()) {
                        h(i2, kiuVar, kjfVar, kiuVar2);
                    }
                }
            }
        }
        if (kiuVar instanceof kiy) {
            return;
        }
        HashSet hashSet2 = V2.a;
        if (hashSet2 != null && V2.c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                int i3 = i + 1;
                kit kitVar9 = (kit) it2.next();
                kiu kiuVar3 = kitVar9.d;
                boolean c3 = c(kiuVar3);
                if (kiuVar3.U() && c3) {
                    kiv.al(kiuVar3, kjfVar, new kje());
                }
                kit kitVar10 = kiuVar3.U;
                boolean z2 = (kitVar9 == kitVar10 && (kitVar2 = kiuVar3.W.e) != null && kitVar2.c) || (kitVar9 == kiuVar3.W && (kitVar = kitVar10.e) != null && kitVar.c);
                if (kiuVar3.Y() != 3 || c3) {
                    if (kiuVar3.U()) {
                        continue;
                    } else {
                        kit kitVar11 = kiuVar3.U;
                        if (kitVar9 == kitVar11 && kiuVar3.W.e == null) {
                            int b4 = kitVar11.b() + a3;
                            kiuVar3.B(b4, kiuVar3.h() + b4);
                            b(i3, kiuVar3, kjfVar);
                        } else {
                            kit kitVar12 = kiuVar3.W;
                            if (kitVar9 == kitVar12 && kitVar11.e == null) {
                                int b5 = a3 - kitVar12.b();
                                kiuVar3.B(b5 - kiuVar3.h(), b5);
                                b(i3, kiuVar3, kjfVar);
                            } else if (z2 && !kiuVar3.T()) {
                                g(i3, kjfVar, kiuVar3);
                            }
                        }
                    }
                } else if (kiuVar3.Y() == 3 && kiuVar3.J >= 0 && kiuVar3.I >= 0 && (kiuVar3.ar == 8 || (kiuVar3.D == 0 && kiuVar3.ah == 0.0f))) {
                    if (!kiuVar3.T() && !kiuVar3.Q && z2 && !kiuVar3.T()) {
                        h(i3, kiuVar, kjfVar, kiuVar3);
                    }
                }
            }
        }
        kit V3 = kiuVar.V(6);
        if (V3.a != null && V3.c) {
            int a4 = V3.a();
            Iterator it3 = V3.a.iterator();
            while (it3.hasNext()) {
                int i4 = i + 1;
                kit kitVar13 = (kit) it3.next();
                kiu kiuVar4 = kitVar13.d;
                boolean c4 = c(kiuVar4);
                if (kiuVar4.U() && c4) {
                    kiv.al(kiuVar4, kjfVar, new kje());
                }
                if (kiuVar4.Y() != 3 || c4) {
                    if (!kiuVar4.U() && kitVar13 == kiuVar4.X) {
                        int b6 = kitVar13.b() + a4;
                        if (kiuVar4.P) {
                            int i5 = b6 - kiuVar4.al;
                            int i6 = kiuVar4.ag + i5;
                            kiuVar4.ak = i5;
                            kiuVar4.U.f(i5);
                            kiuVar4.W.f(i6);
                            kiuVar4.X.f(b6);
                            kiuVar4.w = true;
                        }
                        b(i4, kiuVar4, kjfVar);
                    }
                }
            }
        }
        kiuVar.y = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        if (r8.Q(0) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0069, code lost:
    
        if (r8.Q(1) != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x007c, code lost:
    
        if (r8.R(1, r8.h()) != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x006c, code lost:
    
        if (r1 != 3) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x004c, code lost:
    
        if (r8.R(0, r8.j()) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x003c, code lost:
    
        if (r0 != 3) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(defpackage.kiu r8) {
        /*
            int r0 = r8.X()
            int r1 = r8.Y()
            kiu r2 = r8.ae
            if (r2 == 0) goto Lf
            kiv r2 = (defpackage.kiv) r2
            goto L10
        Lf:
            r2 = 0
        L10:
            if (r2 == 0) goto L15
            r2.X()
        L15:
            if (r2 == 0) goto L1a
            r2.Y()
        L1a:
            r2 = 2
            r3 = 0
            r4 = 3
            r5 = 0
            r6 = 1
            if (r0 == r6) goto L4e
            boolean r7 = r8.e()
            if (r7 != 0) goto L4e
            if (r0 == r2) goto L4e
            if (r0 != r4) goto L3c
            int r0 = r8.C
            if (r0 != 0) goto L40
            float r0 = r8.ah
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L40
            boolean r0 = r8.Q(r5)
            if (r0 != 0) goto L4e
            goto L40
        L3c:
            if (r0 == r4) goto L40
        L3e:
            r0 = r5
            goto L4f
        L40:
            int r0 = r8.C
            if (r0 != r6) goto L3e
            int r0 = r8.j()
            boolean r0 = r8.R(r5, r0)
            if (r0 == 0) goto L3e
        L4e:
            r0 = r6
        L4f:
            if (r1 == r6) goto L7e
            boolean r7 = r8.f()
            if (r7 != 0) goto L7e
            if (r1 == r2) goto L7e
            if (r1 != r4) goto L6c
            int r1 = r8.D
            if (r1 != 0) goto L70
            float r1 = r8.ah
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L70
            boolean r1 = r8.Q(r6)
            if (r1 != 0) goto L7e
            goto L70
        L6c:
            if (r1 == r4) goto L70
        L6e:
            r1 = r5
            goto L7f
        L70:
            int r1 = r8.D
            if (r1 != r6) goto L6e
            int r1 = r8.h()
            boolean r1 = r8.R(r6, r1)
            if (r1 == 0) goto L6e
        L7e:
            r1 = r6
        L7f:
            float r8 = r8.ah
            int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r8 <= 0) goto L8d
            if (r0 != 0) goto L8c
            if (r1 != 0) goto L8c
            r0 = r5
            r1 = r0
            goto L8d
        L8c:
            return r6
        L8d:
            if (r0 == 0) goto L92
            if (r1 == 0) goto L92
            return r6
        L92:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kjm.c(kiu):boolean");
    }

    public static void d(kiq kiqVar, kjf kjfVar, int i, boolean z) {
        if (kiqVar.c()) {
            if (i == 0) {
                a(1, kiqVar, kjfVar, z);
            } else {
                b(1, kiqVar, kjfVar);
            }
        }
    }

    private static void e(int i, kjf kjfVar, kiu kiuVar, boolean z) {
        float f = kiuVar.ao;
        int a2 = kiuVar.T.e.a();
        int a3 = kiuVar.V.e.a();
        int b2 = kiuVar.T.b() + a2;
        int b3 = a3 - kiuVar.V.b();
        if (a2 == a3) {
            b3 = a3;
        }
        if (a2 == a3) {
            b2 = a2;
        }
        if (a2 == a3) {
            f = 0.5f;
        }
        int j = kiuVar.j();
        int i2 = (b3 - b2) - j;
        if (b2 > b3) {
            i2 = (b2 - b3) - j;
        }
        int i3 = ((int) (i2 > 0 ? (f * i2) + 0.5f : f * i2)) + b2;
        int i4 = i3 + j;
        if (b2 > b3) {
            i4 = i3 - j;
        }
        kiuVar.A(i3, i4);
        a(i + 1, kiuVar, kjfVar, z);
    }

    private static void f(int i, kiu kiuVar, kjf kjfVar, kiu kiuVar2, boolean z) {
        float f = kiuVar2.ao;
        int a2 = kiuVar2.T.e.a() + kiuVar2.T.b();
        int a3 = kiuVar2.V.e.a() - kiuVar2.V.b();
        if (a3 >= a2) {
            int j = kiuVar2.j();
            int i2 = a3 - a2;
            if (kiuVar2.ar != 8) {
                int i3 = kiuVar2.C;
                if (i3 == 2) {
                    j = (int) (kiuVar2.ao * 0.5f * (kiuVar instanceof kiv ? kiuVar.j() : kiuVar.ae.j()));
                } else if (i3 == 0) {
                    j = i2;
                }
                j = Math.max(kiuVar2.F, j);
                int i4 = kiuVar2.G;
                if (i4 > 0) {
                    j = Math.min(i4, j);
                }
            }
            int i5 = a2 + ((int) ((f * (i2 - j)) + 0.5f));
            kiuVar2.A(i5, j + i5);
            a(i + 1, kiuVar2, kjfVar, z);
        }
    }

    private static void g(int i, kjf kjfVar, kiu kiuVar) {
        float f = kiuVar.ap;
        int a2 = kiuVar.U.e.a();
        int a3 = kiuVar.W.e.a();
        int b2 = kiuVar.U.b() + a2;
        int b3 = a3 - kiuVar.W.b();
        if (a2 == a3) {
            b3 = a3;
        }
        if (a2 == a3) {
            b2 = a2;
        }
        if (a2 == a3) {
            f = 0.5f;
        }
        int h = kiuVar.h();
        int i2 = (b3 - b2) - h;
        if (b2 > b3) {
            i2 = (b2 - b3) - h;
        }
        int i3 = (int) (i2 > 0 ? (f * i2) + 0.5f : f * i2);
        int i4 = b2 + i3;
        int i5 = i4 + h;
        if (b2 > b3) {
            i4 = b2 - i3;
            i5 = i4 - h;
        }
        kiuVar.B(i4, i5);
        b(i + 1, kiuVar, kjfVar);
    }

    private static void h(int i, kiu kiuVar, kjf kjfVar, kiu kiuVar2) {
        float f = kiuVar2.ap;
        int a2 = kiuVar2.U.e.a() + kiuVar2.U.b();
        int a3 = kiuVar2.W.e.a() - kiuVar2.W.b();
        if (a3 >= a2) {
            int h = kiuVar2.h();
            int i2 = a3 - a2;
            if (kiuVar2.ar != 8) {
                int i3 = kiuVar2.D;
                if (i3 == 2) {
                    h = (int) (f * 0.5f * (kiuVar instanceof kiv ? kiuVar.h() : kiuVar.ae.h()));
                } else if (i3 == 0) {
                    h = i2;
                }
                h = Math.max(kiuVar2.I, h);
                int i4 = kiuVar2.J;
                if (i4 > 0) {
                    h = Math.min(i4, h);
                }
            }
            int i5 = a2 + ((int) ((f * (i2 - h)) + 0.5f));
            kiuVar2.B(i5, h + i5);
            b(i + 1, kiuVar2, kjfVar);
        }
    }
}
