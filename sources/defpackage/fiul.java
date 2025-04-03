package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fiul implements fiuo {
    public final fiup a;

    private fiul(fiup fiupVar) {
        this.a = fiupVar;
    }

    static fiuo b(fiup fiupVar) {
        if (fiupVar instanceof fiup) {
            return fiupVar;
        }
        if (fiupVar == null) {
            return null;
        }
        return new fiul(fiupVar);
    }

    @Override // defpackage.fiuo
    public final int a() {
        return this.a.a();
    }

    @Override // defpackage.fiuo
    public final int c(fiuk fiukVar, CharSequence charSequence, int i) {
        return this.a.a.c(fiukVar, charSequence.toString(), i);
    }
}
