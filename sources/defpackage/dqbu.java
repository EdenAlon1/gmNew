package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqbu implements ffjm {
    final /* synthetic */ ffxx a;

    public dqbu(ffxx ffxxVar) {
        this.a = ffxxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            String str = (String) hkt.b(this.a, null, null, hfdVar, 2).a();
            if (str != null) {
                grl.b(str, null, 0L, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, jpo.y(gft.d(hfdVar).g, 0L, kal.c(18), null, null, null, null, 0L, null, 0, 0, kal.c(24), null, null, 0, 16646141), hfdVar, 0, 3120, 55294);
            }
        }
        return ffcu.a;
    }
}
