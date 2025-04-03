package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class aaks extends ffkh implements ffji {
    public aaks(Object obj) {
        super(1, obj, aalh.class, "clearRichCardAttachmentOnPermanentFailure", "clearRichCardAttachmentOnPermanentFailure(Lcom/google/android/apps/messaging/shared/api/messaging/message/content/CardAttachment$CardAttachmentContent;)V", 0);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        apor aporVar = (apor) obj;
        aporVar.getClass();
        alye alyeVar = ((aalh) this.g).e;
        if (!(alyeVar instanceof apxk)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        ((apxk) alyeVar).c(aporVar);
        return ffcu.a;
    }
}
