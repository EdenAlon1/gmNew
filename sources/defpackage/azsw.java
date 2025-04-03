package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class azsw extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aztd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azsw(aztd aztdVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aztdVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((azsw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        this.a = 1;
        bdhm bdhmVar = bdhm.EXECUTE_UPGRADE;
        return bdhmVar == ffhhVar ? ffhhVar : bdhmVar;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new azsw(this.b, ffguVar);
    }
}
