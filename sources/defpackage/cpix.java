package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpix {
    private static final entd a = entd.c("BugleTachygram");
    private final cpke b;

    public cpix(cpke cpkeVar) {
        this.b = cpkeVar;
    }

    public final elfl a(esqv esqvVar) {
        eyee eyeeVar = esqvVar.a.a.e;
        if (!eyee.b.equals(eyeeVar)) {
            return this.b.c(esqvVar.a.a.c, eyeeVar);
        }
        ensz enszVar = (ensz) a.j();
        enszVar.Y(csux.J, esqvVar.a.a.c);
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/tachygram/chat/RoutingInfoTokenForwarder", "storeRoutingInfoToken", 32, "RoutingInfoTokenForwarder.java")).q("GroupInfo missing routing info token.");
        return elfo.e(null);
    }
}
