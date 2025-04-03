package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gan extends ffkk implements ffjm {
    final /* synthetic */ gcz a;
    final /* synthetic */ ham b;
    final /* synthetic */ fzr c;
    final /* synthetic */ boolean d;
    final /* synthetic */ gae e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gan(gcz gczVar, ham hamVar, gae gaeVar, fzr fzrVar, boolean z) {
        super(2);
        this.a = gczVar;
        this.b = hamVar;
        this.e = gaeVar;
        this.c = fzrVar;
        this.d = z;
    }

    @Override // defpackage.ffjm
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            gcz gczVar = this.a;
            Long d = gczVar.d();
            long a = gczVar.a();
            int c = gczVar.c();
            boolean D = hfdVar.D(gczVar);
            gcz gczVar2 = this.a;
            Object f = hfdVar.f();
            if (D || f == hfc.a) {
                f = new gal(gczVar2);
                hfdVar.y(f);
            }
            ffji ffjiVar = (ffji) f;
            boolean D2 = hfdVar.D(this.a);
            gcz gczVar3 = this.a;
            Object f2 = hfdVar.f();
            if (D2 || f2 == hfc.a) {
                f2 = new gam(gczVar3);
                hfdVar.y(f2);
            }
            ham hamVar = this.b;
            Object obj3 = this.a;
            fuh fuhVar = (fuh) obj3;
            gcy.n(d, a, c, ffjiVar, (ffji) f2, hamVar, fuhVar.a, this.e, (dmug) fuhVar.d.a(), this.c, this.d, hfdVar, 0, 0);
        }
        return ffcu.a;
    }
}
