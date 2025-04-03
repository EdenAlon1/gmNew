package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnyi implements ffjn {
    final /* synthetic */ dnym a;
    final /* synthetic */ int b;

    public dnyi(dnym dnymVar, int i) {
        this.a = dnymVar;
        this.b = i;
    }

    @Override // defpackage.ffjn
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((dyh) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dnym dnymVar = this.a;
            dnxw.e((dnwq) ((dnyn) dnymVar).a.get(this.b), null, null, null, null, hfdVar, 0, 28);
        }
        return ffcu.a;
    }
}
