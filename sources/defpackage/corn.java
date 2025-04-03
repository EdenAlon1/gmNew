package defpackage;

import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class corn implements ejny {
    public static final entd a = entd.c("BugleSimStateTracker");
    public final coqc b;
    private final ffsk c;
    private final ffhd d;

    public corn(ffsk ffskVar, ffhd ffhdVar, coqc coqcVar) {
        ffskVar.getClass();
        ffhdVar.getClass();
        coqcVar.getClass();
        this.c = ffskVar;
        this.d = ffhdVar;
        this.b = coqcVar;
    }

    @Override // defpackage.ejok
    public final /* synthetic */ ListenableFuture a(WorkerParameters workerParameters) {
        return ejoj.a();
    }

    @Override // defpackage.ejny, defpackage.ejok
    public final ListenableFuture b(WorkerParameters workerParameters) {
        elfl c;
        workerParameters.getClass();
        c = axol.c(this.c, ffhe.a, ffsm.a, new corl(this, workerParameters, null));
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.eraj r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.corh
            if (r0 == 0) goto L13
            r0 = r6
            corh r0 = (defpackage.corh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            corh r0 = new corh
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r6)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.ffci.b(r6)
            coqc r6 = r4.b
            ffss r5 = r6.c(r5)
            r0.c = r3
            java.lang.Object r5 = r5.c(r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            ppp r5 = new ppp
            r5.<init>()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.corn.c(eraj, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.pot r9, defpackage.ffgu r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.cori
            if (r0 == 0) goto L13
            r0 = r10
            cori r0 = (defpackage.cori) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cori r0 = new cori
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            defpackage.ffci.b(r10)
            goto L99
        L28:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L30:
            defpackage.ffci.b(r10)
            java.util.Map r9 = r9.b
            java.lang.String r10 = "unstable_subscription_id_list"
            java.lang.Object r9 = r9.get(r10)
            boolean r10 = r9 instanceof java.lang.Object[]
            r2 = 0
            r4 = 0
            if (r10 == 0) goto L66
            r10 = r9
            java.lang.Object[] r10 = (java.lang.Object[]) r10
            boolean r5 = r10 instanceof java.lang.Object[]
            if (r5 == 0) goto L66
            int r10 = r10.length
            poq r5 = new poq
            r5.<init>(r9)
            int[] r9 = new int[r10]
            r6 = r2
        L51:
            if (r6 >= r10) goto L67
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            java.lang.Object r7 = r5.invoke(r7)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r9[r6] = r7
            int r6 = r6 + 1
            goto L51
        L66:
            r9 = r4
        L67:
            if (r9 == 0) goto L7f
            java.util.ArrayList r4 = new java.util.ArrayList
            int r10 = r9.length
            r4.<init>(r10)
        L6f:
            int r10 = r9.length
            if (r2 >= r10) goto L7f
            r10 = r9[r2]
            djrq r5 = new djrq
            r5.<init>(r10)
            r4.add(r5)
            int r2 = r2 + 1
            goto L6f
        L7f:
            if (r4 == 0) goto L9f
            boolean r9 = r4.isEmpty()
            if (r9 == 0) goto L88
            goto L9f
        L88:
            coqc r9 = r8.b
            eraj r10 = defpackage.eraj.UPDATE_TRIGGER_UNSTABLE_SUBSCRIPTION
            ffss r9 = r9.b(r4, r10)
            r0.c = r3
            java.lang.Object r9 = r9.c(r0)
            if (r9 != r1) goto L99
            return r1
        L99:
            ppp r9 = new ppp
            r9.<init>()
            return r9
        L9f:
            entd r9 = defpackage.corn.a
            ensk r9 = r9.n()
            java.lang.String r10 = "No unstable subscription Ids provided."
            r9.q(r10)
            ppn r9 = new ppn
            r9.<init>()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.corn.d(pot, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.eraj r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.cork
            if (r0 == 0) goto L13
            r0 = r7
            cork r0 = (defpackage.cork) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cork r0 = new cork
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r7)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.ffci.b(r7)
            ffhd r7 = r5.d
            ffhd r7 = defpackage.ekxi.a(r7)
            corj r2 = new corj
            r4 = 0
            r2.<init>(r4, r5, r6)
            r0.c = r3
            java.lang.Object r7 = defpackage.ffra.a(r7, r2, r0)
            if (r7 != r1) goto L47
            return r1
        L47:
            r7.getClass()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.corn.e(eraj, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00bc, code lost:
    
        if (r12 != r1) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c7, code lost:
    
        if (r12 != r1) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d5, code lost:
    
        if (r12 != r1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x009c, code lost:
    
        if (r12.equals("VERIFY_UNSTABLE_SUBSCRIPTION") != false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc A[Catch: IllegalArgumentException -> 0x00db, TryCatch #0 {IllegalArgumentException -> 0x00db, blocks: (B:12:0x0029, B:13:0x00be, B:18:0x0036, B:19:0x00c9, B:21:0x003b, B:22:0x00d7, B:32:0x006d, B:46:0x00b1, B:49:0x00b6, B:52:0x00c1, B:54:0x00cc, B:56:0x00a8, B:57:0x00ad), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(androidx.work.WorkerParameters r11, defpackage.ffgu r12) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.corn.f(androidx.work.WorkerParameters, ffgu):java.lang.Object");
    }
}
