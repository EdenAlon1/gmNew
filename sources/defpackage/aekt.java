package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aekt extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aegr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aekt(aegr aegrVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aegrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aekt) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            aegr aegrVar = this.b;
            this.a = 1;
            obj = aegrVar.a(this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        if (((Number) obj).intValue() <= 0) {
            this.b.b(1);
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aekt(this.b, ffguVar);
    }
}
