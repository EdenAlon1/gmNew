package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erpi extends erpk {
    public erpi(engi engiVar, boolean z) {
        super(engiVar, z);
        o();
    }

    @Override // defpackage.erpk
    public final /* bridge */ /* synthetic */ Object r(List list) {
        ArrayList d = enkr.d(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            erpj erpjVar = (erpj) it.next();
            d.add(erpjVar != null ? erpjVar.a : null);
        }
        return DesugarCollections.unmodifiableList(d);
    }
}
