package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aemp implements ffjm {
    final /* synthetic */ hkx a;
    final /* synthetic */ aemw b;

    public aemp(hkx hkxVar, aemw aemwVar) {
        this.a = hkxVar;
        this.b = aemwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            cwoi.a(null, null, false, null, false, hpx.d(-1781260446, new aemo(this.a, this.b), hfdVar), hfdVar, 196608, 31);
        }
        return ffcu.a;
    }
}
