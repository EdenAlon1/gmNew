package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwcf extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cwcg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwcf(cwcg cwcgVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cwcgVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cwcf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cwcg cwcgVar = this.b;
            ffxx b = fgck.b(cwcgVar.k, cwcgVar.l, cwcgVar.n, cwcgVar.m, new cwcd(cwcgVar));
            cwce cwceVar = new cwce(this.b);
            this.a = 1;
            if (b.a(cwceVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cwcf(this.b, ffguVar);
    }
}
