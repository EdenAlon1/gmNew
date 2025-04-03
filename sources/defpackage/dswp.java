package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dswp implements ffjn {
    final /* synthetic */ boolean a;
    final /* synthetic */ boolean b;
    final /* synthetic */ ffix c;
    final /* synthetic */ float d;
    final /* synthetic */ boolean e = true;
    final /* synthetic */ boolean f;
    final /* synthetic */ ffji g;
    final /* synthetic */ ffix h;
    final /* synthetic */ String i;
    final /* synthetic */ String j;

    public dswp(boolean z, boolean z2, ffix ffixVar, float f, boolean z3, boolean z4, ffji ffjiVar, ffix ffixVar2, String str, String str2) {
        this.a = z;
        this.b = z2;
        this.c = ffixVar;
        this.d = f;
        this.f = z4;
        this.g = ffjiVar;
        this.h = ffixVar2;
        this.i = str;
        this.j = str2;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        dyn dynVar = (dyn) obj;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        dynVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= true != hfdVar.D(dynVar) ? 2 : 4;
        }
        if ((intValue & 19) == 18 && hfdVar.I()) {
            hfdVar.s();
        } else {
            boolean z = this.a;
            dbu dbuVar = dswb.a;
            cru.b(z, null, ctt.l(dswb.a, 2), ctt.m(dswb.a, 2), null, hpx.d(-1689055322, new dswo(dynVar, this.b, this.c, this.d, true, this.f, this.g, this.h, this.i, this.j), hfdVar), hfdVar, 200064, 18);
        }
        return ffcu.a;
    }
}
