package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class emfw implements ffjm {
    final /* synthetic */ ffix a;

    public emfw(ffix ffixVar) {
        this.a = ffixVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hfdVar.v(558018570);
            boolean D = hfdVar.D(this.a);
            final ffix ffixVar = this.a;
            Object f = hfdVar.f();
            if (D || f == hfc.a) {
                f = new ffix() { // from class: emfv
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        ffix.this.invoke();
                        return ffcu.a;
                    }
                };
                hfdVar.y(f);
            }
            hfdVar.o();
            fwa.c((ffix) f, null, false, null, null, null, emeh.c, hfdVar, 805306368, 510);
        }
        return ffcu.a;
    }
}
