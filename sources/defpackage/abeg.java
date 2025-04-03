package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abeg implements ffjm {
    final /* synthetic */ float a;
    final /* synthetic */ float b;
    final /* synthetic */ jzn c;
    final /* synthetic */ abdn d;
    final /* synthetic */ gvo e;
    final /* synthetic */ hho f;
    final /* synthetic */ hho g;

    public abeg(float f, float f2, jzn jznVar, abdn abdnVar, gvo gvoVar, hho hhoVar, hho hhoVar2) {
        this.a = f;
        this.b = f2;
        this.c = jznVar;
        this.d = abdnVar;
        this.e = gvoVar;
        this.f = hhoVar;
        this.g = hhoVar2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hve hveVar = hvi.e;
            hfdVar.v(-33791820);
            boolean A = hfdVar.A(this.a) | hfdVar.A(this.b) | hfdVar.D(this.c);
            final float f = this.a;
            final float f2 = this.b;
            final jzn jznVar = this.c;
            final hho hhoVar = this.f;
            final hho hhoVar2 = this.g;
            Object f3 = hfdVar.f();
            if (A || f3 == hfc.a) {
                f3 = new ffji() { // from class: abef
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj3) {
                        ((jzn) obj3).getClass();
                        float a = abem.a(hhoVar) - f;
                        hho hhoVar3 = hhoVar2;
                        int i = 0;
                        if (Float.compare(a, f2) < 0) {
                            int em = (int) jznVar.em(-240.0f);
                            abem.b(hhoVar3, false);
                            i = em;
                        } else {
                            abem.b(hhoVar3, true);
                        }
                        return new kaa(i & 4294967295L);
                    }
                };
                hfdVar.y(f3);
            }
            hfdVar.o();
            hvi a = eau.a(hveVar, (ffji) f3);
            abdn abdnVar = this.d;
            abmx.d(abdnVar.a, a, this.e, hfdVar, 0);
        }
        return ffcu.a;
    }
}
