package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lkm extends ffhv implements ffjm {
    final /* synthetic */ lkn a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lkm(lkn lknVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = lknVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((lkm) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ffsk ffskVar = (ffsk) this.b;
        if (this.a.a.a().compareTo(lkj.INITIALIZED) >= 0) {
            lkn lknVar = this.a;
            lknVar.a.c(lknVar);
        } else {
            ffui.d(ffskVar.hT(), null);
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        lkm lkmVar = new lkm(this.a, ffguVar);
        lkmVar.b = obj;
        return lkmVar;
    }
}
