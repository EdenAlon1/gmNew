package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class chnd implements copf {
    final /* synthetic */ chmb a;
    final /* synthetic */ errl b;
    final /* synthetic */ akzt c;

    public chnd(chmb chmbVar, errl errlVar, akzt akztVar) {
        this.a = chmbVar;
        this.b = errlVar;
        this.c = akztVar;
    }

    @Override // defpackage.copf
    public final /* synthetic */ elfl a() {
        return cope.a();
    }

    @Override // defpackage.copf
    public final elfl b() {
        final chli chliVar = (chli) chlj.a.createBuilder();
        return elfl.g(this.a.a.a()).h(new emwl() { // from class: chma
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Long.valueOf(((chlr) obj).f);
            }
        }, erpp.a).h(new emwl() { // from class: chnc
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                long longValue = ((Long) obj).longValue();
                chli chliVar2 = chli.this;
                chliVar2.copyOnWrite();
                chlj chljVar = (chlj) chliVar2.instance;
                chlj chljVar2 = chlj.a;
                chljVar.b = longValue;
                return (chlj) chliVar2.build();
            }
        }, this.b);
    }

    @Override // defpackage.copg
    public final void c() {
        this.c.c("Bugle.Firebase.Registration.Data.Migration.Counts");
    }
}
