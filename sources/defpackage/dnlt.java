package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnlt implements ffjm {
    final /* synthetic */ dnlg a;

    public dnlt(dnlg dnlgVar) {
        this.a = dnlgVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dnly.e(this.a, hfdVar, 0);
        }
        return ffcu.a;
    }
}
