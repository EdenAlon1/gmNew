package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ffk extends ffkk implements ffji {
    final /* synthetic */ fft a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ffk(fft fftVar) {
        super(1);
        this.a = fftVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        hzo hzoVar = (hzo) obj;
        if (!hzoVar.a() && this.a.y()) {
            this.a.k();
        }
        this.a.r(hzoVar.a());
        return ffcu.a;
    }
}
