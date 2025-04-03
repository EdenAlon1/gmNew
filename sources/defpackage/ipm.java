package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ipm {
    public static int a(ipn ipnVar, iny inyVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new inr((inx) list.get(i2), 2, 2));
        }
        return ipnVar.e(new ioa(inyVar, inyVar.q()), arrayList, jzl.k(0, i, 0, 13)).j();
    }

    public static int b(ipn ipnVar, iny inyVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new inr((inx) list.get(i2), 2, 1));
        }
        return ipnVar.e(new ioa(inyVar, inyVar.q()), arrayList, jzl.k(0, 0, i, 7)).k();
    }

    public static int c(ipn ipnVar, iny inyVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new inr((inx) list.get(i2), 1, 2));
        }
        return ipnVar.e(new ioa(inyVar, inyVar.q()), arrayList, jzl.k(0, i, 0, 13)).j();
    }

    public static int d(ipn ipnVar, iny inyVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new inr((inx) list.get(i2), 1, 1));
        }
        return ipnVar.e(new ioa(inyVar, inyVar.q()), arrayList, jzl.k(0, 0, i, 7)).k();
    }
}
