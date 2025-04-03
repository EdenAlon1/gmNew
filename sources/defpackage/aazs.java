package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aazs extends ffhv implements ffji {
    final /* synthetic */ abac a;
    final /* synthetic */ aoax b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aazs(abac abacVar, aoax aoaxVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.a = abacVar;
        this.b = aoaxVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        Long d = ((aoas) this.b).d();
        Long c = ((aoas) this.b).c();
        aoax aoaxVar = this.b;
        aoas aoasVar = (aoas) aoaxVar;
        boolean a = this.a.J.a(d, c, aoasVar.f(), aoasVar.g(), aoasVar.e(), aoaxVar);
        if (a) {
            this.a.m(4);
        }
        return Boolean.valueOf(a);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new aazs(this.a, this.b, (ffgu) obj).b(ffcu.a);
    }
}
