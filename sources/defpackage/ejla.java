package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejla extends ernr {
    private ejlc a;
    private final int b;

    public ejla(ejlc ejlcVar, int i) {
        this.a = ejlcVar;
        this.b = i;
    }

    @Override // defpackage.ernr
    protected final String gP() {
        erog erogVar;
        ejlc ejlcVar = this.a;
        if (ejlcVar == null || (erogVar = ejlcVar.a.a) == null) {
            return null;
        }
        String b = a.b(erogVar, "callable=[", "]");
        ejlb ejlbVar = (ejlb) this.a.c.get();
        if (ejlbVar == null) {
            return b;
        }
        return b + ", trial=[" + ejlbVar.toString() + "]";
    }

    @Override // defpackage.ernr
    protected final void gQ() {
        long j;
        int i;
        int a;
        boolean z;
        ejlc ejlcVar = this.a;
        this.a = null;
        if (ejlcVar == null) {
            return;
        }
        do {
            j = ejlcVar.b.get();
            i = (int) j;
            a = ejlc.a(j);
            if (i == Integer.MIN_VALUE) {
                throw new AssertionError(a.s(j, "Refcount is: "));
            }
            z = i == -2147483647;
            if (z) {
                a++;
            }
        } while (!ejlcVar.b.compareAndSet(j, ejlc.b(a, i - 1)));
        if (z) {
            while (true) {
                ejlb ejlbVar = (ejlb) ejlcVar.c.get();
                if (ejlbVar != null) {
                    if (ejlbVar.a <= this.b) {
                        ejlbVar.cancel(true);
                        AtomicReference atomicReference = ejlcVar.c;
                        while (!atomicReference.compareAndSet(ejlbVar, null)) {
                            if (atomicReference.get() != ejlbVar) {
                                break;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }
}
