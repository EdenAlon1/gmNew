package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cmhl extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cmii b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmhl(cmii cmiiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cmiiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmhl) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cmii cmiiVar = this.b;
            this.a = 1;
            obj = ffra.a(ekxi.a(cmiiVar.f), new cmhk(null, cmiiVar), this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        return Optional.of(obj);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cmhl(this.b, ffguVar);
    }
}
