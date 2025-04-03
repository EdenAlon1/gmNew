package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xtx extends ffhv implements ffjm {
    int a;
    final /* synthetic */ doxs b;
    final /* synthetic */ xuk c;
    final /* synthetic */ xty d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xtx(doxs doxsVar, xuk xukVar, xty xtyVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = doxsVar;
        this.c = xukVar;
        this.d = xtyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xtx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ensk h = xuk.a.h();
            h.Y(ente.a, "BugleComposeRow2");
            ((enrr) h.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DraftAttachmentController$hugoDraftAttachmentsController$1$send$1", "invokeSuspend", 565, "DraftAttachmentController.kt")).t("Direct sending %s", this.b);
            xuk xukVar = this.c;
            xty xtyVar = this.d;
            doxs doxsVar = this.b;
            xih a = xukVar.a();
            xhp g = xtyVar.g(doxsVar, false);
            this.a = 1;
            obj = a.a(g, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        if (!((Boolean) obj).booleanValue()) {
            ensk i2 = xuk.a.i();
            i2.Y(ente.a, "BugleComposeRow2");
            ((enrr) i2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DraftAttachmentController$hugoDraftAttachmentsController$1$send$1", "invokeSuspend", 571, "DraftAttachmentController.kt")).t("Direct sending failed %s", this.b);
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new xtx(this.b, this.c, this.d, ffguVar);
    }
}
