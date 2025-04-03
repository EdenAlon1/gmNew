package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class estr implements estj {
    private final esro a;
    private final String b;

    public estr(esro esroVar, String str) {
        esroVar.getClass();
        this.a = esroVar;
        this.b = str;
    }

    static /* synthetic */ fatc d(estr estrVar, int i) {
        return estrVar.e(i, null);
    }

    private final fatc e(int i, esqb esqbVar) {
        fatb fatbVar = (fatb) fatc.a.createBuilder();
        fatbVar.getClass();
        fasq.c(this.b, fatbVar);
        fatd fatdVar = (fatd) fatf.a.createBuilder();
        fatdVar.getClass();
        fatj.c(this.a.a, fatdVar);
        fatj.f(i, fatdVar);
        if (esqbVar != null) {
            fatj.e(esun.n(esqbVar), fatdVar);
        }
        fasq.d(fatj.a(fatdVar), fatbVar);
        return fasq.a(fatbVar);
    }

    @Override // defpackage.estj
    public final fatc a(esqb esqbVar) {
        return e(9, esqbVar);
    }

    @Override // defpackage.estj
    public final fatc b() {
        throw null;
    }

    @Override // defpackage.estj
    public final fatc c() {
        return d(this, 8);
    }
}
