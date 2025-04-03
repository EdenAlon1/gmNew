package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aatq extends ffhv implements ffjm {
    /* synthetic */ Object a;

    public aatq(ffgu ffguVar) {
        super(2, ffguVar);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aatq) c((ojf) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ((enrr) aatu.a.h().h("com/google/android/apps/messaging/conversation2/messagelist/paging/MessageListPagingDataProviderImpl$pagingDataFlow$2$2", "invokeSuspend", 131, "MessageListPagingDataProviderImpl.kt")).t("PagingData emitted: %s", (ojf) this.a);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        aatq aatqVar = new aatq(ffguVar);
        aatqVar.a = obj;
        return aatqVar;
    }
}
