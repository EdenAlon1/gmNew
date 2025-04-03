package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dmp extends ffkk implements ffji {
    final /* synthetic */ dmt a;
    final /* synthetic */ ffud b;
    final /* synthetic */ dsl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmp(dmt dmtVar, ffud ffudVar, dsl dslVar) {
        super(1);
        this.a = dmtVar;
        this.b = ffudVar;
        this.c = dslVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        float floatValue = ((Number) obj).floatValue();
        dmt dmtVar = this.a;
        float f = true != dmtVar.c ? -1.0f : 1.0f;
        dsp dspVar = dmtVar.b;
        float b = f * dspVar.b(dspVar.d(this.c.b(dspVar.d(dspVar.f(f * floatValue)))));
        if (Math.abs(b) < Math.abs(floatValue)) {
            ffui.e(this.b, "Scroll animation cancelled because scroll was not consumed (" + b + " < " + floatValue + ')', null);
        }
        return ffcu.a;
    }
}
