package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class doqx implements ffjn {
    final /* synthetic */ dorc a;
    final /* synthetic */ long b;
    final /* synthetic */ long c;
    final /* synthetic */ long d;
    final /* synthetic */ gvi e;

    public doqx(dorc dorcVar, long j, long j2, long j3, gvi gviVar) {
        this.a = dorcVar;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = gviVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        gve gveVar = (gve) obj;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        gveVar.getClass();
        hfdVar.v(-447885636);
        hfdVar.o();
        hfdVar.v(-447883251);
        hpn d = !this.a.b.isEmpty() ? hpx.d(660737011, new doqv(this.a, this.d, this.e), hfdVar) : null;
        hfdVar.o();
        float f = dwkb.a;
        long j = this.b;
        long j2 = this.c;
        hfdVar.v(1001742709);
        gks gksVar = new gks(j, j2, j2, dwfv.c(26, hfdVar));
        hfdVar.o();
        dwke.a(gveVar, null, d, 0L, 0.0f, null, gksVar, 0.0f, 0.0f, hpx.d(-62543139, new doqw(this.a), hfdVar), hfdVar, intValue & 14, 6);
        return ffcu.a;
    }
}
