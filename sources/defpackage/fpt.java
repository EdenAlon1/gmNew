package defpackage;

import androidx.car.app.model.Alert;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fpt implements ipn {
    public final float a;
    public final ebe b;

    public fpt(float f, ebe ebeVar) {
        this.a = f;
        this.b = ebeVar;
    }

    private final int f(iny inyVar, List list, int i, ffjm ffjmVar) {
        Object obj;
        Object obj2;
        int i2;
        int i3;
        int i4;
        Object obj3;
        int i5;
        Object obj4;
        int size = list.size();
        int i6 = 0;
        while (true) {
            obj = null;
            if (i6 >= size) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i6);
            if (ffkj.e(fpi.c((inx) obj2), "Leading")) {
                break;
            }
            i6++;
        }
        inx inxVar = (inx) obj2;
        if (inxVar != null) {
            i2 = i;
            i4 = fpn.c(i2, inxVar.b(Alert.DURATION_SHOW_INDEFINITELY));
            i3 = ((Number) ffjmVar.a(inxVar, Integer.valueOf(i2))).intValue();
        } else {
            i2 = i;
            i3 = 0;
            i4 = i2;
        }
        int size2 = list.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size2) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i7);
            if (ffkj.e(fpi.c((inx) obj3), "Trailing")) {
                break;
            }
            i7++;
        }
        inx inxVar2 = (inx) obj3;
        if (inxVar2 != null) {
            i4 = fpn.c(i4, inxVar2.b(Alert.DURATION_SHOW_INDEFINITELY));
            i5 = ((Number) ffjmVar.a(inxVar2, Integer.valueOf(i2))).intValue();
        } else {
            i5 = 0;
        }
        int size3 = list.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size3) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i8);
            if (ffkj.e(fpi.c((inx) obj4), "Label")) {
                break;
            }
            i8++;
        }
        Object obj5 = (inx) obj4;
        int intValue = obj5 != null ? ((Number) ffjmVar.a(obj5, Integer.valueOf(i4))).intValue() : 0;
        int size4 = list.size();
        for (int i9 = 0; i9 < size4; i9++) {
            Object obj6 = list.get(i9);
            if (ffkj.e(fpi.c((inx) obj6), "TextField")) {
                int intValue2 = ((Number) ffjmVar.a(obj6, Integer.valueOf(i4))).intValue();
                int size5 = list.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size5) {
                        break;
                    }
                    Object obj7 = list.get(i10);
                    if (ffkj.e(fpi.c((inx) obj7), "Hint")) {
                        obj = obj7;
                        break;
                    }
                    i10++;
                }
                Object obj8 = (inx) obj;
                return fpn.a(intValue2, intValue > 0, intValue, i3, i5, obj8 != null ? ((Number) ffjmVar.a(obj8, Integer.valueOf(i4))).intValue() : 0, jzl.k(0, 0, 0, 15), inyVar.ec(), this.b);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private static final int g(List list, int i, ffjm ffjmVar) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj5 = list.get(i2);
            if (ffkj.e(fpi.c((inx) obj5), "TextField")) {
                int intValue = ((Number) ffjmVar.a(obj5, Integer.valueOf(i))).intValue();
                int size2 = list.size();
                int i3 = 0;
                while (true) {
                    obj = null;
                    if (i3 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i3);
                    if (ffkj.e(fpi.c((inx) obj2), "Label")) {
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
                    if (ffkj.e(fpi.c((inx) obj3), "Trailing")) {
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
                    if (ffkj.e(fpi.c((inx) obj4), "Leading")) {
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
                        break;
                    }
                    Object obj6 = list.get(i6);
                    if (ffkj.e(fpi.c((inx) obj6), "Hint")) {
                        obj = obj6;
                        break;
                    }
                    i6++;
                }
                inx inxVar4 = (inx) obj;
                return fpn.b(intValue4, intValue3, intValue, intValue2, inxVar4 != null ? ((Number) ffjmVar.a(inxVar4, Integer.valueOf(i))).intValue() : 0, jzl.k(0, 0, 0, 15));
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // defpackage.ipn
    public final int a(iny inyVar, List list, int i) {
        return f(inyVar, list, i, fpo.a);
    }

    @Override // defpackage.ipn
    public final int b(iny inyVar, List list, int i) {
        return g(list, i, fpp.a);
    }

    @Override // defpackage.ipn
    public final int c(iny inyVar, List list, int i) {
        return f(inyVar, list, i, fpr.a);
    }

    @Override // defpackage.ipn
    public final int d(iny inyVar, List list, int i) {
        return g(list, i, fps.a);
    }

    @Override // defpackage.ipn
    public final ipo e(ipq ipqVar, List list, long j) {
        Object obj;
        Object obj2;
        int i;
        Object obj3;
        int i2;
        Object obj4;
        ipo ei;
        fpt fptVar = this;
        List list2 = list;
        int eo = ipqVar.eo(((ebf) fptVar.b).a);
        int eo2 = ipqVar.eo(((ebf) fptVar.b).b);
        int eo3 = ipqVar.eo(2.0f);
        long m = jzk.m(j, 0, 0, 0, 0, 10);
        int size = list2.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                obj = null;
                break;
            }
            obj = list2.get(i3);
            if (ffkj.e(ioe.b((ipl) obj), "Leading")) {
                break;
            }
            i3++;
        }
        ipl iplVar = (ipl) obj;
        iqk e = iplVar != null ? iplVar.e(m) : null;
        int b = fpi.b(e);
        int size2 = list2.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list2.get(i4);
            if (ffkj.e(ioe.b((ipl) obj2), "Trailing")) {
                break;
            }
            i4++;
        }
        ipl iplVar2 = (ipl) obj2;
        iqk e2 = iplVar2 != null ? iplVar2.e(jzl.l(m, -b, 0, 2)) : null;
        int i5 = -eo2;
        int i6 = -(b + fpi.b(e2));
        long h = jzl.h(m, i6, i5);
        int size3 = list2.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size3) {
                i = eo2;
                obj3 = null;
                break;
            }
            obj3 = list2.get(i7);
            i = eo2;
            if (ffkj.e(ioe.b((ipl) obj3), "Label")) {
                break;
            }
            i7++;
            eo2 = i;
        }
        ipl iplVar3 = (ipl) obj3;
        iqk e3 = iplVar3 != null ? iplVar3.e(h) : null;
        if (e3 != null) {
            i2 = e3.eh(imt.b);
            if (i2 == Integer.MIN_VALUE) {
                i2 = e3.b;
            }
        } else {
            i2 = 0;
        }
        int max = Math.max(i2, eo);
        boolean z = e3 == null;
        long h2 = jzl.h(jzk.m(j, 0, 0, 0, 0, 11), i6, e3 != null ? (i5 - eo3) - max : (-eo) - i);
        int size4 = list2.size();
        int i8 = 0;
        while (i8 < size4) {
            ipl iplVar4 = (ipl) list2.get(i8);
            iqk iqkVar = e3;
            if (ffkj.e(ioe.b(iplVar4), "TextField")) {
                iqk e4 = iplVar4.e(h2);
                long m2 = jzk.m(h2, 0, 0, 0, 0, 14);
                int size5 = list2.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size5) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list2.get(i9);
                    if (ffkj.e(ioe.b((ipl) obj4), "Hint")) {
                        break;
                    }
                    i9++;
                    list2 = list;
                }
                ipl iplVar5 = (ipl) obj4;
                iqk e5 = iplVar5 != null ? iplVar5.e(m2) : null;
                int b2 = fpn.b(fpi.b(e), fpi.b(e2), e4.a, fpi.b(iqkVar), fpi.b(e5), j);
                int a = fpn.a(e4.b, !z, max, fpi.a(e), fpi.a(e2), fpi.a(e5), j, ipqVar.ec(), fptVar.b);
                ei = ipqVar.ei(b2, a, ffem.a, new fpq(iqkVar, eo, i2, b2, a, e4, e5, e, e2, fptVar, max, eo3, ipqVar));
                return ei;
            }
            e3 = iqkVar;
            i8++;
            fptVar = this;
            list2 = list;
            e = e;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
