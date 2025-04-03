package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final /* synthetic */ class apav extends ffkh implements ffji {
    final /* synthetic */ apbk a;
    final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apav(apbk apbkVar, int i) {
        super(1, ffki.class, "getLatestMessagesSuspend", "getLatestMessages$getLatestMessagesSuspend(Lcom/google/android/apps/messaging/shared/api/messaging/message/OptimisticBugleMessageRepository;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.a = apbkVar;
        this.b = i;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return apbk.ao(this.a, this.b, (ffgu) obj);
    }
}
