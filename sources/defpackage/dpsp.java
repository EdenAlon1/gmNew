package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpsp extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dptb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpsp(dptb dptbVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dptbVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpsp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dptb dptbVar = this.b;
            fgdj l = dptbVar.c.l();
            dpso dpsoVar = new dpso(dptbVar);
            this.a = 1;
            if (l.a(dpsoVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        throw new ffbx();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dpsp(this.b, ffguVar);
    }
}
