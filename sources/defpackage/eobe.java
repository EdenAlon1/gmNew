package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eobe implements Serializable {
    public static final double a;
    private static final long serialVersionUID = 1;
    protected final eoai b;
    protected final List c;
    public volatile boolean d;
    private List e;
    private int f;
    private final List g;

    static {
        double d = enyd.a + 4.996003610813204E-16d;
        a = d + d;
    }

    public eobe() {
        eoai eoaiVar = new eoai();
        int i = engw.d;
        this.e = enou.a;
        this.f = 0;
        this.g = new ArrayList();
        this.d = true;
        this.b = eoaiVar;
        this.c = new ArrayList();
    }

    static final List b(int i) {
        return i < 256 ? new eobd(i) : new eobc(i);
    }

    static void e(enyq enyqVar, List list, eoag eoagVar) {
        List list2;
        int i;
        int i2;
        eobb eoaoVar;
        enyq enyqVar2 = enyqVar;
        List list3 = list;
        if (list3.isEmpty() && eoagVar.b.e == 0) {
            return;
        }
        int size = list3.size();
        eoai eoaiVar = eoagVar.a;
        int i3 = eoaiVar.a;
        if (size > 10) {
            double d = eoaiVar.b;
            int max = Math.max(10, (int) ((list3.size() + eoagVar.b.e) * 0.2d));
            Iterator it = list3.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                i4 += enyqVar2.f < ((eoad) it.next()).a.c ? 1 : 0;
                if (i4 > max) {
                    int size2 = list3.size();
                    List b = b(size2);
                    List b2 = b(size2);
                    List b3 = b(size2);
                    List b4 = b(size2);
                    engw u = engw.u(b, b2, b3, b4);
                    int i5 = eoagVar.d.a;
                    enxp a2 = enyqVar2.a();
                    int i6 = 0;
                    while (i6 < size2) {
                        eoad eoadVar = (eoad) list3.get(i6);
                        enxp enxpVar = eoadVar.b;
                        enxo enxoVar = enxpVar.a;
                        enxo enxoVar2 = a2.a;
                        engw engwVar = u;
                        int i7 = i5;
                        if (enxoVar.b <= enxoVar2.a) {
                            i(eoadVar, a2.b, b, b2, eoagVar.d);
                        } else {
                            double d2 = enxoVar.a;
                            double d3 = enxoVar2.b;
                            if (d2 >= d3) {
                                i(eoadVar, a2.b, b3, b4, eoagVar.d);
                            } else {
                                enxo enxoVar3 = enxpVar.b;
                                enxo enxoVar4 = a2.b;
                                if (enxoVar3.b <= enxoVar4.a) {
                                    b.add(f(eoadVar, true, d3, eoagVar.d));
                                    b3.add(f(eoadVar, false, a2.a.a, eoagVar.d));
                                } else if (enxoVar3.a >= enxoVar4.b) {
                                    b2.add(f(eoadVar, true, d3, eoagVar.d));
                                    b4.add(f(eoadVar, false, a2.a.a, eoagVar.d));
                                } else {
                                    i(f(eoadVar, true, d3, eoagVar.d), a2.b, b, b2, eoagVar.d);
                                    i(f(eoadVar, false, a2.a.a, eoagVar.d), a2.b, b3, b4, eoagVar.d);
                                }
                            }
                        }
                        i6++;
                        list3 = list;
                        u = engwVar;
                        i5 = i7;
                    }
                    engw engwVar2 = u;
                    int i8 = i5;
                    int i9 = 0;
                    while (i9 < 4) {
                        engw engwVar3 = engwVar2;
                        List list4 = (List) engwVar3.get(enxw.a(enyqVar.e, i9));
                        if (!list4.isEmpty() || eoagVar.b.e > 0) {
                            int a3 = enxw.a(enyqVar.e, i9);
                            e(new enyq(enyqVar, i9, a3 >> 1, a3 & 1), list4, eoagVar);
                        }
                        i9++;
                        engwVar2 = engwVar3;
                    }
                    eoagVar.d.a = i8;
                    return;
                }
                list3 = list;
            }
        }
        int i10 = 2;
        if (eoagVar.b.a && !list.isEmpty()) {
            if (enyqVar2.a.y().d != eoagVar.b.c.d) {
                eoah eoahVar = eoagVar.b;
                int i11 = enyqVar2.c;
                int i12 = enyqVar2.d;
                if ((enyqVar2.e & 2) != 0) {
                    int g = enxz.g(enyqVar2.f);
                    i11 += g;
                    i12 += g;
                }
                long j = i12;
                long j2 = i11;
                eoahVar.b = enyr.m(enzn.h(enyqVar2.a.b(), j2 + j2, j + j));
            }
            eoah eoahVar2 = eoagVar.b;
            int i13 = enyqVar2.f;
            int i14 = enyqVar2.c;
            long j3 = enyqVar2.d;
            int b5 = enyqVar2.a.b();
            long j4 = i14;
            long g2 = enxz.g(i13);
            eoahVar2.a(enyr.m(enzn.h(b5, j4 + j4 + g2, j3 + j3 + g2)));
            k(list, eoagVar);
        }
        enxz enxzVar = enyqVar2.a;
        int size3 = list.size();
        int size4 = eoagVar.e.size();
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (true) {
            if (i16 >= size3 && i15 >= eoagVar.b.e) {
                break;
            }
            if (i16 < size3) {
                list2 = list;
                i = ((eoad) list2.get(i16)).a.a;
            } else {
                list2 = list;
                i = size4;
            }
            eoah eoahVar3 = eoagVar.b;
            int i18 = i15 < eoahVar3.e ? eoahVar3.d[i15] : size4;
            if (i18 < i) {
                i15++;
                eoaoVar = enxzVar != null ? new eoaj(i18, enxzVar.d) : new eoak(i18);
                i2 = size3;
            } else {
                int i19 = i16;
                while (i19 < size3 && ((eoad) list2.get(i19)).a.a == i) {
                    i19++;
                }
                int i20 = i19 - i16;
                if (i20 == 1) {
                    int i21 = ((eoad) list2.get(i16)).a.b;
                    i2 = size3;
                    if (enxzVar != null) {
                        long j5 = enxzVar.d;
                        eoaoVar = i18 == i ? new eoaw(i, i21, j5) : new eoax(i, i21, j5);
                    } else {
                        eoaoVar = i18 == i ? new eoay(i, i21) : new eoaz(i, i21);
                    }
                } else {
                    i2 = size3;
                    int i22 = ((eoad) list2.get(i16)).a.b;
                    int i23 = 1;
                    while (true) {
                        if (i23 < i20) {
                            if (i22 + i23 != ((eoad) list2.get(i16 + i23)).a.b) {
                                int[] iArr = new int[i20];
                                for (int i24 = 0; i24 < i20; i24++) {
                                    iArr[i24] = ((eoad) list2.get(i24 + i16)).a.b;
                                }
                                if (enxzVar != null) {
                                    long j6 = enxzVar.d;
                                    eoaoVar = i18 == i ? new eoar(i, iArr, j6) : new eoas(i, iArr, j6);
                                } else {
                                    eoaoVar = i18 == i ? new eoat(i, iArr) : new eoau(i, iArr);
                                }
                            } else {
                                i23++;
                            }
                        } else if (enxzVar != null) {
                            long j7 = enxzVar.d;
                            eoaoVar = i18 == i ? new eoam(i, i22, i20, j7) : new eoan(i, i22, i20, j7);
                        } else {
                            eoaoVar = i18 == i ? new eoao(i, i22, i20) : new eoap(i, i22, i20);
                        }
                    }
                }
                if (i18 == i) {
                    i15++;
                }
                i16 = i19;
            }
            eoagVar.c[i17] = eoaoVar;
            enxzVar = null;
            enyqVar2 = enyqVar;
            i17++;
            size3 = i2;
            i10 = 2;
        }
        Consumer consumer = eoagVar.f;
        eobb[] eobbVarArr = eoagVar.c;
        consumer.o(i17 != 1 ? i17 != i10 ? new eoab((eobb[]) Arrays.copyOf(eobbVarArr, i17)) : new eoaa(eobbVarArr[0], eobbVarArr[1]) : eobbVarArr[0]);
        if (!eoagVar.b.a || list.isEmpty()) {
            return;
        }
        eoah eoahVar4 = eoagVar.b;
        int i25 = enyqVar2.c;
        int i26 = enyqVar2.d;
        int i27 = enyqVar2.f;
        int i28 = enyqVar2.e;
        int g3 = enxz.g(i27);
        if (i28 == 0 || i28 == 3) {
            i25 += g3;
        } else {
            i26 += g3;
        }
        long j8 = i26;
        long j9 = i25;
        eoahVar4.a(enyr.m(enzn.h(enyqVar2.a.b(), j9 + j9, j8 + j8)));
        k(list, eoagVar);
        eoagVar.b.c = enyqVar2.a.x().v();
    }

    private static eoad f(eoad eoadVar, boolean z, double d, eoae eoaeVar) {
        if (z ? eoadVar.b.a.b <= d : eoadVar.b.a.a >= d) {
            return eoadVar;
        }
        eoaf eoafVar = eoadVar.a;
        return h(eoadVar, z, d, (((eoafVar.d > eoafVar.f ? 1 : (eoafVar.d == eoafVar.f ? 0 : -1)) > 0) != ((eoafVar.e > eoafVar.g ? 1 : (eoafVar.e == eoafVar.g ? 0 : -1)) > 0)) ^ z, eoadVar.b.b.a(enyd.b(d, eoafVar.d, eoafVar.f, eoafVar.e, eoafVar.g)), eoaeVar);
    }

    private static eoad g(eoad eoadVar, boolean z, double d, eoae eoaeVar) {
        if (z ? eoadVar.b.b.b <= d : eoadVar.b.b.a >= d) {
            return eoadVar;
        }
        eoaf eoafVar = eoadVar.a;
        return h(eoadVar, (((eoafVar.d > eoafVar.f ? 1 : (eoafVar.d == eoafVar.f ? 0 : -1)) > 0) != ((eoafVar.e > eoafVar.g ? 1 : (eoafVar.e == eoafVar.g ? 0 : -1)) > 0)) ^ z, eoadVar.b.a.a(enyd.b(d, eoafVar.e, eoafVar.g, eoafVar.d, eoafVar.f)), z, d, eoaeVar);
    }

    private static eoad h(eoad eoadVar, boolean z, double d, boolean z2, double d2, eoae eoaeVar) {
        if (eoaeVar.a == eoaeVar.b.size()) {
            eoaeVar.b.add(new eoad());
        }
        List list = eoaeVar.b;
        int i = eoaeVar.a;
        eoaeVar.a = i + 1;
        eoad eoadVar2 = (eoad) list.get(i);
        eoadVar2.a = eoadVar.a;
        if (z) {
            eoadVar2.b.a.e(eoadVar.b.a.a, d);
        } else {
            eoadVar2.b.a.e(d, eoadVar.b.a.b);
        }
        if (z2) {
            eoadVar2.b.b.e(eoadVar.b.b.a, d2);
            return eoadVar2;
        }
        eoadVar2.b.b.e(d2, eoadVar.b.b.b);
        return eoadVar2;
    }

    private static void i(eoad eoadVar, enxo enxoVar, List list, List list2, eoae eoaeVar) {
        enxo enxoVar2 = eoadVar.b.b;
        if (enxoVar2.b <= enxoVar.a) {
            list.add(eoadVar);
            return;
        }
        double d = enxoVar2.a;
        double d2 = enxoVar.b;
        if (d >= d2) {
            list2.add(eoadVar);
        } else {
            list.add(g(eoadVar, true, d2, eoaeVar));
            list2.add(g(eoadVar, false, enxoVar.a, eoaeVar));
        }
    }

    private static void j(enxz enxzVar, enxz enxzVar2, eoag eoagVar) {
        if (eoagVar.b.e > 0) {
            enya enyaVar = new enya();
            enyaVar.a.clear();
            while (enxzVar.compareTo(enxzVar2) < 0) {
                long j = enxzVar.d;
                while (!enxz.F(j) && enxz.p(enxz.n(j)) == enxzVar.d && enxz.M(enxz.o(enxz.n(j)), enxzVar2.d)) {
                    j = enxz.n(j);
                }
                enxz enxzVar3 = new enxz(j);
                enyaVar.a.add(enxzVar3);
                enxzVar = enxzVar3.x().v();
            }
            int i = engw.d;
            engw engwVar = enou.a;
            for (int i2 = 0; i2 < enyaVar.b(); i2++) {
                e(new enyq((enxz) enyaVar.a.get(i2), a), engwVar, eoagVar);
            }
        }
    }

    private static void k(List list, eoag eoagVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            eoaf eoafVar = ((eoad) it.next()).a;
            ((enzy) eoagVar.e.get(eoafVar.a)).p();
            eoagVar.b.b(eoafVar.a, eoafVar.h, eoafVar.i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x02c6 A[Catch: all -> 0x031c, TryCatch #1 {all -> 0x031c, blocks: (B:64:0x0194, B:69:0x030f, B:72:0x01ab, B:74:0x01b6, B:76:0x01fa, B:79:0x030c, B:80:0x020e, B:82:0x0216, B:84:0x0220, B:86:0x025a, B:88:0x02c6, B:89:0x02db, B:91:0x02e5, B:92:0x02c9, B:93:0x0228, B:94:0x022d, B:96:0x0243, B:99:0x02d8), top: B:63:0x0194 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02e5 A[Catch: all -> 0x031c, TryCatch #1 {all -> 0x031c, blocks: (B:64:0x0194, B:69:0x030f, B:72:0x01ab, B:74:0x01b6, B:76:0x01fa, B:79:0x030c, B:80:0x020e, B:82:0x0216, B:84:0x0220, B:86:0x025a, B:88:0x02c6, B:89:0x02db, B:91:0x02e5, B:92:0x02c9, B:93:0x0228, B:94:0x022d, B:96:0x0243, B:99:0x02d8), top: B:63:0x0194 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02c9 A[Catch: all -> 0x031c, TryCatch #1 {all -> 0x031c, blocks: (B:64:0x0194, B:69:0x030f, B:72:0x01ab, B:74:0x01b6, B:76:0x01fa, B:79:0x030c, B:80:0x020e, B:82:0x0216, B:84:0x0220, B:86:0x025a, B:88:0x02c6, B:89:0x02db, B:91:0x02e5, B:92:0x02c9, B:93:0x0228, B:94:0x022d, B:96:0x0243, B:99:0x02d8), top: B:63:0x0194 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.enyi a() {
        /*
            Method dump skipped, instructions count: 826
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eobe.a():enyi");
    }

    public final void c(enzy enzyVar) {
        this.c.add(enzyVar);
        this.d = false;
    }

    public final void d() {
        int i = engw.d;
        this.e = enou.a;
        this.g.clear();
        this.c.clear();
        this.d = false;
        this.f = 0;
    }
}
