package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class estm implements estj {
    private final fast a;
    private final String b;
    private final esqd c;

    public estm(fast fastVar, String str, esqd esqdVar) {
        fastVar.getClass();
        this.a = fastVar;
        this.b = str;
        this.c = esqdVar;
    }

    static /* synthetic */ fatc d(estm estmVar, int i) {
        return estmVar.e(i, null);
    }

    private final fatc e(int i, esqb esqbVar) {
        fatb fatbVar = (fatb) fatc.a.createBuilder();
        fatbVar.getClass();
        fasq.c(this.b, fatbVar);
        fass fassVar = (fass) fasu.a.createBuilder();
        fassVar.getClass();
        faso.b(this.a, fassVar);
        faso.d(3, fassVar);
        faso.e(i, fassVar);
        if (esqbVar != null) {
            faso.c(esun.n(esqbVar), fassVar);
        }
        fasq.b(faso.a(fassVar), fatbVar);
        esqd esqdVar = this.c;
        if (esqdVar != null) {
            fasq.e(esqdVar.a, fatbVar);
        }
        return fasq.a(fatbVar);
    }

    @Override // defpackage.estj
    public final fatc a(esqb esqbVar) {
        return e(4, esqbVar);
    }

    @Override // defpackage.estj
    public final fatc b() {
        return d(this, 5);
    }

    @Override // defpackage.estj
    public final fatc c() {
        return d(this, 3);
    }

    public /* synthetic */ estm(fast fastVar, String str) {
        this(fastVar, str, null);
    }
}
