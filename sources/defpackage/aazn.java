package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aazn extends ffhv implements ffji {
    final /* synthetic */ aoax a;
    final /* synthetic */ abac b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aazn(aoax aoaxVar, abac abacVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.a = aoaxVar;
        this.b = abacVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        String str = ((bdtz) this.a).a;
        abac abacVar = this.b;
        axol.k(abacVar.f, null, new aazc(abacVar, str, null), 3);
        return true;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new aazn(this.a, this.b, (ffgu) obj).b(ffcu.a);
    }
}
