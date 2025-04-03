package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class doqv implements ffjm {
    final /* synthetic */ dorc a;
    final /* synthetic */ long b;
    final /* synthetic */ gvi c;

    public doqv(dorc dorcVar, long j, gvi gviVar) {
        this.a = dorcVar;
        this.b = j;
        this.c = gviVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dorc dorcVar = this.a;
            long j = this.b;
            hfdVar.v(-26770932);
            boolean F = hfdVar.F(this.c);
            final gvi gviVar = this.c;
            Object f = hfdVar.f();
            if (F || f == hfc.a) {
                f = new ffix() { // from class: doqu
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        gvi.this.b();
                        return ffcu.a;
                    }
                };
                hfdVar.y(f);
            }
            hfdVar.o();
            dorb.a(dorcVar.b, j, (ffix) f, hfdVar, 0);
        }
        return ffcu.a;
    }
}
