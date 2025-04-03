package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpsd extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dptb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpsd(dptb dptbVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dptbVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpsd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dptb dptbVar = this.b;
            fgdj l = dptbVar.c.l();
            dpsc dpscVar = new dpsc(dptbVar);
            this.a = 1;
            if (l.a(dpscVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        throw new ffbx();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dpsd(this.b, ffguVar);
    }
}
