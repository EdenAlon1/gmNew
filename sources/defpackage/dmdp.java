package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmdp implements ffjn {
    final /* synthetic */ dmck a;

    public dmdp(dmck dmckVar) {
        this.a = dmckVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((dys) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dmds.k(this.a.a, hfdVar, 0);
            dmck dmckVar = this.a;
            dmds.a(dmckVar.e, dmckVar.a != null, hfdVar, 0);
        }
        return ffcu.a;
    }
}
