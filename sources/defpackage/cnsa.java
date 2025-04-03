package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnsa extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cnsb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnsa(cnsb cnsbVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cnsbVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cnsa) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2 = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cnsb cnsbVar = this.b;
            this.a = 1;
            ensk h = cnsb.a.h();
            h.Y(ente.a, "BugleSatellite");
            ((enrr) h.h("com/google/android/apps/messaging/shared/satelliteapi/outgoing/questionnaireretriever/RetrieveQuestionnaireScheduler", "retrieveQuestionnaire", 38, "RetrieveQuestionnaireScheduler.kt")).q("Scheduling RetrieveQuestionnaireWorkHandler task in PWQ.");
            Object a = ffra.a(ekxi.a(cnsbVar.c), new cnrz(null, cnsbVar), this);
            if (a != ffhh.a) {
                a = ffcu.a;
            }
            if (a == obj2) {
                return obj2;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cnsa(this.b, ffguVar);
    }
}
