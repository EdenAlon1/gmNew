package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qwr {
    public final Map a = new HashMap();

    public qwr() {
        new HashMap();
    }

    final void a(qtp qtpVar, qwj qwjVar) {
        Map map = this.a;
        if (qwjVar.equals(map.get(qtpVar))) {
            map.remove(qtpVar);
        }
    }
}
