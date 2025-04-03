package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class esh extends ffkk implements ffjn {
    public static final esh a = new esh();

    public esh() {
        super(3);
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ffjm ffjmVar = (ffjm) obj;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= true != hfdVar.F(ffjmVar) ? 2 : 4;
        }
        if (hfdVar.J((intValue & 19) != 18, intValue & 1)) {
            ffjmVar.a(hfdVar, Integer.valueOf(intValue & 14));
        } else {
            hfdVar.s();
        }
        return ffcu.a;
    }
}
