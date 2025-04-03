package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ah extends ab {
    private static final long serialVersionUID = 1405488568664762222L;

    public ah(ac acVar, ac acVar2) {
        super(acVar, acVar2);
    }

    @Override // defpackage.ac
    public final boolean a(ae aeVar) {
        return this.a.a(aeVar) || this.b.a(aeVar);
    }

    public final String toString() {
        ac acVar = this.b;
        return this.a.toString() + " or " + acVar.toString();
    }
}
