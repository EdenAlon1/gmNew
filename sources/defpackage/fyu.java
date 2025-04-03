package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fyu extends ffkk implements ffjn {
    public static final fyu a = new fyu();

    public fyu() {
        super(3);
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        goa goaVar = (goa) obj;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= true != hfdVar.D(goaVar) ? 2 : 4;
        }
        if ((intValue & 19) == 18 && hfdVar.I()) {
            hfdVar.s();
        } else {
            gor.c(goaVar, null, null, 0L, 0L, 0L, 0L, 0L, hfdVar, intValue & 14);
        }
        return ffcu.a;
    }
}
