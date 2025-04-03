package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtgn extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dtgp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtgn(dtgp dtgpVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dtgpVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dtgn) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dtef dtefVar = this.b.g;
            this.a = 1;
            if (dtefVar.a(0, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dtgn(this.b, ffguVar);
    }
}
