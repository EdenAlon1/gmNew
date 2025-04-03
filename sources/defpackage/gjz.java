package defpackage;

import androidx.car.app.model.Alert;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gjz implements ipn {
    public final boolean a;
    public final gqz b;
    public final ebe c;
    public final float d;
    private final ffji e;
    private final hbe f;

    public gjz(ffji ffjiVar, boolean z, gqz gqzVar, hbe hbeVar, ebe ebeVar, float f) {
        this.e = ffjiVar;
        this.a = z;
        this.b = gqzVar;
        this.f = hbeVar;
        this.c = ebeVar;
        this.d = f;
    }

    public static final int f(int i, gjz gjzVar, int i2, int i3, iqk iqkVar, iqk iqkVar2) {
        if (gjzVar.a) {
            int i4 = huo.a;
            i3 = hum.n.a(iqkVar2.b, i2);
        }
        return Math.max(i3, hbm.a(iqkVar) / 2);
    }

    private final int g(jzn jznVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, float f) {
        int i8 = i3 + i4;
        return jzl.c(j, Math.max(i + Math.max(i5 + i8, Math.max(i7 + i8, kav.c(i6, 0, f))) + i2, ffln.b((i6 + jznVar.em(this.c.b(kah.a) + this.c.c(kah.a))) * f)));
    }

    private final int h(iny inyVar, List list, int i, ffjm ffjmVar) {
        Object obj;
        int i2;
        int i3;
        Object obj2;
        int i4;
        Object obj3;
        Object obj4;
        int i5;
        Object obj5;
        int i6;
        Object obj6;
        Object obj7;
        gjz gjzVar = this;
        float a = gjzVar.f.a();
        int size = list.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i7);
            if (ffkj.e(hbm.d((inx) obj), "Leading")) {
                break;
            }
            i7++;
        }
        inx inxVar = (inx) obj;
        if (inxVar != null) {
            i2 = hbm.c(i, inxVar.b(Alert.DURATION_SHOW_INDEFINITELY));
            i3 = ((Number) ffjmVar.a(inxVar, Integer.valueOf(i))).intValue();
        } else {
            i2 = i;
            i3 = 0;
        }
        int size2 = list.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i8);
            if (ffkj.e(hbm.d((inx) obj2), "Trailing")) {
                break;
            }
            i8++;
        }
        inx inxVar2 = (inx) obj2;
        if (inxVar2 != null) {
            i2 = hbm.c(i2, inxVar2.b(Alert.DURATION_SHOW_INDEFINITELY));
            i4 = ((Number) ffjmVar.a(inxVar2, Integer.valueOf(i))).intValue();
        } else {
            i4 = 0;
        }
        int size3 = list.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i9);
            if (ffkj.e(hbm.d((inx) obj3), "Label")) {
                break;
            }
            i9++;
        }
        Object obj8 = (inx) obj3;
        int intValue = obj8 != null ? ((Number) ffjmVar.a(obj8, Integer.valueOf(kav.c(i2, i, a)))).intValue() : 0;
        int size4 = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i10);
            if (ffkj.e(hbm.d((inx) obj4), "Prefix")) {
                break;
            }
            i10++;
        }
        inx inxVar3 = (inx) obj4;
        if (inxVar3 != null) {
            i5 = ((Number) ffjmVar.a(inxVar3, Integer.valueOf(i2))).intValue();
            i2 = hbm.c(i2, inxVar3.b(Alert.DURATION_SHOW_INDEFINITELY));
        } else {
            i5 = 0;
        }
        int size5 = list.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i11);
            if (ffkj.e(hbm.d((inx) obj5), "Suffix")) {
                break;
            }
            i11++;
        }
        inx inxVar4 = (inx) obj5;
        if (inxVar4 != null) {
            i6 = ((Number) ffjmVar.a(inxVar4, Integer.valueOf(i2))).intValue();
            i2 = hbm.c(i2, inxVar4.b(Alert.DURATION_SHOW_INDEFINITELY));
        } else {
            i6 = 0;
        }
        int size6 = list.size();
        int i12 = 0;
        while (i12 < size6) {
            Object obj9 = list.get(i12);
            if (ffkj.e(hbm.d((inx) obj9), "TextField")) {
                int intValue2 = ((Number) ffjmVar.a(obj9, Integer.valueOf(i2))).intValue();
                int size7 = list.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i13);
                    if (ffkj.e(hbm.d((inx) obj6), "Hint")) {
                        break;
                    }
                    i13++;
                }
                Object obj10 = (inx) obj6;
                int intValue3 = obj10 != null ? ((Number) ffjmVar.a(obj10, Integer.valueOf(i2))).intValue() : 0;
                int size8 = list.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i14);
                    if (ffkj.e(hbm.d((inx) obj7), "Supporting")) {
                        break;
                    }
                    i14++;
                }
                Object obj11 = (inx) obj7;
                return gjzVar.j(inyVar, i3, i4, i5, i6, intValue2, intValue, intValue3, obj11 != null ? ((Number) ffjmVar.a(obj11, Integer.valueOf(i))).intValue() : 0, jzl.k(0, 0, 0, 15), a);
            }
            i12++;
            i6 = i6;
            gjzVar = this;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final int i(iny inyVar, List list, int i, ffjm ffjmVar) {
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
                    if (ffkj.e(hbm.d((inx) obj4), "Leading")) {
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
                    if (ffkj.e(hbm.d((inx) obj5), "Prefix")) {
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
                    if (ffkj.e(hbm.d((inx) obj6), "Suffix")) {
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
                return g(inyVar, intValue4, intValue3, intValue5, intValue6, intValue, intValue2, inxVar6 != null ? ((Number) ffjmVar.a(inxVar6, Integer.valueOf(i))).intValue() : 0, jzl.k(0, 0, 0, 15), this.f.a());
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final int j(jzn jznVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, float f) {
        int b = ffgh.b(i5, i7, i3, i4, kav.c(i6, 0, f));
        float em = jznVar.em(((ebf) this.c).a);
        return jzl.b(j, Math.max(i, Math.max(i2, ffln.b(kav.b(em, Math.max(em, i6 / 2.0f), f) + b + jznVar.em(((ebf) this.c).b)))) + i8);
    }

    @Override // defpackage.ipn
    public final int a(iny inyVar, List list, int i) {
        return h(inyVar, list, i, gju.a);
    }

    @Override // defpackage.ipn
    public final int b(iny inyVar, List list, int i) {
        return i(inyVar, list, i, gjv.a);
    }

    @Override // defpackage.ipn
    public final int c(iny inyVar, List list, int i) {
        return h(inyVar, list, i, gjx.a);
    }

    @Override // defpackage.ipn
    public final int d(iny inyVar, List list, int i) {
        return i(inyVar, list, i, gjy.a);
    }

    @Override // defpackage.ipn
    public final ipo e(ipq ipqVar, List list, long j) {
        Object obj;
        Object obj2;
        Object obj3;
        int i;
        int i2;
        iqk iqkVar;
        Object obj4;
        int i3;
        iqk iqkVar2;
        Object obj5;
        List list2;
        Object obj6;
        Object obj7;
        ipo ei;
        ebe ebeVar = this.c;
        float a = this.f.a();
        int eo = ipqVar.eo(((ebf) ebeVar).b);
        int i4 = -eo;
        long m = jzk.m(j, 0, 0, 0, 0, 10);
        int size = list.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i5);
            if (ffkj.e(ioe.b((ipl) obj), "Leading")) {
                break;
            }
            i5++;
        }
        ipl iplVar = (ipl) obj;
        iqk e = iplVar != null ? iplVar.e(m) : null;
        int b = hbm.b(e);
        int max = Math.max(0, hbm.a(e));
        int size2 = list.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i6);
            if (ffkj.e(ioe.b((ipl) obj2), "Trailing")) {
                break;
            }
            i6++;
        }
        ipl iplVar2 = (ipl) obj2;
        iqk e2 = iplVar2 != null ? iplVar2.e(jzl.l(m, -b, 0, 2)) : null;
        int b2 = b + hbm.b(e2);
        int max2 = Math.max(max, hbm.a(e2));
        int size3 = list.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i7);
            if (ffkj.e(ioe.b((ipl) obj3), "Prefix")) {
                break;
            }
            i7++;
        }
        ipl iplVar3 = (ipl) obj3;
        if (iplVar3 != null) {
            i = eo;
            i2 = i4;
            iqkVar = iplVar3.e(jzl.l(m, -b2, 0, 2));
        } else {
            i = eo;
            i2 = i4;
            iqkVar = null;
        }
        int b3 = b2 + hbm.b(iqkVar);
        int max3 = Math.max(max2, hbm.a(iqkVar));
        int size4 = list.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i8);
            if (ffkj.e(ioe.b((ipl) obj4), "Suffix")) {
                break;
            }
            i8++;
        }
        ipl iplVar4 = (ipl) obj4;
        if (iplVar4 != null) {
            i3 = b3;
            iqkVar2 = iplVar4.e(jzl.l(m, -b3, 0, 2));
        } else {
            i3 = b3;
            iqkVar2 = null;
        }
        int b4 = i3 + hbm.b(iqkVar2);
        int max4 = Math.max(max3, hbm.a(iqkVar2));
        int size5 = list.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i9);
            if (ffkj.e(ioe.b((ipl) obj5), "Label")) {
                break;
            }
            i9++;
        }
        ipl iplVar5 = (ipl) obj5;
        fflb fflbVar = new fflb();
        int eo2 = ipqVar.eo(this.c.b(ipqVar.q())) + ipqVar.eo(this.c.c(ipqVar.q()));
        fflbVar.a = iplVar5 != null ? iplVar5.e(jzl.h(m, -kav.c(b4 + eo2, eo2, a), i2)) : null;
        this.e.invoke(new iar(((iqk) fflbVar.a) != null ? ias.a(r5.a, r5.b) : 0L));
        int size6 = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size6) {
                list2 = list;
                obj6 = null;
                break;
            }
            list2 = list;
            obj6 = list2.get(i10);
            if (ffkj.e(ioe.b((ipl) obj6), "Supporting")) {
                break;
            }
            i10++;
        }
        ipl iplVar6 = (ipl) obj6;
        int c = iplVar6 != null ? iplVar6.c(jzk.d(j)) : 0;
        int max5 = Math.max(hbm.a((iqk) fflbVar.a) / 2, ipqVar.eo(((ebf) this.c).a));
        long j2 = j;
        long m2 = jzk.m(jzl.h(j2, -b4, (i2 - max5) - c), 0, 0, 0, 0, 11);
        int size7 = list2.size();
        int i11 = 0;
        while (i11 < size7) {
            int i12 = i11;
            ipl iplVar7 = (ipl) list2.get(i11);
            int i13 = max5;
            if (ffkj.e(ioe.b(iplVar7), "TextField")) {
                iqk e3 = iplVar7.e(m2);
                long m3 = jzk.m(m2, 0, 0, 0, 0, 14);
                int size8 = list2.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list2.get(i14);
                    int i15 = size8;
                    int i16 = i14;
                    if (ffkj.e(ioe.b((ipl) obj7), "Hint")) {
                        break;
                    }
                    i14 = i16 + 1;
                    size8 = i15;
                }
                ipl iplVar8 = (ipl) obj7;
                iqk e4 = iplVar8 != null ? iplVar8.e(m3) : null;
                int max6 = Math.max(max4, Math.max(hbm.a(e3), hbm.a(e4)) + i13 + i);
                fflb fflbVar2 = fflbVar;
                int g = g(ipqVar, hbm.b(e), hbm.b(e2), hbm.b(iqkVar), hbm.b(iqkVar2), e3.a, hbm.b((iqk) fflbVar.a), hbm.b(e4), j2, a);
                int i17 = g;
                iqk e5 = iplVar6 != null ? iplVar6.e(jzk.m(jzl.l(m, 0, -max6, 1), 0, g, 0, 0, 9)) : null;
                int a2 = hbm.a(e5);
                int j3 = j(ipqVar, hbm.a(e), hbm.a(e2), hbm.a(iqkVar), hbm.a(iqkVar2), e3.b, hbm.a((iqk) fflbVar2.a), hbm.a(e4), hbm.a(e5), j, a);
                int i18 = j3 - a2;
                int size9 = list.size();
                int i19 = 0;
                while (i19 < size9) {
                    ipl iplVar9 = (ipl) list.get(i19);
                    if (ffkj.e(ioe.b(iplVar9), "Container")) {
                        iqk e6 = iplVar9.e(jzl.d(i17 != Integer.MAX_VALUE ? i17 : 0, i17, i18 != Integer.MAX_VALUE ? i18 : 0, i18));
                        int i20 = i17;
                        ei = ipqVar.ei(i20, j3, ffem.a, new gjw(this, j3, i20, e, e2, iqkVar, iqkVar2, e3, fflbVar2, e4, e6, e5, ipqVar, a));
                        return ei;
                    }
                    i19++;
                    i17 = i17;
                    e5 = e5;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            fflbVar = fflbVar;
            max5 = i13;
            j2 = j;
            m = m;
            i11 = i12 + 1;
            list2 = list2;
            m2 = m2;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
