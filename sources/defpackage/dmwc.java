package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmwc implements ffjm {
    final /* synthetic */ dmvk a;

    public dmwc(dmvk dmvkVar) {
        this.a = dmvkVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            doas doasVar = this.a.f;
            if (doasVar != null) {
                dwfj.e(doasVar.c, null, false, null, null, null, hpx.d(-2105001713, new dmwb(doasVar), hfdVar), hfdVar, 805306368, 510);
            }
        }
        return ffcu.a;
    }
}
