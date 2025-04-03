package defpackage;

import j$.time.Duration;
import j$.util.Optional;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cesw extends ceut {
    public static final entd a = entd.c("BugleNotifications");
    public final ffbr b;
    public final Optional c;
    private final errm d;

    public cesw(errm errmVar, ffbr ffbrVar, Optional optional) {
        this.d = errmVar;
        this.b = ffbrVar;
        this.c = optional;
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        ((ceti) l).d = Duration.ofSeconds(1L);
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("UpdateUnreadCounterHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return cesy.a.getParserForType();
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final /* synthetic */ boolean h(eyhs eyhsVar) {
        return k();
    }

    @Override // defpackage.ceut
    public final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        final cesy cesyVar = (cesy) eyhsVar;
        return elfo.g(new Callable() { // from class: cesv
            /* JADX WARN: Code restructure failed: missing block: B:11:0x0049, code lost:
            
                if (r1 != false) goto L12;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
            
                if (r5.c != false) goto L10;
             */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call() {
                /*
                    r7 = this;
                    cesw r0 = defpackage.cesw.this
                    boolean r1 = r0.k()
                    if (r1 == 0) goto L6f
                    ffbr r1 = r0.b
                    java.lang.Object r1 = r1.b()
                    ctvs r1 = (defpackage.ctvs) r1
                    boolean r1 = r1.d()
                    java.lang.String r2 = "processPendingWorkItemAsync"
                    java.lang.String r3 = "com/google/android/apps/messaging/shared/datamodel/workhandlers/UpdateUnreadCounterHandler"
                    java.lang.String r4 = "UpdateUnreadCounterHandler.java"
                    if (r1 == 0) goto L28
                    cesy r5 = r2
                    int r6 = r5.b
                    r6 = r6 & 1
                    if (r6 == 0) goto L4b
                    boolean r5 = r5.c
                    if (r5 == 0) goto L4b
                L28:
                    j$.util.Optional r5 = r0.c
                    java.lang.Object r5 = r5.get()
                    ctif r5 = (defpackage.ctif) r5
                    r6 = 0
                    r5.a(r6)
                    entd r5 = defpackage.cesw.a
                    ensk r5 = r5.h()
                    ensz r5 = (defpackage.ensz) r5
                    r6 = 80
                    ensk r5 = r5.h(r3, r2, r6, r4)
                    ensz r5 = (defpackage.ensz) r5
                    java.lang.String r6 = "Cleared shortcut badge counter"
                    r5.q(r6)
                    if (r1 == 0) goto L6f
                L4b:
                    j$.util.Optional r0 = r0.c
                    int r1 = defpackage.cbem.a()
                    java.lang.Object r0 = r0.get()
                    ctif r0 = (defpackage.ctif) r0
                    r0.a(r1)
                    entd r0 = defpackage.cesw.a
                    ensk r0 = r0.h()
                    ensz r0 = (defpackage.ensz) r0
                    r5 = 86
                    ensk r0 = r0.h(r3, r2, r5, r4)
                    ensz r0 = (defpackage.ensz) r0
                    java.lang.String r2 = "Set shortcut badge counter to %d"
                    r0.r(r2, r1)
                L6f:
                    ceyt r0 = defpackage.ceyt.i()
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.cesv.call():java.lang.Object");
            }
        }, this.d);
    }

    public final boolean k() {
        this.c.isPresent();
        return fgsf.b(((ctif) this.c.get()).a) && ((ctif) this.c.get()).b();
    }
}
