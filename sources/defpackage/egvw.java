package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egvw extends ffhv implements ffjm {
    final /* synthetic */ egvy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egvw(egvy egvyVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = egvyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((egvw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        egub egubVar = this.a.f;
        if (egubVar == null) {
            ffkj.c("viewModel");
            egubVar = null;
        }
        egubVar.a(this.a.a);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new egvw(this.a, ffguVar);
    }
}
