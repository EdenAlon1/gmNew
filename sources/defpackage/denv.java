package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class denv extends ffhv implements ffjm {
    int a;
    final /* synthetic */ deny b;
    final /* synthetic */ eisx c;
    final /* synthetic */ cvjl d;
    final /* synthetic */ cjtw e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public denv(deny denyVar, eisx eisxVar, cvjl cvjlVar, cjtw cjtwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = denyVar;
        this.c = eisxVar;
        this.d = cvjlVar;
        this.e = cjtwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((denv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dejk dejkVar = (dejk) this.b.f.b();
            eisx eisxVar = this.c;
            String a = ((deln) this.b.d.b()).a();
            if (a == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            dejkVar.a(eisxVar, a, this.d, this.e);
            deny denyVar = this.b;
            ffcu ffcuVar = ffcu.a;
            this.a = 1;
            if (denyVar.s.fQ(ffcuVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new denv(this.b, this.c, this.d, this.e, ffguVar);
    }
}
