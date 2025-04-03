package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cmqa extends ffhv implements ffjm {
    final /* synthetic */ cmqb a;
    final /* synthetic */ erbj b;
    final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmqa(cmqb cmqbVar, erbj erbjVar, String str, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = cmqbVar;
        this.b = erbjVar;
        this.c = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmqa) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        akxn a = ((akyb) this.a.b.b()).a();
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eoluVar.getClass();
        eogy.g(eolt.TYCHO_GRPC_EVENT, eoluVar);
        erbg erbgVar = (erbg) erbh.a.createBuilder();
        erbgVar.getClass();
        erbgVar.copyOnWrite();
        erbh erbhVar = (erbh) erbgVar.instance;
        erbhVar.d = this.b;
        erbhVar.c = 2;
        eqpc b = ((dijt) this.a.a.b()).b(new djro(this.c));
        b.getClass();
        erbgVar.copyOnWrite();
        erbh erbhVar2 = (erbh) erbgVar.instance;
        erbhVar2.e = b;
        erbhVar2.b |= 1;
        eyfy build = erbgVar.build();
        build.getClass();
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.cA = (erbh) build;
        eolvVar.h |= 536870912;
        a.j((eolu) eogy.a(eoluVar).toBuilder(), alal.LOG_SPEC_TYCHO_GRPC_EVENTS);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cmqa(this.a, this.b, this.c, ffguVar);
    }
}
