package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tpp extends ffhv implements ffjm {
    int a;
    final /* synthetic */ tpq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tpp(tpq tpqVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = tpqVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tpp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return null;
        }
        tpq tpqVar = this.b;
        this.a = 1;
        if (tpqVar.a(this) == ffhhVar) {
            return ffhhVar;
        }
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new tpp(this.b, ffguVar);
    }
}
