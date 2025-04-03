package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nir {
    private static final int[] a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static ndr a(ncp ncpVar, boolean z, boolean z2) {
        ndr ndrVar;
        long j;
        luv luvVar;
        int i;
        int i2;
        int[] iArr;
        long d = ncpVar.d();
        long j2 = -1;
        long j3 = 4096;
        if (d != -1 && d <= 4096) {
            j3 = d;
        }
        luv luvVar2 = new luv(64);
        int i3 = (int) j3;
        int i4 = 0;
        int i5 = 0;
        boolean z3 = false;
        while (i5 < i3) {
            luvVar2.G(8);
            boolean z4 = true;
            if (!ncpVar.n(luvVar2.a, i4, 8, true)) {
                break;
            }
            long r = luvVar2.r();
            int e = luvVar2.e();
            if (r == 1) {
                j = j2;
                ncpVar.i(luvVar2.a, 8, 8);
                i = 16;
                luvVar2.J(16);
                r = luvVar2.q();
                luvVar = luvVar2;
            } else {
                j = j2;
                if (r == 0) {
                    long d2 = ncpVar.d();
                    if (d2 != j) {
                        r = (d2 - ncpVar.e()) + 8;
                    }
                }
                luvVar = luvVar2;
                i = 8;
            }
            long j4 = r;
            ndrVar = null;
            long j5 = i;
            if (j4 >= j5) {
                i5 += i;
                if (e == 1836019574) {
                    i3 += (int) j4;
                    if (d != -1 && i3 > d) {
                        i3 = (int) d;
                    }
                    luvVar2 = luvVar;
                    j2 = j;
                    i4 = 0;
                } else {
                    if (e == 1836019558 || e == 1836475768) {
                        i4 = 1;
                        break;
                    }
                    z3 |= !(e != 1835295092);
                    long j6 = d;
                    if ((i5 + j4) - j5 >= i3) {
                        i4 = 0;
                        break;
                    }
                    int i6 = (int) (j4 - j5);
                    i5 += i6;
                    if (e != 1718909296) {
                        i2 = 0;
                        if (i6 != 0) {
                            ncpVar.g(i6);
                        }
                    } else if (i6 >= 8) {
                        luvVar.G(i6);
                        i2 = 0;
                        ncpVar.i(luvVar.a, 0, i6);
                        boolean b = b(luvVar.e(), z2) | z3;
                        luvVar.L(4);
                        int b2 = luvVar.b() / 4;
                        if (!b && b2 > 0) {
                            iArr = new int[b2];
                            int i7 = 0;
                            while (true) {
                                if (i7 >= b2) {
                                    z4 = b;
                                    break;
                                }
                                int e2 = luvVar.e();
                                iArr[i7] = e2;
                                if (b(e2, z2)) {
                                    break;
                                }
                                i7++;
                            }
                        } else {
                            z4 = b;
                            iArr = null;
                        }
                        if (!z4) {
                            return new niw(iArr);
                        }
                        z3 = z4;
                    }
                    i4 = i2;
                    luvVar2 = luvVar;
                    j2 = j;
                    d = j6;
                }
            }
            return new nhp();
        }
        ndrVar = null;
        return !z3 ? nim.a : z != i4 ? i4 != 0 ? nig.a : nig.b : ndrVar;
    }

    private static boolean b(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579) {
            if (z) {
                return true;
            }
            i = 1751476579;
        }
        int[] iArr = a;
        for (int i2 = 0; i2 < 29; i2++) {
            if (iArr[i2] == i) {
                return true;
            }
        }
        return false;
    }
}
