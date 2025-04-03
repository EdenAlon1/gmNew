package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gnx extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cxj b;
    final /* synthetic */ boolean c;
    final /* synthetic */ cxt d;
    final /* synthetic */ ffix e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gnx(cxj cxjVar, boolean z, cxt cxtVar, ffix ffixVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cxjVar;
        this.c = z;
        this.d = cxtVar;
        this.e = ffixVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gnx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        gnx gnxVar;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            gnxVar = this;
        } else {
            cxj cxjVar = this.b;
            Float f = new Float(true != this.c ? 0.0f : 1.0f);
            cxt cxtVar = this.d;
            this.a = 1;
            gnxVar = this;
            if (cxj.j(cxjVar, f, cxtVar, null, gnxVar, 12) == ffhhVar) {
                return ffhhVar;
            }
        }
        gnxVar.e.invoke();
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new gnx(this.b, this.c, this.d, this.e, ffguVar);
    }
}
