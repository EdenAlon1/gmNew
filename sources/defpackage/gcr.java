package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gcr extends ffkk implements ffjm {
    final /* synthetic */ ham a;
    final /* synthetic */ long b;
    final /* synthetic */ ffmj c;
    final /* synthetic */ hvi d;
    final /* synthetic */ fzr e;
    final /* synthetic */ ffji f;
    final /* synthetic */ dmug g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gcr(ham hamVar, long j, ffmj ffmjVar, hvi hviVar, fzr fzrVar, ffji ffjiVar, dmug dmugVar) {
        super(2);
        this.a = hamVar;
        this.b = j;
        this.c = ffmjVar;
        this.d = hviVar;
        this.e = fzrVar;
        this.f = ffjiVar;
        this.g = dmugVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hvi a;
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            ham hamVar = this.a;
            int i = hamVar.f(hamVar.c()).a;
            int i2 = this.a.e(this.b).a;
            ehh a2 = ehl.a(Math.max(0, (i2 - this.c.a) - 3), hfdVar, 2);
            efg efgVar = new efg();
            a = dee.a(this.d, this.e.a, idb.a);
            dxj dxjVar = dxu.f;
            dxn dxnVar = new dxn(gcy.b, true, dxr.a);
            boolean F = hfdVar.F(this.c) | hfdVar.B(i2) | hfdVar.B(i) | hfdVar.D(this.f) | hfdVar.D(this.g) | hfdVar.D(this.e);
            ffmj ffmjVar = this.c;
            ffji ffjiVar = this.f;
            dmug dmugVar = this.g;
            fzr fzrVar = this.e;
            Object f = hfdVar.f();
            if (F || f == hfc.a) {
                gcq gcqVar = new gcq(ffmjVar, i2, i, ffjiVar, dmugVar, fzrVar);
                hfdVar.y(gcqVar);
                f = gcqVar;
            }
            efo.c(efgVar, a, a2, null, dxnVar, dxjVar, null, false, (ffji) f, hfdVar, 1769472);
        }
        return ffcu.a;
    }
}
