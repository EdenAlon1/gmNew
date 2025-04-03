package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class znz implements ffjm {
    final /* synthetic */ eey a;
    final /* synthetic */ zmz b;
    final /* synthetic */ olu c;
    final /* synthetic */ float d;

    public znz(eey eeyVar, zmz zmzVar, olu oluVar, float f) {
        this.a = eeyVar;
        this.b = zmzVar;
        this.c = oluVar;
        this.d = f;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            eey eeyVar = this.a;
            zmz zmzVar = this.b;
            hfdVar.v(737405347);
            boolean D = hfdVar.D(this.c);
            olu oluVar = this.c;
            Object f = hfdVar.f();
            if (D || f == hfc.a) {
                f = new zkq(oluVar);
                hfdVar.y(f);
            }
            hfdVar.o();
            zoz.b(eeyVar, zmzVar, (zkq) f, this.d, hfdVar, 0);
        }
        return ffcu.a;
    }
}
