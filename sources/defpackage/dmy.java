package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dmy extends ffkk implements ffji {
    final /* synthetic */ ffky a;
    final /* synthetic */ drd b;
    final /* synthetic */ ffky c;
    final /* synthetic */ dna d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmy(ffky ffkyVar, drd drdVar, ffky ffkyVar2, dna dnaVar) {
        super(1);
        this.a = ffkyVar;
        this.b = drdVar;
        this.c = ffkyVar2;
        this.d = dnaVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        cxs cxsVar = (cxs) obj;
        float floatValue = ((Number) cxsVar.a()).floatValue() - this.a.a;
        float a = this.b.a(floatValue);
        this.a.a = ((Number) cxsVar.a()).floatValue();
        this.c.a = ((Number) cxsVar.b()).floatValue();
        if (Math.abs(floatValue - a) > 0.5f) {
            cxsVar.c();
        }
        this.d.a++;
        return ffcu.a;
    }
}
