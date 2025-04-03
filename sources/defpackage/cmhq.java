package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cmhq extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cmii b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmhq(cmii cmiiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cmiiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmhq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cmii cmiiVar = this.b;
        this.a = 1;
        Object a = ffra.a(ekxi.a(cmiiVar.f), new cmhu(null, cmiiVar), this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cmhq(this.b, ffguVar);
    }
}
