package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ftz extends ffkk implements ffji {
    final /* synthetic */ ffky a;
    final /* synthetic */ gvr b;
    final /* synthetic */ ffky c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ftz(ffky ffkyVar, gvr gvrVar, ffky ffkyVar2) {
        super(1);
        this.a = ffkyVar;
        this.b = gvrVar;
        this.c = ffkyVar2;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        cxs cxsVar = (cxs) obj;
        float floatValue = ((Number) cxsVar.a()).floatValue() - this.a.a;
        float c = this.b.c();
        this.b.e(c + floatValue);
        float abs = Math.abs(c - this.b.c());
        this.a.a = ((Number) cxsVar.a()).floatValue();
        this.c.a = ((Number) cxsVar.b()).floatValue();
        if (Math.abs(floatValue - abs) > 0.5f) {
            cxsVar.c();
        }
        return ffcu.a;
    }
}
