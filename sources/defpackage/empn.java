package defpackage;

import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class empn implements empt {
    @Override // defpackage.empt
    public final List a(fbts fbtsVar, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(emps.d((fbxa) it.next(), Optional.empty(), 3));
        }
        emps.c(arrayList);
        return arrayList;
    }
}
