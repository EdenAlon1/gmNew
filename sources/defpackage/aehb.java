package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aehb extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aehc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aehb(aehc aehcVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aehcVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aehb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Integer num;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            aegr aegrVar = (aegr) fflm.b(this.b.a);
            if (aegrVar == null) {
                num = null;
                return Boolean.valueOf(num == null && num.intValue() == 1);
            }
            this.a = 1;
            obj = aegrVar.a(this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        num = (Integer) obj;
        return Boolean.valueOf(num == null && num.intValue() == 1);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aehb(this.b, ffguVar);
    }
}
