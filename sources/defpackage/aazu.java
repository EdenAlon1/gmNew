package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aazu extends ffhv implements ffji {
    final /* synthetic */ abac a;
    final /* synthetic */ aoax b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aazu(abac abacVar, aoax aoaxVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.a = abacVar;
        this.b = aoaxVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.j(((bdub) this.b).a);
        return true;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new aazu(this.a, this.b, (ffgu) obj).b(ffcu.a);
    }
}
