package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djvv extends diyb {
    final /* synthetic */ djxs d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djvv(djxs djxsVar) {
        super("ProvisioningStateMachine");
        this.d = djxsVar;
    }

    @Override // defpackage.diyb
    protected final void h(String str) {
        this.d.z.b(str, new Object[0]);
    }

    @Override // defpackage.diyb
    protected final void i(String str) {
        this.d.z.d(str, new Object[0]);
    }

    @Override // defpackage.diyb
    protected final void j() {
        this.d.z.e("onHalting", new Object[0]);
    }

    @Override // defpackage.diyb
    protected final void k() {
        this.d.z.e("onQuitting", new Object[0]);
        this.d.ap(4);
    }

    @Override // defpackage.diyb
    public final void l() {
        djxs djxsVar = this.d;
        djxsVar.z.d("onTransitionRequested %s", djxsVar.n());
        this.d.z();
    }
}
