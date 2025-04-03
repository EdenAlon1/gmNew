package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fis extends ffkk implements ffjn {
    public static final fis a = new fis();

    public fis() {
        super(3);
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        fnx fnxVar = (fnx) obj;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= true != hfdVar.D(fnxVar) ? 2 : 4;
        }
        if (hfdVar.J((intValue & 19) != 18, intValue & 1)) {
            fnu.b(fnxVar, null, null, hfdVar, intValue & 14);
        } else {
            hfdVar.s();
        }
        return ffcu.a;
    }
}
