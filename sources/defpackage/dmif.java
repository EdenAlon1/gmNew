package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmif implements ffjn {
    final /* synthetic */ String a;
    final /* synthetic */ hkx b;

    public dmif(String str, hkx hkxVar) {
        this.a = str;
        this.b = hkxVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        dyh dyhVar = (dyh) obj;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        dyhVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= true != hfdVar.D(dyhVar) ? 2 : 4;
        }
        if ((intValue & 19) == 18 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dmio.d(dyhVar, this.a, dmio.e(this.b), hfdVar, intValue & 14);
        }
        return ffcu.a;
    }
}
