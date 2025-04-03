package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmib extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cmii b;
    final /* synthetic */ djrm c;
    final /* synthetic */ cmis d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmib(ffgu ffguVar, cmii cmiiVar, djrm djrmVar, cmis cmisVar) {
        super(2, ffguVar);
        this.b = cmiiVar;
        this.c = djrmVar;
        this.d = cmisVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmib) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
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
        cmic cmicVar = new cmic(this.c, this.d);
        this.a = 1;
        Object d = cmiiVar.h.d(cmicVar, this);
        return d == ffhhVar ? ffhhVar : d;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cmib cmibVar = new cmib(ffguVar, this.b, this.c, this.d);
        cmibVar.e = obj;
        return cmibVar;
    }
}
