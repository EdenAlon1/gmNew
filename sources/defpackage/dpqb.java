package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpqb implements ffjn {
    final /* synthetic */ dptl a;
    final /* synthetic */ boolean b;
    final /* synthetic */ float c;

    public dpqb(dptl dptlVar, boolean z, float f) {
        this.a = dptlVar;
        this.b = z;
        this.c = f;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((ebq) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dptl dptlVar = this.a;
            if (dptlVar.a == 1 && this.b) {
                dpqe.o(this.c, dptlVar.i, dptlVar.f, dptlVar.c, null, hfdVar, 0);
            }
        }
        return ffcu.a;
    }
}
