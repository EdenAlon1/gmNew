package defpackage;

import androidx.car.app.model.Alert;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class grf implements ipn {
    public final boolean a;
    public final gqz b;
    public final ebe c;
    public final float d;
    private final hbe e;

    public grf(boolean z, gqz gqzVar, hbe hbeVar, ebe ebeVar, float f) {
        this.a = z;
        this.b = gqzVar;
        this.e = hbeVar;
        this.c = ebeVar;
        this.d = f;
    }

    public static final int f(grf grfVar, int i, int i2, iqk iqkVar) {
        if (!grfVar.a) {
            return i2;
        }
        int i3 = huo.a;
        return hum.n.a(iqkVar.b, i);
    }

    private final int g(iny inyVar, List list, int i, ffjm ffjmVar) {
        Object obj;
        int i2;
        int i3;
        int i4;
        Object obj2;
        int i5;
        Object obj3;
        Object obj4;
        int i6;
        Object obj5;
        int i7;
        Object obj6;
        Object obj7;
        int size = list.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i8);
            if (ffkj.e(hbm.d((inx) obj), "Leading")) {
                break;
            }
            i8++;
        }
        inx inxVar = (inx) obj;
        if (inxVar != null) {
            i2 = i;
            i4 = hbm.c(i2, inxVar.b(Alert.DURATION_SHOW_INDEFINITELY));
            i3 = ((Number) ffjmVar.a(inxVar, Integer.valueOf(i2))).intValue();
        } else {
            i2 = i;
            i3 = 0;
            i4 = i2;
        }
        int size2 = list.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i9);
            if (ffkj.e(hbm.d((inx) obj2), "Trailing")) {
                break;
            }
            i9++;
        }
        inx inxVar2 = (inx) obj2;
        if (inxVar2 != null) {
            i4 = hbm.c(i4, inxVar2.b(Alert.DURATION_SHOW_INDEFINITELY));
            i5 = ((Number) ffjmVar.a(inxVar2, Integer.valueOf(i2))).intValue();
        } else {
            i5 = 0;
        }
        int size3 = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i10);
            if (ffkj.e(hbm.d((inx) obj3), "Label")) {
                break;
            }
            i10++;
        }
        Object obj8 = (inx) obj3;
        int intValue = obj8 != null ? ((Number) ffjmVar.a(obj8, Integer.valueOf(i4))).intValue() : 0;
        int size4 = list.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i11);
            if (ffkj.e(hbm.d((inx) obj4), "Prefix")) {
                break;
            }
            i11++;
        }
        inx inxVar3 = (inx) obj4;
        if (inxVar3 != null) {
            int intValue2 = ((Number) ffjmVar.a(inxVar3, Integer.valueOf(i4))).intValue();
            i4 = hbm.c(i4, inxVar3.b(Alert.DURATION_SHOW_INDEFINITELY));
            i6 = intValue2;
        } else {
            i6 = 0;
        }
        int size5 = list.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i12);
            if (ffkj.e(hbm.d((inx) obj5), "Suffix")) {
                break;
            }
            i12++;
        }
        inx inxVar4 = (inx) obj5;
        if (inxVar4 != null) {
            int intValue3 = ((Number) ffjmVar.a(inxVar4, Integer.valueOf(i4))).intValue();
            i4 = hbm.c(i4, inxVar4.b(Alert.DURATION_SHOW_INDEFINITELY));
            i7 = intValue3;
        } else {
            i7 = 0;
        }
        int size6 = list.size();
        for (int i13 = 0; i13 < size6; i13++) {
            Object obj9 = list.get(i13);
            if (ffkj.e(hbm.d((inx) obj9), "TextField")) {
                int intValue4 = ((Number) ffjmVar.a(obj9, Integer.valueOf(i4))).intValue();
                int size7 = list.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i14);
                    if (ffkj.e(hbm.d((inx) obj6), "Hint")) {
                        break;
                    }
                    i14++;
                }
                Object obj10 = (inx) obj6;
                int intValue5 = obj10 != null ? ((Number) ffjmVar.a(obj10, Integer.valueOf(i4))).intValue() : 0;
                int size8 = list.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i15);
                    if (ffkj.e(hbm.d((inx) obj7), "Supporting")) {
                        break;
                    }
                    i15++;
                }
                Object obj11 = (inx) obj7;
                return j(inyVar, intValue4, intValue, i3, i5, i6, i7, intValue5, obj11 != null ? ((Number) ffjmVar.a(obj11, Integer.valueOf(i2))).intValue() : 0, jzl.k(0, 0, 0, 15), this.e.a());
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private static final int h(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j) {
        int i8 = i3 + i4;
        return jzl.c(j, i + Math.max(i5 + i8, Math.max(i7 + i8, i6)) + i2);
    }

    private static final int i(List list, int i, ffjm ffjmVar) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj7 = list.get(i2);
            if (ffkj.e(hbm.d((inx) obj7), "TextField")) {
                int intValue = ((Number) ffjmVar.a(obj7, Integer.valueOf(i))).intValue();
                int size2 = list.size();
                int i3 = 0;
                while (true) {
                    obj = null;
                    if (i3 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i3);
                    if (ffkj.e(hbm.d((inx) obj2), "Label")) {
                        break;
                    }
                    i3++;
                }
                inx inxVar = (inx) obj2;
                int intValue2 = inxVar != null ? ((Number) ffjmVar.a(inxVar, Integer.valueOf(i))).intValue() : 0;
                int size3 = list.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i4);
                    if (ffkj.e(hbm.d((inx) obj3), "Trailing")) {
                        break;
                    }
                    i4++;
                }
                inx inxVar2 = (inx) obj3;
                int intValue3 = inxVar2 != null ? ((Number) ffjmVar.a(inxVar2, Integer.valueOf(i))).intValue() : 0;
                int size4 = list.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i5);
                    if (ffkj.e(hbm.d((inx) obj4), "Prefix")) {
                        break;
                    }
                    i5++;
                }
                inx inxVar3 = (inx) obj4;
                int intValue4 = inxVar3 != null ? ((Number) ffjmVar.a(inxVar3, Integer.valueOf(i))).intValue() : 0;
                int size5 = list.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size5) {
                        obj5 = null;
                        break;
                    }
                    obj5 = list.get(i6);
                    if (ffkj.e(hbm.d((inx) obj5), "Suffix")) {
                        break;
                    }
                    i6++;
                }
                inx inxVar4 = (inx) obj5;
                int intValue5 = inxVar4 != null ? ((Number) ffjmVar.a(inxVar4, Integer.valueOf(i))).intValue() : 0;
                int size6 = list.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size6) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i7);
                    if (ffkj.e(hbm.d((inx) obj6), "Leading")) {
                        break;
                    }
                    i7++;
                }
                inx inxVar5 = (inx) obj6;
                int intValue6 = inxVar5 != null ? ((Number) ffjmVar.a(inxVar5, Integer.valueOf(i))).intValue() : 0;
                int size7 = list.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size7) {
                        break;
                    }
                    Object obj8 = list.get(i8);
                    if (ffkj.e(hbm.d((inx) obj8), "Hint")) {
                        obj = obj8;
                        break;
                    }
                    i8++;
                }
                inx inxVar6 = (inx) obj;
                return h(intValue6, intValue3, intValue4, intValue5, intValue, intValue2, inxVar6 != null ? ((Number) ffjmVar.a(inxVar6, Integer.valueOf(i))).intValue() : 0, jzl.k(0, 0, 0, 15));
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final int j(jzn jznVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, float f) {
        ebf ebfVar = (ebf) this.c;
        int eo = jznVar.eo(ebfVar.a + ebfVar.b);
        int i9 = 0;
        int b = ffgh.b(i, i7, i5, i6, kav.c(i2, 0, f));
        if (i2 > 0) {
            float f2 = this.d;
            int eo2 = jznVar.eo(f2 + f2);
            cyh cyhVar = hdz.a;
            i9 = Math.max(eo2, kav.c(0, i2, hdz.a.a(f)));
        }
        return jzl.b(j, Math.max(i3, Math.max(i4, eo + i9 + b)) + i8);
    }

    @Override // defpackage.ipn
    public final int a(iny inyVar, List list, int i) {
        return g(inyVar, list, i, gra.a);
    }

    @Override // defpackage.ipn
    public final int b(iny inyVar, List list, int i) {
        return i(list, i, grb.a);
    }

    @Override // defpackage.ipn
    public final int c(iny inyVar, List list, int i) {
        return g(inyVar, list, i, grd.a);
    }

    @Override // defpackage.ipn
    public final int d(iny inyVar, List list, int i) {
        return i(list, i, gre.a);
    }

    @Override // defpackage.ipn
    public final ipo e(ipq ipqVar, List list, long j) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int i;
        Object obj7;
        ipo ei;
        ebe ebeVar = this.c;
        float a = this.e.a();
        int eo = ipqVar.eo(((ebf) ebeVar).a);
        int eo2 = ipqVar.eo(((ebf) this.c).b);
        long m = jzk.m(j, 0, 0, 0, 0, 10);
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i2);
            if (ffkj.e(ioe.b((ipl) obj), "Leading")) {
                break;
            }
            i2++;
        }
        ipl iplVar = (ipl) obj;
        iqk e = iplVar != null ? iplVar.e(m) : null;
        int b = hbm.b(e);
        int max = Math.max(0, hbm.a(e));
        int size2 = list.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i3);
            if (ffkj.e(ioe.b((ipl) obj2), "Trailing")) {
                break;
            }
            i3++;
        }
        ipl iplVar2 = (ipl) obj2;
        iqk e2 = iplVar2 != null ? iplVar2.e(jzl.l(m, -b, 0, 2)) : null;
        int b2 = b + hbm.b(e2);
        int max2 = Math.max(max, hbm.a(e2));
        int size3 = list.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i4);
            if (ffkj.e(ioe.b((ipl) obj3), "Prefix")) {
                break;
            }
            i4++;
        }
        ipl iplVar3 = (ipl) obj3;
        iqk e3 = iplVar3 != null ? iplVar3.e(jzl.l(m, -b2, 0, 2)) : null;
        int b3 = b2 + hbm.b(e3);
        int max3 = Math.max(max2, hbm.a(e3));
        int size4 = list.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i5);
            if (ffkj.e(ioe.b((ipl) obj4), "Suffix")) {
                break;
            }
            i5++;
        }
        ipl iplVar4 = (ipl) obj4;
        iqk e4 = iplVar4 != null ? iplVar4.e(jzl.l(m, -b3, 0, 2)) : null;
        int b4 = b3 + hbm.b(e4);
        int max4 = Math.max(max3, hbm.a(e4));
        int size5 = list.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i6);
            if (ffkj.e(ioe.b((ipl) obj5), "Label")) {
                break;
            }
            i6++;
        }
        int i7 = -b4;
        ipl iplVar5 = (ipl) obj5;
        fflb fflbVar = new fflb();
        fflbVar.a = iplVar5 != null ? iplVar5.e(jzl.h(m, i7, -eo2)) : null;
        int size6 = list.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size6) {
                obj6 = null;
                break;
            }
            obj6 = list.get(i8);
            if (ffkj.e(ioe.b((ipl) obj6), "Supporting")) {
                break;
            }
            i8++;
        }
        ipl iplVar6 = (ipl) obj6;
        int c = iplVar6 != null ? iplVar6.c(jzk.d(j)) : 0;
        int a2 = hbm.a((iqk) fflbVar.a) + eo;
        long h = jzl.h(jzk.m(j, 0, 0, 0, 0, 11), i7, ((-a2) - eo2) - c);
        int size7 = list.size();
        int i9 = 0;
        while (i9 < size7) {
            ipl iplVar7 = (ipl) list.get(i9);
            int i10 = size7;
            int i11 = eo2;
            if (ffkj.e(ioe.b(iplVar7), "TextField")) {
                iqk e5 = iplVar7.e(h);
                long m2 = jzk.m(h, 0, 0, 0, 0, 14);
                int size8 = list.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size8) {
                        i = a2;
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i12);
                    int i13 = size8;
                    i = a2;
                    if (ffkj.e(ioe.b((ipl) obj7), "Hint")) {
                        break;
                    }
                    i12++;
                    size8 = i13;
                    a2 = i;
                }
                ipl iplVar8 = (ipl) obj7;
                iqk e6 = iplVar8 != null ? iplVar8.e(m2) : null;
                int max5 = Math.max(max4, Math.max(hbm.a(e5), hbm.a(e6)) + i + i11);
                int h2 = h(hbm.b(e), hbm.b(e2), hbm.b(e3), hbm.b(e4), e5.a, hbm.b((iqk) fflbVar.a), hbm.b(e6), j);
                iqk e7 = iplVar6 != null ? iplVar6.e(jzk.m(jzl.l(m, 0, -max5, 1), 0, h2, 0, 0, 9)) : null;
                int a3 = hbm.a(e7);
                fflb fflbVar2 = fflbVar;
                int j2 = j(ipqVar, e5.b, hbm.a((iqk) fflbVar.a), hbm.a(e), hbm.a(e2), hbm.a(e3), hbm.a(e4), hbm.a(e6), hbm.a(e7), j, a);
                int i14 = j2 - a3;
                int size9 = list.size();
                int i15 = 0;
                while (i15 < size9) {
                    ipl iplVar9 = (ipl) list.get(i15);
                    if (ffkj.e(ioe.b(iplVar9), "Container")) {
                        ei = ipqVar.ei(h2, j2, ffem.a, new grc(fflbVar2, this, i14, eo, ipqVar, h2, j2, e5, e6, e, e2, e3, e4, iplVar9.e(jzl.d(h2 != Integer.MAX_VALUE ? h2 : 0, h2, i14 != Integer.MAX_VALUE ? i14 : 0, i14)), e7, a));
                        return ei;
                    }
                    i15++;
                    i14 = i14;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i9++;
            size7 = i10;
            fflbVar = fflbVar;
            h = h;
            eo2 = i11;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
