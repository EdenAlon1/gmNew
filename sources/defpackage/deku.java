package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class deku extends ffhv implements ffjm {
    final /* synthetic */ dekv a;
    final /* synthetic */ cvjl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public deku(dekv dekvVar, cvjl cvjlVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = dekvVar;
        this.b = cvjlVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((deku) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ((akzt) this.a.b.b()).e("Bugle.Welcome.V1.Screen.Shown", dekv.b(this.b));
        if (((avdl) this.a.d.b()).a()) {
            akxn a = ((akyb) this.a.c.b()).a();
            cvjl cvjlVar = this.b;
            eolu eoluVar = (eolu) eolv.a.createBuilder();
            eoluVar.getClass();
            eogy.g(eolt.BUGLE_WELCOME_V1_EVENT, eoluVar);
            eqmj eqmjVar = (eqmj) eqmk.a.createBuilder();
            eqmjVar.getClass();
            eqmv eqmvVar = (eqmv) eqmw.a.createBuilder();
            eqmvVar.getClass();
            eqmvVar.copyOnWrite();
            eqmw eqmwVar = (eqmw) eqmvVar.instance;
            eqmwVar.c = cvjlVar.g;
            eqmwVar.b |= 1;
            eyfy build = eqmvVar.build();
            build.getClass();
            eqmjVar.copyOnWrite();
            eqmk eqmkVar = (eqmk) eqmjVar.instance;
            eqmkVar.c = (eqmw) build;
            eqmkVar.b = 1;
            eogy.l(eqmx.a(eqmjVar), eoluVar);
            a.j((eolu) eogy.a(eoluVar).toBuilder(), alal.LOG_SPEC_BUGLE_WELCOME_V1_EVENT);
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new deku(this.a, this.b, ffguVar);
    }
}
