package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.concurrent.ScheduledFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkst {
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final HashMap b = new HashMap();
    public ScheduledFuture c;

    public final void a(Object obj) {
        if (((dkss) this.a.remove(obj)) != null) {
            this.b.remove(null);
        }
    }
}
