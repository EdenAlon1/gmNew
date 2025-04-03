package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtgh extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dtgp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtgh(dtgp dtgpVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dtgpVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dtgh) c((dtfs) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dtgp dtgpVar = this.b;
            this.a = 1;
            if (dtgpVar.g(this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dtgh(this.b, ffguVar);
    }
}
