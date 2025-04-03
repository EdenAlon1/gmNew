package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chkl {
    public static final cfup a = cfvl.f(cfvl.b, "verified_sms_registration_deadline_timeout_ms", TimeUnit.SECONDS.toMillis(60));
    private eteh b;
    private final Object c = new Object();
    private final chhs d;

    public chkl(chhs chhsVar) {
        this.d = chhsVar;
    }

    public final eteh a() {
        eteh etehVar;
        feau feauVar;
        synchronized (this.c) {
            if (this.b == null) {
                chhs chhsVar = this.d;
                synchronized (chhsVar.u) {
                    feauVar = chhsVar.t;
                    if (feauVar == null) {
                        ensk e = chhs.a.e();
                        e.Y(ente.a, "BugleNetwork");
                        ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/net/common/GrpcChannelManager", "getVerifiedSmsChannel", 324, "GrpcChannelManager.java")).q("Creating Verified SMS Channel gRPC Channel");
                        feauVar = chhsVar.b((String) cful.ad.e(), ((Long) chhs.g.e()).longValue(), ((Long) chhs.h.e()).longValue(), chhsVar.g(8));
                        chhsVar.t = feauVar;
                    }
                }
                eteh etehVar2 = (eteh) eteh.h(new eteg(), feauVar);
                febo feboVar = new febo();
                febf febfVar = febo.c;
                int i = febj.d;
                feboVar.g(new febe("X-Goog-Api-Key", febfVar), "AIzaSyAKnDfiZeg6YM0hdZq29oAdumr3VXOcYJc");
                this.b = (eteh) etehVar2.l(new ffaw(feboVar));
            }
            etehVar = this.b;
        }
        return etehVar;
    }
}
