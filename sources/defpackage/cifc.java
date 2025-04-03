package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cifc implements cifg {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/net/handler/ditto/PrewarmDelegate");
    private final ffsk b;

    public cifc(ffsk ffskVar) {
        ffskVar.getClass();
        this.b = ffskVar;
    }

    @Override // defpackage.cifg
    public final /* synthetic */ elfl a(ciff ciffVar) {
        return cife.a(this, ciffVar);
    }

    @Override // defpackage.cifg
    public final /* bridge */ /* synthetic */ elfl b(ciff ciffVar, eyhs eyhsVar) {
        elfl c;
        ((esau) eyhsVar).getClass();
        ensk e = a.e();
        e.Y(ente.a, "BugleDitto");
        enrr enrrVar = (enrr) e;
        enrrVar.Y(csux.O, getClass().getSimpleName());
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/net/handler/ditto/PrewarmDelegate", "handleRequestInternal", 37, "PrewarmDelegate.kt")).q("Pre-warming bugle.");
        c = axol.c(this.b, ffhe.a, ffsm.a, new cifb(null));
        return c;
    }

    @Override // defpackage.cifg
    public final /* bridge */ /* synthetic */ eyhs c(eyee eyeeVar) {
        esau esauVar = (esau) eyfy.parseFrom(esau.a, eyeeVar, eyfc.a());
        esauVar.getClass();
        return esauVar;
    }
}
