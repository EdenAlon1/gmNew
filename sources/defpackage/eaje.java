package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class eaje extends ffhv implements ffjm {
    int a;
    final /* synthetic */ eajg b;
    final /* synthetic */ eaja c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eaje(eajg eajgVar, eaja eajaVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = eajgVar;
        this.c = eajaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((eaje) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        eajg eajgVar = this.b;
        eaja eajaVar = this.c;
        this.a = 1;
        Object c = eajgVar.c(eajaVar, this);
        return c == ffhhVar ? ffhhVar : c;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new eaje(this.b, this.c, ffguVar);
    }
}
