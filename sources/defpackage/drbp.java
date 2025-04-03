package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drbp extends ffhv implements ffji {
    final /* synthetic */ dqzc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drbp(dqzc dqzcVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.a = dqzcVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return this.a;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new drbp(this.a, (ffgu) obj).b(ffcu.a);
    }
}
