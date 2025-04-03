package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dsn extends ffkk implements ffji {
    final /* synthetic */ dsp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsn(dsp dspVar) {
        super(1);
        this.a = dspVar;
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        long j = ((iak) obj).a;
        dsp dspVar = this.a;
        return new iak(dspVar.c(dspVar.j, j, dspVar.i));
    }
}
