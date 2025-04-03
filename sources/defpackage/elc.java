package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class elc {
    public static final int a(ejs ejsVar) {
        long g = ejsVar.g(0);
        return ejsVar.m() ? kaa.b(g) : kaa.a(g);
    }

    public static final List b(emc emcVar, List list, cmw cmwVar, int i, int i2, int i3, ffji ffjiVar) {
        cmw cmwVar2;
        Object obj;
        int i4;
        int i5;
        if (emcVar == null || list.isEmpty() || cmwVar.b == 0) {
            return ffel.a;
        }
        int a = ((ejs) ffdx.K(list)).a();
        int i6 = -1;
        int i7 = 0;
        if (((ejs) ffdx.P(list)).a() - a < 0 || (i4 = cmwVar.b) == 0) {
            cmwVar2 = cmx.a;
        } else {
            ffmj q = ffmk.q(0, i4);
            int i8 = q.a;
            int i9 = q.b;
            if (i8 <= i9) {
                i5 = -1;
                while (cmwVar.a(i8) <= a) {
                    i5 = cmwVar.a(i8);
                    if (i8 == i9) {
                        break;
                    }
                    i8++;
                }
            } else {
                i5 = -1;
            }
            cmwVar2 = i5 == -1 ? cmx.a : cmx.b(i5);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj2 = list.get(i10);
            int a2 = ((ejs) obj2).a();
            int[] iArr = cmwVar.a;
            int i11 = cmwVar.b;
            int i12 = 0;
            while (true) {
                if (i12 >= i11) {
                    break;
                }
                if (iArr[i12] == a2) {
                    arrayList2.add(obj2);
                    break;
                }
                i12++;
            }
        }
        int[] iArr2 = cmwVar2.a;
        int i13 = cmwVar2.b;
        int i14 = 0;
        while (i14 < i13) {
            int i15 = iArr2[i14];
            Iterator it = list.iterator();
            int i16 = i7;
            while (true) {
                if (!it.hasNext()) {
                    i16 = i6;
                    break;
                }
                if (((ejs) it.next()).a() == i15) {
                    break;
                }
                i16++;
            }
            ejs ejsVar = i16 == i6 ? (ejs) ffjiVar.invoke(Integer.valueOf(i15)) : (ejs) list.remove(i16);
            int c = ejsVar.c();
            int a3 = i16 == i6 ? Integer.MIN_VALUE : a(ejsVar);
            int i17 = -i;
            int size2 = arrayList2.size();
            while (true) {
                if (i7 >= size2) {
                    obj = null;
                    break;
                }
                obj = arrayList2.get(i7);
                if (((ejs) obj).a() != i15) {
                    break;
                }
                i7++;
            }
            ejs ejsVar2 = (ejs) obj;
            int a4 = ejsVar2 != null ? a(ejsVar2) : Integer.MIN_VALUE;
            if (a3 != Integer.MIN_VALUE) {
                i17 = Math.max(i17, a3);
            }
            if (a4 != Integer.MIN_VALUE) {
                i17 = Math.min(i17, a4 - c);
            }
            ejsVar.n();
            ejsVar.l(i17, 0, i2, i3);
            arrayList.add(ejsVar);
            i14++;
            i7 = 0;
            i6 = -1;
        }
        return arrayList;
    }
}
