package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qoy {
    public final Map a = new HashMap();
    public final qod b;
    private final qny c;
    private final BlockingQueue d;

    public qoy(qny qnyVar, BlockingQueue blockingQueue, qod qodVar) {
        this.b = qodVar;
        this.c = qnyVar;
        this.d = blockingQueue;
    }

    public final synchronized void a(qol qolVar) {
        Map map = this.a;
        String str = qolVar.b;
        List list = (List) map.remove(str);
        if (list == null || list.isEmpty()) {
            return;
        }
        if (qox.b) {
            qox.d("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), str);
        }
        qol qolVar2 = (qol) list.remove(0);
        this.a.put(str, list);
        qolVar2.l(this);
        try {
            this.d.put(qolVar2);
        } catch (InterruptedException e) {
            qox.b("Couldn't add request to queue. %s", e.toString());
            Thread.currentThread().interrupt();
            this.c.a();
        }
    }

    final synchronized boolean b(qol qolVar) {
        Map map = this.a;
        String str = qolVar.b;
        if (!map.containsKey(str)) {
            this.a.put(str, null);
            qolVar.l(this);
            if (qox.b) {
                qox.a("new request, sending to network %s", str);
            }
            return false;
        }
        List list = (List) this.a.get(str);
        if (list == null) {
            list = new ArrayList();
        }
        qolVar.d("waiting-for-response");
        list.add(qolVar);
        this.a.put(str, list);
        if (qox.b) {
            qox.a("Request for cacheKey=%s is in flight, putting on hold.", str);
        }
        return true;
    }
}
