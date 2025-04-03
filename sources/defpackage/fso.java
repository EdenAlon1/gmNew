package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fso implements ipn {
    final /* synthetic */ float a;
    final /* synthetic */ float b;

    public fso(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    private static final void f(List list, ffkz ffkzVar, ipq ipqVar, float f, List list2, List list3, ffkz ffkzVar2, List list4, ffkz ffkzVar3, ffkz ffkzVar4) {
        if (!list.isEmpty()) {
            ffkzVar.a += ipqVar.eo(f);
        }
        list.add(0, ffdx.ak(list2));
        list3.add(Integer.valueOf(ffkzVar2.a));
        list4.add(Integer.valueOf(ffkzVar.a));
        ffkzVar.a += ffkzVar2.a;
        ffkzVar3.a = Math.max(ffkzVar3.a, ffkzVar4.a);
        list2.clear();
        ffkzVar4.a = 0;
        ffkzVar2.a = 0;
    }

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
        ipo ei;
        iqk iqkVar;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ffkz ffkzVar = new ffkz();
        ffkz ffkzVar2 = new ffkz();
        ArrayList arrayList4 = new ArrayList();
        ffkz ffkzVar3 = new ffkz();
        ffkz ffkzVar4 = new ffkz();
        int size = list.size();
        int i = 0;
        while (i < size) {
            float f = this.a;
            int i2 = size;
            int i3 = i;
            iqk e = ((ipl) list.get(i)).e(j);
            if (arrayList4.isEmpty()) {
                iqkVar = e;
            } else {
                ArrayList arrayList5 = arrayList;
                ffkz ffkzVar5 = ffkzVar2;
                if (ffkzVar3.a + ipqVar.eo(f) + e.a > jzk.b(j)) {
                    iqkVar = e;
                    arrayList = arrayList5;
                    ffkzVar2 = ffkzVar5;
                    f(arrayList, ffkzVar2, ipqVar, this.b, arrayList4, arrayList2, ffkzVar4, arrayList3, ffkzVar, ffkzVar3);
                } else {
                    iqkVar = e;
                    arrayList = arrayList5;
                    ffkzVar2 = ffkzVar5;
                }
            }
            if (!arrayList4.isEmpty()) {
                ffkzVar3.a += ipqVar.eo(f);
            }
            arrayList4.add(iqkVar);
            ffkzVar3.a += iqkVar.a;
            ffkzVar4.a = Math.max(ffkzVar4.a, iqkVar.b);
            i = i3 + 1;
            size = i2;
        }
        if (!arrayList4.isEmpty()) {
            f(arrayList, ffkzVar2, ipqVar, this.b, arrayList4, arrayList2, ffkzVar4, arrayList3, ffkzVar, ffkzVar3);
        }
        int max = Math.max(ffkzVar.a, jzk.d(j));
        ei = ipqVar.ei(max, Math.max(ffkzVar2.a, jzk.c(j)), ffem.a, new fsn(arrayList, ipqVar, this.a, max, arrayList3));
        return ei;
    }
}
