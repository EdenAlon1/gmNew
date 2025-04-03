package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlxf implements ffjm {
    final /* synthetic */ dlvq a;

    public dlxf(dlvq dlvqVar) {
        this.a = dlvqVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dlxp.b((dlvj) this.a, hfdVar, 0);
        }
        return ffcu.a;
    }
}
