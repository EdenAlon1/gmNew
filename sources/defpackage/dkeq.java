package defpackage;

import j$.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkeq {
    public final dksa a;
    public final AtomicReference b = new AtomicReference(dkep.UNKNOWN);
    private final dkgw c;
    private final errl d;

    public dkeq(dkgw dkgwVar, dksa dksaVar, errl errlVar) {
        this.c = dkgwVar;
        this.a = dksaVar;
        this.d = errlVar;
    }

    public final void a() {
        final dkkq dkkqVar = (dkkq) this.c.a(dkkq.class);
        if (Objects.isNull(dkkqVar)) {
            dkty.c("Skipping Chat API flag change detection: InstantMessagingService not configured.", new Object[0]);
        } else {
            erqt.r(erqc.o(this.d.submit(new Runnable() { // from class: dken
                /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        r5 = this;
                        dkeq r0 = defpackage.dkeq.this
                        dksa r1 = r0.a
                        r2 = 0
                        java.lang.String r3 = "enable_simplified_messaging_api"
                        java.lang.String r4 = "BuglePhenotypeFlagsRelay"
                        boolean r1 = r1.k(r3, r2, r4)     // Catch: defpackage.dksb -> L12
                        if (r1 == 0) goto L12
                        dkep r1 = defpackage.dkep.SMAPI
                        goto L14
                    L12:
                        dkep r1 = defpackage.dkep.LEGACY
                    L14:
                        java.util.concurrent.atomic.AtomicReference r0 = r0.b
                        java.lang.Object r0 = r0.getAndSet(r1)
                        dkep r0 = (defpackage.dkep) r0
                        boolean r0 = r1.equals(r0)
                        if (r0 != 0) goto L30
                        dkkq r0 = r2
                        java.lang.Object[] r1 = new java.lang.Object[r2]
                        java.lang.String r2 = "Chat API flag detected, disconnecting all sessions."
                        defpackage.dkty.c(r2, r1)
                        dilc r1 = defpackage.dilc.CONNECTIVITY_CHANGE
                        r0.d(r1)
                    L30:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.dken.run():void");
                }
            })), new dkeo(), this.d);
        }
    }
}
