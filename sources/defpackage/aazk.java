package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aazk extends ffhv implements ffji {
    final /* synthetic */ abac a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aazk(abac abacVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.a = abacVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ((whk) this.a.F.b()).c();
        ((xie) this.a.o.b()).c(xhx.a);
        return true;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new aazk(this.a, (ffgu) obj).b(ffcu.a);
    }
}
