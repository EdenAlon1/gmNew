package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fov extends ffkk implements ffjn {
    final /* synthetic */ boolean a;
    final /* synthetic */ dwn b;
    final /* synthetic */ fjj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fov(boolean z, dwn dwnVar, fjj fjjVar) {
        super(3);
        this.a = z;
        this.b = dwnVar;
        this.c = fjjVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        ((Number) obj3).intValue();
        hfdVar.v(1398930845);
        hkx a = fox.a(this.a, this.b, this.c, 2.0f, 1.0f, hfdVar, 0);
        hve hveVar = hvi.e;
        der derVar = (der) a.a();
        hvi c = hxs.c(hveVar, new fpm(derVar.a, derVar));
        hfdVar.o();
        return c;
    }
}
