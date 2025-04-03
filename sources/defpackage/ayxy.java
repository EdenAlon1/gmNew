package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayxy extends ceut {
    public final entd a = entd.c("BugleBCM");
    private final ayxs b;

    public ayxy(ayxs ayxsVar) {
        this.b = ayxsVar;
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("ConversationDedupingWorkHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        eyhz parserForType = ayxo.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.ceut
    public final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        elfl c;
        ((ayxo) eyhsVar).getClass();
        ffix ffixVar = new ffix() { // from class: ayxx
            @Override // defpackage.ffix
            public final Object invoke() {
                ((ensz) ayxy.this.a.h()).q("ConversationDedupingWorkHandler finished proccessing work item");
                return ceyt.i();
            }
        };
        ayxw ayxwVar = (ayxw) this.b;
        c = axol.c(ayxwVar.a, ffhe.a, ffsm.a, new ayxv(ayxwVar, ffixVar, null));
        return c;
    }
}
