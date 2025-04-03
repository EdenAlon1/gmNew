package defpackage;

import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.net.URI;
import java.net.URISyntaxException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eveq extends fdxk {
    private final String a;
    private final euzw b;
    private final Object c = new Object();
    private final ConcurrentHashMap d = new ConcurrentHashMap();

    public eveq(String str, euzw euzwVar) {
        this.a = str;
        this.b = euzwVar;
    }

    private static final URI c(String str) {
        try {
            URI uri = new URI(null, str, null, null, null);
            return uri.getPort() != -1 ? uri : new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), 443, uri.getPath(), uri.getQuery(), uri.getFragment());
        } catch (URISyntaxException e) {
            throw new IllegalStateException("Malformed endpoint authority", e);
        }
    }

    @Override // defpackage.fdxk
    public final fdxo a(febs febsVar, fdxj fdxjVar) {
        String str = (String) fdxjVar.h(evbm.a);
        euzw euzwVar = this.b;
        if (str == null) {
            str = this.a;
        }
        URI c = c(str);
        emxf.m(!TextUtils.isEmpty(c.getAuthority()), "Could not parse channel authority");
        Integer num = (Integer) fdxjVar.h(evgq.a);
        Integer num2 = (Integer) fdxjVar.h(evgq.b);
        Integer num3 = (Integer) fdxjVar.h(evbi.a);
        long longValue = ((Long) ((emyr) ((euzm) this.b).j).a).longValue();
        euzm euzmVar = (euzm) this.b;
        evds evdsVar = new evds(c, longValue, euzmVar.m, euzmVar.n, num, num2, num3);
        eveo eveoVar = (eveo) this.d.get(evdsVar);
        if (eveoVar == null) {
            synchronized (this.c) {
                if (!this.d.containsKey(evdsVar)) {
                    long j = evbp.n;
                    emyr emyrVar = new emyr(false);
                    euzt euztVar = new euzt();
                    euztVar.h = emyrVar;
                    euztVar.c(4194304);
                    euztVar.a(Long.MAX_VALUE);
                    euztVar.b(evbp.n);
                    euztVar.a = ((euzm) euzwVar).a;
                    euztVar.b = evdsVar.a;
                    euztVar.j = evdsVar.c;
                    euztVar.k = evdsVar.d;
                    euztVar.l = evdsVar.b;
                    euztVar.p = (byte) (euztVar.p | 1);
                    euztVar.c = ((euzm) euzwVar).d;
                    euztVar.d = ((euzm) euzwVar).e;
                    euztVar.e = ((euzm) euzwVar).c;
                    euztVar.f = ((euzm) euzwVar).f;
                    euztVar.g = ((euzm) euzwVar).h;
                    euztVar.h = ((euzm) euzwVar).i;
                    euztVar.i = ((euzm) euzwVar).k;
                    euztVar.a(((euzm) euzwVar).m);
                    euztVar.b(((euzm) euzwVar).n);
                    Integer num4 = evdsVar.e;
                    if (num4 != null) {
                        euztVar.c(num4.intValue());
                    } else {
                        euztVar.c(((euzm) euzwVar).l);
                    }
                    evbq evbqVar = ((euzm) euzwVar).b;
                    if (euztVar.p == 15 && euztVar.a != null && euztVar.b != null && euztVar.c != null && euztVar.d != null && euztVar.e != null && euztVar.h != null) {
                        this.d.put(evdsVar, new eveo(evbqVar, new euzu(euztVar.a, euztVar.b, euztVar.c, euztVar.d, euztVar.e, euztVar.f, euztVar.g, euztVar.h, euztVar.i, euztVar.j, euztVar.k, euztVar.l, euztVar.m, euztVar.n, euztVar.o)));
                    }
                    StringBuilder sb = new StringBuilder();
                    if (euztVar.a == null) {
                        sb.append(" applicationContext");
                    }
                    if (euztVar.b == null) {
                        sb.append(" uri");
                    }
                    if (euztVar.c == null) {
                        sb.append(" backgroundExecutor");
                    }
                    if (euztVar.d == null) {
                        sb.append(" blockingExecutor");
                    }
                    if (euztVar.e == null) {
                        sb.append(" lightweightExecutor");
                    }
                    if (euztVar.h == null) {
                        sb.append(" recordNetworkMetricsToPrimes");
                    }
                    if ((euztVar.p & 1) == 0) {
                        sb.append(" grpcIdleTimeoutMillis");
                    }
                    if ((euztVar.p & 2) == 0) {
                        sb.append(" maxMessageSize");
                    }
                    if ((euztVar.p & 4) == 0) {
                        sb.append(" grpcKeepAliveTimeMillis");
                    }
                    if ((euztVar.p & 8) == 0) {
                        sb.append(" grpcKeepAliveTimeoutMillis");
                    }
                    throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                }
                eveoVar = (eveo) this.d.get(evdsVar);
            }
        }
        return eveoVar.a(febsVar, fdxjVar);
    }

    @Override // defpackage.fdxk
    public final String b() {
        return this.a;
    }
}
