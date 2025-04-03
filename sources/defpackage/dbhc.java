package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbhc implements ffjm {
    final /* synthetic */ String a;
    final /* synthetic */ ebe b;

    public dbhc(String str, ebe ebeVar) {
        this.a = str;
        this.b = ebeVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hvi c;
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            String str = this.a;
            c = dix.c(jfw.a(eba.c(hvi.e, this.b), "resultField"), dix.a(0, hfdVar, 0, 1), false & ((r6 & 8) == 0), (r6 & 2) != 0, true);
            dwjt.b(str, c, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, hfdVar, 0, 0, 131068);
        }
        return ffcu.a;
    }
}
