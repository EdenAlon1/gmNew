package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class docl implements ffjm {
    final /* synthetic */ String a;
    final /* synthetic */ long b;

    public docl(String str, long j) {
        this.a = str;
        this.b = j;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dwjt.b(this.a, eba.e(hvi.e, 8.0f, 2.0f), this.b, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, gft.d(hfdVar).o, hfdVar, 432, 0, 65528);
        }
        return ffcu.a;
    }
}
