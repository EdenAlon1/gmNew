package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmhx extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cmii b;
    final /* synthetic */ djrm c;
    final /* synthetic */ int d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmhx(ffgu ffguVar, cmii cmiiVar, djrm djrmVar, int i) {
        super(2, ffguVar);
        this.b = cmiiVar;
        this.c = djrmVar;
        this.d = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmhx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
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
        cmhy cmhyVar = new cmhy(cmiiVar, this.c, this.d);
        this.a = 1;
        Object d = cmiiVar.h.d(cmhyVar, this);
        return d == ffhhVar ? ffhhVar : d;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cmhx cmhxVar = new cmhx(ffguVar, this.b, this.c, this.d);
        cmhxVar.e = obj;
        return cmhxVar;
    }
}
