package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dofb extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cxj b;
    final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dofb(cxj cxjVar, boolean z, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cxjVar;
        this.c = z;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dofb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cxj cxjVar = this.b;
            Float f = new Float(true != this.c ? 0.0f : 1.0f);
            dbu c = cxu.c(130, 0, cyp.d, 2);
            this.a = 1;
            if (cxj.j(cxjVar, f, c, null, this, 12) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dofb(this.b, this.c, ffguVar);
    }
}
