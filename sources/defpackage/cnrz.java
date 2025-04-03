package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnrz extends ffhv implements ffjm {
    final /* synthetic */ cnsb a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnrz(ffgu ffguVar, cnsb cnsbVar) {
        super(2, ffguVar);
        this.a = cnsbVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cnrz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        eyew eyewVar = (eyew) eyex.a.createBuilder();
        eyewVar.getClass();
        eyfy build = eyewVar.build();
        build.getClass();
        cetp cetpVar = new cetp();
        cetpVar.b = "retrieve_questionnaire_task";
        return ((cevh) this.a.b.a.b()).a(ceyr.h("retrieve_questionnaire", (eyex) build, cetpVar.a()));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cnrz cnrzVar = new cnrz(ffguVar, this.a);
        cnrzVar.b = obj;
        return cnrzVar;
    }
}
