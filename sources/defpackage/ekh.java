package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ekh {
    public final ffji a;
    public final elv b;
    public elu c;

    public ekh() {
        this(null);
    }

    public final ekg a(int i, long j, ffji ffjiVar) {
        elu eluVar = this.c;
        if (eluVar == null) {
            return ehu.a;
        }
        elt eltVar = new elt(eluVar, i, j, this.b, ffjiVar);
        eluVar.c.a(eltVar);
        return eltVar;
    }

    public ekh(ffji ffjiVar) {
        this.a = ffjiVar;
        this.b = new elv();
    }
}
