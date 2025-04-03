package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddah extends abo {
    final /* synthetic */ ddae a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ddah(ddae ddaeVar) {
        super(true);
        this.a = ddaeVar;
    }

    @Override // defpackage.abo
    public final void b() {
        ddae ddaeVar = this.a;
        ddaeVar.k(epgr.RCS_PROVISIONING_BACK_BUTTON_CLICKED);
        ddaeVar.s(5);
        ddaeVar.d.fe().setResult(7337);
        ddaeVar.d.fe().finish();
    }
}
