package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edys {
    private Map a;

    public edys(Map map) {
        this.a = map;
    }

    public final void a() {
        efbd.c();
        this.a.getClass();
        for (edyq edyqVar : edyq.values()) {
            edyr edyrVar = (edyr) this.a.get(edyqVar);
            if (edyrVar != null) {
                edyrVar.a();
            }
        }
        this.a = null;
    }
}
