package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtjp extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dtjq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtjp(dtjq dtjqVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dtjqVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dtjp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            fgdj fgdjVar = dtjq.f(this.b).f;
            dtjo dtjoVar = new dtjo(this.b);
            this.a = 1;
            if (fgdjVar.a(dtjoVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        throw new ffbx();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dtjp(this.b, ffguVar);
    }
}
