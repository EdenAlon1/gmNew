package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dqh extends ffkk implements ffji {
    final /* synthetic */ dqq a;
    final /* synthetic */ fflb b;
    final /* synthetic */ ffky c;
    final /* synthetic */ dsp d;
    final /* synthetic */ ffkx e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqh(dqq dqqVar, fflb fflbVar, ffky ffkyVar, dsp dspVar, ffkx ffkxVar) {
        super(1);
        this.a = dqqVar;
        this.b = fflbVar;
        this.c = ffkyVar;
        this.d = dspVar;
        this.e = ffkxVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        float floatValue = ((Number) obj).floatValue();
        dqb g = dqq.g(this.a.c);
        if (g != null) {
            this.a.d(g);
            fflb fflbVar = this.b;
            fflbVar.a = ((dqb) fflbVar.a).a(g);
            ffky ffkyVar = this.c;
            dsp dspVar = this.d;
            ffkyVar.a = dspVar.b(dspVar.d(((dqb) this.b.a).a));
            this.e.a = !dqa.a(this.c.a - floatValue);
        }
        return Boolean.valueOf(g != null);
    }
}
