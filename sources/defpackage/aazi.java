package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aazi extends ffhv implements ffji {
    final /* synthetic */ abac a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aazi(abac abacVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.a = abacVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ((xie) this.a.o.b()).c(xia.a);
        return true;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new aazi(this.a, (ffgu) obj).b(ffcu.a);
    }
}
