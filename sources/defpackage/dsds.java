package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsds extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dsed b;
    final /* synthetic */ dsci c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsds(dsed dsedVar, dsci dsciVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dsedVar;
        this.c = dsciVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dsds) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dqlx dqlxVar = ((dqls) this.b.bE().invoke()).b;
            dsci dsciVar = this.c;
            dsciVar.getClass();
            this.a = 1;
            obj = dqlxVar.a(dsciVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            dsed dsedVar = this.b;
            dsci dsciVar2 = this.c;
            dsciVar2.getClass();
            dsedVar.e(dsciVar2, null);
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dsds(this.b, this.c, ffguVar);
    }
}
