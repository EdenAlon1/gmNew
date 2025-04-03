package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyzo implements ffjm {
    final /* synthetic */ cyyj a;
    final /* synthetic */ ffix b;

    public cyzo(cyyj cyyjVar, ffix ffixVar) {
        this.a = cyyjVar;
        this.b = ffixVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            cyyj cyyjVar = this.a;
            czah.j(cyyjVar.a, this.b, cyyjVar.f.c, hfdVar, 0);
        }
        return ffcu.a;
    }
}
