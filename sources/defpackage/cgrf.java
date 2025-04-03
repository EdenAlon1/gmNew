package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgrf extends ceut {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/message/delete/DeletePartCmsAttachmentHandler");
    private final ffsk b;
    private final cfyt c;

    public cgrf(ffsk ffskVar, cfyt cfytVar) {
        ffskVar.getClass();
        cfytVar.getClass();
        this.b = ffskVar;
        this.c = cfytVar;
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("DeletePartCmsAttachmentHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        eyhz parserForType = cgrh.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.ceut
    public final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        elfl c;
        cgrh cgrhVar = (cgrh) eyhsVar;
        cgrhVar.getClass();
        c = axol.c(this.b, ffhe.a, ffsm.a, new cgre(cgrhVar, this, null));
        return c;
    }

    public final Object k(String str, String str2, Throwable th, ffgu ffguVar) {
        Object c;
        enrr a2 = a.a(Level.WARNING);
        a2.Y(ente.a, "BugleCmsMedia");
        a2.Y(cdii.k, str2);
        ((enrr) a2.g(th).h("com/google/android/apps/messaging/shared/message/delete/DeletePartCmsAttachmentHandler", "processFailure", 103, "DeletePartCmsAttachmentHandler.kt")).q(str);
        return (th == null || (c = fgfz.c(this.c.b(th), ffguVar)) != ffhh.a) ? ffcu.a : c;
    }
}
