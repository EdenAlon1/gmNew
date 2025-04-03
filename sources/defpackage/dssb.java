package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dssb implements ffjm {
    final /* synthetic */ dsrv a;

    public dssb(dsrv dsrvVar) {
        this.a = dsrvVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dsrv dsrvVar = this.a;
            dwjt.b(dsrvVar.b, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, gft.d(hfdVar).j, hfdVar, 0, 0, 65534);
        }
        return ffcu.a;
    }
}
