package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class febv {
    public final int a;
    public final fecp b;
    public final feds c;
    public final fecb d;
    public final ScheduledExecutorService e;
    public final Executor f;
    private final fdxm g;
    private final ferb h;

    public febv(febu febuVar) {
        Integer num = febuVar.a;
        num.getClass();
        this.a = num.intValue();
        fecp fecpVar = febuVar.b;
        fecpVar.getClass();
        this.b = fecpVar;
        feds fedsVar = febuVar.c;
        fedsVar.getClass();
        this.c = fedsVar;
        fecb fecbVar = febuVar.d;
        fecbVar.getClass();
        this.d = fecbVar;
        this.e = febuVar.e;
        this.g = febuVar.f;
        this.f = febuVar.g;
        this.h = febuVar.h;
    }

    public final String toString() {
        emwz b = emxa.b(this);
        b.f("defaultPort", this.a);
        b.b("proxyDetector", this.b);
        b.b("syncContext", this.c);
        b.b("serviceConfigParser", this.d);
        b.b("customArgs", null);
        b.b("scheduledExecutorService", this.e);
        b.b("channelLogger", this.g);
        b.b("executor", this.f);
        b.b("overrideAuthority", null);
        b.b("metricRecorder", this.h);
        return b.toString();
    }
}
