package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fsr extends ffkk implements ffjm {
    final /* synthetic */ ffjm a;
    final /* synthetic */ ffjm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fsr(ffjm ffjmVar, ffjm ffjmVar2) {
        super(2);
        this.a = ffjmVar;
        this.b = ffjmVar2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            ebe ebeVar = fsx.a;
            fsx.a(8.0f, 12.0f, hpx.d(1887135077, new fsq(this.a, this.b), hfdVar), hfdVar, 438);
        }
        return ffcu.a;
    }
}
