package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuvq {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/util/spam/tachyon/TachyonSpamAbuseStub");
    private static final cfup b = cfvl.e(cfvl.b, "tachyon_spam_grpc_deadline_seconds", 10);
    private final ffbr c;
    private fbct d;
    private final Object e;

    public cuvq(ffbr ffbrVar) {
        ffbrVar.getClass();
        this.c = ffbrVar;
        this.e = new Object();
    }

    public final fbct a() {
        feau feauVar;
        fbct fbctVar;
        synchronized (this.e) {
            if (this.d == null) {
                try {
                    chhs chhsVar = (chhs) this.c.b();
                    synchronized (chhsVar.s) {
                        feauVar = chhsVar.r;
                        if (feauVar == null) {
                            ensk e = chhs.a.e();
                            e.Y(ente.a, "BugleNetwork");
                            ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/net/common/GrpcChannelManager", "getTachyonSpamChannel", 309, "GrpcChannelManager.java")).q("Creating Tachyon Spam gRPC Channel");
                            feauVar = chhsVar.a((String) chhs.d.e(), chhsVar.g(7));
                            chhsVar.r = feauVar;
                        }
                    }
                    this.d = (fbct) ((fbct) fbct.h(new fbcs(), feauVar)).l(new ffaw(((chhs) this.c.b()).e()));
                } catch (Exception e2) {
                    ensk j = a.j();
                    j.Y(ente.a, "BugleSpam");
                    ((enrr) ((enrr) j).g(e2).h("com/google/android/apps/messaging/shared/util/spam/tachyon/TachyonSpamAbuseStub", "getAbuseStub", 38, "TachyonSpamAbuseStub.kt")).q("Cannot create stub for spam tachyon grpc");
                    return null;
                }
            }
            fbct fbctVar2 = this.d;
            fbctVar2.getClass();
            fbctVar = (fbct) fbctVar2.j(((Number) b.e()).intValue(), TimeUnit.SECONDS);
        }
        return fbctVar;
    }
}
