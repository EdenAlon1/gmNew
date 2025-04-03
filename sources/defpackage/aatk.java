package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aatk extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    private /* synthetic */ Object c;

    public aatk(ffgu ffguVar) {
        super(3, ffguVar);
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        aatk aatkVar = new aatk((ffgu) obj3);
        aatkVar.c = (ffxy) obj;
        aatkVar.b = (Throwable) obj2;
        return aatkVar.b(ffcu.a);
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
                ((enrr) aatu.a.j().h("com/google/android/apps/messaging/conversation2/messagelist/paging/MessageListPagingDataProviderImpl$oldestUnreadMessageIdFlow$2", "invokeSuspend", 69, "MessageListPagingDataProviderImpl.kt")).q("oldestUnreadMessageId flow did not emit after timeout. Emitting null to avoid empty message list.");
            } else {
                ((enrr) ((enrr) aatu.a.j()).g((Throwable) obj2).h("com/google/android/apps/messaging/conversation2/messagelist/paging/MessageListPagingDataProviderImpl$oldestUnreadMessageIdFlow$2", "invokeSuspend", 76, "MessageListPagingDataProviderImpl.kt")).q("oldestUnreadMessageId flow did not emit due to cancellation or timeout. Emitting null to avoid empty message list.");
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
