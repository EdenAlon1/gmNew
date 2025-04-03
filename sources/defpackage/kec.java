package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kec extends ffkk implements ffjm {
    public static final kec a = new kec();

    public kec() {
        super(2);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        int intValue = ((Number) obj2).intValue();
        int i = intValue & 3;
        if (!hfdVar.J(i != 2, intValue & 1)) {
            hfdVar.s();
        }
        return ffcu.a;
    }
}
