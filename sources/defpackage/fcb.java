package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fcb extends ffkk implements ffjm {
    final /* synthetic */ jgi a;
    final /* synthetic */ long b;
    final /* synthetic */ boolean c;
    final /* synthetic */ hvi d;
    final /* synthetic */ fcu e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fcb(jgi jgiVar, long j, boolean z, hvi hviVar, fcu fcuVar) {
        super(2);
        this.a = jgiVar;
        this.b = j;
        this.c = z;
        this.d = hviVar;
        this.e = fcuVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        int intValue = ((Number) obj2).intValue();
        int i = intValue & 3;
        if (hfdVar.J(i != 2, intValue & 1)) {
            hfz.a(jdr.n.c(this.a), hpx.d(1260045569, new fca(this.b, this.c, this.d, this.e), hfdVar), hfdVar, 56);
        } else {
            hfdVar.s();
        }
        return ffcu.a;
    }
}
