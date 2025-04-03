package defpackage;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efdy implements efbi {
    public boolean a = false;

    @Override // defpackage.efbi
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final InputStream a(efbh efbhVar) {
        InputStream e = efbhVar.b.e(efbhVar.f);
        if (this.a) {
            e = new BufferedInputStream(e);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(e);
        if (!efbhVar.d.isEmpty()) {
            List list = efbhVar.d;
            int i = efbe.a;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((efej) it.next()).h();
            }
            efbe efbeVar = !arrayList2.isEmpty() ? new efbe(e, arrayList2) : null;
            if (efbeVar != null) {
                arrayList.add(efbeVar);
            }
        }
        Iterator it2 = efbhVar.c.iterator();
        while (it2.hasNext()) {
            arrayList.add(((efel) it2.next()).a(efbhVar.e, (InputStream) enjk.j(arrayList)));
        }
        Collections.reverse(arrayList);
        return (InputStream) arrayList.get(0);
    }
}
