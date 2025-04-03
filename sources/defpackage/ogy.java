package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ogy extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ohc b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ogy(ohc ohcVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ohcVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ogy) c((okz) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            okz okzVar = (okz) this.c;
            ffxx b = oen.b(new fgbq(new fgcp(new oek(new ffzh(new ogs(null), this.b.c.a), new ogu(this.b, null), null))), new ogx(null, this.b));
            ogw ogwVar = new ogw(okzVar);
            this.a = 1;
            if (b.a(ogwVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ogy ogyVar = new ogy(this.b, ffguVar);
        ogyVar.c = obj;
        return ogyVar;
    }
}
