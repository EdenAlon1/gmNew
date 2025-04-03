package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dhtm implements dhtt {
    public final String a;
    public final dhtq b;
    public final Object c;
    public boolean d;
    private final dhty e;
    private final dhtx f;

    public dhtm(dhty dhtyVar) {
        dhtq dhtqVar = new dhtq(erpp.a, new ecda("DelegatingInternalTimeSignalSupplier"));
        String str = "DelegatingInternalTimeSignalSupplier[" + System.identityHashCode(this) + "]";
        this.a = str;
        this.c = new Object();
        dhtyVar.getClass();
        this.e = dhtyVar;
        this.b = dhtqVar;
        dhtx dhtxVar = new dhtx() { // from class: dhtl
            @Override // defpackage.dhtx
            public final void a(dhts dhtsVar) {
                dhtm dhtmVar = dhtm.this;
                synchronized (dhtmVar.c) {
                    if (dhtmVar.d) {
                        dhtk.a.n().D("%s: Discarding timeSignal=%s, instance is disposed()", dhtmVar.a, dhtsVar);
                        return;
                    }
                    dhtk.a.n().D("%s: Notifying listener about timeSignal=%s", dhtmVar.a, dhtsVar);
                    dhtq dhtqVar2 = dhtmVar.b;
                    dhtqVar2.getClass();
                    dhtqVar2.f(dhtsVar);
                }
            }
        };
        this.f = dhtxVar;
        dhtyVar.b(dhtxVar);
        dhtk.a.n().t("%s: Construction complete", str);
    }

    @Override // defpackage.dhtt
    public final dhre a() {
        dhtk.a.n().t("%s: dispose() called", this.a);
        synchronized (this.c) {
            if (this.d) {
                return dhrt.c(null);
            }
            this.b.e();
            this.d = true;
            this.e.c(this.f);
            return this.e.a();
        }
    }

    @Override // defpackage.dhtt
    public final void d(dhtx dhtxVar) {
        dhtk.a.n().D("%s: Adding listener %s", this.a, dhtxVar);
        synchronized (this.c) {
            if (this.d) {
                throw new IllegalStateException("dispose() has been called");
            }
            if (this.b.b() != 0) {
                throw new IllegalStateException("listener already set");
            }
            dhtq dhtqVar = this.b;
            dhtxVar.getClass();
            dhtqVar.d(dhtxVar);
        }
    }

    public final String toString() {
        String str;
        synchronized (this.c) {
            str = "DelegatingInternalTimeSignalSupplier{supplierIdentity='" + this.a + "', sharedTimeSignalSupplier=" + String.valueOf(this.e) + ", internalListenersManager=" + String.valueOf(this.b) + ", sharedTimeSignalSupplierListener=" + String.valueOf(this.f) + ", disposed=" + this.d + "}";
        }
        return str;
    }
}
