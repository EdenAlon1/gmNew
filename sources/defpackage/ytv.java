package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ytv extends ffhv implements ffjm {
    int a;
    final /* synthetic */ yud b;
    final /* synthetic */ String c = "Location";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ytv(yud yudVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = yudVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ytv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ytv ytvVar;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            ytvVar = this;
        } else {
            yud yudVar = this.b;
            String str = this.c;
            ffix ffixVar = new ffix() { // from class: ytu
                @Override // defpackage.ffix
                public final Object invoke() {
                    ensk e = yud.a.e();
                    e.Y(ente.a, "BugleComposeRow2");
                    ((enrr) e.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/location/LocationHandlerImpl$checkForAndHandlePendingResult$1", "invokeSuspend$lambda$0", 180, "LocationHandlerImpl.kt")).q("Location picker opened flag detected, attempting to recover result");
                    return ffcu.a;
                }
            };
            this.a = 1;
            ytvVar = this;
            obj = yse.b(yudVar.f, "location_saved_state_pending_result", yudVar.d, str, ffixVar, ytvVar);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        ade adeVar = (ade) obj;
        if (adeVar == null) {
            return ffcu.a;
        }
        ytvVar.b.e(adeVar);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ytv(this.b, ffguVar);
    }
}
