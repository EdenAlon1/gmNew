package defpackage;

import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayfb implements ejny {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/contacts/sync/workprofile/WorkProfileContactsSyncPeriodicWorker");
    public final ffbr b;
    public final ffbr c;
    private final ffsk d;
    private final ffbr e;
    private final ffbr f;
    private final ffbr g;
    private final ffbr h;

    public ayfb(ffsk ffskVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6) {
        ffskVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar6.getClass();
        this.d = ffskVar;
        this.e = ffbrVar;
        this.f = ffbrVar2;
        this.g = ffbrVar3;
        this.h = ffbrVar4;
        this.b = ffbrVar5;
        this.c = ffbrVar6;
    }

    @Override // defpackage.ejok
    public final /* synthetic */ ListenableFuture a(WorkerParameters workerParameters) {
        return ejoj.a();
    }

    @Override // defpackage.ejny, defpackage.ejok
    public final ListenableFuture b(WorkerParameters workerParameters) {
        elfl c;
        workerParameters.getClass();
        c = axol.c(this.d, ffhe.a, ffsm.a, new ayez(this, workerParameters, null));
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(j$.time.Instant r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.ayey
            if (r0 == 0) goto L13
            r0 = r7
            ayey r0 = (defpackage.ayey) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ayey r0 = new ayey
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            j$.time.Instant r6 = r0.e
            ayfb r0 = r0.d
            defpackage.ffci.b(r7)
            goto L4b
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            defpackage.ffci.b(r7)
            ffbr r7 = r5.g
            java.lang.Object r7 = r7.b()
            comc r7 = (defpackage.comc) r7
            r0.d = r5
            r0.e = r6
            r0.c = r3
            java.lang.Object r7 = r7.c(r0)
            if (r7 == r1) goto Lad
            r0 = r5
        L4b:
            axvx r7 = (defpackage.axvx) r7
            eyja r7 = r7.i
            if (r7 != 0) goto L53
            eyja r7 = defpackage.eyja.a
        L53:
            r7.getClass()
            j$.time.Instant r7 = defpackage.eykn.d(r7)
            j$.time.Duration r6 = defpackage.ernl.a(r6, r7)
            j$.time.Instant r1 = j$.time.Instant.EPOCH
            boolean r7 = defpackage.ffkj.e(r7, r1)
            if (r7 != 0) goto L81
            ffbr r7 = r0.h
            java.lang.Object r7 = r7.b()
            r7.getClass()
            java.lang.Number r7 = (java.lang.Number) r7
            long r0 = r7.longValue()
            j$.time.Duration r7 = j$.time.Duration.ofHours(r0)
            int r6 = r6.compareTo(r7)
            if (r6 <= 0) goto L80
            goto L81
        L80:
            r3 = 0
        L81:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            r6.getClass()
            enru r7 = defpackage.ayfb.a
            ensk r7 = r7.h()
            ensn r0 = defpackage.ente.a
            java.lang.String r1 = "BugleWorkContactsSync"
            r7.Y(r0, r1)
            java.lang.String r0 = "shouldPerformFullSync"
            r1 = 97
            java.lang.String r2 = "com/google/android/apps/messaging/shared/contacts/sync/workprofile/WorkProfileContactsSyncPeriodicWorker"
            java.lang.String r4 = "WorkProfileContactsSyncPeriodicWorker.kt"
            ensk r7 = r7.h(r2, r0, r1, r4)
            enrr r7 = (defpackage.enrr) r7
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            java.lang.String r1 = "ShouldPerformFullSync = %s"
            r7.t(r1, r0)
            return r6
        Lad:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayfb.c(j$.time.Instant, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.ffgu r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.ayfa
            if (r0 == 0) goto L13
            r0 = r10
            ayfa r0 = (defpackage.ayfa) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ayfa r0 = new ayfa
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r0 = r0.a
            defpackage.ffci.b(r10)
            goto L94
        L2c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L34:
            java.lang.Object r2 = r0.a
            ayfb r2 = (defpackage.ayfb) r2
            defpackage.ffci.b(r10)
            goto L52
        L3c:
            defpackage.ffci.b(r10)
            ffbr r10 = r9.e
            java.lang.Object r10 = r10.b()
            ayei r10 = (defpackage.ayei) r10
            r0.a = r9
            r0.d = r4
            java.lang.Object r10 = r10.b(r0)
            if (r10 == r1) goto L9b
            r2 = r9
        L52:
            r4 = r10
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L9a
            enru r4 = defpackage.ayfb.a
            ensk r4 = r4.h()
            ensn r5 = defpackage.ente.a
            java.lang.String r6 = "BugleWorkContactsSync"
            r4.Y(r5, r6)
            java.lang.String r5 = "validateSyncEligibility"
            r6 = 80
            java.lang.String r7 = "com/google/android/apps/messaging/shared/contacts/sync/workprofile/WorkProfileContactsSyncPeriodicWorker"
            java.lang.String r8 = "WorkProfileContactsSyncPeriodicWorker.kt"
            ensk r4 = r4.h(r7, r5, r6, r8)
            enrr r4 = (defpackage.enrr) r4
            java.lang.String r5 = "Not eligible for sync. Cancelling work and finishing."
            r4.q(r5)
            ffbr r2 = r2.f
            java.lang.Object r2 = r2.b()
            ejoc r2 = (defpackage.ejoc) r2
            java.lang.String r4 = "WorkProfileContactsPeriodicSync"
            com.google.common.util.concurrent.ListenableFuture r2 = r2.a(r4)
            r0.a = r10
            r0.d = r3
            java.lang.Object r0 = defpackage.fgfz.c(r2, r0)
            if (r0 == r1) goto L9b
            r0 = r10
        L94:
            ppp r10 = new ppp
            r10.<init>()
            return r0
        L9a:
            return r10
        L9b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayfb.d(ffgu):java.lang.Object");
    }
}
