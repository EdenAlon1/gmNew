package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class apgx implements erqj {
    final /* synthetic */ apgy a;

    public apgx(apgy apgyVar) {
        this.a = apgyVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.a.e((engw) obj);
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        ensz enszVar = (ensz) apgy.a.j();
        enszVar.Y(csux.q, this.a.i);
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/constraints/DefaultBugleComposeConstraintsSupplier$2", "onFailure", 987, "DefaultBugleComposeConstraintsSupplier.java")).q("Failed to get updated recipients.");
    }
}
