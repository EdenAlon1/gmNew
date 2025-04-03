package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtjk implements ffjm {
    final /* synthetic */ dtjq a;
    final /* synthetic */ ffxx b;

    public dtjk(dtjq dtjqVar, ffxx ffxxVar) {
        this.a = dtjqVar;
        this.b = ffxxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dtjq dtjqVar = this.a;
            dtld r = dtjqVar.r();
            dtiz f = dtjq.f(dtjqVar);
            f.getClass();
            dtkp.e(r.a(f), this.b, dtjq.f(this.a).c, dtjq.f(this.a).h, hfdVar, 0);
        }
        return ffcu.a;
    }
}
