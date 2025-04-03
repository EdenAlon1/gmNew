package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmtp implements ffjm {
    final /* synthetic */ dmve a;

    public dmtp(dmve dmveVar) {
        this.a = dmveVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            doas doasVar = this.a.h;
            if (doasVar != null) {
                dwfj.e(doasVar.c, null, false, null, null, null, hpx.d(494394427, new dmto(doasVar), hfdVar), hfdVar, 805306368, 510);
            }
        }
        return ffcu.a;
    }
}
