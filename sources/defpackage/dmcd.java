package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmcd implements ffjn {
    final /* synthetic */ dmaz a;

    public dmcd(dmaz dmazVar) {
        this.a = dmazVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((dyh) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dmcf.i(this.a.a, hfdVar, 0);
        }
        return ffcu.a;
    }
}
