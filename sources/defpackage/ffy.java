package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ffy extends ffkk implements ffix {
    final /* synthetic */ fft a;
    final /* synthetic */ hho b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ffy(fft fftVar, hho hhoVar) {
        super(0);
        this.a = fftVar;
        this.b = hhoVar;
    }

    @Override // defpackage.ffix
    public final /* synthetic */ Object invoke() {
        euf d;
        long a;
        long j = ((kaf) this.b.a()).a;
        fft fftVar = this.a;
        fcy f = fftVar.f();
        long j2 = 9205357640488583168L;
        if (f != null && (d = fftVar.d()) != null) {
            int ordinal = d.ordinal();
            if (ordinal == 0) {
                throw new IllegalStateException("SelectionContainer does not support cursor");
            }
            if (ordinal == 1) {
                a = ffu.a(fftVar, j, f.a);
            } else {
                if (ordinal != 2) {
                    throw new ffcd();
                }
                a = ffu.a(fftVar, j, f.b);
            }
            j2 = a;
        }
        return new iak(j2);
    }
}
