package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dhue implements dhty {
    final /* synthetic */ dhuf a;
    private final dhtt b;
    private final dhtq c;

    public dhue(dhuf dhufVar, dhtt dhttVar, final dhtq dhtqVar) {
        this.a = dhufVar;
        dhttVar.getClass();
        this.b = dhttVar;
        this.c = dhtqVar;
        dhttVar.d(new dhtx() { // from class: dhud
            @Override // defpackage.dhtx
            public final void a(dhts dhtsVar) {
                dhtq.this.f(dhtsVar);
            }
        });
    }

    @Override // defpackage.dhty
    public final dhre a() {
        dhuf dhufVar = this.a;
        synchronized (dhufVar.b) {
            int i = dhufVar.d - 1;
            dhufVar.d = i;
            if (i != 0) {
                return dhrt.c(null);
            }
            dhufVar.c = null;
            dhtk.a.n().q("Disposing of shared InternalTimeSignalSupplier instance");
            this.c.e();
            return this.b.a();
        }
    }

    @Override // defpackage.dhty
    public final void b(dhtx dhtxVar) {
        this.c.d(dhtxVar);
    }

    @Override // defpackage.dhty
    public final void c(dhtx dhtxVar) {
        dhtq dhtqVar = this.c;
        synchronized (dhtqVar) {
            dhtqVar.a.remove(dhtxVar);
        }
    }

    public final String toString() {
        String str;
        synchronized (this.a.b) {
            str = "ShareableTimeSignalSupplierAdapter{ShareableTimeSignalSupplierManager.this=" + this.a.toString() + ",delegate=" + this.b.toString() + ", internalListenersManager=" + this.c.toString() + "}";
        }
        return str;
    }
}
