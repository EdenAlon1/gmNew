package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egro extends abo {
    final /* synthetic */ ea a;
    final /* synthetic */ egrp d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egro(egrp egrpVar, ea eaVar) {
        super(true);
        this.a = eaVar;
        this.d = egrpVar;
    }

    @Override // defpackage.abo
    public final void b() {
        this.d.c.a(dvxh.a(), this.a.Q);
        if (this.d.a.b() == 0) {
            this.d.b.finish();
        } else {
            this.d.a.aj();
        }
    }
}
