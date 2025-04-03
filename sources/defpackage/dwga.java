package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwga implements ffjn {
    public static final dwga a = new dwga();

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        god godVar = (god) obj;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        godVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= true != hfdVar.D(godVar) ? 2 : 4;
        }
        if ((intValue & 19) == 18 && hfdVar.I()) {
            hfdVar.s();
        } else {
            gnz.a(godVar, null, null, hfdVar, intValue & 14, 6);
        }
        return ffcu.a;
    }
}
