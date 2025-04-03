package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnck implements ffjn {
    public static final dnck a = new dnck();

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
            int i = intValue & 14;
            dncq.a(ebqVar, hfdVar, i);
            dncq.c(hfdVar, 0);
            dncq.a(ebqVar, hfdVar, i);
        }
        return ffcu.a;
    }
}
