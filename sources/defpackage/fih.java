package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fih extends ffkk implements ffjm {
    final /* synthetic */ czq a;
    final /* synthetic */ hho b;
    final /* synthetic */ dji c;
    final /* synthetic */ hvi d;
    final /* synthetic */ ffjn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fih(czq czqVar, hho hhoVar, dji djiVar, hvi hviVar, ffjn ffjnVar) {
        super(2);
        this.a = czqVar;
        this.b = hhoVar;
        this.c = djiVar;
        this.d = hviVar;
        this.e = ffjnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        int intValue = ((Number) obj2).intValue();
        int i = intValue & 3;
        if (hfdVar.J(i != 2, intValue & 1)) {
            flk.b(this.a, this.b, this.c, this.d, this.e, hfdVar, 48);
        } else {
            hfdVar.s();
        }
        return ffcu.a;
    }
}
