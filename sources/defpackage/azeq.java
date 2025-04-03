package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azeq extends ffhv implements ffjm {
    final /* synthetic */ String a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azeq(ffgu ffguVar, String str) {
        super(2, ffguVar);
        this.a = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((azeq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        bsob e = bsom.e();
        e.z("CachingGroupManager#getConversationData");
        e.i(new azes(this.a));
        e.i(azet.a);
        e.e(new bsny(bsom.c.ao, false));
        return e.b().y();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        azeq azeqVar = new azeq(ffguVar, this.a);
        azeqVar.b = obj;
        return azeqVar;
    }
}
