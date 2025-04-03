package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ests implements estj {
    private final String a;
    private final int b;

    public ests(int i, String str) {
        this.b = i;
        this.a = str;
    }

    static /* synthetic */ fatc d(ests estsVar, int i) {
        return estsVar.e(i, null);
    }

    private final fatc e(int i, esqb esqbVar) {
        fatb fatbVar = (fatb) fatc.a.createBuilder();
        fatbVar.getClass();
        fasq.c(this.a, fatbVar);
        fatg fatgVar = (fatg) fati.a.createBuilder();
        fatgVar.getClass();
        fatgVar.copyOnWrite();
        ((fati) fatgVar.instance).c = this.b - 2;
        fatgVar.copyOnWrite();
        ((fati) fatgVar.instance).d = fasv.a(3);
        fatgVar.copyOnWrite();
        ((fati) fatgVar.instance).e = fasw.a(i);
        if (esqbVar != null) {
            fata n = esun.n(esqbVar);
            fatgVar.copyOnWrite();
            fati fatiVar = (fati) fatgVar.instance;
            fatiVar.f = n;
            fatiVar.b |= 1;
        }
        eyfy build = fatgVar.build();
        build.getClass();
        fatbVar.copyOnWrite();
        fatc fatcVar = (fatc) fatbVar.instance;
        fatcVar.d = (fati) build;
        fatcVar.c = 3;
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
}
