package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fns extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cxj b;
    final /* synthetic */ boolean c;
    final /* synthetic */ cxt d;
    final /* synthetic */ ffix e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fns(cxj cxjVar, boolean z, cxt cxtVar, ffix ffixVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cxjVar;
        this.c = z;
        this.d = cxtVar;
        this.e = ffixVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fns) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        fns fnsVar;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            fnsVar = this;
        } else {
            cxj cxjVar = this.b;
            Float f = new Float(true != this.c ? 0.0f : 1.0f);
            cxt cxtVar = this.d;
            this.a = 1;
            fnsVar = this;
            if (cxj.j(cxjVar, f, cxtVar, null, fnsVar, 12) == ffhhVar) {
                return ffhhVar;
            }
        }
        fnsVar.e.invoke();
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new fns(this.b, this.c, this.d, this.e, ffguVar);
    }
}
