package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekjr {
    private final Map a = new HashMap();
    private final ffbr b;

    public ekjr(ffbr ffbrVar) {
        this.b = ffbrVar;
    }

    public final Object a(eisx eisxVar) {
        Object obj;
        synchronized (this.a) {
            if (!this.a.containsKey(eisxVar)) {
                Map map = this.a;
                akhc akhcVar = (akhc) this.b.b();
                akhcVar.b = eisxVar;
                map.put(eisxVar, new akhy(akhcVar.a, akhcVar.b));
            }
            obj = this.a.get(eisxVar);
        }
        return obj;
    }
}
