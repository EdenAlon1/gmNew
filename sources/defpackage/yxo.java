package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yxo extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffxx b;
    final /* synthetic */ yya c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yxo(ffxx ffxxVar, yya yyaVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ffxxVar;
        this.c = yyaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yxo) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffxx ffxxVar = this.b;
            yxn yxnVar = new yxn(this.c);
            this.a = 1;
            if (ffxxVar.a(yxnVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new yxo(this.b, this.c, ffguVar);
    }
}
