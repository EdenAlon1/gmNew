package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ill extends ffkk implements ffjn {
    final /* synthetic */ ffji a;
    final /* synthetic */ ils b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ill(ffji ffjiVar, ils ilsVar) {
        super(3);
        this.a = ffjiVar;
        this.b = ilsVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        ((Number) obj3).intValue();
        hfdVar.v(374375707);
        Object f = hfdVar.f();
        if (f == hfc.a) {
            f = new ili();
            hfdVar.y(f);
        }
        ili iliVar = (ili) f;
        iliVar.a = this.a;
        iliVar.e(this.b);
        hfdVar.o();
        return iliVar;
    }
}
