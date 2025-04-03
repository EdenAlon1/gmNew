package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kcx extends ffkk implements ffjm {
    final /* synthetic */ hkx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kcx(hkx hkxVar) {
        super(2);
        this.a = hkxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hvi c;
        hfd hfdVar = (hfd) obj;
        int intValue = ((Number) obj2).intValue();
        int i = intValue & 3;
        if (hfdVar.J(i != 2, intValue & 1)) {
            c = jjs.c(hvi.e, false, kcw.a);
            kdc.b(c, (ffjm) this.a.a(), hfdVar, 0);
        } else {
            hfdVar.s();
        }
        return ffcu.a;
    }
}
