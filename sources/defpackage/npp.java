package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class npp {
    public engw a;
    public int b;
    private final lse c;
    private final nqo d;
    private boolean e;

    public npp(npq npqVar) {
        this.a = npqVar.a;
        this.c = npqVar.b;
        this.d = npqVar.c;
        this.b = npqVar.d;
        this.e = npqVar.e;
    }

    public final npq a() {
        engw engwVar = this.a;
        int i = this.b;
        boolean z = false;
        if (this.e && i == 0) {
            z = true;
        }
        boolean z2 = z;
        return new npq(engwVar, this.c, this.d, i, z2);
    }

    public npp(nqn nqnVar, nqn... nqnVarArr) {
        engr engrVar = new engr();
        engrVar.h(nqnVar);
        engrVar.i(nqnVarArr);
        engw g = engrVar.g();
        lti.b(!g.isEmpty(), "The composition must contain at least one EditedMediaItemSequence.");
        this.a = engw.n(g);
        this.c = lse.a;
        this.d = nqo.a;
    }
}
