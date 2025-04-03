package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class clwm extends ffhv implements ffjm {
    final /* synthetic */ clwn a;
    final /* synthetic */ djrm b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public clwm(clwn clwnVar, int i, djrm djrmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = clwnVar;
        this.c = i;
        this.b = djrmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((clwm) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        eqxx eqxxVar = (eqxx) eqyh.a.createBuilder();
        eqxxVar.getClass();
        eqyi.c(this.c, eqxxVar);
        djrm djrmVar = this.b;
        djro a = djrn.a(djrmVar);
        clwn clwnVar = this.a;
        cosz coszVar = (cosz) fflm.b(((cort) clwnVar.a.b()).j(djrmVar));
        eqye eqyeVar = (eqye) eqyg.a.createBuilder();
        String str = a.a;
        eqyeVar.copyOnWrite();
        eqyg eqygVar = (eqyg) eqyeVar.instance;
        eqygVar.b |= 1;
        eqygVar.c = str.length();
        if (coszVar != null) {
            String str2 = coszVar.p;
            eqyeVar.copyOnWrite();
            eqyg eqygVar2 = (eqyg) eqyeVar.instance;
            str2.getClass();
            eqygVar2.b = 2 | eqygVar2.b;
            eqygVar2.d = str2;
            int i = coszVar.d;
            eqyeVar.copyOnWrite();
            eqyg eqygVar3 = (eqyg) eqyeVar.instance;
            eqygVar3.b |= 4;
            eqygVar3.e = i;
            eqyeVar.copyOnWrite();
            eqyg eqygVar4 = (eqyg) eqyeVar.instance;
            eqygVar4.f = 1;
            eqygVar4.b |= 16;
        } else if (ffkj.e(((dkpp) clwnVar.b.b()).l(), a.a)) {
            int b = ((dkpp) clwnVar.b.b()).b();
            eqyeVar.copyOnWrite();
            eqyg eqygVar5 = (eqyg) eqyeVar.instance;
            eqygVar5.b |= 4;
            eqygVar5.e = b;
            eqyeVar.copyOnWrite();
            eqyg eqygVar6 = (eqyg) eqyeVar.instance;
            eqygVar6.f = 2;
            eqygVar6.b |= 16;
        }
        eyfy build = eqyeVar.build();
        build.getClass();
        eqxxVar.copyOnWrite();
        eqyh eqyhVar = (eqyh) eqxxVar.instance;
        eqyhVar.d = (eqyg) build;
        eqyhVar.b |= 4;
        this.a.c(eqyi.a(eqxxVar));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new clwm(this.a, this.c, this.b, ffguVar);
    }
}
