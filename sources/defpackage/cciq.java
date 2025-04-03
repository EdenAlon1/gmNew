package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cciq extends ffhv implements ffjm {
    final /* synthetic */ ccix a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cciq(ffgu ffguVar, ccix ccixVar) {
        super(2, ffguVar);
        this.a = ccixVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cciq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        long epochMilli = this.a.b.f().toEpochMilli() - this.a.i.toMillis();
        String[] strArr = bqmm.a;
        bqmd bqmdVar = new bqmd();
        bqmdVar.f("CmsDeletedMessagesBufferPersister#evictOldDeletedMessageEntries");
        bqmdVar.e();
        bqmdVar.a(new ccir(epochMilli));
        return new Integer(bqmdVar.d());
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cciq cciqVar = new cciq(ffguVar, this.a);
        cciqVar.b = obj;
        return cciqVar;
    }
}
