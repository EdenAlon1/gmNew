package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wla implements ffjm {
    final /* synthetic */ wlg a;

    public wla(wlg wlgVar) {
        this.a = wlgVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            this.a.a(hfdVar, 0);
        }
        return ffcu.a;
    }
}
