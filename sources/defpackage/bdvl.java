package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdvl {
    public final aolr a;
    private final ckac b;

    public bdvl(ckac ckacVar, aolr aolrVar) {
        ckacVar.getClass();
        aolrVar.getClass();
        this.b = ckacVar;
        this.a = aolrVar;
    }

    public final bdvj a(engw engwVar) {
        engwVar.getClass();
        ffji ffjiVar = new ffji() { // from class: bdvk
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj;
                bindData.getClass();
                return bdvl.this.a.q(bindData);
            }
        };
        ckac ckacVar = this.b;
        Set m = ((djsi) ckacVar.a.b()).m();
        ArrayList arrayList = new ArrayList(ffdx.n(m, 10));
        Iterator it = m.iterator();
        while (it.hasNext()) {
            arrayList.add(((avkc) ckacVar.c.b()).c(((djrj) it.next()).a));
        }
        ArrayList arrayList2 = new ArrayList(ffdx.n(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(this.a.b((awui) it2.next()));
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : engwVar) {
            obj.getClass();
            if (arrayList2.contains(ffjiVar.invoke(obj))) {
                arrayList3.add(obj);
            } else {
                arrayList4.add(obj);
            }
        }
        ffcf ffcfVar = new ffcf(arrayList3, arrayList4);
        return new bdvj(engq.a((List) ffcfVar.a), engq.a((List) ffcfVar.b));
    }
}
