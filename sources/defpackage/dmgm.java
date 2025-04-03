package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmgm extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dmgr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmgm(dmgr dmgrVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dmgrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmgm) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            final dmgr dmgrVar = this.b;
            czo a = cxu.a(new ffji() { // from class: dmgl
                @Override // defpackage.ffji
                public final Object invoke(Object obj2) {
                    czn cznVar = (czn) obj2;
                    cznVar.a = 1700;
                    Float valueOf = Float.valueOf(0.0f);
                    cznVar.a(valueOf, 0).b = cyp.a;
                    cznVar.a(Float.valueOf(dmgr.this.g), 500).b = cyp.a;
                    cznVar.a(valueOf, 700);
                    return ffcu.a;
                }
            });
            dmgr dmgrVar2 = this.b;
            Float f = new Float(0.0f);
            czz czzVar = new czz(2, a, dag.b(this.b.f));
            this.a = 1;
            if (cxj.j(dmgrVar2.d, f, czzVar, null, this, 12) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dmgm(this.b, ffguVar);
    }
}
