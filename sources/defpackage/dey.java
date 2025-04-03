package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dey extends ffkk implements ffjn {
    final /* synthetic */ boolean a;
    final /* synthetic */ ffix b;
    final /* synthetic */ ffix c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dey(boolean z, ffix ffixVar, ffix ffixVar2) {
        super(3);
        this.a = z;
        this.b = ffixVar;
        this.c = ffixVar2;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        dwn dwnVar;
        hfd hfdVar = (hfd) obj2;
        ((Number) obj3).intValue();
        hfdVar.v(-1534186401);
        dgz dgzVar = (dgz) hfdVar.e(dhc.a);
        if (dgzVar instanceof dhf) {
            hfdVar.v(-1726068379);
            hfdVar.o();
            dwnVar = null;
        } else {
            hfdVar.v(-1725935761);
            Object f = hfdVar.f();
            if (f == hfc.a) {
                f = new dwn();
                hfdVar.y(f);
            }
            dwnVar = (dwn) f;
            hfdVar.o();
        }
        dwn dwnVar2 = dwnVar;
        hvi e = dfb.e(hvi.e, dwnVar2, dgzVar, this.a, null, this.b, null, this.c);
        hfdVar.o();
        return e;
    }
}
