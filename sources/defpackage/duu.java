package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class duu extends ffkk implements ffji {
    final /* synthetic */ ffky a;
    final /* synthetic */ dnh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public duu(ffky ffkyVar, dnh dnhVar) {
        super(1);
        this.a = ffkyVar;
        this.b = dnhVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        cxs cxsVar = (cxs) obj;
        this.b.a(this.a.a == 0.0f ? 1.0f : ((Number) cxsVar.a()).floatValue() / this.a.a, 0L, 0.0f);
        this.a.a = ((Number) cxsVar.a()).floatValue();
        return ffcu.a;
    }
}
