package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbkn implements ffjm {
    final /* synthetic */ dbku a;

    public dbkn(dbku dbkuVar) {
        this.a = dbkuVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hvi c;
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dbku dbkuVar = this.a;
            c = ebs.c(hvi.e, 1.0f);
            dbkuVar.a(c, hfdVar, 6);
        }
        return ffcu.a;
    }
}
