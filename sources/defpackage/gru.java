package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gru implements ipn {
    final /* synthetic */ float a;

    public gru(float f) {
        this.a = f;
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
        Object obj;
        Object obj2;
        ipo ei;
        int i = 0;
        long m = jzk.m(j, 0, 0, 0, 0, 10);
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj3 = list.get(i2);
            ipl iplVar = (ipl) obj3;
            if (ioe.b(iplVar) != gey.a && ioe.b(iplVar) != gey.b) {
                arrayList.add(obj3);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            arrayList2.add(((ipl) arrayList.get(i3)).e(m));
        }
        int size3 = list.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size3) {
                obj = null;
                break;
            }
            obj = list.get(i4);
            if (ioe.b((ipl) obj) == gey.a) {
                break;
            }
            i4++;
        }
        ipl iplVar2 = (ipl) obj;
        int size4 = list.size();
        while (true) {
            if (i >= size4) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i);
            if (ioe.b((ipl) obj2) == gey.b) {
                break;
            }
            i++;
        }
        ipl iplVar3 = (ipl) obj2;
        float size5 = arrayList2.size();
        iqk e = iplVar2 != null ? iplVar2.e(m) : null;
        ei = ipqVar.ei(jzk.d(j), jzk.c(j), ffem.a, new grt(e, arrayList2, iplVar3 != null ? iplVar3.e(m) : null, j, jzk.a(j) * this.a, 6.2831855f / size5));
        return ei;
    }
}
