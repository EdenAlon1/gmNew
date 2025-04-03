package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final /* synthetic */ class apax extends ffkh implements ffji {
    final /* synthetic */ apbk a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apax(apbk apbkVar, int i, int i2) {
        super(1, ffki.class, "getMessagesDescendingSuspend", "getMessagesDescending$getMessagesDescendingSuspend(Lcom/google/android/apps/messaging/shared/api/messaging/message/OptimisticBugleMessageRepository;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.a = apbkVar;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return apbk.b(this.a, this.b, this.c, (ffgu) obj);
    }
}
