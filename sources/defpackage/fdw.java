package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fdw extends ffkk implements ffji {
    final /* synthetic */ fft a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fdw(fft fftVar) {
        super(1);
        this.a = fftVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new fdv(this.a);
    }
}
