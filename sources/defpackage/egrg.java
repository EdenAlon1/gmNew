package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egrg extends abo {
    final /* synthetic */ ea a;
    final /* synthetic */ egrh d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egrg(egrh egrhVar, ea eaVar) {
        super(true);
        this.a = eaVar;
        this.d = egrhVar;
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
