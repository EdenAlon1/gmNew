package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dman implements ffjn {
    final /* synthetic */ boolean a;
    final /* synthetic */ ffix b;

    public dman(boolean z, ffix ffixVar) {
        this.a = z;
        this.b = ffixVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        ((Number) obj3).intValue();
        ((crw) obj).getClass();
        dmao.a(hfdVar, 0);
        Boolean valueOf = Boolean.valueOf(this.a);
        hfdVar.v(-124858197);
        boolean E = hfdVar.E(this.a) | hfdVar.D(this.b);
        Object f = hfdVar.f();
        if (E || f == hfc.a) {
            dmam dmamVar = new dmam(this.a, this.b, null);
            hfdVar.y(dmamVar);
            f = dmamVar;
        }
        hfdVar.o();
        hgs.g(valueOf, (ffjm) f, hfdVar);
        return ffcu.a;
    }
}
