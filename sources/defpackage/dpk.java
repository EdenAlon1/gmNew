package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dpk extends ffkk implements ffji {
    final /* synthetic */ dpc a;
    final /* synthetic */ dpo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpk(dpc dpcVar, dpo dpoVar) {
        super(1);
        this.a = dpcVar;
        this.b = dpoVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        long g = iak.g(((dnm) obj).a, true != this.b.k ? 1.0f : -1.0f);
        dqs dqsVar = this.b.b;
        ffjn ffjnVar = dpj.a;
        this.a.a(Float.intBitsToFloat((int) (dqsVar == dqs.a ? g & 4294967295L : g >> 32)));
        return ffcu.a;
    }
}
