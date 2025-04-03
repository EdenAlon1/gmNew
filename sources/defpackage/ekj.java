package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ekj extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ekl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ekj(ekl eklVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = eklVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ekj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cxv cxvVar = this.b.a;
            Float f = new Float(0.0f);
            dac b = cxu.b(0.0f, 400.0f, new Float(0.5f), 1);
            this.a = 1;
            if (dap.j(cxvVar, f, b, true, null, this, 8) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ekj(this.b, ffguVar);
    }
}
