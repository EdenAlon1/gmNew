package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajgp {
    public static final enru a = enru.c("com/google/android/apps/messaging/penpal/transport/grpc/GeminiLocationGrpcImpl");
    public final chhs b;
    private final ffbr c;

    public ajgp(chhs chhsVar, ffbr ffbrVar) {
        chhsVar.getClass();
        ffbrVar.getClass();
        this.b = chhsVar;
        this.c = ffbrVar;
    }

    public final fbqm a(fcek fcekVar, febo feboVar) {
        return (fbqm) ((fbqm) ((chhv) this.c.b()).a(fcekVar, new ffjm() { // from class: ajgo
            @Override // defpackage.ffjm
            public final Object a(Object obj, Object obj2) {
                fdxk fdxkVar = (fdxk) obj;
                fdxkVar.getClass();
                ((febo) obj2).getClass();
                return fbqn.a(fdxkVar);
            }
        })).l(new ffaw(feboVar));
    }

    public final fbqm b(fcek fcekVar) {
        ensk e = a.e();
        e.Y(ente.a, "Bugle");
        ((enrr) e.h("com/google/android/apps/messaging/penpal/transport/grpc/GeminiLocationGrpcImpl", "getSmartMessagingFutureStubTachyonAuth", 47, "GeminiLocationGrpcImpl.kt")).q("Creating Penpal gRPC stub");
        return a(fcekVar, this.b.e());
    }
}
