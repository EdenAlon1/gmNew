package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egtg implements ffjm {
    final /* synthetic */ ffjn a;
    final /* synthetic */ dvxi b;

    public egtg(ffjn ffjnVar, dvxi dvxiVar) {
        this.a = ffjnVar;
        this.b = dvxiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            Object e = hfdVar.e(dvyx.a);
            if (e == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            this.a.a(new egtj((dvxe) e, this.b), hfdVar, 0);
        }
        return ffcu.a;
    }
}
