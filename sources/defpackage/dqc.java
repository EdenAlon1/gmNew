package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dqc extends ffkk implements ffji {
    final /* synthetic */ ffky a;
    final /* synthetic */ dqq b;
    final /* synthetic */ ffji c;
    final /* synthetic */ dsl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqc(ffky ffkyVar, dqq dqqVar, dsl dslVar, ffji ffjiVar) {
        super(1);
        this.a = ffkyVar;
        this.b = dqqVar;
        this.d = dslVar;
        this.c = ffjiVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        cxs cxsVar = (cxs) obj;
        float floatValue = ((Number) cxsVar.a()).floatValue() - this.a.a;
        if (!dqa.a(floatValue)) {
            if (!dqa.a(floatValue - this.b.e(this.d, floatValue))) {
                cxsVar.c();
                return ffcu.a;
            }
            this.a.a += floatValue;
        }
        if (((Boolean) this.c.invoke(Float.valueOf(this.a.a))).booleanValue()) {
            cxsVar.c();
        }
        return ffcu.a;
    }
}
