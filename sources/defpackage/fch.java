package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fch extends ffkk implements ffjn {
    final /* synthetic */ ffix a;
    final /* synthetic */ boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fch(ffix ffixVar, boolean z) {
        super(3);
        this.a = ffixVar;
        this.b = z;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hvi hviVar = (hvi) obj;
        hfd hfdVar = (hfd) obj2;
        ((Number) obj3).intValue();
        hfdVar.v(-196777734);
        long j = ((fhz) hfdVar.e(fib.a)).a;
        boolean C = hfdVar.C(j) | hfdVar.D(this.a) | hfdVar.E(this.b);
        Object f = hfdVar.f();
        if (C || f == hfc.a) {
            fcg fcgVar = new fcg(j, this.a, this.b);
            hfdVar.y(fcgVar);
            f = fcgVar;
        }
        hvi b = hxs.b(hviVar, (ffji) f);
        hfdVar.o();
        return b;
    }
}
