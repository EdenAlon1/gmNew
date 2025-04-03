package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnnw extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cxj b;
    final /* synthetic */ czo c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnnw(cxj cxjVar, czo czoVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cxjVar;
        this.c = czoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnnw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cxj cxjVar = this.b;
            Float f = new Float(1.0f);
            czo czoVar = this.c;
            this.a = 1;
            if (cxj.j(cxjVar, f, czoVar, null, this, 12) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dnnw(this.b, this.c, ffguVar);
    }
}
