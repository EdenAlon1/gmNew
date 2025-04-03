package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes7.dex */
public final class chiv implements chht {
    private final chhs a;

    public chiv(chhs chhsVar) {
        this.a = chhsVar;
    }

    @Override // defpackage.chht
    public final feau a() {
        chhs chhsVar = this.a;
        synchronized (chhsVar.n) {
            feau feauVar = chhsVar.m;
            if (feauVar != null) {
                return feauVar;
            }
            String f = chhsVar.f();
            ensk e = chhs.a.e();
            e.Y(ente.a, "BugleNetwork");
            ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/net/common/GrpcChannelManager", "getTachyonPhoneGrpcChannel", 267, "GrpcChannelManager.java")).q("Creating Tachyon Phone gRPC Channel");
            feau c = chhsVar.c(f);
            chhsVar.m = c;
            return c;
        }
    }

    @Override // defpackage.chht
    public final febo b() {
        return this.a.e();
    }
}
