package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dew extends ffkk implements ffjn {
    final /* synthetic */ boolean a;
    final /* synthetic */ String b;
    final /* synthetic */ ffix c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dew(boolean z, String str, ffix ffixVar) {
        super(3);
        this.a = z;
        this.b = str;
        this.c = ffixVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        dwn dwnVar;
        hfd hfdVar = (hfd) obj2;
        ((Number) obj3).intValue();
        hfdVar.v(-756081143);
        dgz dgzVar = (dgz) hfdVar.e(dhc.a);
        if (dgzVar instanceof dhf) {
            hfdVar.v(617653824);
            hfdVar.o();
            dwnVar = null;
        } else {
            hfdVar.v(617786442);
            Object f = hfdVar.f();
            if (f == hfc.a) {
                f = new dwn();
                hfdVar.y(f);
            }
            dwnVar = (dwn) f;
            hfdVar.o();
        }
        dwn dwnVar2 = dwnVar;
        hvi b = dfb.b(hvi.e, dwnVar2, dgzVar, this.a, this.b, null, this.c);
        hfdVar.o();
        return b;
    }
}
