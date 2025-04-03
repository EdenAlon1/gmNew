package defpackage;

import java.util.Collection;
import org.json.JSONArray;

/* compiled from: PG */
/* loaded from: classes6.dex */
abstract class ayit {
    /* JADX WARN: Multi-variable type inference failed */
    static ayit b(engw engwVar) {
        enoe enoeVar = enoe.a;
        enpz.a(enoeVar, engwVar);
        Object[] r = enjk.r(engwVar);
        enjc x = enjc.x(enoeVar, r.length, r);
        return x.size() == 1 ? new ayhe((String) ((enpe) x).d.get(0)) : new ayhe(new JSONArray((Collection) x).toString());
    }

    public abstract String a();
}
