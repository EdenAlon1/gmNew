package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhun implements dhsj {
    public final dhst a;
    public final Object b = new Object();
    public boolean c;
    private final dhtt d;
    private final dhtx e;

    public dhun(dhtt dhttVar, dhst dhstVar) {
        this.d = dhttVar;
        this.a = dhstVar;
        dhtx dhtxVar = new dhtx() { // from class: dhum
            @Override // defpackage.dhtx
            public final void a(dhts dhtsVar) {
                dhun dhunVar = dhun.this;
                synchronized (dhunVar.b) {
                    if (dhunVar.c) {
                        return;
                    }
                    dhui dhuiVar = new dhui(dhtsVar);
                    dhst dhstVar2 = dhunVar.a;
                    dhstVar2.getClass();
                    dhstVar2.f(dhuiVar);
                }
            }
        };
        this.e = dhtxVar;
        dhttVar.d(dhtxVar);
    }

    @Override // defpackage.dhsj
    public final Instant a() {
        dhso dhsoVar;
        synchronized (this.b) {
            if (this.c) {
                throw new IllegalStateException("dispose() has been called");
            }
            dhsoVar = (dhso) this.a.c();
        }
        if (dhsoVar == null) {
            return null;
        }
        return Instant.ofEpochMilli(dhsoVar.a().a);
    }

    protected final void finalize() {
        synchronized (this.b) {
            if (!this.c) {
                dhtk.a.n().q("TrustedTimeClientAdapter.finalize() causing dispose()");
                synchronized (this.b) {
                    if (this.c) {
                        dhrt.c(null);
                    } else {
                        this.a.e();
                        this.c = true;
                        this.d.a();
                    }
                }
            }
        }
        super.finalize();
    }

    public final String toString() {
        String str;
        synchronized (this.b) {
            str = "TrustedTimeClientAdapter{internalTimeSignalSupplier=" + String.valueOf(this.d) + ", apiListenersManager=" + String.valueOf(this.a) + ", disposed=" + this.c + "}";
        }
        return str;
    }
}
