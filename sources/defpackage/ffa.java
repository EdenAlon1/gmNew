package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ffa extends ffkk implements ffji {
    final /* synthetic */ fft a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ffa(fft fftVar) {
        super(1);
        this.a = fftVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (this.a.a.b().b(((Number) obj).longValue())) {
            this.a.w();
            this.a.x();
        }
        return ffcu.a;
    }
}
