package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deko extends ffhv implements ffjm {
    final /* synthetic */ dekv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public deko(dekv dekvVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = dekvVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((deko) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ((akzt) this.a.b.b()).c("Bugle.Welcome.V1.Screen.EditName");
        if (((avdl) this.a.d.b()).a()) {
            akxn a = ((akyb) this.a.c.b()).a();
            eolu eoluVar = (eolu) eolv.a.createBuilder();
            eoluVar.getClass();
            eogy.g(eolt.BUGLE_WELCOME_V1_EVENT, eoluVar);
            eqmj eqmjVar = (eqmj) eqmk.a.createBuilder();
            eqmjVar.getClass();
            eqml eqmlVar = (eqml) eqmm.a.createBuilder();
            eqmlVar.getClass();
            eyfy build = eqmlVar.build();
            build.getClass();
            eqmjVar.copyOnWrite();
            eqmk eqmkVar = (eqmk) eqmjVar.instance;
            eqmkVar.c = (eqmm) build;
            eqmkVar.b = 5;
            eogy.l(eqmx.a(eqmjVar), eoluVar);
            a.j((eolu) eogy.a(eoluVar).toBuilder(), alal.LOG_SPEC_BUGLE_WELCOME_V1_EVENT);
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new deko(this.a, ffguVar);
    }
}
