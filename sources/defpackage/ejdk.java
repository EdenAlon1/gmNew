package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final /* synthetic */ class ejdk implements eroh {
    public final /* synthetic */ ejdr a;

    @Override // defpackage.eroh
    public final ListenableFuture a(Object obj) {
        ArrayList arrayList = new ArrayList();
        enqu listIterator = ((enhk) obj).entrySet().listIterator();
        while (listIterator.hasNext()) {
            final ejdr ejdrVar = this.a;
            Map.Entry entry = (Map.Entry) listIterator.next();
            final eizj eizjVar = new eizj((eisx) entry.getKey(), ((eizi) ejdr.a((ejec) entry.getValue())).a);
            Set set = (Set) ejdrVar.e.b();
            final ArrayList arrayList2 = new ArrayList(set.size());
            Iterator it = set.iterator();
            while (it.hasNext()) {
                try {
                    arrayList2.add(((eiyd) it.next()).l(eizjVar));
                } catch (Exception e) {
                    arrayList2.add(erqt.h(e));
                }
            }
            arrayList.add(erqt.a(arrayList2).b(eldl.c(new erog() { // from class: ejdg
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    Set set2 = (Set) ejdr.this.f.b();
                    ArrayList arrayList3 = new ArrayList(set2.size());
                    Iterator it2 = set2.iterator();
                    eiyc eiycVar = eizjVar;
                    while (it2.hasNext()) {
                        try {
                            arrayList3.add(((eiyb) it2.next()).b(eiycVar));
                        } catch (Exception e2) {
                            arrayList3.add(erqt.h(e2));
                        }
                    }
                    List list = arrayList2;
                    list.addAll(arrayList3);
                    return erqt.c(list).a(new eroi(null), erpp.a);
                }
            }), ejdrVar.b));
        }
        return erqt.c(arrayList).a(new eroi(null), erpp.a);
    }
}
