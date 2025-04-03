package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cghq extends ffhv implements ffjm {
    final /* synthetic */ cghv a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cghq(ffgu ffguVar, cghv cghvVar) {
        super(2, ffguVar);
        this.a = cghvVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cghq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        efbd.b();
        String[] strArr = bvin.a;
        bvig bvigVar = new bvig();
        bvigVar.f("ParentDisallowedConversationDatabaseOperations#markAllConversationsAsAllowed");
        bvigVar.e();
        bvigVar.d();
        this.a.m();
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cghq cghqVar = new cghq(ffguVar, this.a);
        cghqVar.b = obj;
        return cghqVar;
    }
}
