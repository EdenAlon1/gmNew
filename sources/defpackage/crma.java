package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crma {
    public static final cskc a = cskc.g("BugleNetwork", "ChatContentDecoratorGrpc");
    private final chhs b;
    private fbqm c;

    public crma(chhs chhsVar) {
        this.b = chhsVar;
    }

    public final synchronized fbqm a() {
        feau feauVar;
        if (this.c == null) {
            try {
                chhs chhsVar = this.b;
                synchronized (chhsVar.l) {
                    feauVar = chhsVar.k;
                    if (feauVar == null) {
                        ensk e = chhs.a.e();
                        e.Y(ente.a, "BugleNetwork");
                        ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/net/common/GrpcChannelManager", "getSmartTachyonGrpcChannel", 234, "GrpcChannelManager.java")).q("Creating Tachyon gRPC Channel");
                        feauVar = chhsVar.a((String) chhs.c.e(), chhsVar.g(5));
                        chhsVar.k = feauVar;
                    }
                }
                this.c = (fbqm) fbqn.a(feauVar).l(new ffaw(this.b.e()));
            } catch (Exception e2) {
                a.s("ChatContentDecoratorGrpc: Exception in creating a new stub: ", e2);
                this.c = null;
            }
        }
        return this.c;
    }
}
