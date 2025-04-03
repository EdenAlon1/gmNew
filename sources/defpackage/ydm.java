package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ydm extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ydq b;
    final /* synthetic */ Duration c;
    final /* synthetic */ ffxx d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ydm(ydq ydqVar, Duration duration, ffxx ffxxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ydqVar;
        this.c = duration;
        this.d = ffxxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ydm) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ensk e = ydq.a.e();
            e.Y(ente.a, "BugleComposeRow2");
            enrr enrrVar = (enrr) e;
            enrrVar.Y(csux.q, this.b.b);
            ((enrr) enrrVar.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/data/persistence/ConversationDraftPersistence$subscribe$2", "invokeSuspend", 117, "ConversationDraftPersistence.kt")).t("Persistence subscribing to draft flow with period %s", this.c);
            fflb fflbVar = new fflb();
            ffxx a = ffyo.a(axty.a(this.d, this.c));
            ydl ydlVar = new ydl(fflbVar, this.b);
            this.a = 1;
            if (a.a(ydlVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ydm(this.b, this.c, this.d, ffguVar);
    }
}
