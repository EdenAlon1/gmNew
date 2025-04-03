package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tzy implements tyw {
    final /* synthetic */ dtyq a;
    private dtrs b;

    public tzy(dtyq dtyqVar) {
        this.a = dtyqVar;
    }

    @Override // defpackage.tyw
    public final void a(ffix ffixVar) {
        tzx tzxVar = new tzx(ffixVar);
        this.b = tzxVar;
        this.a.L(tzxVar);
    }

    @Override // defpackage.tyw
    public final void b() {
        dtrs dtrsVar = this.b;
        if (dtrsVar == null) {
            ffkj.c("changeListener");
            dtrsVar = null;
        }
        this.a.P(dtrsVar);
    }
}
