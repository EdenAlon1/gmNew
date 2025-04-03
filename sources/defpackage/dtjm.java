package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtjm implements ffjm {
    final /* synthetic */ dtjq a;
    final /* synthetic */ ffxx b;

    public dtjm(dtjq dtjqVar, ffxx ffxxVar) {
        this.a = dtjqVar;
        this.b = ffxxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hfz.a(dnae.a.c(dtjq.f(this.a).m), hpx.d(584288459, new dtjl(this.a, this.b), hfdVar), hfdVar, 56);
        }
        return ffcu.a;
    }
}
