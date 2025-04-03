package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class eafv {
    private final Map a = new HashMap();
    private final eafu b;

    public eafv(eafu eafuVar) {
        this.b = eafuVar;
    }

    public final synchronized Object a(String str) {
        return b(easz.a(str));
    }

    public final synchronized Object b(easy easyVar) {
        Object obj = this.a.get(easyVar);
        if (obj != null) {
            return obj;
        }
        Object a = this.b.a(easyVar);
        this.a.put(easyVar, a);
        return a;
    }
}
