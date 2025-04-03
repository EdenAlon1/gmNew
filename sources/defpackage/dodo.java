package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dodo implements ipn {
    public static final dodo a = new dodo();

    @Override // defpackage.ipn
    public final /* synthetic */ int a(iny inyVar, List list, int i) {
        return ipm.a(this, inyVar, list, i);
    }

    @Override // defpackage.ipn
    public final /* synthetic */ int b(iny inyVar, List list, int i) {
        return ipm.b(this, inyVar, list, i);
    }

    @Override // defpackage.ipn
    public final /* synthetic */ int c(iny inyVar, List list, int i) {
        return ipm.c(this, inyVar, list, i);
    }

    @Override // defpackage.ipn
    public final /* synthetic */ int d(iny inyVar, List list, int i) {
        return ipm.d(this, inyVar, list, i);
    }

    @Override // defpackage.ipn
    public final ipo e(ipq ipqVar, List list, long j) {
        List list2;
        dods a2;
        ipo ei;
        ipqVar.getClass();
        int i = 0;
        ipl iplVar = (ipl) list.get(0);
        ipl iplVar2 = (ipl) list.get(1);
        ipl iplVar3 = (ipl) list.get(2);
        List Y = ffdx.Y(list, 3);
        dodr dodrVar = new dodr(j, iplVar, iplVar2, iplVar3, ffdx.Z(Y, 1), (ipl) ffdx.P(Y));
        List list3 = dodrVar.e;
        ArrayList arrayList = new ArrayList(ffdx.n(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(dodp.a((ipl) it.next(), dodrVar)));
        }
        List aC = ffdx.aC(arrayList, 2, true, new ffji() { // from class: dodj
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                List list4 = (List) obj;
                list4.getClass();
                return Integer.valueOf(ffdx.E(list4));
            }
        });
        Iterator it2 = aC.iterator();
        if (it2.hasNext()) {
            Object next = it2.next();
            ArrayList arrayList2 = new ArrayList(ffdx.n(aC, 10));
            arrayList2.add(next);
            while (it2.hasNext()) {
                next = Integer.valueOf(((Number) next).intValue() + ((Number) it2.next()).intValue());
                arrayList2.add(next);
            }
            list2 = arrayList2;
        } else {
            list2 = ffel.a;
        }
        long j2 = dodrVar.a;
        int a3 = dodp.a(dodrVar.b, dodrVar);
        ipl iplVar4 = dodrVar.c;
        int b = dodp.b(iplVar4);
        int a4 = dodp.a(iplVar4, dodrVar);
        ipl iplVar5 = dodrVar.d;
        int b2 = dodp.b(iplVar5);
        int a5 = dodp.a(iplVar5, dodrVar);
        Integer num = (Integer) ffdx.Q(list2);
        docz doczVar = new docz(jzk.a(j2), a3, b, a4, b2, a5, list2, num != null ? num.intValue() : 0, dodp.a(dodrVar.f, dodrVar));
        int i2 = doczVar.b;
        int i3 = doczVar.d;
        int i4 = doczVar.f;
        int i5 = doczVar.h;
        int i6 = doczVar.i;
        int i7 = doczVar.a;
        if (i2 + i3 + i4 + i5 + i6 <= i7) {
            a2 = new dods(i2, i3, i4, doczVar.g.size(), i6);
        } else {
            int i8 = doczVar.e;
            int i9 = i7 - i2;
            int i10 = ((i9 - i3) - i5) - i6;
            if (i10 >= i8) {
                a2 = new dods(i2, i3, i10, doczVar.g.size(), i6);
            } else {
                int i11 = doczVar.c;
                int i12 = ((i9 - i8) - i5) - i6;
                if (i12 >= i11) {
                    a2 = new dods(i2, i12, i8, doczVar.g.size(), i6);
                } else {
                    a2 = dodq.a(doczVar, i11, i8);
                    if (a2 == null && (a2 = dodq.a(doczVar, doczVar.c, 0)) == null) {
                        dods a6 = dodq.a(doczVar, 0, 0);
                        a2 = (a6 == null || a6.d <= 0) ? null : a6;
                        if (a2 == null) {
                            a2 = new dods(0, 0, 0, 0, 0);
                        }
                    }
                }
            }
        }
        fffs fffsVar = new fffs((byte[]) null);
        fffsVar.add(dodp.c(dodrVar.b, dodrVar, a2.a));
        fffsVar.add(dodp.c(dodrVar.c, dodrVar, a2.b));
        fffsVar.add(dodp.c(dodrVar.d, dodrVar, a2.c));
        if (a2.d > 0) {
            List ai = ffdx.ai(dodrVar.e, (r2 + r2) - 1);
            ArrayList arrayList3 = new ArrayList(ffdx.n(ai, 10));
            Iterator it3 = ai.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((ipl) it3.next()).e(dodrVar.a));
            }
            fffsVar.addAll(arrayList3);
        }
        fffsVar.add(dodp.c(dodrVar.f, dodrVar, a2.e));
        final List a7 = ffdx.a(fffsVar);
        Iterator it4 = a7.iterator();
        if (!it4.hasNext()) {
            throw new NoSuchElementException();
        }
        int i13 = ((iqk) it4.next()).a;
        while (it4.hasNext()) {
            int i14 = ((iqk) it4.next()).a;
            if (i13 < i14) {
                i13 = i14;
            }
        }
        Iterator it5 = a7.iterator();
        while (it5.hasNext()) {
            i += ((iqk) it5.next()).b;
        }
        ei = ipqVar.ei(i13, i, ffem.a, new ffji() { // from class: dodb
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                iqj iqjVar = (iqj) obj;
                iqjVar.getClass();
                int i15 = 0;
                for (iqk iqkVar : a7) {
                    iqj.m(iqjVar, iqkVar, 0, i15);
                    i15 += iqkVar.b;
                }
                return ffcu.a;
            }
        });
        return ei;
    }
}
