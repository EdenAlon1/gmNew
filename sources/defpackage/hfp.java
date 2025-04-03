package defpackage;

import java.util.Comparator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hfp {
    public static final Object a = new hhu("provider");
    public static final Object b = new hhu("provider");
    public static final Object c = new hhu("compositionLocalMap");
    public static final Object d = new hhu("providers");
    public static final Object e = new hhu("reference");
    public static final Comparator f = new Comparator() { // from class: hfn
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ffkj.a(((hgy) obj).b, ((hgy) obj2).b);
        }
    };

    public static final int a(boolean z) {
        return z ? 1 : 0;
    }

    public static final int b(hjq hjqVar, int i, int i2) {
        int i3 = 0;
        while (i > 0 && i != i2) {
            i = hjqVar.e(i);
            i3++;
        }
        return i3;
    }

    public static final int c(List list, int i) {
        int d2 = d(list, i);
        return d2 < 0 ? -(d2 + 1) : d2;
    }

    public static final int d(List list, int i) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int a2 = ffkj.a(((hgy) list.get(i3)).b, i);
            if (a2 < 0) {
                i2 = i3 + 1;
            } else {
                if (a2 <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final hgy e(List list, int i, int i2) {
        int c2 = c(list, i);
        if (c2 >= list.size()) {
            return null;
        }
        hgy hgyVar = (hgy) list.get(c2);
        if (hgyVar.b < i2) {
            return hgyVar;
        }
        return null;
    }

    public static final hgy f(List list, int i) {
        int d2 = d(list, i);
        if (d2 >= 0) {
            return (hgy) list.remove(d2);
        }
        return null;
    }

    public static final hhm g(hgh hghVar, hhn hhnVar, hjv hjvVar, hep hepVar) {
        List a2;
        hjr hjrVar = new hjr();
        if (hjvVar.e != null) {
            hjrVar.f();
        }
        if (hjvVar.f != null) {
            hjrVar.e();
        }
        int i = hjvVar.q;
        if (hepVar != null && hjvVar.k(i) > 0) {
            int i2 = hjvVar.s;
            while (i2 > 0 && !hjvVar.T(i2)) {
                i2 = hjvVar.l(i2);
            }
            if (i2 >= 0 && hjvVar.T(i2)) {
                Object w = hjvVar.w(i2);
                int i3 = i2 + 1;
                int j = i2 + hjvVar.j(i2);
                int i4 = 0;
                while (i3 < j) {
                    int j2 = hjvVar.j(i3) + i3;
                    if (j2 > i) {
                        break;
                    }
                    i4 += hjvVar.T(i3) ? 1 : hjvVar.k(i3);
                    i3 = j2;
                }
                int k = hjvVar.T(i) ? 1 : hjvVar.k(i);
                hepVar.d(w);
                hepVar.l(i4, k);
                hepVar.h();
            }
        }
        hjv d2 = hjrVar.d();
        try {
            d2.z();
            d2.N(126665345, hhnVar.a);
            hjv.Y(d2);
            d2.aa(hhnVar.b);
            hen henVar = hhnVar.e;
            if (d2.n <= 0) {
                j("Check failed");
            }
            if (hjvVar.n != 0) {
                j("Check failed");
            }
            if (!henVar.a()) {
                j("Check failed");
            }
            int a3 = hjvVar.a(henVar) + 1;
            int i5 = hjvVar.q;
            if (i5 > a3 || a3 >= hjvVar.r) {
                j("Check failed");
            }
            int l = hjvVar.l(a3);
            int j3 = hjvVar.j(a3);
            int k2 = hjvVar.T(a3) ? 1 : hjvVar.k(a3);
            a2 = hju.a(hjvVar, a3, d2, false, false, true);
            hjvVar.Q(l);
            boolean z = k2 > 0;
            while (l >= i5) {
                int h = hjvVar.h(l);
                int[] iArr = hjvVar.b;
                hjt.h(iArr, h, hjt.a(iArr, h) - j3);
                if (z) {
                    int[] iArr2 = hjvVar.b;
                    int i6 = iArr2[(h * 5) + 1];
                    if ((1073741824 & i6) == 0) {
                        hjt.i(iArr2, h, (i6 & 67108863) - k2);
                        z = true;
                        l = hjvVar.l(l);
                    }
                }
                z = false;
                l = hjvVar.l(l);
            }
            if (z) {
                if (hjvVar.o < k2) {
                    j("Check failed");
                }
                hjvVar.o -= k2;
            }
            d2.m();
            d2.X();
            d2.B();
            d2.A(true);
            hhm hhmVar = new hhm(hjrVar);
            if (!a2.isEmpty()) {
                int size = a2.size();
                for (int i7 = 0; i7 < size; i7++) {
                    hen henVar2 = (hen) a2.get(i7);
                    if (hjrVar.h(henVar2)) {
                        int a4 = hjrVar.a(henVar2);
                        int e2 = hjt.e(hjrVar.a, a4);
                        int i8 = a4 + 1;
                        if (((i8 < hjrVar.b ? hjrVar.a[(i8 * 5) + 4] : hjrVar.c.length) - e2 > 0 ? hjrVar.c[e2] : hfc.a) instanceof hio) {
                            hfo hfoVar = new hfo(hghVar, hhnVar);
                            d2 = hjrVar.d();
                            try {
                                him.a(d2, a2, hfoVar);
                                d2.A(true);
                                return hhmVar;
                            } finally {
                            }
                        }
                    }
                }
            }
            return hhmVar;
        } finally {
        }
    }

    public static final Void h(String str) {
        throw new hfa(a.a(str, "Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final void i(hjq hjqVar, List list, int i) {
        if (hjqVar.B(i)) {
            list.add(hjqVar.o(i));
            return;
        }
        int i2 = i + 1;
        int c2 = i + hjqVar.c(i);
        while (i2 < c2) {
            i(hjqVar, list, i2);
            i2 += hjqVar.c(i2);
        }
    }

    public static final void j(String str) {
        throw new hfa(a.a(str, "Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final void k(hjv hjvVar, hjj hjjVar) {
        int i;
        int[] iArr = hjvVar.b;
        int i2 = hjvVar.q;
        int c2 = hjvVar.c(iArr, hjvVar.h(i2 + hjvVar.j(i2)));
        for (int c3 = hjvVar.c(hjvVar.b, hjvVar.h(hjvVar.q)); c3 < c2; c3++) {
            Object obj = hjvVar.c[hjvVar.d(c3)];
            int i3 = -1;
            if (obj instanceof hez) {
                ((hqe) hjjVar).d((hez) obj, hjvVar.g() - c3, -1, -1);
            } else if (obj instanceof hjl) {
                hjl hjlVar = (hjl) obj;
                if (!(hjlVar.a instanceof hfe)) {
                    o(hjvVar, c3, obj);
                    int g = hjvVar.g() - c3;
                    hen henVar = hjlVar.b;
                    if (henVar == null || !henVar.a()) {
                        i = -1;
                    } else {
                        i3 = hjvVar.a(henVar);
                        i = hjvVar.g() - hjvVar.p(i3);
                    }
                    ((hqe) hjjVar).d(hjlVar, g, i3, i);
                }
            } else if (obj instanceof hio) {
                o(hjvVar, c3, obj);
                ((hio) obj).b();
            }
        }
    }

    public static final void l(hjv hjvVar, hjj hjjVar) {
        int i;
        int[] iArr = hjvVar.b;
        int i2 = hjvVar.q;
        int c2 = hjvVar.c(iArr, hjvVar.h(i2 + hjvVar.j(i2)));
        for (int c3 = hjvVar.c(hjvVar.b, hjvVar.h(hjvVar.q)); c3 < c2; c3++) {
            Object obj = hjvVar.c[hjvVar.d(c3)];
            int i3 = -1;
            if (obj instanceof hez) {
                int g = hjvVar.g() - c3;
                hez hezVar = (hez) obj;
                hqe hqeVar = (hqe) hjjVar;
                coq coqVar = hqeVar.b;
                if (coqVar == null) {
                    int i4 = cpj.a;
                    coqVar = new coq((byte[]) null);
                    hqeVar.b = coqVar;
                }
                coqVar.e(hezVar);
                hqeVar.d(hezVar, g, -1, -1);
            }
            if (obj instanceof hjl) {
                int g2 = hjvVar.g() - c3;
                hjl hjlVar = (hjl) obj;
                hen henVar = hjlVar.b;
                if (henVar == null || !henVar.a()) {
                    i = -1;
                } else {
                    i3 = hjvVar.a(henVar);
                    i = hjvVar.g() - hjvVar.p(i3);
                }
                ((hqe) hjjVar).d(hjlVar, g2, i3, i);
            }
            if (obj instanceof hio) {
                ((hio) obj).b();
            }
        }
        hjvVar.U();
    }

    public static final void m(List list, int i, int i2) {
        int c2 = c(list, i);
        while (c2 < list.size() && ((hgy) list.get(c2)).b < i2) {
            list.remove(c2);
        }
    }

    public static final boolean n(int i) {
        return i != 0;
    }

    private static final void o(hjv hjvVar, int i, Object obj) {
        int d2 = hjvVar.d(i);
        Object[] objArr = hjvVar.c;
        Object obj2 = objArr[d2];
        objArr[d2] = hfc.a;
        if (obj == obj2) {
            return;
        }
        j("Slot table is out of sync (expected " + obj + ", got " + obj2 + ')');
    }
}
