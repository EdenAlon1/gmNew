package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czdn implements ffjm {
    final /* synthetic */ czdj a;

    public czdn(czdj czdjVar) {
        this.a = czdjVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            czdo.b(this.a.a, hfdVar, 0);
        }
        return ffcu.a;
    }
}
