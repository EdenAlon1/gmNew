package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cmsr extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cmss b;
    final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmsr(cmss cmssVar, boolean z, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cmssVar;
        this.c = z;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmsr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cmss cmssVar = this.b;
            final boolean z = this.c;
            final ffji ffjiVar = new ffji() { // from class: cmsp
                @Override // defpackage.ffji
                public final Object invoke(Object obj2) {
                    cmsu cmsuVar = (cmsu) cmsv.a.createBuilder();
                    cmsuVar.getClass();
                    cmsuVar.copyOnWrite();
                    cmsv cmsvVar = (cmsv) cmsuVar.instance;
                    cmsvVar.b |= 1;
                    cmsvVar.c = z;
                    eyfy build = cmsuVar.build();
                    build.getClass();
                    return (cmsv) build;
                }
            };
            elfl j = cmssVar.a.j(new emwl() { // from class: cmsq
                @Override // defpackage.emwl
                public final Object apply(Object obj2) {
                    return ffji.this.invoke(obj2);
                }
            });
            this.a = 1;
            if (fgfz.c(j, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        this.b.c.c(true != this.c ? "Bugle.MessageReactions.Ios.Opt.Out.Count" : "Bugle.MessageReactions.Ios.Opt.In.Count");
        this.b.b.a(elfo.e(null), "REACTIONS_SETTINGS_DATASERVICE_KEY");
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cmsr(this.b, this.c, ffguVar);
    }
}
