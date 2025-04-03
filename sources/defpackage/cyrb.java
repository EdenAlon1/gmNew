package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyrb implements ffjm {
    final /* synthetic */ dlsr a;
    final /* synthetic */ cyrt b;

    public cyrb(dlsr dlsrVar, cyrt cyrtVar) {
        this.a = dlsrVar;
        this.b = cyrtVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hfdVar.v(-1192010248);
            boolean D = hfdVar.D(this.a);
            final dlsr dlsrVar = this.a;
            Object f = hfdVar.f();
            if (D || f == hfc.a) {
                f = new ffix() { // from class: cyqz
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        dlsr dlsrVar2 = dlsr.this;
                        if (dlsrVar2 != null) {
                            dlsrVar2.k.invoke();
                        }
                        return ffcu.a;
                    }
                };
                hfdVar.y(f);
            }
            hfdVar.o();
            dwfj.e((ffix) f, jfw.a(hvi.e, "add_people_button"), false, null, null, null, hpx.d(-933750326, new cyra(this.b), hfdVar), hfdVar, 805306416, 508);
        }
        return ffcu.a;
    }
}
