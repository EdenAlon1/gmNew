package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zgz implements ffjn {
    final /* synthetic */ zhq a;

    public zgz(zhq zhqVar) {
        this.a = zhqVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ebq ebqVar = (ebq) obj;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ebqVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= true != hfdVar.D(ebqVar) ? 2 : 4;
        }
        if ((intValue & 19) == 18 && hfdVar.I()) {
            hfdVar.s();
        } else {
            zhq zhqVar = this.a;
            dssg.e(ebqVar, zhqVar != null ? zhqVar.c : ffel.a, 0, hfdVar, intValue & 14);
        }
        return ffcu.a;
    }
}
