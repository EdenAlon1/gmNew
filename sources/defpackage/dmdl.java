package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmdl extends ffhv implements ffjm {
    int a;
    final /* synthetic */ gpi b;
    final /* synthetic */ dmck c;
    final /* synthetic */ hho d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmdl(gpi gpiVar, dmck dmckVar, hho hhoVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = gpiVar;
        this.c = dmckVar;
        this.d = hhoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmdl) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            final gpi gpiVar = this.b;
            ffxx a = hkt.a(new ffix() { // from class: dmdj
                @Override // defpackage.ffix
                public final Object invoke() {
                    return gpi.this.a();
                }
            });
            dmdk dmdkVar = new dmdk(this.c, this.d);
            this.a = 1;
            if (a.a(dmdkVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dmdl(this.b, this.c, this.d, ffguVar);
    }
}
