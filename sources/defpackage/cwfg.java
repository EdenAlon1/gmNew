package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwfg implements ffjn {
    final /* synthetic */ cwec a;

    public cwfg(cwec cwecVar) {
        this.a = cwecVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((edi) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            cvye.i(this.a.e, null, hfdVar, 0);
        }
        return ffcu.a;
    }
}
