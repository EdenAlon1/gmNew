package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class goo extends ffkk implements ffjm {
    final /* synthetic */ long a;
    final /* synthetic */ String b;
    final /* synthetic */ goa c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public goo(long j, goa goaVar, String str) {
        super(2);
        this.a = j;
        this.c = goaVar;
        this.b = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            long j = this.a;
            ebe ebeVar = fvp.a;
            fvo e = fvp.e(0L, j, hfdVar, 13);
            boolean D = hfdVar.D(this.c);
            goa goaVar = this.c;
            Object f = hfdVar.f();
            if (D || f == hfc.a) {
                f = new gom(goaVar);
                hfdVar.y(f);
            }
            fwa.c((ffix) f, null, false, null, e, null, hpx.d(521110564, new gon(this.b), hfdVar), hfdVar, 805306368, 494);
        }
        return ffcu.a;
    }
}
