package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xmj implements ffjo {
    public static final xmj a = new xmj();

    @Override // defpackage.ffjo
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        hvi hviVar = (hvi) obj;
        god godVar = (god) obj2;
        hfd hfdVar = (hfd) obj3;
        int intValue = ((Number) obj4).intValue();
        hviVar.getClass();
        godVar.getClass();
        if ((intValue & 6) == 0) {
            i = (true != hfdVar.D(hviVar) ? 2 : 4) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= true != hfdVar.D(godVar) ? 16 : 32;
        }
        if ((i & 147) == 146 && hfdVar.I()) {
            hfdVar.s();
        } else {
            gnz.a(godVar, ecs.a(hviVar), null, hfdVar, (i >> 3) & 14, 4);
        }
        return ffcu.a;
    }
}
