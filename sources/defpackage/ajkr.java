package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ajkr implements ffjm {
    final /* synthetic */ ajkt a;

    public ajkr(ajkt ajktVar) {
        this.a = ajktVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            ajld ajldVar = this.a.i.e;
            if (ajldVar == null) {
                ajldVar = ajld.a;
            }
            ajldVar.getClass();
            ajlb.c(ajldVar, hfdVar, 0);
        }
        return ffcu.a;
    }
}
