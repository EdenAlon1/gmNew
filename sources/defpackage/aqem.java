package defpackage;

import j$.time.Instant;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqem implements aqev {
    public final ffsk a;
    public final cbut b;
    public final aqge c;
    public final aqge d;
    public final aqge e;
    private final ffsk g;
    private final ffbr h;
    private ctbx j;
    public final AtomicBoolean f = new AtomicBoolean(false);
    private final Object i = new Object();

    public aqem(ffsk ffskVar, ffsk ffskVar2, cbut cbutVar, ffbr ffbrVar, aqge aqgeVar, aqge aqgeVar2, aqge aqgeVar3) {
        this.a = ffskVar;
        this.g = ffskVar2;
        this.b = cbutVar;
        this.h = ffbrVar;
        this.c = aqgeVar;
        this.d = aqgeVar2;
        this.e = aqgeVar3;
    }

    @Override // defpackage.aqev
    public final elfl a(Instant instant) {
        elfl c;
        instant.getClass();
        c = axol.c(this.g, ffhe.a, ffsm.a, new aqek(this, instant, null));
        return c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r13v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(j$.time.Instant r13, defpackage.ffgu r14) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqem.b(j$.time.Instant, ffgu):java.lang.Object");
    }

    @Override // defpackage.aqev
    public final void c() {
        synchronized (this.i) {
            if (this.j != null) {
                throw new IllegalStateException("Check failed.");
            }
            if (!this.f.compareAndSet(false, true)) {
                throw new IllegalStateException("Check failed.");
            }
            this.j = this.e.a(new aqgd() { // from class: aqeh
                @Override // defpackage.aqgd
                public final elfl a() {
                    elfl c;
                    aqem aqemVar = aqem.this;
                    c = axol.c(aqemVar.a, ffhe.a, ffsm.a, new aqej(aqemVar, null));
                    return c;
                }
            });
        }
    }

    @Override // defpackage.aqev
    public final void d() {
        ctbx ctbxVar;
        synchronized (this.i) {
            this.f.set(false);
            ctbxVar = this.j;
            this.j = null;
        }
        if (ctbxVar != null) {
            ctbxVar.a();
        }
    }
}
