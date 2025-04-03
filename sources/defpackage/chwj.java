package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class chwj extends ffhv implements ffjm {
    int a;
    final /* synthetic */ chwk b;
    final /* synthetic */ fcfo c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chwj(chwk chwkVar, fcfo fcfoVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = chwkVar;
        this.c = fcfoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chwj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            elfl a = this.b.a.a();
            this.a = 1;
            obj = fgfz.c(a, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        fcfn fcfnVar = (fcfn) fcfo.a.createBuilder(this.c);
        chwk chwkVar = this.b;
        fcfnVar.copyOnWrite();
        ((fcfo) fcfnVar.instance).e = chwkVar.b.a;
        eyee x = eyee.x((byte[]) obj);
        fcfnVar.copyOnWrite();
        ((fcfo) fcfnVar.instance).f = x;
        eyfy build = fcfnVar.build();
        build.getClass();
        fbzd fbzdVar = (fbzd) fbze.a.createBuilder();
        fbzdVar.copyOnWrite();
        fbze fbzeVar = (fbze) fbzdVar.instance;
        fbzeVar.c = (fcfo) build;
        fbzeVar.b |= 1;
        eyfy build2 = fbzdVar.build();
        build2.getClass();
        return build2;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new chwj(this.b, this.c, ffguVar);
    }
}
