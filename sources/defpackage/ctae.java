package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctae extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ctaf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctae(ctaf ctafVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ctafVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctae) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cmgr cmgrVar = (cmgr) this.b.a.b();
            this.a = 1;
            obj = cmgrVar.i(this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        return Boolean.valueOf(obj == cmip.TOGGLE_STATE_USER_DISABLED);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ctae(this.b, ffguVar);
    }
}
