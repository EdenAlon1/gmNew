package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class frl extends ffhv implements ffjm {
    int a;
    final /* synthetic */ frr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public frl(frr frrVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = frrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((frl) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            frr frrVar = this.b;
            Float f = new Float(1.0f);
            dbu c = cxu.c(75, 0, cyp.d, 2);
            this.a = 1;
            if (cxj.j(frrVar.f, f, c, null, this, 12) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new frl(this.b, ffguVar);
    }
}
