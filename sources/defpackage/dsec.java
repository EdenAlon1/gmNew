package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsec extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dsed b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsec(dsed dsedVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dsedVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dsec) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        dscd bl = this.b.bl();
        this.a = 1;
        Object d = bl.d(this);
        return d == ffhhVar ? ffhhVar : d;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dsec(this.b, ffguVar);
    }
}
