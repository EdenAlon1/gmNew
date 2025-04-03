package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chgu implements chhw {
    private final fdxk a;
    private final febo b;

    public chgu(fdxk fdxkVar, febo feboVar) {
        this.a = fdxkVar;
        this.b = feboVar;
    }

    private final fbot g() {
        return (fbot) chiu.c(fbov.a(this.a), this.b, false);
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
        ((fbou) chiu.c(fbov.b(this.a), this.b, true)).b(fcatVar, ffbcVar);
    }
}
