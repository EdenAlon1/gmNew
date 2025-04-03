package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fnt extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cxj b;
    final /* synthetic */ boolean c;
    final /* synthetic */ cxt d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fnt(cxj cxjVar, boolean z, cxt cxtVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cxjVar;
        this.c = z;
        this.d = cxtVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fnt) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cxj cxjVar = this.b;
            Float f = new Float(true != this.c ? 0.8f : 1.0f);
            cxt cxtVar = this.d;
            this.a = 1;
            if (cxj.j(cxjVar, f, cxtVar, null, this, 12) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new fnt(this.b, this.c, this.d, ffguVar);
    }
}
