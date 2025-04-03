package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amqd implements eikt {
    private static final enru c = enru.c("com/google/android/apps/messaging/shared/api/messaging/conversation/customtheme/transport/IncomingCustomThemesHandler");
    public final alxl a;
    public final aqkp b;
    private final ffsk d;

    public amqd(alxl alxlVar, aqkp aqkpVar, ffsk ffskVar) {
        alxlVar.getClass();
        aqkpVar.getClass();
        ffskVar.getClass();
        this.a = alxlVar;
        this.b = aqkpVar;
        this.d = ffskVar;
    }

    @Override // defpackage.eikt
    public final /* bridge */ /* synthetic */ void a(eyhs eyhsVar, eiks eiksVar) {
        ckkz ckkzVar = (ckkz) eyhsVar;
        enrr enrrVar = (enrr) c.h();
        enrrVar.Y(new ensn("custom_theme_id", Integer.class, false, false), Integer.valueOf(ckkzVar.c));
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/api/messaging/conversation/customtheme/transport/IncomingCustomThemesHandler", "onMessageReceived", 31, "IncomingCustomThemesHandler.kt")).q("Received custom theme message.");
        if (eiksVar.a == null) {
            return;
        }
        axol.k(this.d, null, new amqb(this, eiksVar, new amqc(ckkzVar, eiksVar), null), 3);
    }
}
