package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aato extends ffhv implements ffjm {
    /* synthetic */ Object a;

    public aato(ffgu ffguVar) {
        super(2, ffguVar);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aato) c((alxw) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ((enrr) aatu.a.h().h("com/google/android/apps/messaging/conversation2/messagelist/paging/MessageListPagingDataProviderImpl$pagingDataFlow$1", "invokeSuspend", 111, "MessageListPagingDataProviderImpl.kt")).t("Initial PagingKey emitted: %s", (alxw) this.a);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        aato aatoVar = new aato(ffguVar);
        aatoVar.a = obj;
        return aatoVar;
    }
}
