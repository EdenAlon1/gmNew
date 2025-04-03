package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewvw extends ewzz {
    public boolean a;
    public ewze b;
    public ewxw c;
    public engw d;
    public exaa e;
    public byte f;
    public ewyr g;
    public ewyr h;
    public ewyr i;
    public ewyr j;
    public ewyr k;
    public ewyr l;
    public ewyr m;
    public ewyr n;

    @Override // defpackage.ewzz
    public final void a(engw engwVar) {
        if (engwVar == null) {
            throw new NullPointerException("Null actionsSuggestionsLocales");
        }
        this.d = engwVar;
    }

    @Override // defpackage.ewzz
    public final void b(ewyr ewyrVar) {
        if (ewyrVar == null) {
            throw new NullPointerException("Null actionsSuggestionsModelProvider");
        }
        this.i = ewyrVar;
    }

    @Override // defpackage.ewzz
    public final void c(ewyr ewyrVar) {
        if (ewyrVar == null) {
            throw new NullPointerException("Null coreModelProvider");
        }
        this.g = ewyrVar;
    }

    @Override // defpackage.ewzz
    public final void d(boolean z) {
        this.a = z;
        this.f = (byte) (this.f | 1);
    }

    @Override // defpackage.ewzz
    public final void e(ewyr ewyrVar) {
        if (ewyrVar == null) {
            throw new NullPointerException("Null webrefModelProvider");
        }
        this.j = ewyrVar;
    }
}
