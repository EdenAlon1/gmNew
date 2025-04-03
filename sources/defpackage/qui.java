package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qui {
    private static final que a = new qug();
    private final Map b = new HashMap();

    public final synchronized quf a(Object obj) {
        que queVar;
        rkf.f(obj);
        queVar = (que) this.b.get(obj.getClass());
        if (queVar == null) {
            Iterator it = this.b.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                que queVar2 = (que) it.next();
                if (queVar2.b().isAssignableFrom(obj.getClass())) {
                    queVar = queVar2;
                    break;
                }
            }
        }
        if (queVar == null) {
            queVar = a;
        }
        return queVar.a(obj);
    }

    public final synchronized void b(que queVar) {
        this.b.put(queVar.b(), queVar);
    }
}
