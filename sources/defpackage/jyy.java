package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jyy extends ffkk implements ffjm {
    public static final jyy a = new jyy();

    public jyy() {
        super(2);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        int intValue = ((Number) obj2).intValue();
        int i = intValue & 3;
        if (hfdVar.J(i != 2, intValue & 1)) {
            fqi.c(null, 0L, 0L, 0L, 0L, 0, false, 0, null, null, hfdVar, 6, 0);
        } else {
            hfdVar.s();
        }
        return ffcu.a;
    }
}
