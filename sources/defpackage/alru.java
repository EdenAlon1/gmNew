package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.DeviceData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alru {
    private final Map e = new ConcurrentHashMap();
    public final Map a = new ConcurrentHashMap();
    private final Map f = new ConcurrentHashMap();
    private final Map g = new ConcurrentHashMap();
    private final Map h = new ConcurrentHashMap();
    public final Map b = new ConcurrentHashMap();
    private final Map i = new ConcurrentHashMap();
    private final Map j = new ConcurrentHashMap();
    public final Map c = new ConcurrentHashMap();
    public final Map d = new ConcurrentHashMap();

    final altj a(String str) {
        return (altj) this.e.get(str);
    }

    public final eonv b(String str) {
        return this.h.containsKey(str) ? (eonv) this.h.get(str) : eonv.UNKNOWN_INSTANT_MESSAGING_ALWAYS_ON;
    }

    public final eooe c(String str) {
        return this.i.containsKey(str) ? (eooe) this.i.get(str) : eooe.UNKNOWN_RCS_STATUS_REASON;
    }

    public final eoog d(String str) {
        eoog eoogVar;
        return (!this.g.containsKey(str) || (eoogVar = (eoog) this.g.remove(str)) == null) ? eoog.UNKNOWN_RESEND_ATTEMPT : eoogVar;
    }

    public final Integer e(String str) {
        return (Integer) this.f.get(str);
    }

    public final void f(MessageCoreData messageCoreData) {
        if (messageCoreData == null || messageCoreData.B().c() || messageCoreData.y() == null) {
            return;
        }
        String b = messageCoreData.B().b();
        MessageUsageStatisticsData y = messageCoreData.y();
        this.e.put(b, new altj(messageCoreData));
        if (y.d() != null) {
            Map map = this.a;
            DeviceData d = y.d();
            d.getClass();
            map.put(b, d);
        }
        this.f.put(b, Integer.valueOf(y.a()));
        this.g.put(b, y.i());
        this.h.put(b, y.g());
        this.b.put(b, y.k());
        this.i.put(b, y.h());
        this.j.put(b, Integer.valueOf(y.b()));
        eoxo l = y.l();
        if (l != null) {
            this.c.put(b, l);
        }
        this.d.put(b, Long.valueOf(y.c()));
    }
}
