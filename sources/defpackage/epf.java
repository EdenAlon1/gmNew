package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class epf extends hvh {
    private epe a;

    public epf(epe epeVar) {
        this.a = epeVar;
    }

    private final void b() {
        epe epeVar = this.a;
        if (epeVar instanceof epe) {
            epeVar.getClass();
            epeVar.a.m(this);
        }
    }

    public final void a(epe epeVar) {
        b();
        if (epeVar instanceof epe) {
            epeVar.a.n(this);
        }
        this.a = epeVar;
    }

    @Override // defpackage.hvh
    public final boolean dM() {
        return false;
    }

    @Override // defpackage.hvh
    public final void dT() {
        a(this.a);
    }

    @Override // defpackage.hvh
    public final void t() {
        b();
    }
}
