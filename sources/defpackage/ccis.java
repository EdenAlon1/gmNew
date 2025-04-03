package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccis extends ffhv implements ffjm {
    final /* synthetic */ long a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccis(ffgu ffguVar, long j) {
        super(2, ffguVar);
        this.a = j;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ccis) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object apply;
        ffci.b(obj);
        String[] strArr = bqmm.a;
        bqmj bqmjVar = new bqmj(bqmm.a);
        bqmjVar.z("CmsDeletedMessagesBufferPersister#getDeletedMessageEntryForId");
        apply = new ccit(this.a).apply(new bqml());
        bqmjVar.k(new bqmk((bqml) apply));
        engw y = bqmjVar.b().y();
        if (((enou) y).c == 0) {
            return null;
        }
        return y.get(0);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ccis ccisVar = new ccis(ffguVar, this.a);
        ccisVar.b = obj;
        return ccisVar;
    }
}
