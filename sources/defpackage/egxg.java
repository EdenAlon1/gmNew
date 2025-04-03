package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egxg implements ffjm {
    final /* synthetic */ hho a;

    public egxg(hho hhoVar) {
        this.a = hhoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hfdVar.v(-1734098575);
            boolean D = hfdVar.D(this.a);
            final hho hhoVar = this.a;
            Object f = hfdVar.f();
            if (D || f == hfc.a) {
                f = new ffix() { // from class: egxf
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        egxi.c(hho.this, false);
                        return ffcu.a;
                    }
                };
                hfdVar.y(f);
            }
            hfdVar.o();
            dwfj.e((ffix) f, null, false, null, null, null, eguk.c, hfdVar, 805306368, 510);
        }
        return ffcu.a;
    }
}
