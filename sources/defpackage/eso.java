package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eso extends ffkk implements ffjm {
    final /* synthetic */ fft a;
    final /* synthetic */ ffjm b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eso(fft fftVar, ffjm ffjmVar, int i) {
        super(2);
        this.a = fftVar;
        this.b = ffjmVar;
        this.c = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a = hip.a(this.c | 1);
        esr.b(this.a, this.b, (hfd) obj, a);
        return ffcu.a;
    }
}
