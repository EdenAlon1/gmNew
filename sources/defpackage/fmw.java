package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fmw extends ffkk implements ffjn {
    final /* synthetic */ fln a;
    final /* synthetic */ ecd b;
    final /* synthetic */ long c;
    final /* synthetic */ long d;
    final /* synthetic */ int e;
    final /* synthetic */ ffjm f;
    final /* synthetic */ ffjn g;
    final /* synthetic */ ffjm h;
    final /* synthetic */ ffjm i;
    final /* synthetic */ ffjn j;
    final /* synthetic */ fnf k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fmw(fln flnVar, ecd ecdVar, long j, long j2, int i, ffjm ffjmVar, ffjn ffjnVar, ffjm ffjmVar2, ffjm ffjmVar3, ffjn ffjnVar2, fnf fnfVar) {
        super(3);
        this.a = flnVar;
        this.b = ecdVar;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = ffjmVar;
        this.g = ffjnVar;
        this.h = ffjmVar2;
        this.i = ffjmVar3;
        this.j = ffjnVar2;
        this.k = fnfVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hvi hviVar = (hvi) obj;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= true != hfdVar.D(hviVar) ? 2 : 4;
        }
        if (hfdVar.J((intValue & 19) != 18, intValue & 1)) {
            boolean D = hfdVar.D(this.a) | hfdVar.D(this.b);
            fln flnVar = this.a;
            ecd ecdVar = this.b;
            Object f = hfdVar.f();
            if (D || f == hfc.a) {
                f = new fmt(flnVar, ecdVar);
                hfdVar.y(f);
            }
            C0001for.a(ecm.a(hviVar, (ffji) f), null, this.c, this.d, 0.0f, hpx.d(1772955108, new fmv(this.e, this.f, this.g, this.h, this.a, this.i, this.j, this.k), hfdVar), hfdVar, 1572864, 50);
        } else {
            hfdVar.s();
        }
        return ffcu.a;
    }
}
