package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dphk extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dpif b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dphk(dpif dpifVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dpifVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dphk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            fgcq j = this.b.a().j();
            dphj dphjVar = new dphj(this.b);
            this.a = 1;
            if (j.a(dphjVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        throw new ffbx();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dphk(this.b, ffguVar);
    }
}
