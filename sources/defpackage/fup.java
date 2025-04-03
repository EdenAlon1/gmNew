package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fup implements ipu {
    final /* synthetic */ gmk a;
    final /* synthetic */ ffix b;

    public fup(gmk gmkVar, ffix ffixVar) {
        this.a = gmkVar;
        this.b = ffixVar;
    }

    @Override // defpackage.ipu
    public final /* synthetic */ int a(iny inyVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) list.get(i2);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList2.add(new inr((inx) list2.get(i3), 2, 2));
            }
            arrayList.add(arrayList2);
        }
        return e(new ioa(inyVar, inyVar.q()), arrayList, jzl.k(0, i, 0, 13)).j();
    }

    @Override // defpackage.ipu
    public final /* synthetic */ int b(iny inyVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) list.get(i2);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList2.add(new inr((inx) list2.get(i3), 2, 1));
            }
            arrayList.add(arrayList2);
        }
        return e(new ioa(inyVar, inyVar.q()), arrayList, jzl.k(0, 0, i, 7)).k();
    }

    @Override // defpackage.ipu
    public final /* synthetic */ int c(iny inyVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) list.get(i2);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList2.add(new inr((inx) list2.get(i3), 1, 2));
            }
            arrayList.add(arrayList2);
        }
        return e(new ioa(inyVar, inyVar.q()), arrayList, jzl.k(0, i, 0, 13)).j();
    }

    @Override // defpackage.ipu
    public final /* synthetic */ int d(iny inyVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) list.get(i2);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList2.add(new inr((inx) list2.get(i3), 1, 1));
            }
            arrayList.add(arrayList2);
        }
        return e(new ioa(inyVar, inyVar.q()), arrayList, jzl.k(0, 0, i, 7)).k();
    }

    @Override // defpackage.ipu
    public final ipo e(ipq ipqVar, List list, long j) {
        Integer valueOf;
        ipo ei;
        List list2 = (List) list.get(0);
        int i = 1;
        List list3 = (List) list.get(1);
        List list4 = (List) list.get(2);
        List list5 = (List) list.get(3);
        long m = jzk.m(j, 0, 0, 0, 0, 10);
        ArrayList arrayList = new ArrayList(list4.size());
        int size = list4.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((ipl) list4.get(i2)).e(m));
        }
        ArrayList arrayList2 = new ArrayList(list2.size());
        int size2 = list2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            arrayList2.add(((ipl) list2.get(i3)).e(m));
        }
        if (arrayList2.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((iqk) arrayList2.get(0)).b);
            int e = ffdx.e(arrayList2);
            if (e > 0) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((iqk) arrayList2.get(i)).b);
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i == e) {
                        break;
                    }
                    i++;
                }
            }
        }
        int intValue = valueOf != null ? valueOf.intValue() : 0;
        int a = jzk.a(j);
        long m2 = jzk.m(m, 0, 0, 0, a - intValue, 7);
        ArrayList arrayList3 = new ArrayList(list3.size());
        int size3 = list3.size();
        for (int i4 = 0; i4 < size3; i4++) {
            arrayList3.add(((ipl) list3.get(i4)).e(m2));
        }
        ArrayList arrayList4 = new ArrayList(list5.size());
        int size4 = list5.size();
        for (int i5 = 0; i5 < size4; i5++) {
            arrayList4.add(((ipl) list5.get(i5)).e(m));
        }
        int b = jzk.b(j);
        ei = ipqVar.ei(b, a, ffem.a, new fuo(arrayList, b, arrayList4, this.a, this.b, a, arrayList3, arrayList2, intValue));
        return ei;
    }
}
