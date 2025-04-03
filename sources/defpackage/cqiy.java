package defpackage;

import j$.time.Instant;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqiy implements cqfs {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/telephony/forwardsync/workorganizer/PausingForwardSyncWorkOrganizer");
    public final cqih b;
    public final cqfr c;
    public final auxb d;
    public final ffsk e;
    public final ffsk f;
    public final emar g;
    public final AtomicReference h;
    private final Set i;
    private final cpzj j;
    private final akzt k;

    public cqiy(cqih cqihVar, cqfr cqfrVar, Set set, cpzj cpzjVar, auxb auxbVar, akzt akztVar, ffsk ffskVar, ffsk ffskVar2) {
        cqihVar.getClass();
        cqfrVar.getClass();
        set.getClass();
        akztVar.getClass();
        ffskVar.getClass();
        ffskVar2.getClass();
        this.b = cqihVar;
        this.c = cqfrVar;
        this.i = set;
        this.j = cpzjVar;
        this.d = auxbVar;
        this.k = akztVar;
        this.e = ffskVar;
        this.f = ffskVar2;
        this.g = new emar();
        this.h = new AtomicReference(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00fc, code lost:
    
        if (defpackage.fgfz.c(r9, r0) == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x010d, code lost:
    
        if (r11.a(r9, r10, r0) == r1) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.cqfs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.cqgj r9, defpackage.eqqh r10, defpackage.ffgu r11) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqiy.a(cqgj, eqqh, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00cd, code lost:
    
        if (r11.c(r0) != r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b1, code lost:
    
        if (r2.g(r0) != r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0076, code lost:
    
        if (r12 != r1) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.cqfs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.cqel r11, defpackage.ffgu r12) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqiy.b(cqel, ffgu):java.lang.Object");
    }

    @Override // defpackage.cqfs
    public final void c(Instant instant) {
        this.b.c(instant);
    }

    @Override // defpackage.cqfs
    public final boolean d() {
        return this.b.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.ffgu r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.cqim
            if (r0 == 0) goto L13
            r0 = r11
            cqim r0 = (defpackage.cqim) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cqim r0 = new cqim
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r11)
            goto L6f
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L2f:
            defpackage.ffci.b(r11)
            java.util.Set r11 = r10.i
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r4 = defpackage.ffdx.n(r11, r4)
            r2.<init>(r4)
            java.util.Iterator r11 = r11.iterator()
        L43:
            boolean r4 = r11.hasNext()
            if (r4 == 0) goto L67
            java.lang.Object r4 = r11.next()
            cqfh r4 = (defpackage.cqfh) r4
            ffsk r5 = r10.f
            ffhe r6 = defpackage.ffhe.a
            ffsm r7 = defpackage.ffsm.a
            ffhd r6 = defpackage.ekxi.a(r6)
            cqin r8 = new cqin
            r9 = 0
            r8.<init>(r9, r4)
            ffss r4 = defpackage.ffra.b(r5, r6, r7, r8)
            r2.add(r4)
            goto L43
        L67:
            r0.c = r3
            java.lang.Object r11 = defpackage.ffqv.a(r2, r0)
            if (r11 == r1) goto L9c
        L6f:
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            boolean r0 = r11 instanceof java.util.Collection
            r1 = 0
            if (r0 == 0) goto L81
            r0 = r11
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L81
        L7f:
            r3 = r1
            goto L97
        L81:
            java.util.Iterator r11 = r11.iterator()
        L85:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L7f
            java.lang.Object r0 = r11.next()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L85
        L97:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r3)
            return r11
        L9c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqiy.e(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.ffgu r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.cqip
            if (r0 == 0) goto L13
            r0 = r9
            cqip r0 = (defpackage.cqip) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cqip r0 = new cqip
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            java.lang.String r3 = "pause"
            java.lang.String r4 = "com/google/android/apps/messaging/shared/telephony/forwardsync/workorganizer/PausingForwardSyncWorkOrganizer"
            java.lang.String r5 = "PausingForwardSyncWorkOrganizer.kt"
            java.lang.String r6 = "BugleTelephony"
            r7 = 1
            if (r2 == 0) goto L39
            if (r2 != r7) goto L31
            cqiy r0 = r0.d
            defpackage.ffci.b(r9)
            goto L61
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L39:
            defpackage.ffci.b(r9)
            enru r9 = defpackage.cqiy.a
            ensk r9 = r9.h()
            ensn r2 = defpackage.ente.a
            r9.Y(r2, r6)
            r2 = 68
            ensk r9 = r9.h(r4, r3, r2, r5)
            enrr r9 = (defpackage.enrr) r9
            java.lang.String r2 = "Pausing forward sync"
            r9.q(r2)
            cqfr r9 = r8.c
            r0.d = r8
            r0.c = r7
            java.lang.Object r9 = r9.e(r7, r0)
            if (r9 == r1) goto L9c
            r0 = r8
        L61:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L84
            enru r9 = defpackage.cqiy.a
            ensk r9 = r9.h()
            ensn r0 = defpackage.ente.a
            r9.Y(r0, r6)
            r0 = 70
            ensk r9 = r9.h(r4, r3, r0, r5)
            enrr r9 = (defpackage.enrr) r9
            java.lang.String r0 = "Sync already paused"
            r9.q(r0)
            ffcu r9 = defpackage.ffcu.a
            return r9
        L84:
            akzt r9 = r0.k
            java.lang.String r1 = "Bugle.Telephony.ForwardSync.Paused"
            r9.c(r1)
            java.util.concurrent.atomic.AtomicReference r9 = r0.h
            r0 = 0
            java.lang.Object r9 = r9.getAndSet(r0)
            ffss r9 = (defpackage.ffss) r9
            if (r9 == 0) goto L99
            defpackage.ffub.a(r9)
        L99:
            ffcu r9 = defpackage.ffcu.a
            return r9
        L9c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqiy.f(ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bf, code lost:
    
        if (r2.f(r0) == r1) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.ffgu r13) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqiy.g(ffgu):java.lang.Object");
    }

    public final void h() {
        enru enruVar = a;
        ensk h = enruVar.h();
        h.Y(ente.a, "BugleTelephony");
        ((enrr) h.h("com/google/android/apps/messaging/shared/telephony/forwardsync/workorganizer/PausingForwardSyncWorkOrganizer", "pauseInTransaction", 79, "PausingForwardSyncWorkOrganizer.kt")).q("Pausing forward sync");
        final fflb fflbVar = new fflb();
        fflbVar.a = new AtomicBoolean(false);
        final cqfr cqfrVar = this.c;
        if (!((AtomicBoolean) fflbVar.a).get()) {
            ensk h2 = enruVar.h();
            h2.Y(ente.a, "BugleTelephony");
            ((enrr) h2.h("com/google/android/apps/messaging/shared/telephony/forwardsync/workorganizer/PausingForwardSyncWorkOrganizer", "pauseInTransaction", 81, "PausingForwardSyncWorkOrganizer.kt")).q("Sync already paused");
        } else {
            this.k.c("Bugle.Telephony.ForwardSync.Paused");
            ffss ffssVar = (ffss) this.h.getAndSet(null);
            if (ffssVar != null) {
                ffssVar.t(null);
            }
        }
    }
}
