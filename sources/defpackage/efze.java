package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class efze extends efzc {
    public engw a;
    public engw b;
    public emxc c = emux.a;
    public engw d;
    public int e;

    @Override // defpackage.efzc
    public final void a(emxc emxcVar) {
        if (emxcVar == null) {
            throw new NullPointerException("Null errorState");
        }
        this.c = emxcVar;
    }

    @Override // defpackage.efzc
    public final void b(engw engwVar) {
        if (engwVar == null) {
            throw new NullPointerException("Null searchInterests");
        }
        this.a = engwVar;
    }

    @Override // defpackage.efzc
    public final void c(int i) {
        if (i == 0) {
            throw new NullPointerException("Null searchState");
        }
        this.e = i;
    }

    @Override // defpackage.efzc
    public final void d(engw engwVar) {
        if (engwVar == null) {
            throw new NullPointerException("Null searchSuggestions");
        }
        this.b = engwVar;
    }
}
