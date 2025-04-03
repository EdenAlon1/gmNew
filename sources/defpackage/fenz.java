package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fenz extends femp {
    final /* synthetic */ fejs a;
    final /* synthetic */ feoa b;

    public fenz(feoa feoaVar, fejs fejsVar) {
        this.a = fejsVar;
        this.b = feoaVar;
    }

    @Override // defpackage.femp, defpackage.fejs
    public final void m(feju fejuVar) {
        this.b.a.b();
        this.a.m(new feny(this, fejuVar));
    }

    @Override // defpackage.femp
    protected final fejs p() {
        return this.a;
    }
}
