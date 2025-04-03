package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dodn implements ffjm {
    final /* synthetic */ dodz a;

    public dodn(dodz dodzVar) {
        this.a = dodzVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            ebv.a(ebs.e(hvi.e, 16.0f), hfdVar);
            dodp.h(this.a.f(), hfdVar, 0);
            dodp.e(this.a.e(), hfdVar, 0);
            dodp.d(this.a.g(), hfdVar, 0);
            ebv.a(ebs.e(hvi.e, 12.0f), hfdVar);
        }
        return ffcu.a;
    }
}
