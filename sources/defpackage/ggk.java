package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ggk extends ffkk implements ffjm {
    final /* synthetic */ ffjm a;
    final /* synthetic */ ggc b;
    final /* synthetic */ boolean c;
    final /* synthetic */ ebq d;
    final /* synthetic */ ffjm e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ggk(ffjm ffjmVar, ggc ggcVar, boolean z, ebq ebqVar, ffjm ffjmVar2) {
        super(2);
        this.a = ffjmVar;
        this.b = ggcVar;
        this.c = z;
        this.d = ebqVar;
        this.e = ffjmVar2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            if (this.a != null) {
                hfdVar.v(549980483);
                ggc ggcVar = this.b;
                hfz.a(fzc.a.c(new ibw(this.c ? ggcVar.b : ggcVar.e)), hpx.d(2035552199, new ggi(this.a), hfdVar), hfdVar, 56);
                hfdVar.o();
            } else {
                hfdVar.v(550301457);
                hfdVar.o();
            }
            ggc ggcVar2 = this.b;
            hfz.a(fzc.a.c(new ibw(this.c ? ggcVar2.a : ggcVar2.d)), hpx.d(-1728894036, new ggj(this.d, this.a, this.e), hfdVar), hfdVar, 56);
            hfdVar.v(551521617);
            hfdVar.o();
        }
        return ffcu.a;
    }
}
