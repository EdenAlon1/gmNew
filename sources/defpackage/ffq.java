package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ffq extends ffkk implements ffji {
    final /* synthetic */ fft a;
    final /* synthetic */ ffji b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ffq(fft fftVar, ffji ffjiVar) {
        super(1);
        this.a = fftVar;
        this.b = ffjiVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        fcy fcyVar = (fcy) obj;
        this.a.t(fcyVar);
        this.b.invoke(fcyVar);
        return ffcu.a;
    }
}
