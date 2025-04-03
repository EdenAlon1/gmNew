package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yxp extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aqux b;
    final /* synthetic */ yya c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yxp(aqux aquxVar, yya yyaVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aquxVar;
        this.c = yyaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yxp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ensk e = yya.a.e();
            e.Y(ente.a, "BugleComposeRow2");
            ((enrr) e.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/sim/SimSelectorUiAdapterImpl$onSelect$1", "invokeSuspend", 159, "SimSelectorUiAdapterImpl.kt")).t("Selected self identity: %s", this.b);
            yya yyaVar = this.c;
            elfl t = yyaVar.e.t(yyaVar.c, this.b);
            t.getClass();
            this.a = 1;
            obj = fgfz.c(t, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            ensk e2 = yya.a.e();
            e2.Y(ente.a, "BugleComposeRow2");
            ((enrr) e2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/sim/SimSelectorUiAdapterImpl$onSelect$1", "invokeSuspend", 163, "SimSelectorUiAdapterImpl.kt")).t("Updated the conversation active self identity: %s", this.b);
        } else {
            ensk h = yya.a.h();
            h.Y(ente.a, "BugleComposeRow2");
            ((enrr) h.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/sim/SimSelectorUiAdapterImpl$onSelect$1", "invokeSuspend", 165, "SimSelectorUiAdapterImpl.kt")).q("Failed to update the conversation active self identity");
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new yxp(this.b, this.c, ffguVar);
    }
}
