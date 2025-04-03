package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zdf implements ffjn {
    final /* synthetic */ String a;
    final /* synthetic */ boolean b;

    public zdf(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((eql) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            domg.b(new doml(this.a, null, true, false, null, false, this.b, null, false, null, null, null, false, false, null, null, false, false, false, 4194134), null, null, null, hfdVar, 0, 14);
        }
        return ffcu.a;
    }
}
