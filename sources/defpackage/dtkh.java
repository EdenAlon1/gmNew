package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtkh extends ffhv implements ffjm {
    final /* synthetic */ ffsk a;
    final /* synthetic */ ffxx b;
    final /* synthetic */ hss c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtkh(ffsk ffskVar, ffxx ffxxVar, hss hssVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = ffskVar;
        this.b = ffxxVar;
        this.c = hssVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dtkh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ffqy.d(this.a, null, null, new dtkg(this.b, this.c, null), 3);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dtkh(this.a, this.b, this.c, ffguVar);
    }
}
