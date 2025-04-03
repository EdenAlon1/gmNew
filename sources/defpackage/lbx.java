package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lbx extends ffkk implements ffji {
    final /* synthetic */ lcc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lbx(lcc lccVar) {
        super(1);
        this.a = lccVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        if (th != null) {
            lcc lccVar = this.a;
            lccVar.c.b(new lcr(th));
        }
        if (this.a.e.b()) {
            this.a.d().a();
        }
        return ffcu.a;
    }
}
