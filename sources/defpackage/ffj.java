package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ffj extends ffkk implements ffji {
    final /* synthetic */ fft a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ffj(fft fftVar) {
        super(1);
        this.a = fftVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        fft fftVar = this.a;
        ioc iocVar = (ioc) obj;
        fftVar.g = iocVar;
        if (fftVar.y() && fftVar.f() != null) {
            iak iakVar = iocVar != null ? new iak(iod.b(iocVar)) : null;
            if (!ffkj.e(fftVar.f, iakVar)) {
                fftVar.f = iakVar;
                fftVar.w();
                fftVar.x();
            }
        }
        return ffcu.a;
    }
}
