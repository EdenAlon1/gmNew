package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dspx implements ffjm {
    final /* synthetic */ dspo a;
    final /* synthetic */ god b;

    public dspx(dspo dspoVar, god godVar) {
        this.a = dspoVar;
        this.b = godVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            cru.b(this.a != null, null, null, ctt.m(null, 3), null, hpx.d(-1951304972, new dspw(this.a, this.b), hfdVar), hfdVar, 199680, 22);
        }
        return ffcu.a;
    }
}
