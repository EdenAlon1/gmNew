package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chja implements chhw {
    private final ffbr a;
    private final asok b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;
    private final String g;

    public chja(ffbr ffbrVar, asok asokVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, String str) {
        this.a = ffbrVar;
        this.b = asokVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.e = ffbrVar4;
        this.f = ffbrVar5;
        this.g = str;
        emxf.b(!str.isEmpty(), "Tachyon host cannot be empty");
        emxf.b(true, "Tachyon port must be between 1 and 65535");
    }

    private static evcd h() {
        evby evbyVar = new evby();
        evbyVar.b(enip.r("https://www.googleapis.com/auth/carrier-message-store", "https://www.googleapis.com/auth/android-messages"));
        return evbyVar.c();
    }

    private final String i() {
        return this.g + ":443";
    }

    @Override // defpackage.chhw
    public final elfl a(fbyg fbygVar) {
        return elfl.g(g().b(fbygVar));
    }

    @Override // defpackage.chhw
    public final elfl b(fbyw fbywVar) {
        return elfl.g(g().c(fbywVar));
    }

    @Override // defpackage.chhw
    public final elfl c(fcap fcapVar) {
        return elfl.g(g().d(fcapVar));
    }

    @Override // defpackage.chhw
    public final elfl d(fcch fcchVar) {
        return elfl.g(g().e(fcchVar));
    }

    @Override // defpackage.chhw
    public final elfl e(fbzv fbzvVar) {
        return elfl.g(g().f(fbzvVar));
    }

    @Override // defpackage.chhw
    public final void f(fcat fcatVar, ffbc ffbcVar) {
        emxf.m(!efbd.g(), "Method must not be called on MainThread");
        (this.b.a() ? (fbou) chiu.a((fbou) ((fbou) ((fbou) chiu.b((fbou) this.d.b(), true)).m(evbm.a, i())).m(evcy.a, new evce(h())), ((Boolean) this.a.b()).booleanValue(), 8755) : (fbou) ((fbou) chiu.b((fbou) this.f.b(), true)).m(evcy.a, new evce(h()))).b(fcatVar, ffbcVar);
    }

    final fbot g() {
        return this.b.a() ? (fbot) chiu.a((fbot) ((fbot) ((fbot) chiu.b((fbot) this.c.b(), false)).m(evbm.a, i())).m(evcy.a, new evce(h())), ((Boolean) this.a.b()).booleanValue(), 8755) : (fbot) ((fbot) chiu.b((fbot) this.e.b(), false)).m(evcy.a, new evce(h()));
    }
}
