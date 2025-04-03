package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtgv extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dteh b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtgv(dteh dtehVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dtehVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dtgv) c((dtgp) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dtgp dtgpVar = (dtgp) this.c;
            dteh dtehVar = this.b;
            this.a = 1;
            if (dtgpVar.c(dtehVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dtgv dtgvVar = new dtgv(this.b, ffguVar);
        dtgvVar.c = obj;
        return dtgvVar;
    }
}
