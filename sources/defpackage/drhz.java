package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drhz extends ffhv implements ffjm {
    int a;
    final /* synthetic */ drie b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drhz(drie drieVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = drieVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((drhz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            fgdj c = this.b.e().c(dslv.aI);
            drhy drhyVar = new drhy(this.b);
            this.a = 1;
            if (c.a(drhyVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        throw new ffbx();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new drhz(this.b, ffguVar);
    }
}
