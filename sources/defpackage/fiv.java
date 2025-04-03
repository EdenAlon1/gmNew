package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fiv extends ffkk implements ffjn {
    public static final fiv a = new fiv();

    public fiv() {
        super(3);
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        fnv fnvVar = (fnv) obj;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= true != ((intValue & 8) == 0 ? hfdVar.D(fnvVar) : hfdVar.F(fnvVar)) ? 2 : 4;
        }
        if (hfdVar.J((intValue & 19) != 18, intValue & 1)) {
            foh.b(fnvVar, null, null, 0L, 0L, 0L, 0.0f, hfdVar, intValue & 14);
        } else {
            hfdVar.s();
        }
        return ffcu.a;
    }
}
