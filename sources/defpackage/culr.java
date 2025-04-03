package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class culr extends ffhv implements ffjm {
    final /* synthetic */ culs a;
    final /* synthetic */ culf b;
    final /* synthetic */ cukx c;
    final /* synthetic */ erdy d;
    final /* synthetic */ int e;
    final /* synthetic */ eres f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public culr(culs culsVar, culf culfVar, cukx cukxVar, erdy erdyVar, int i, eres eresVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = culsVar;
        this.b = culfVar;
        this.c = cukxVar;
        this.d = erdyVar;
        this.e = i;
        this.f = eresVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((culr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        cufr cufrVar = (cufr) this.a.c.b();
        eres eresVar = this.f;
        eresVar.getClass();
        efbd.b();
        cugi cugiVar = (cugi) cufrVar.a.b();
        culf culfVar = this.b;
        axol.k(cufrVar.c, null, new cufp(cufrVar, culfVar, cugiVar.a(culfVar), this.c, this.d, this.e, eresVar, null), 3);
        culp culpVar = (culp) this.a.b.b();
        culf culfVar2 = this.b;
        culpVar.o(culfVar2.a, culfVar2.i, this.c, this.d, this.e, this.f);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new culr(this.a, this.b, this.c, this.d, this.e, this.f, ffguVar);
    }
}
