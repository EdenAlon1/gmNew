package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final /* synthetic */ class cvvw extends ffju implements ffjn {
    public cvvw(Object obj) {
        super(3, obj, cvvx.class, "createChatbotDirectoryUiData", "createChatbotDirectoryUiData(Lcom/google/android/apps/messaging/startchat/contactlist/rbm/ChatBotInfo;Lcom/google/android/apps/messaging/startchat/tracker/ContactSelectionState;)Lcom/google/android/apps/messaging/startchat/contactlist/rbm/ChatbotDirectoryUiData;", 4);
    }

    @Override // defpackage.ffjn
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        cwjb cwjbVar;
        final cvvq cvvqVar = (cvvq) obj;
        cwir cwirVar = (cwir) obj2;
        final cvvx cvvxVar = (cvvx) this.b;
        boolean z = false;
        if (cvvqVar.a && ((cwjbVar = cwirVar.d) == cwjb.a || cwjbVar == cwjb.c)) {
            z = true;
        }
        return new cvvz(z, new ffix() { // from class: cvvu
            @Override // defpackage.ffix
            public final Object invoke() {
                ((aigz) cvvx.this.b.b()).j(new ailx(cvvqVar.b));
                return ffcu.a;
            }
        });
    }
}
