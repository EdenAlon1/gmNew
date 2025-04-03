package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwcc extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cwcg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwcc(cwcg cwcgVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cwcgVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cwcc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffxx a = ffyo.a(this.b.d.a());
            cwcb cwcbVar = new cwcb(this.b);
            this.a = 1;
            if (a.a(cwcbVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cwcc(this.b, ffguVar);
    }
}
