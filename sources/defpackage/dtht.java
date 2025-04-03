package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtht implements ffjn {
    final /* synthetic */ igq a;
    final /* synthetic */ String b;
    final /* synthetic */ float c;
    final /* synthetic */ String d;

    public dtht(igq igqVar, String str, float f, String str2) {
        this.a = igqVar;
        this.b = str;
        this.c = f;
        this.d = str2;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((ebq) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            geq.a(this.a, this.b, ebs.k(hvi.e, this.c), 0L, hfdVar, 0, 8);
            if (this.d != null) {
                grl.b(this.d, eba.j(hvi.e, 8.0f, 0.0f, 0.0f, 0.0f, 14), 0L, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, null, hfdVar, 48, 3120, 120828);
            }
        }
        return ffcu.a;
    }
}
