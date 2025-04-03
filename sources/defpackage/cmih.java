package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cmih extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cmii b;
    final /* synthetic */ cmip c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmih(cmii cmiiVar, cmip cmipVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cmiiVar;
        this.c = cmipVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmih) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return null;
        }
        cmii cmiiVar = this.b;
        cmip cmipVar = this.c;
        this.a = 1;
        if (cmiiVar.y(cmipVar, this) == ffhhVar) {
            return ffhhVar;
        }
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cmih(this.b, this.c, ffguVar);
    }
}
