package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abfx implements ffjn {
    final /* synthetic */ String a;

    public abfx(String str) {
        this.a = str;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((edi) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            jpo jpoVar = gft.d(hfdVar).g;
            long j = gft.a(hfdVar).q;
            dwjt.b(this.a, eba.j(hvi.e, 32.0f, 0.0f, 0.0f, 2.0f, 6), j, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jpoVar, hfdVar, 0, 0, 65528);
        }
        return ffcu.a;
    }
}
