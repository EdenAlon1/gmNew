package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class doub implements ffjm {
    final /* synthetic */ doui a;
    final /* synthetic */ hvi b;
    final /* synthetic */ doue c;

    public doub(doui douiVar, hvi hviVar, doue doueVar) {
        this.a = douiVar;
        this.b = hviVar;
        this.c = doueVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            doui douiVar = this.a;
            if (douiVar instanceof doug) {
                hfdVar.v(535588710);
                doud.g(this.b, hfdVar, 0);
                hfdVar.o();
            } else if (douiVar instanceof douf) {
                hfdVar.v(535592198);
                doud.f(this.b, (douf) this.a, this.c, hfdVar, 0);
                hfdVar.o();
            } else {
                if (!(douiVar instanceof douh)) {
                    hfdVar.v(535586761);
                    hfdVar.o();
                    throw new ffcd();
                }
                hfdVar.v(535596675);
                hvi hviVar = this.b;
                hfdVar.v(535599609);
                boolean F = hfdVar.F(this.c);
                final doue doueVar = this.c;
                Object f = hfdVar.f();
                if (F || f == hfc.a) {
                    f = new ffix() { // from class: doua
                        @Override // defpackage.ffix
                        public final Object invoke() {
                            doue.this.c();
                            return ffcu.a;
                        }
                    };
                    hfdVar.y(f);
                }
                hfdVar.o();
                doud.h(hviVar, (ffix) f, hfdVar, 0);
                hfdVar.o();
            }
        }
        return ffcu.a;
    }
}
