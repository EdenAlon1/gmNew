package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fdu extends ffkk implements ffjm {
    final /* synthetic */ fft a;
    final /* synthetic */ fgi b;
    final /* synthetic */ ffjm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fdu(fft fftVar, fgi fgiVar, ffjm ffjmVar) {
        super(2);
        this.a = fftVar;
        this.b = fgiVar;
        this.c = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        int intValue = ((Number) obj2).intValue();
        int i = intValue & 3;
        if (hfdVar.J(i != 2, intValue & 1)) {
            fft fftVar = this.a;
            esr.b(fftVar, hpx.d(577209674, new fdt(this.b, this.c, fftVar), hfdVar), hfdVar, 48);
        } else {
            hfdVar.s();
        }
        return ffcu.a;
    }
}
