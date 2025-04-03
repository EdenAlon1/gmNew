package defpackage;

import androidx.car.app.model.Alert;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alat {
    private final akzx a;
    private final dfld b;
    private final Map c = new LinkedHashMap();

    public alat(akzx akzxVar, dfld dfldVar) {
        this.a = akzxVar;
        this.b = dfldVar;
    }

    public final synchronized dfmc a(String str) {
        Object obj;
        Map map = this.c;
        obj = map.get(str);
        if (obj == null) {
            dfmc dfmcVar = new dfmc(this.b, "BUGLE_COUNTERS", Alert.DURATION_SHOW_INDEFINITELY);
            dfmcVar.i(this.a.b(str));
            map.put(str, dfmcVar);
            obj = dfmcVar;
        }
        return (dfmc) obj;
    }
}
