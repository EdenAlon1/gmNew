package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akzv implements akzu {
    private final dfmc a;
    private final alat b;

    public akzv(dfmc dfmcVar, alat alatVar) {
        this.a = dfmcVar;
        this.b = alatVar;
    }

    private final void j(String str, Number number) {
        this.a.c(str).a(0L, number.longValue(), dfmc.b);
    }

    private final void k(String str, int i, long j) {
        this.a.d(str).a(i, j, dfmc.b);
    }

    @Override // defpackage.akzu
    public final void a() {
        this.a.f();
    }

    @Override // defpackage.akzu
    public final void b(String str, eogt eogtVar, long j) {
        str.getClass();
        eogtVar.getClass();
        eole eoleVar = (eole) eoli.a.createBuilder();
        eoleVar.getClass();
        eoleVar.copyOnWrite();
        eoli eoliVar = (eoli) eoleVar.instance;
        eoliVar.t = eogtVar.bI;
        eoliVar.b |= 131072;
        eovw eovwVar = csjc.a;
        eovwVar.getClass();
        eoleVar.copyOnWrite();
        eoli eoliVar2 = (eoli) eoleVar.instance;
        eoliVar2.u = eovwVar.x;
        eoliVar2.b |= 262144;
        eyfy build = eoleVar.build();
        build.getClass();
        dflz e = this.a.e(str);
        dflv a = dflv.a((eoli) build);
        dflt dfltVar = e.f;
        e.a(j, 1L, a);
    }

    @Override // defpackage.akzu
    public final void c(String str) {
        j(str, 1);
    }

    @Override // defpackage.akzu
    public final void d(String str, Number number) {
        j(str, Long.valueOf(number.longValue()));
    }

    @Override // defpackage.akzu
    public final void e(String str, int i) {
        k(str, i, 1L);
    }

    @Override // defpackage.akzu
    public final void f(String str, int i, long j) {
        str.getClass();
        k(str, i, j);
    }

    @Override // defpackage.akzu
    public final void g(String str, long j) {
        str.getClass();
        dflz e = this.a.e(str);
        dflt dfltVar = e.f;
        e.a(j, 1L, dfmc.b);
    }

    @Override // defpackage.akzu
    public final void h(String str, long j, String str2) {
        str2.getClass();
        dflz e = this.b.a(str2).e(str);
        dflt dfltVar = e.f;
        e.a(j, 1L, dfmc.b);
    }

    @Override // defpackage.akzu
    public final void i() {
        this.b.a("112855188").c("Bugle.BugOccurrence.Counts").a(0L, 1L, dfmc.b);
    }
}
