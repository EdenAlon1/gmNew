package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final /* synthetic */ class apaz extends ffkh implements ffji {
    final /* synthetic */ apbk a;
    final /* synthetic */ alxw b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apaz(apbk apbkVar, alxw alxwVar, int i) {
        super(1, ffki.class, "getMessagesDescendingAfterKeySuspend", "getMessagesDescendingAfterKey$getMessagesDescendingAfterKeySuspend(Lcom/google/android/apps/messaging/shared/api/messaging/message/OptimisticBugleMessageRepository;Lcom/google/android/apps/messaging/shared/api/messaging/MessagePager$PagingKey;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.a = apbkVar;
        this.b = alxwVar;
        this.c = i;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return apbk.c(this.a, this.b, this.c, (ffgu) obj);
    }
}
