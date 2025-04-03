package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvsu extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ cvsy c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvsu(ffgu ffguVar, cvsy cvsyVar) {
        super(3, ffguVar);
        this.c = cvsyVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        cvsu cvsuVar = new cvsu((ffgu) obj3, this.c);
        cvsuVar.d = (ffxy) obj;
        cvsuVar.b = obj2;
        return cvsuVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [cvvd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [ffxy, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ?? r4 = this.d;
            ffxx a = ((cvxm) this.b) != null ? fgdm.a(null) : this.c.a.get().a();
            this.a = 1;
            if (ffyk.c(r4, a, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }
}
