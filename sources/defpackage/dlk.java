package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dlk extends ffkk implements ffji {
    final /* synthetic */ dlq a;
    final /* synthetic */ dlu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlk(dlq dlqVar, dlu dluVar) {
        super(1);
        this.a = dlqVar;
        this.b = dluVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        long j = ((dnm) obj).a;
        dlq dlqVar = this.a;
        long g = iak.g(j, true != dlqVar.j() ? 1.0f : -1.0f);
        dkw.a(this.b, this.a.a.b(Float.intBitsToFloat((int) (dlqVar.b == dqs.a ? g & 4294967295L : g >> 32))));
        return ffcu.a;
    }
}
