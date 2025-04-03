package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dohn implements ffjn {
    final /* synthetic */ dohr a;

    public dohn(dohr dohrVar) {
        this.a = dohrVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((ebq) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dohp.b(hfdVar, 0);
            String str = this.a.c;
            if (str != null) {
                ebv.a(ebs.o(hvi.e, 8.0f), hfdVar);
                dohp.e(str, hfdVar, 0);
            }
        }
        return ffcu.a;
    }
}
