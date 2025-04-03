package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class abx implements aal {
    final /* synthetic */ aca a;
    private final abo b;

    public abx(aca acaVar, abo aboVar) {
        this.a = acaVar;
        this.b = aboVar;
    }

    @Override // defpackage.aal
    public final void b() {
        this.a.a.remove(this.b);
        if (ffkj.e(this.a.b, this.b)) {
            this.b.a();
            this.a.b = null;
        }
        this.b.g(this);
        ffix ffixVar = this.b.c;
        if (ffixVar != null) {
            ffixVar.invoke();
        }
        this.b.c = null;
    }
}
