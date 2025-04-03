package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xtm extends ffhv implements ffjm {
    int a;
    final /* synthetic */ xuk b;
    final /* synthetic */ xhp c;
    final /* synthetic */ xwy d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xtm(xuk xukVar, xhp xhpVar, xwy xwyVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = xukVar;
        this.c = xhpVar;
        this.d = xwyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xtm) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            xuk xukVar = this.b;
            enru enruVar = xuk.a;
            xhp xhpVar = this.c;
            xwy xwyVar = this.d;
            final xuk xukVar2 = this.b;
            yoz yozVar = xukVar.i;
            ffji ffjiVar = new ffji() { // from class: xtl
                @Override // defpackage.ffji
                public final Object invoke(Object obj2) {
                    xhm xhmVar = (xhm) obj2;
                    ensk e = xuk.a.e();
                    e.Y(ente.a, "BugleComposeRow2");
                    ((enrr) e.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DraftAttachmentController$addSizedAttachment$2$1", "invokeSuspend$lambda$0", 254, "DraftAttachmentController.kt")).t("addAttachment receiving trimmed video: %s", xhmVar);
                    xuk.this.v.a(xhmVar);
                    return ffcu.a;
                }
            };
            this.a = 1;
            if (yozVar.c(xhpVar, xwyVar, ffjiVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new xtm(this.b, this.c, this.d, ffguVar);
    }
}
