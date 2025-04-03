package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qrx extends ffhv implements ffjm {
    int a;
    final /* synthetic */ qry b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qrx(qry qryVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = qryVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((qrx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            qry qryVar = this.b;
            qsu qsuVar = qryVar.b;
            qqo qqoVar = qryVar.a;
            ffxn ffxnVar = new ffxn(new qsq(qsuVar, qqoVar, qqoVar.a, null));
            qrw qrwVar = new qrw(this.b);
            this.a = 1;
            if (fgea.h(ffxnVar, qrwVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new qrx(this.b, ffguVar);
    }
}
