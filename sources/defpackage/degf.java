package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class degf extends ceut {
    public static final entd a = entd.c("BugleWearable");
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    private final ffsk e;
    private final ffbr f;
    private final ffbr g;

    public degf(ffsk ffskVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5) {
        ffskVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        this.e = ffskVar;
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.f = ffbrVar3;
        this.g = ffbrVar4;
        this.d = ffbrVar5;
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        poh pohVar = new poh();
        pohVar.c(2);
        ((ceti) l).a = pohVar.a();
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("LoadPagedConversationTimeoutFallbackHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        eyhz parserForType = defr.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final /* bridge */ /* synthetic */ boolean h(eyhs eyhsVar) {
        defr defrVar = (defr) eyhsVar;
        defrVar.getClass();
        if (!((cvhp) this.f.b()).a().booleanValue()) {
            return false;
        }
        if (!((cvhr) this.g.b()).b()) {
            ensk o = a.o();
            o.Y(csux.O, "LoadPagedConversationTimeoutFallbackHandler");
            o.q("Skip sending paged conversation data to wear device.");
            return false;
        }
        String str = defrVar.c;
        str.getClass();
        if (str.length() != 0) {
            return true;
        }
        ensk o2 = a.o();
        o2.Y(csux.O, "LoadPagedConversationTimeoutFallbackHandler");
        o2.q("Connected watch node Id is empty. Skip sending paged conversation data to wear device.");
        return false;
    }

    @Override // defpackage.ceut
    public final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        elfl c;
        defr defrVar = (defr) eyhsVar;
        defrVar.getClass();
        ((akzt) ((defd) this.d.b()).a.b()).c("Bugle.Wear.Phone.LoadConversation.TimeoutFallback.Started");
        c = axol.c(this.e, ffhe.a, ffsm.a, new dege(this, defrVar, null));
        return c;
    }
}
