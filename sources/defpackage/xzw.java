package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xzw extends ffhv implements ffjm {
    int a;
    final /* synthetic */ awap b;
    final /* synthetic */ yag c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xzw(awap awapVar, yag yagVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = awapVar;
        this.c = yagVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xzw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2 = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ensk g = yag.a.g();
            g.Y(ente.a, "BugleComposeRow2");
            enrr enrrVar = (enrr) g;
            enrrVar.Y(cqpo.j, this.b);
            ((enrr) enrrVar.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/processor/DraftAttachmentPostProcessorImpl$cancel$1", "invokeSuspend", 127, "DraftAttachmentPostProcessorImpl.kt")).q("Cancel early processing.");
            yag yagVar = this.c;
            awap awapVar = this.b;
            this.a = 1;
            appm appmVar = (appm) yagVar.d;
            Object a = ffra.a(ekxi.a(appmVar.b), new appk(null, appmVar, awapVar), this);
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
        return new xzw(this.b, this.c, ffguVar);
    }
}
