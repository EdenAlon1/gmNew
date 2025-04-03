package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dfs extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dft b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dfs(dft dftVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dftVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dfs) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffkz ffkzVar = new ffkz();
            ffkz ffkzVar2 = new ffkz();
            ffkz ffkzVar3 = new ffkz();
            dft dftVar = this.b;
            dfr dfrVar = new dfr(ffkzVar, ffkzVar2, ffkzVar3, dftVar);
            this.a = 1;
            if (fgct.g((fgct) dftVar.d.a, dfrVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dfs(this.b, ffguVar);
    }
}
