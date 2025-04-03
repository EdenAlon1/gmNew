package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class estq implements estj {
    private final esro a;
    private final esqf b;
    private final String c;
    private final esqd d;

    public estq(esro esroVar, esqf esqfVar, String str, esqd esqdVar) {
        this.a = esroVar;
        this.b = esqfVar;
        this.c = str;
        this.d = esqdVar;
    }

    static /* synthetic */ fatc d(estq estqVar, int i) {
        return estqVar.e(i, null);
    }

    private final fatc e(int i, esqb esqbVar) {
        fatb fatbVar = (fatb) fatc.a.createBuilder();
        fatbVar.getClass();
        fasq.c(this.c, fatbVar);
        fatd fatdVar = (fatd) fatf.a.createBuilder();
        fatdVar.getClass();
        fatj.c(this.a.a, fatdVar);
        fatj.b(this.b.a().toString(), fatdVar);
        fatj.d(this.b.b().d(), fatdVar);
        fatj.f(i, fatdVar);
        if (esqbVar != null) {
            fatj.e(esun.n(esqbVar), fatdVar);
        }
        fasq.d(fatj.a(fatdVar), fatbVar);
        esqd esqdVar = this.d;
        if (esqdVar != null) {
            fasq.e(esqdVar.a, fatbVar);
        }
        return fasq.a(fatbVar);
    }

    @Override // defpackage.estj
    public final fatc a(esqb esqbVar) {
        return e(5, esqbVar);
    }

    @Override // defpackage.estj
    public final fatc b() {
        throw null;
    }

    @Override // defpackage.estj
    public final fatc c() {
        return d(this, 3);
    }
}
