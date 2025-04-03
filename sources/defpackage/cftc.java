package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cftc implements eikt {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/emergency/session/IncomingSessionNotificationHandler");
    public final boolean b;
    public final long c;
    public final ffbr d;
    public final ffbr e;
    private final ffsk f;
    private final ffbr g;

    public cftc(boolean z, long j, ffsk ffskVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        ffskVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        this.b = z;
        this.c = j;
        this.f = ffskVar;
        this.d = ffbrVar;
        this.g = ffbrVar2;
        this.e = ffbrVar3;
    }

    @Override // defpackage.eikt
    public final /* bridge */ /* synthetic */ void a(eyhs eyhsVar, eiks eiksVar) {
        esop esopVar = (esop) eyhsVar;
        if (!((attl) this.g.b()).a()) {
            enrr enrrVar = (enrr) a.j();
            enrrVar.Y(csux.E, eiksVar.c.j());
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/emergency/session/IncomingSessionNotificationHandler", "onMessageReceived", 49, "IncomingSessionNotificationHandler.kt")).q("Received an emergency SessionNotification emergency RCS messaging flag is turned off.");
            return;
        }
        if (!eiksVar.c.e().isEmpty()) {
            axol.k(this.f, null, new cftb(this, eiksVar, esopVar, null), 3);
            return;
        }
        enrr enrrVar2 = (enrr) a.j();
        enrrVar2.Y(csux.E, eiksVar.c.j());
        ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/emergency/session/IncomingSessionNotificationHandler", "onMessageReceived", 59, "IncomingSessionNotificationHandler.kt")).q("Received an emergency SessionNotification but messaging identity has no RCS identifier.");
    }
}
