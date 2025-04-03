package defpackage;

import io.grpc.Status;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euzz implements evbq {
    private static final entd a = entd.c("xRPC");
    private final ffbr b;

    public euzz(ffbr ffbrVar) {
        this.b = ffbrVar;
    }

    @Override // defpackage.evbq
    public final fdxk a(evbp evbpVar) {
        efbd.b();
        try {
            fehv l = fehv.l(evbpVar.r(), evbpVar.q(), (CronetEngine) this.b.b());
            String str = ((euzu) evbpVar).f;
            if (str == null) {
                str = new CronetEngine.Builder(((euzu) evbpVar).a).getDefaultUserAgent();
            }
            l.k(str);
            l.g(((euzu) evbpVar).d);
            l.j(((euzu) evbpVar).c);
            l.h(((euzu) evbpVar).k, TimeUnit.MILLISECONDS);
            int i = ((euzu) evbpVar).l;
            emxf.b(i >= 0, "maxMessageSize must be >= 0");
            l.d = i;
            ScheduledExecutorService scheduledExecutorService = ((euzu) evbpVar).e;
            if (scheduledExecutorService != null) {
                l.a = scheduledExecutorService;
            }
            evag evagVar = ((euzu) evbpVar).h;
            if (evagVar != null) {
                enqu listIterator = evagVar.a().listIterator();
                while (true) {
                    if (!listIterator.hasNext()) {
                        break;
                    }
                    if (((evaf) listIterator.next()).a() != null) {
                        l.f();
                        int i2 = engw.d;
                        engr engrVar = new engr();
                        enqu listIterator2 = evagVar.a().listIterator();
                        while (listIterator2.hasNext()) {
                            evaf evafVar = (evaf) listIterator2.next();
                            enhd enhdVar = new enhd();
                            enhd enhdVar2 = new enhd();
                            enhdVar2.k("service", evafVar.b());
                            evafVar.c();
                            enhdVar.k("name", engw.r(enhdVar2.c()));
                            evae a2 = evafVar.a();
                            if (a2 != null && ((euzq) a2).a) {
                                enhd enhdVar3 = new enhd();
                                enhdVar3.k("maxAttempts", Double.valueOf(((euzq) a2).b));
                                enhdVar3.k("initialBackoff", ((euzq) a2).c + "s");
                                enhdVar3.k("maxBackoff", ((euzq) a2).d + "s");
                                enhdVar3.k("backoffMultiplier", Double.valueOf(((euzq) a2).e));
                                enhdVar3.k("retryableStatusCodes", enkr.g(((euzq) a2).f, new emwl() { // from class: evac
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj) {
                                        return ((Status.Code) obj).name();
                                    }
                                }));
                                enhdVar.g(enhk.l("retryPolicy", enhdVar3.c()));
                            }
                            engrVar.h(enhdVar.c());
                        }
                        l.e(enhk.l("methodConfig", engrVar.g()));
                    }
                }
            }
            Integer num = ((euzu) evbpVar).i;
            if (num != null) {
                int intValue = num.intValue();
                l.g = true;
                l.h = intValue;
            }
            Integer num2 = ((euzu) evbpVar).j;
            if (num2 != null) {
                l.m(num2.intValue());
            }
            return fdxr.b(l.a(), new duir(new duiy(((euzu) evbpVar).g)));
        } catch (IllegalStateException | UnsatisfiedLinkError e) {
            ((ensz) ((ensz) ((ensz) a.i()).g(e)).h("com/google/frameworks/client/data/android/CronetWithOkHttpFallbackTransport", "getTransportChannel", '\'', "CronetWithOkHttpFallbackTransport.java")).q("Failed to load Cronet, falling back on OkHttp implementation");
            fexv fexvVar = new fexv(evbpVar.r(), evbpVar.q());
            euzu euzuVar = (euzu) evbpVar;
            fexvVar.g(euzuVar.d);
            fexvVar.o(euzuVar.c);
            fexvVar.j(euzuVar.c);
            fexvVar.h(euzuVar.k, TimeUnit.MILLISECONDS);
            fexvVar.m(euzuVar.m, TimeUnit.MILLISECONDS);
            fexvVar.n(euzuVar.m, TimeUnit.MILLISECONDS);
            ScheduledExecutorService scheduledExecutorService2 = euzuVar.e;
            if (scheduledExecutorService2 != null) {
                fexvVar.e = new femo(scheduledExecutorService2);
            }
            String str2 = euzuVar.f;
            if (str2 != null) {
                fexvVar.k(str2);
            }
            return fdxr.b(fexvVar.a(), new duiy(euzuVar.g));
        }
    }
}
