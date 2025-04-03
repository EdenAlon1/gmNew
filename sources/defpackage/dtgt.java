package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtgt extends ffhv implements ffjm {
    int a;
    private /* synthetic */ Object b;

    public dtgt(ffgu ffguVar) {
        super(2, ffguVar);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dtgt) c((dtgp) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dtgp dtgpVar = (dtgp) this.b;
            this.a = 1;
            if (dtgpVar.f(this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dtgt dtgtVar = new dtgt(ffguVar);
        dtgtVar.b = obj;
        return dtgtVar;
    }
}
