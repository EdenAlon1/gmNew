package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class epq extends ffkk implements ffjn {
    final /* synthetic */ boolean a;
    final /* synthetic */ ffix b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public epq(boolean z, ffix ffixVar) {
        super(3);
        this.a = z;
        this.b = ffixVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        dwn dwnVar;
        hfd hfdVar = (hfd) obj2;
        ((Number) obj3).intValue();
        hfdVar.v(-2124609672);
        dgz dgzVar = (dgz) hfdVar.e(dhc.a);
        if (dgzVar instanceof dhf) {
            hfdVar.v(-1412174474);
            hfdVar.o();
            dwnVar = null;
        } else {
            hfdVar.v(-1412041856);
            Object f = hfdVar.f();
            if (f == hfc.a) {
                f = new dwn();
                hfdVar.y(f);
            }
            dwnVar = (dwn) f;
            hfdVar.o();
        }
        dwn dwnVar2 = dwnVar;
        hvi a = eps.a(hvi.e, this.a, dwnVar2, dgzVar, true, null, this.b);
        hfdVar.o();
        return a;
    }
}
