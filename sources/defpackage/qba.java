package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qba {
    public static final String a = ppt.d("WorkTimer");
    public final pqj b;
    public final Map c = new HashMap();
    public final Map d = new HashMap();
    public final Object e = new Object();

    public qba(pqj pqjVar) {
        this.b = pqjVar;
    }

    public final void a(pxs pxsVar) {
        synchronized (this.e) {
            if (((qaz) this.c.remove(pxsVar)) != null) {
                ppt.c().a(a, a.n(pxsVar, "Stopping timer for "));
                this.d.remove(pxsVar);
            }
        }
    }
}
