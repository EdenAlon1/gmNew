package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class esu extends ffhv implements ffjm {
    int a;
    final /* synthetic */ eva b;
    final /* synthetic */ hkx c;
    final /* synthetic */ jvw d;
    final /* synthetic */ fhi e;
    final /* synthetic */ juw f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public esu(eva evaVar, hkx hkxVar, jvw jvwVar, fhi fhiVar, juw juwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = evaVar;
        this.c = hkxVar;
        this.d = jvwVar;
        this.e = fhiVar;
        this.f = juwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((esu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                ffxx a = hkt.a(new ess(this.c));
                est estVar = new est(this.b, this.d, this.e, this.f);
                this.a = 1;
                if (a.a(estVar, this) == ffhhVar) {
                    return ffhhVar;
                }
            }
            eub.d(this.b);
            return ffcu.a;
        } catch (Throwable th) {
            eub.d(this.b);
            throw th;
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new esu(this.b, this.c, this.d, this.e, this.f, ffguVar);
    }
}
