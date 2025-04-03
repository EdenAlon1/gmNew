package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cmhd extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cmii b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmhd(cmii cmiiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cmiiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmhd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cmii cmiiVar = this.b;
            this.a = 1;
            if (cmiiVar.p(this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cmhd(this.b, ffguVar);
    }
}
