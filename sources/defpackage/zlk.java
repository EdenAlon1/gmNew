package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class zlk extends ffkh implements ffji {
    public zlk(Object obj) {
        super(1, obj, zmw.class, "onBottomReached", "onBottomReached(Lcom/google/android/apps/messaging/conversation2/messagelist/message/BugleMessageUiData;)V", 0);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        zqy zqyVar = (zqy) obj;
        zmw zmwVar = (zmw) this.g;
        ((enrr) zmw.a.h().h("com/google/android/apps/messaging/conversation2/messagelist/PagedMessageListUiAdapterImpl", "onBottomReached", 545, "PagedMessageListUiAdapterImpl.kt")).q("Bottom reached, maybe marking messages as read");
        if (zqyVar != null) {
            if (zqyVar instanceof zsn) {
                zsn zsnVar = (zsn) zqyVar;
                if (zsnVar.c.B() == 1) {
                    ((enrr) zmw.a.f().h("com/google/android/apps/messaging/conversation2/messagelist/PagedMessageListUiAdapterImpl", "onBottomReached", 559, "PagedMessageListUiAdapterImpl.kt")).t("Skipped marking as read: waiting until %s is interactable", zsnVar.f);
                }
            }
            axol.k(zmwVar.m, null, new zlv(zmwVar, null), 3);
        }
        return ffcu.a;
    }
}
