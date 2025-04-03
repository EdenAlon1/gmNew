package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zgy implements ffjm {
    final /* synthetic */ zhq a;
    final /* synthetic */ dspm b;

    public zgy(zhq zhqVar, dspm dspmVar) {
        this.a = zhqVar;
        this.b = dspmVar;
    }

    @Override // defpackage.ffjm
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            zhq zhqVar = this.a;
            dwhl.b(zhqVar != null ? zhqVar.d : this.b.a, null, false, null, null, zet.a, hfdVar, 1572864, 62);
        }
        return ffcu.a;
    }
}
