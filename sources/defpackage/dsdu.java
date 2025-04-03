package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsdu extends ffhv implements ffjm {
    final /* synthetic */ dsed a;
    final /* synthetic */ dscj b;
    final /* synthetic */ Boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsdu(dsed dsedVar, dscj dscjVar, Boolean bool, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = dsedVar;
        this.b = dscjVar;
        this.c = bool;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dsdu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        dscd bl = this.a.bl();
        dscj dscjVar = this.b;
        dscjVar.getClass();
        Boolean bool = this.c;
        bool.getClass();
        ((dscc) bl).a.g(dscjVar.a, bool.booleanValue());
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dsdu(this.a, this.b, this.c, ffguVar);
    }
}
