package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvxy implements ffjn {
    final /* synthetic */ cvxk a;

    public cvxy(cvxk cvxkVar) {
        this.a = cvxkVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        dyn dynVar = (dyn) obj;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        dynVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= true != hfdVar.D(dynVar) ? 2 : 4;
        }
        if ((intValue & 19) == 18 && hfdVar.I()) {
            hfdVar.s();
        } else {
            final float d = dynVar.d() * 0.5f;
            hvi d2 = eba.d(hvi.e, 16.0f);
            hfdVar.v(-1320418443);
            boolean D = hfdVar.D(this.a) | hfdVar.A(d);
            final cvxk cvxkVar = this.a;
            Object f = hfdVar.f();
            if (D || f == hfc.a) {
                f = new ffjm() { // from class: cvxx
                    @Override // defpackage.ffjm
                    public final Object a(Object obj4, Object obj5) {
                        int i;
                        int i2;
                        float f2;
                        final int eo;
                        ipo ei;
                        final irg irgVar = (irg) obj4;
                        jzk jzkVar = (jzk) obj5;
                        irgVar.getClass();
                        long j = jzkVar.a;
                        cvxk cvxkVar2 = cvxk.this;
                        List a = irgVar.a("EmergencyBannerButton", new hpw(-881947874, true, new cvyc(cvxkVar2)));
                        final ArrayList arrayList = new ArrayList(ffdx.n(a, 10));
                        Iterator it = a.iterator();
                        while (true) {
                            i = 13;
                            i2 = 0;
                            if (!it.hasNext()) {
                                break;
                            }
                            arrayList.add(((ipl) it.next()).e(jzl.k(0, jzk.b(j), 0, 13)));
                        }
                        iqk iqkVar = (iqk) ffdx.M(arrayList);
                        int b = jzk.b(jzkVar.a) - cvye.a(iqkVar != null ? Integer.valueOf(iqkVar.a) : null);
                        long j2 = jzkVar.a;
                        List a2 = irgVar.a("EmergencyBannerIconAndText", new hpw(175433914, true, new cvyd(cvxkVar2)));
                        final ArrayList arrayList2 = new ArrayList(ffdx.n(a2, 10));
                        Iterator it2 = a2.iterator();
                        while (true) {
                            f2 = d;
                            if (!it2.hasNext()) {
                                break;
                            }
                            arrayList2.add(((ipl) it2.next()).e(b < irgVar.eo(f2) ? jzl.k(i2, jzk.b(j2), i2, i) : jzl.k(irgVar.eo(f2), b, i2, 12)));
                            i = 13;
                            i2 = 0;
                        }
                        final long j3 = jzkVar.a;
                        boolean z = b >= irgVar.eo(f2);
                        if (z) {
                            iqk iqkVar2 = (iqk) ffdx.M(arrayList2);
                            int a3 = cvye.a(iqkVar2 != null ? Integer.valueOf(iqkVar2.b) : null);
                            iqk iqkVar3 = (iqk) ffdx.M(arrayList);
                            eo = Math.max(a3, cvye.a(iqkVar3 != null ? Integer.valueOf(iqkVar3.b) : null));
                        } else {
                            Iterator it3 = arrayList2.iterator();
                            int i3 = 0;
                            while (it3.hasNext()) {
                                i3 += ((iqk) it3.next()).b;
                            }
                            Iterator it4 = arrayList.iterator();
                            int i4 = 0;
                            while (it4.hasNext()) {
                                i4 += ((iqk) it4.next()).b;
                            }
                            eo = irgVar.eo(16.0f) + i3 + i4;
                        }
                        final boolean z2 = z;
                        ei = irgVar.ei(jzk.b(j3), eo, ffem.a, new ffji() { // from class: cvxn
                            @Override // defpackage.ffji
                            public final Object invoke(Object obj6) {
                                iqj iqjVar = (iqj) obj6;
                                iqjVar.getClass();
                                List list = arrayList2;
                                List<iqk> list2 = arrayList;
                                int i5 = 0;
                                if (z2) {
                                    Iterator it5 = list.iterator();
                                    int i6 = 0;
                                    while (it5.hasNext()) {
                                        i6 += ((iqk) it5.next()).b;
                                    }
                                    int i7 = eo;
                                    int i8 = i7 - i6;
                                    Iterator it6 = list.iterator();
                                    while (it6.hasNext()) {
                                        iqj.m(iqjVar, (iqk) it6.next(), 0, i8 / 2);
                                    }
                                    Iterator it7 = list2.iterator();
                                    while (it7.hasNext()) {
                                        i5 += ((iqk) it7.next()).b;
                                    }
                                    int i9 = (i7 - i5) / 2;
                                    for (iqk iqkVar4 : list2) {
                                        iqk iqkVar5 = (iqk) ffdx.M(list);
                                        iqj.m(iqjVar, iqkVar4, cvye.a(iqkVar5 != null ? Integer.valueOf(iqkVar5.a) : null), i9);
                                    }
                                } else {
                                    Iterator it8 = list.iterator();
                                    while (it8.hasNext()) {
                                        iqj.m(iqjVar, (iqk) it8.next(), 0, 0);
                                    }
                                    Iterator it9 = list.iterator();
                                    while (it9.hasNext()) {
                                        i5 += ((iqk) it9.next()).b;
                                    }
                                    for (iqk iqkVar6 : list2) {
                                        irg irgVar2 = irgVar;
                                        long j4 = j3;
                                        iqj.m(iqjVar, iqkVar6, jzk.b(j4) - iqkVar6.a, irgVar2.eo(16.0f) + i5);
                                    }
                                }
                                return ffcu.a;
                            }
                        });
                        return ei;
                    }
                };
                hfdVar.y(f);
            }
            hfdVar.o();
            ira.a(d2, (ffjm) f, hfdVar, 6, 0);
        }
        return ffcu.a;
    }
}
