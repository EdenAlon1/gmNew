package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dvs extends ffkk implements ffji {
    final /* synthetic */ float a;
    final /* synthetic */ ffky b;
    final /* synthetic */ drd c;
    final /* synthetic */ ffji d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dvs(float f, ffky ffkyVar, drd drdVar, ffji ffjiVar) {
        super(1);
        this.a = f;
        this.b = ffkyVar;
        this.c = drdVar;
        this.d = ffjiVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        cxs cxsVar = (cxs) obj;
        if (Math.abs(((Number) cxsVar.a()).floatValue()) >= Math.abs(this.a)) {
            float a = dvv.a(((Number) cxsVar.a()).floatValue(), this.a);
            dvv.c(cxsVar, this.c, this.d, a - this.b.a);
            cxsVar.c();
            this.b.a = a;
        } else {
            dvv.c(cxsVar, this.c, this.d, ((Number) cxsVar.a()).floatValue() - this.b.a);
            this.b.a = ((Number) cxsVar.a()).floatValue();
        }
        return ffcu.a;
    }
}
