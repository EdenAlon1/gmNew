package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehwl extends ehwh {
    final /* synthetic */ ehwr a;

    public ehwl(ehwr ehwrVar) {
        this.a = ehwrVar;
    }

    @Override // defpackage.ehwh
    public final void a() {
        synchronized (this.a.f) {
            if (this.a.l.get() > 0 && this.a.l.decrementAndGet() > 0) {
                this.a.b.d("Leaving the connection open for other ongoing calls.", new Object[0]);
                return;
            }
            ehwr ehwrVar = this.a;
            if (ehwrVar.n != null) {
                ehwrVar.b.d("Unbind from service.", new Object[0]);
                ehwr ehwrVar2 = this.a;
                ehwrVar2.a.unbindService(ehwrVar2.m);
                this.a.g = false;
                ehwr ehwrVar3 = this.a;
                ehwrVar3.n = null;
                ehwrVar3.m = null;
            }
            this.a.c();
        }
    }
}
