package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class enm extends ffhv implements ffjm {
    int a;
    final /* synthetic */ eot b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public enm(eot eotVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = eotVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((enm) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        Object obj3 = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            eot eotVar = this.b;
            this.a = 1;
            eob eobVar = eoy.a;
            if (eotVar.j() - 1 < 0 || (obj2 = eot.z(eotVar, eotVar.j() - 1, null, this, 6)) != ffhh.a) {
                obj2 = ffcu.a;
            }
            if (obj2 == obj3) {
                return obj3;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new enm(this.b, ffguVar);
    }
}
