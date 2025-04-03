package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpkv extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cxj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpkv(cxj cxjVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cxjVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpkv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cxj cxjVar = this.b;
            Float f = new Float(360.0f);
            cyz d = cxu.d(cxu.c(400, 0, cyp.d, 2), 1, 0L, 4);
            this.a = 1;
            if (cxj.j(cxjVar, f, d, null, this, 12) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dpkv(this.b, ffguVar);
    }
}
