package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.Timer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkkw {
    public dkkx b;
    private static final Timer c = new Timer(true);
    public static final Map a = new ConcurrentHashMap();

    public static final String c(dkkj dkkjVar, String str) {
        return dkkjVar.k + "#" + str;
    }

    public final void a(dkkj dkkjVar, long j, String str) {
        String c2 = c(dkkjVar, str);
        Map map = a;
        dkkv dkkvVar = (dkkv) map.remove(c2);
        if (dkkvVar != null) {
            dkkvVar.cancel();
        }
        dkty.c("Start timer: remote contact will be considered idle in %ds", Long.valueOf(j));
        dkkv dkkvVar2 = new dkkv(this, dkkjVar, str);
        map.put(c2, dkkvVar2);
        c.schedule(dkkvVar2, j * 1000);
    }

    public final void b(dkkj dkkjVar, String str) {
        dkty.c("Stopping timer for contact: %s", dkty.a(str));
        dkkv dkkvVar = (dkkv) a.remove(c(dkkjVar, str));
        if (dkkvVar != null) {
            dkkx dkkxVar = this.b;
            dkkxVar.getClass();
            dkkxVar.a(dkkvVar.a, str, false);
            dkkvVar.cancel();
        }
    }
}
