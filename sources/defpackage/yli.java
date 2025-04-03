package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yli extends ffhv implements ffjm {
    int a;
    final /* synthetic */ xhp b;
    final /* synthetic */ yln c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yli(ffgu ffguVar, xhp xhpVar, yln ylnVar) {
        super(2, ffguVar);
        this.b = xhpVar;
        this.c = ylnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yli) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        ensk g = yln.a.g();
        g.Y(ente.a, "BugleComposeRow2");
        ((enrr) g.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/send/handler/DraftSendButtonClickHandler$processAttachments$lambda$10$lambda$9$$inlined$asyncPropagatingLegacy$default$1", "invokeSuspend", 207, "DraftSendButtonClickHandler.kt")).t("DraftSendButtonClickHandler processing %s", this.b);
        yln ylnVar = this.c;
        xhm xhmVar = (xhm) this.b;
        this.a = 1;
        Object a = ylnVar.d.a(xhmVar, this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        yli yliVar = new yli(ffguVar, this.b, this.c);
        yliVar.d = obj;
        return yliVar;
    }
}
