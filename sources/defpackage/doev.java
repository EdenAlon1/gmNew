package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class doev implements ffjn {
    final /* synthetic */ qgg a;
    final /* synthetic */ qgp b;

    public doev(qgp qgpVar, qgg qggVar) {
        this.b = qgpVar;
        this.a = qggVar;
    }

    @Override // defpackage.ffjn
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hvi c;
        ((Number) obj).floatValue();
        hfd hfdVar = (hfd) obj2;
        if ((((Number) obj3).intValue() & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else if (this.b.a() != null) {
            c = ebs.c(hvi.e, 1.0f);
            qgf.d(this.b.a(), dofe.a(this.a), jfw.a(c, "reaction"), null, null, null, false, hfdVar, 384, 0);
        }
        return ffcu.a;
    }
}
