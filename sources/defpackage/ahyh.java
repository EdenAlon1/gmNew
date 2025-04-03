package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahyh extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ahyk b;
    final /* synthetic */ xhu c;
    final /* synthetic */ fjay d;
    final /* synthetic */ ecri e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahyh(ahyk ahykVar, xhu xhuVar, fjay fjayVar, ecri ecriVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ahykVar;
        this.c = xhuVar;
        this.d = fjayVar;
        this.e = ecriVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahyh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                if (((auhm) this.b.q.b()).a()) {
                    this.b.i.b();
                }
                ahyk ahykVar = this.b;
                xhu xhuVar = this.c;
                fjay fjayVar = this.d;
                fjayVar.getClass();
                ecri ecriVar = this.e;
                this.a = 1;
                if (ahykVar.c(xhuVar, fjayVar, ecriVar, this) == ffhhVar) {
                    return ffhhVar;
                }
            }
            ((aigz) this.b.j.b()).h(new aikz(new aila()));
            if (((auhm) this.b.q.b()).a()) {
                this.b.i.c();
                this.b.r.b(null);
            }
            return ffcu.a;
        } catch (Throwable th) {
            if (((auhm) this.b.q.b()).a()) {
                this.b.i.c();
                this.b.r.b(null);
            }
            throw th;
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ahyh(this.b, this.c, this.d, this.e, ffguVar);
    }
}
