package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dekt extends ffhv implements ffjm {
    final /* synthetic */ dekv a;
    final /* synthetic */ cvjl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dekt(dekv dekvVar, cvjl cvjlVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = dekvVar;
        this.b = cvjlVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dekt) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ((akzt) this.a.b.b()).e("Bugle.Welcome.V1.Screen.Completed", dekv.b(this.b));
        if (((avdl) this.a.d.b()).a()) {
            akxn a = ((akyb) this.a.c.b()).a();
            cvjl cvjlVar = this.b;
            eolu eoluVar = (eolu) eolv.a.createBuilder();
            eoluVar.getClass();
            eogy.g(eolt.BUGLE_WELCOME_V1_EVENT, eoluVar);
            eqmj eqmjVar = (eqmj) eqmk.a.createBuilder();
            eqmjVar.getClass();
            eqmt eqmtVar = (eqmt) eqmu.a.createBuilder();
            eqmtVar.getClass();
            eqmtVar.copyOnWrite();
            eqmu eqmuVar = (eqmu) eqmtVar.instance;
            eqmuVar.c = cvjlVar.g;
            eqmuVar.b |= 1;
            eyfy build = eqmtVar.build();
            build.getClass();
            eqmjVar.copyOnWrite();
            eqmk eqmkVar = (eqmk) eqmjVar.instance;
            eqmkVar.c = (eqmu) build;
            eqmkVar.b = 2;
            eogy.l(eqmx.a(eqmjVar), eoluVar);
            a.j((eolu) eogy.a(eoluVar).toBuilder(), alal.LOG_SPEC_BUGLE_WELCOME_V1_EVENT);
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dekt(this.a, this.b, ffguVar);
    }
}
