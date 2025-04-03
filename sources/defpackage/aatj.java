package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aatj extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    private /* synthetic */ Object c;

    public aatj(ffgu ffguVar) {
        super(3, ffguVar);
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        aatj aatjVar = new aatj((ffgu) obj3);
        aatjVar.c = (ffxy) obj;
        aatjVar.b = (Throwable) obj2;
        return aatjVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [ffxy, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ?? r7 = this.c;
            Object obj2 = this.b;
            if (obj2 == null) {
                ((enrr) aatu.a.j().h("com/google/android/apps/messaging/conversation2/messagelist/paging/MessageListPagingDataProviderImpl$latestReadMessageFlow$2", "invokeSuspend", 91, "MessageListPagingDataProviderImpl.kt")).q("latestReadMessage flow did not emit after timeout. Emitting null to avoid empty message list.");
            } else {
                ((enrr) ((enrr) aatu.a.j()).g((Throwable) obj2).h("com/google/android/apps/messaging/conversation2/messagelist/paging/MessageListPagingDataProviderImpl$latestReadMessageFlow$2", "invokeSuspend", 98, "MessageListPagingDataProviderImpl.kt")).q("latestReadMessage flow did not emit due to cancellation or timeout. Emitting null to avoid empty message list.");
            }
            this.c = null;
            this.a = 1;
            if (r7.fQ(null, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }
}
