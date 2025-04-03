package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zpg implements ffjn {
    public static final zpg a = new zpg();

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        doun dounVar = (doun) obj;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        dounVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= true != hfdVar.D(dounVar) ? 2 : 4;
        }
        if ((intValue & 19) == 18 && hfdVar.I()) {
            hfdVar.s();
        } else {
            zqq.a(dounVar, hfdVar, intValue & 14);
        }
        return ffcu.a;
    }
}
