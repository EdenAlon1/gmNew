package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fiqp {
    public final List a;
    public final List b;
    public final List c;
    public final int d;
    public final fiqm e;

    public fiqp(fiqn fiqnVar) {
        List list = fiqnVar.a;
        Set set = fiqnVar.d;
        Set set2 = finn.a;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add((fiqx) finn.b.get((Class) it.next()));
        }
        this.a = arrayList;
        this.e = new fiqm();
        this.c = fiqnVar.c;
        List list2 = fiqnVar.b;
        this.b = list2;
        this.d = 1;
        new finy(new finw(list2, new fioa()));
    }
}
