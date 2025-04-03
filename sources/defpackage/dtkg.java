package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtkg extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffxx b;
    final /* synthetic */ hss c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtkg(ffxx ffxxVar, hss hssVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ffxxVar;
        this.c = hssVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dtkg) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffxx ffxxVar = this.b;
            dtkf dtkfVar = new dtkf(this.c);
            this.a = 1;
            if (ffxxVar.a(dtkfVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dtkg(this.b, this.c, ffguVar);
    }
}
