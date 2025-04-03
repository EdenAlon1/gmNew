package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbbs implements ffjn {
    final /* synthetic */ String a;

    public dbbs(String str) {
        this.a = str;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ebe ebeVar = (ebe) obj;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ebeVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= true != hfdVar.D(ebeVar) ? 2 : 4;
        }
        if ((intValue & 19) == 18 && hfdVar.I()) {
            hfdVar.s();
        } else {
            fea.b(null, hpx.d(1225066821, new dbbr(this.a, ebeVar), hfdVar), hfdVar, 48);
        }
        return ffcu.a;
    }
}
