package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class goq extends ffkk implements ffjm {
    final /* synthetic */ goa a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public goq(goa goaVar) {
        super(2);
        this.a = goaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            boolean D = hfdVar.D(this.a);
            goa goaVar = this.a;
            Object f = hfdVar.f();
            if (D || f == hfc.a) {
                f = new gop(goaVar);
                hfdVar.y(f);
            }
            gem.b((ffix) f, null, false, null, null, fyx.a, hfdVar, 1572864, 62);
        }
        return ffcu.a;
    }
}
