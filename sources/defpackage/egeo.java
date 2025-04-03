package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egeo {
    private final Map a = new HashMap();
    private final egej b;

    public egeo(egej egejVar) {
        this.b = egejVar;
    }

    public final egei a(long j) {
        Map map = this.a;
        Long valueOf = Long.valueOf(j);
        if (!map.containsKey(valueOf)) {
            Map map2 = this.a;
            egej egejVar = this.b;
            map2.put(valueOf, new egem(egejVar.a, egejVar.b, egejVar.c, egejVar.d, egejVar.e, j));
        }
        return (egei) this.a.get(valueOf);
    }
}
