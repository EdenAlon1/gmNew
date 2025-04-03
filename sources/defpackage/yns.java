package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yns extends ffhv implements ffjm {
    int a;
    final /* synthetic */ you b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yns(you youVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = youVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yns) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            you youVar = this.b;
            ffxx b = fgaj.b(youVar.l, 1);
            ynr ynrVar = new ynr(youVar);
            this.a = 1;
            if (b.a(ynrVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new yns(this.b, ffguVar);
    }
}
