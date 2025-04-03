package defpackage;

import androidx.car.app.model.Alert;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fma implements ipn {
    public final float a;
    public final ebe b;
    private final ffji c;

    public fma(ffji ffjiVar, float f, ebe ebeVar) {
        this.c = ffjiVar;
        this.a = f;
        this.b = ebeVar;
    }

    private final int f(iny inyVar, List list, int i, ffjm ffjmVar) {
        Object obj;
        Object obj2;
        int i2;
        int i3;
        Object obj3;
        int i4;
        Object obj4;
        int size = list.size();
        int i5 = 0;
        while (true) {
            obj = null;
            if (i5 >= size) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i5);
            if (ffkj.e(fpi.c((inx) obj2), "Leading")) {
                break;
            }
            i5++;
        }
        inx inxVar = (inx) obj2;
        if (inxVar != null) {
            i2 = flu.c(i, inxVar.b(Alert.DURATION_SHOW_INDEFINITELY));
            i3 = ((Number) ffjmVar.a(inxVar, Integer.valueOf(i))).intValue();
        } else {
            i2 = i;
            i3 = 0;
        }
        int size2 = list.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size2) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i6);
            if (ffkj.e(fpi.c((inx) obj3), "Trailing")) {
                break;
            }
            i6++;
        }
        inx inxVar2 = (inx) obj3;
        if (inxVar2 != null) {
            i2 = flu.c(i2, inxVar2.b(Alert.DURATION_SHOW_INDEFINITELY));
            i4 = ((Number) ffjmVar.a(inxVar2, Integer.valueOf(i))).intValue();
        } else {
            i4 = 0;
        }
        int size3 = list.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size3) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i7);
            if (ffkj.e(fpi.c((inx) obj4), "Label")) {
                break;
            }
            i7++;
        }
        Object obj5 = (inx) obj4;
        int intValue = obj5 != null ? ((Number) ffjmVar.a(obj5, Integer.valueOf(kav.c(i2, i, this.a)))).intValue() : 0;
        int size4 = list.size();
        for (int i8 = 0; i8 < size4; i8++) {
            Object obj6 = list.get(i8);
            if (ffkj.e(fpi.c((inx) obj6), "TextField")) {
                int intValue2 = ((Number) ffjmVar.a(obj6, Integer.valueOf(i2))).intValue();
                int size5 = list.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size5) {
                        break;
                    }
                    Object obj7 = list.get(i9);
                    if (ffkj.e(fpi.c((inx) obj7), "Hint")) {
                        obj = obj7;
                        break;
                    }
                    i9++;
                }
                Object obj8 = (inx) obj;
                return flu.a(i3, i4, intValue2, intValue, obj8 != null ? ((Number) ffjmVar.a(obj8, Integer.valueOf(i2))).intValue() : 0, this.a, jzl.k(0, 0, 0, 15), inyVar.ec(), this.b);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final int g(iny inyVar, List list, int i, ffjm ffjmVar) {
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
                return flu.b(intValue4, intValue3, intValue, intValue2, inxVar4 != null ? ((Number) ffjmVar.a(inxVar4, Integer.valueOf(i))).intValue() : 0, this.a, jzl.k(0, 0, 0, 15), inyVar.ec(), this.b);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // defpackage.ipn
    public final int a(iny inyVar, List list, int i) {
        return f(inyVar, list, i, flv.a);
    }

    @Override // defpackage.ipn
    public final int b(iny inyVar, List list, int i) {
        return g(inyVar, list, i, flw.a);
    }

    @Override // defpackage.ipn
    public final int c(iny inyVar, List list, int i) {
        return f(inyVar, list, i, fly.a);
    }

    @Override // defpackage.ipn
    public final int d(iny inyVar, List list, int i) {
        return g(inyVar, list, i, flz.a);
    }

    @Override // defpackage.ipn
    public final ipo e(ipq ipqVar, List list, long j) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        ipo ei;
        fma fmaVar = this;
        int eo = ipqVar.eo(((ebf) fmaVar.b).b);
        long m = jzk.m(j, 0, 0, 0, 0, 10);
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (ffkj.e(ioe.b((ipl) obj), "Leading")) {
                break;
            }
            i++;
        }
        ipl iplVar = (ipl) obj;
        iqk e = iplVar != null ? iplVar.e(m) : null;
        int b = fpi.b(e);
        int size2 = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i2);
            if (ffkj.e(ioe.b((ipl) obj2), "Trailing")) {
                break;
            }
            i2++;
        }
        ipl iplVar2 = (ipl) obj2;
        iqk e2 = iplVar2 != null ? iplVar2.e(jzl.l(m, -b, 0, 2)) : null;
        int b2 = b + fpi.b(e2);
        int eo2 = ipqVar.eo(fmaVar.b.b(ipqVar.q())) + ipqVar.eo(fmaVar.b.c(ipqVar.q()));
        int i3 = -eo;
        int i4 = -b2;
        long h = jzl.h(m, kav.c(i4 - eo2, -eo2, fmaVar.a), i3);
        int size3 = list.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i5);
            if (ffkj.e(ioe.b((ipl) obj3), "Label")) {
                break;
            }
            i5++;
        }
        ipl iplVar3 = (ipl) obj3;
        iqk e3 = iplVar3 != null ? iplVar3.e(h) : null;
        fmaVar.c.invoke(new iar(e3 != null ? ias.a(e3.a, e3.b) : 0L));
        long m2 = jzk.m(jzl.h(j, i4, i3 - Math.max(fpi.a(e3) / 2, ipqVar.eo(((ebf) fmaVar.b).a))), 0, 0, 0, 0, 11);
        int size4 = list.size();
        int i6 = 0;
        while (i6 < size4) {
            ipl iplVar4 = (ipl) list.get(i6);
            if (ffkj.e(ioe.b(iplVar4), "TextField")) {
                iqk e4 = iplVar4.e(m2);
                long m3 = jzk.m(m2, 0, 0, 0, 0, 14);
                int size5 = list.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size5) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i7);
                    if (ffkj.e(ioe.b((ipl) obj4), "Hint")) {
                        break;
                    }
                    i7++;
                }
                ipl iplVar5 = (ipl) obj4;
                iqk e5 = iplVar5 != null ? iplVar5.e(m3) : null;
                int b3 = flu.b(fpi.b(e), fpi.b(e2), e4.a, fpi.b(e3), fpi.b(e5), fmaVar.a, j, ipqVar.ec(), fmaVar.b);
                int a = flu.a(fpi.a(e), fpi.a(e2), e4.b, fpi.a(e3), fpi.a(e5), fmaVar.a, j, ipqVar.ec(), fmaVar.b);
                int size6 = list.size();
                int i8 = 0;
                while (i8 < size6) {
                    ipl iplVar6 = (ipl) list.get(i8);
                    if (ffkj.e(ioe.b(iplVar6), "border")) {
                        iqk e6 = iplVar6.e(jzl.d(b3 != Integer.MAX_VALUE ? b3 : 0, b3, a != Integer.MAX_VALUE ? a : 0, a));
                        iqk iqkVar = e;
                        int i9 = b3;
                        iqk iqkVar2 = e4;
                        int i10 = a;
                        ei = ipqVar.ei(i9, i10, ffem.a, new flx(i10, i9, iqkVar, e2, iqkVar2, e3, e5, e6, fmaVar, ipqVar));
                        return ei;
                    }
                    iqk iqkVar3 = e5;
                    iqk iqkVar4 = e;
                    i8++;
                    fmaVar = this;
                    e3 = e3;
                    a = a;
                    e4 = e4;
                    b3 = b3;
                    e = iqkVar4;
                    e5 = iqkVar3;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i6++;
            fmaVar = this;
            e3 = e3;
            m2 = m2;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
