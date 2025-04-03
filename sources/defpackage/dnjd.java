package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnjd implements ffjm {
    final /* synthetic */ dnjg a;

    public dnjd(dnjg dnjgVar) {
        this.a = dnjgVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dnjf.e(this.a.d, hfdVar, 0);
        }
        return ffcu.a;
    }
}
