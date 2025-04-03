package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aazh extends ffhv implements ffji {
    final /* synthetic */ abac a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aazh(abac abacVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.a = abacVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        new aayb(this.a).invoke();
        return true;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new aazh(this.a, (ffgu) obj).b(ffcu.a);
    }
}
