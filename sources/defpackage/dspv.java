package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dspv implements ffjm {
    final /* synthetic */ dspo a;
    final /* synthetic */ god b;

    public dspv(dspo dspoVar, god godVar) {
        this.a = dspoVar;
        this.b = godVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dspo dspoVar = this.a;
            if (dspoVar != null) {
                dsrl.c(dspoVar, this.b, hfdVar, 0);
            }
        }
        return ffcu.a;
    }
}
