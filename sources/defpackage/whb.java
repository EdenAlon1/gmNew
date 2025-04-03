package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class whb implements wha {
    private final ea a;
    private final ffbr b;

    public whb(ea eaVar, ffbr ffbrVar) {
        this.a = eaVar;
        this.b = ffbrVar;
    }

    @Override // defpackage.wha
    public final void a() {
        ((adtc) this.b.b()).i(this.a.z(), false);
    }

    @Override // defpackage.wha
    public final void b() {
        ea h = this.a.I().h("MagicComposeInfoDialogFragment");
        if (h != null) {
            cg cgVar = new cg(this.a.I());
            cgVar.q(h);
            cgVar.c();
        } else {
            whf whfVar = new whf();
            fbae.e(whfVar);
            whfVar.p(true);
            whfVar.t(this.a.I(), "MagicComposeInfoDialogFragment");
        }
    }
}
