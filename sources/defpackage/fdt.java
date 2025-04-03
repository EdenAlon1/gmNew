package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fdt extends ffkk implements ffjm {
    final /* synthetic */ fgi a;
    final /* synthetic */ ffjm b;
    final /* synthetic */ fft c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fdt(fgi fgiVar, ffjm ffjmVar, fft fftVar) {
        super(2);
        this.a = fgiVar;
        this.b = ffjmVar;
        this.c = fftVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        int intValue = ((Number) obj2).intValue();
        int i = intValue & 3;
        if (hfdVar.J(i != 2, intValue & 1)) {
            hfz.a(fgk.a.c(this.a), hpx.d(-272381430, new fds(this.b, this.c), hfdVar), hfdVar, 56);
        } else {
            hfdVar.s();
        }
        return ffcu.a;
    }
}
