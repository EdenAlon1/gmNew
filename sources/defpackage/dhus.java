package defpackage;

import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhus implements dhtt {
    public final Object a = new Object();
    public WeakReference b;
    private final dhtt c;
    private final dhtx d;
    private boolean e;

    public dhus(dhtt dhttVar) {
        dhttVar.getClass();
        this.c = dhttVar;
        this.d = new dhtx() { // from class: dhur
            @Override // defpackage.dhtx
            public final void a(dhts dhtsVar) {
                dhus dhusVar = dhus.this;
                synchronized (dhusVar.a) {
                    WeakReference weakReference = dhusVar.b;
                    if (weakReference == null) {
                        return;
                    }
                    dhtx dhtxVar = (dhtx) weakReference.get();
                    if (dhtxVar == null) {
                        dhtk.a.n().q("Not forwarding timeSignal: listener has been garbage collected");
                    } else {
                        dhtxVar.a(dhtsVar);
                    }
                }
            }
        };
    }

    @Override // defpackage.dhtt
    public final dhre a() {
        synchronized (this.a) {
            this.e = true;
            this.b = null;
        }
        return this.c.a();
    }

    @Override // defpackage.dhtt
    public final void d(dhtx dhtxVar) {
        synchronized (this.a) {
            if (this.e) {
                throw new IllegalStateException("dispose() has been called");
            }
            WeakReference weakReference = this.b;
            if (weakReference != null) {
                throw new IllegalStateException(a.G(weakReference, "Listener already set:"));
            }
            this.b = new WeakReference(dhtxVar);
            this.c.d(this.d);
        }
    }
}
