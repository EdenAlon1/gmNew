package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmhz extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cmii b;
    final /* synthetic */ djrm c;
    final /* synthetic */ eyja d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmhz(ffgu ffguVar, cmii cmiiVar, djrm djrmVar, eyja eyjaVar) {
        super(2, ffguVar);
        this.b = cmiiVar;
        this.c = djrmVar;
        this.d = eyjaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmhz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
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
        cmia cmiaVar = new cmia(this.c, this.d);
        this.a = 1;
        Object d = cmiiVar.h.d(cmiaVar, this);
        return d == ffhhVar ? ffhhVar : d;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cmhz cmhzVar = new cmhz(ffguVar, this.b, this.c, this.d);
        cmhzVar.e = obj;
        return cmhzVar;
    }
}
