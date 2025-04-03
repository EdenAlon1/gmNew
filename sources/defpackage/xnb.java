package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xnb extends ffhv implements ffjm {
    int a;
    final /* synthetic */ eot b;
    final /* synthetic */ hkx c;
    final /* synthetic */ hjz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xnb(eot eotVar, hjz hjzVar, hkx hkxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = eotVar;
        this.d = hjzVar;
        this.c = hkxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xnb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0 && this.d.c() != 0 && xnd.a(this.c).size() > this.d.c()) {
            eot eotVar = this.b;
            int e = ffdx.e(xnd.a(this.c));
            this.a = 1;
            if (eot.z(eotVar, e, null, this, 6) == ffhhVar) {
                return ffhhVar;
            }
        }
        this.d.i(xnd.a(this.c).size());
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new xnb(this.b, this.d, this.c, ffguVar);
    }
}
