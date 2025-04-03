package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbgr implements ffjm {
    public static final dbgr a = new dbgr();

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dwjt.b("Please select account first...", null, ibw.c, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, hfdVar, 390, 0, 131066);
        }
        return ffcu.a;
    }
}
