package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wmg extends ffhv implements ffjm {
    final /* synthetic */ wmn a;
    final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wmg(wmn wmnVar, int i, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = wmnVar;
        this.b = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wmg) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        akxn a = ((akyb) this.a.d.b()).a();
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eoluVar.getClass();
        eogy.g(eolt.MAGIC_COMPOSE_INPUT_TOKEN_METRIC, eoluVar);
        eqsx eqsxVar = (eqsx) eqsz.a.createBuilder();
        eqsxVar.getClass();
        int i = this.b;
        int i2 = i < 0 ? 1 : i <= 128 ? 2 : i <= 192 ? 3 : i <= 256 ? 4 : 5;
        eqsxVar.copyOnWrite();
        eqsz eqszVar = (eqsz) eqsxVar.instance;
        eqszVar.c = i2 - 1;
        eqszVar.b |= 1;
        eyfy build = eqsxVar.build();
        build.getClass();
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.cf = (eqsz) build;
        eolvVar.h |= 128;
        a.j((eolu) eogy.a(eoluVar).toBuilder(), alal.LOG_SPEC_MAGIC_COMPOSE_EVENTS);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new wmg(this.a, this.b, ffguVar);
    }
}
