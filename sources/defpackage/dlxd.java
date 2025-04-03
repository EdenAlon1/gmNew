package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlxd implements ffjm {
    final /* synthetic */ dlvq a;

    public dlxd(dlvq dlvqVar) {
        this.a = dlvqVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        long j;
        long f;
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dlvq dlvqVar = this.a;
            hfdVar.v(1363695565);
            if (dlvqVar.f()) {
                hfdVar.v(-2018306041);
                j = dooy.a(hfdVar).b.k;
                hfdVar.o();
            } else if (dlvqVar.h() && dlvqVar.g()) {
                hfdVar.v(-2018303574);
                j = dooy.a(hfdVar).b.i;
                hfdVar.o();
            } else if (dlvqVar.h()) {
                hfdVar.v(-2018301462);
                j = dooy.a(hfdVar).b.f;
                hfdVar.o();
            } else if (dlvqVar.g()) {
                hfdVar.v(-2018299350);
                j = dooy.a(hfdVar).b.d;
                hfdVar.o();
            } else {
                hfdVar.v(-2018297430);
                j = dooy.a(hfdVar).b.b;
                hfdVar.o();
            }
            f = iby.f(ibw.d(j), ibw.c(j), ibw.b(j), 0.25f, ibw.f(j));
            hfdVar.o();
            dlxp.c(f, hfdVar, 0);
        }
        return ffcu.a;
    }
}
