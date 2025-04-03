package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fte extends ffkk implements ffjm {
    final /* synthetic */ hvi a;
    final /* synthetic */ czq b;
    final /* synthetic */ hho c;
    final /* synthetic */ dji d;
    final /* synthetic */ idh e;
    final /* synthetic */ long f;
    final /* synthetic */ float g;
    final /* synthetic */ ffjn h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fte(hvi hviVar, czq czqVar, hho hhoVar, dji djiVar, idh idhVar, long j, float f, ffjn ffjnVar) {
        super(2);
        this.a = hviVar;
        this.b = czqVar;
        this.c = hhoVar;
        this.d = djiVar;
        this.e = idhVar;
        this.f = j;
        this.g = f;
        this.h = ffjnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            ggm.c(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, hfdVar, 384);
        }
        return ffcu.a;
    }
}
