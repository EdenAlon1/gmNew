package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehwp extends ehwh {
    final /* synthetic */ ehwq a;

    public ehwp(ehwq ehwqVar) {
        this.a = ehwqVar;
    }

    @Override // defpackage.ehwh
    public final void a() {
        ehwr ehwrVar = this.a.a;
        ehwrVar.b.d("unlinkToDeath", new Object[0]);
        ehwrVar.n.asBinder().unlinkToDeath(ehwrVar.k, 0);
        ehwr ehwrVar2 = this.a.a;
        ehwrVar2.n = null;
        ehwrVar2.g = false;
    }
}
