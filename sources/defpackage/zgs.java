package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zgs implements ffxy {
    final /* synthetic */ hsv a;
    final /* synthetic */ List b;
    final /* synthetic */ zgu c;
    final /* synthetic */ ffsk d;
    final /* synthetic */ ffix e;

    public zgs(hsv hsvVar, List list, zgu zguVar, ffsk ffskVar, ffix ffixVar) {
        this.a = hsvVar;
        this.b = list;
        this.c = zguVar;
        this.d = ffskVar;
        this.e = ffixVar;
    }

    @Override // defpackage.ffxy
    public final /* synthetic */ Object fQ(Object obj, ffgu ffguVar) {
        int intValue = ((Number) obj).intValue();
        ffmj ffmjVar = new ffmj(intValue - 1, intValue + 1);
        ArrayList arrayList = new ArrayList();
        ffev it = ffmjVar.iterator();
        while (((ffmi) it).a) {
            Object next = it.next();
            int intValue2 = ((Number) next).intValue();
            if (intValue2 >= 0 && intValue2 < this.b.size()) {
                arrayList.add(next);
            }
        }
        Set ar = ffdx.ar(arrayList);
        this.a.c.retainAll(ar);
        Iterator it2 = ar.iterator();
        while (it2.hasNext()) {
            int intValue3 = ((Number) it2.next()).intValue();
            hsv hsvVar = this.a;
            Integer num = new Integer(intValue3);
            zgu zguVar = this.c;
            List list = this.b;
            ffsk ffskVar = this.d;
            ffix ffixVar = this.e;
            if (hsvVar.get(num) == null) {
                hsvVar.put(num, ((zeu) zguVar.f.a()).a((alxr) list.get(intValue3), ffskVar, ffixVar));
            }
        }
        return ffcu.a;
    }
}
