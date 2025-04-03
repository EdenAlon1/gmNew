package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejko {
    private final Object a;
    private final Map b;
    private final akil c;

    public ejko(akil akilVar) {
        akilVar.getClass();
        this.c = akilVar;
        this.a = new Object();
        this.b = new LinkedHashMap();
    }

    public final ejkn a(Class cls) {
        ejkn ejknVar;
        cls.getClass();
        synchronized (this.a) {
            Map map = this.b;
            Object obj = map.get(cls);
            if (obj == null) {
                akil akilVar = this.c;
                ejkn ejknVar2 = new ejkn((Context) akilVar.a.a.q.b(), (ejkc) akilVar.a.a.ci.b(), (errm) akilVar.a.a.p.b(), (NotificationManager) akilVar.a.a.cj.b(), akilVar.a.a.eo(), cls);
                map.put(cls, ejknVar2);
                obj = ejknVar2;
            }
            ejknVar = (ejkn) obj;
        }
        return ejknVar;
    }
}
