package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fdn extends ffhv implements ffjm {
    int a;
    final /* synthetic */ jlm b;
    final /* synthetic */ iyj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fdn(iyj iyjVar, jlm jlmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = iyjVar;
        this.b = jlmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fdn) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            iyj iyjVar = this.c;
            jcq a = dws.a(this.b);
            this.a = 1;
            if (iyjVar.b(a) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new fdn(this.c, this.b, ffguVar);
    }
}
