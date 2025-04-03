package defpackage;

import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azao implements cibg {
    private final Map a;

    public azao(Map map) {
        this.a = map;
    }

    @Override // defpackage.cibg
    public final elfl a(fcea fceaVar, aoku aokuVar) {
        fceaVar.getClass();
        Map map = this.a;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            fcdv fcdvVar = (fcdv) fcdx.a.createBuilder();
            fcdvVar.getClass();
            fcdy fcdyVar = (fcdy) fcdz.a.createBuilder();
            fcdyVar.getClass();
            fbda.b((String) entry.getKey(), fcdyVar);
            fbcz.b(fbda.a(fcdyVar), fcdvVar);
            fcdy fcdyVar2 = (fcdy) fcdz.a.createBuilder();
            fcdyVar2.getClass();
            fbda.b((String) entry.getValue(), fcdyVar2);
            fbcz.c(fbda.a(fcdyVar2), fcdvVar);
            fbcz.d(4, fcdvVar);
            arrayList.add(fbcz.a(fcdvVar));
        }
        fceaVar.a(arrayList);
        elfl e = elfo.e(fceaVar);
        e.getClass();
        return e;
    }
}
