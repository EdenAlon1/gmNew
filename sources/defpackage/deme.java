package defpackage;

import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deme implements ejny {
    public static final dely a = new dely();
    public static final enru b = enru.c("com/google/android/apps/messaging/welcome/v1/consent/VerificationWorker");
    private final ffsk c;
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;
    private final ffbr g;
    private final ffbr h;
    private final ffbr i;
    private final ffbr j;
    private final ffbr k;

    public deme(ffsk ffskVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8) {
        ffskVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        ffbrVar6.getClass();
        ffbrVar7.getClass();
        this.c = ffskVar;
        this.d = ffbrVar;
        this.e = ffbrVar2;
        this.f = ffbrVar3;
        this.g = ffbrVar4;
        this.h = ffbrVar5;
        this.i = ffbrVar6;
        this.j = ffbrVar7;
        this.k = ffbrVar8;
    }

    @Override // defpackage.ejok
    public final /* synthetic */ ListenableFuture a(WorkerParameters workerParameters) {
        return ejoj.a();
    }

    @Override // defpackage.ejny, defpackage.ejok
    public final ListenableFuture b(WorkerParameters workerParameters) {
        elfl c;
        workerParameters.getClass();
        c = axol.c(this.c, ffhe.a, ffsm.a, new demb(this, workerParameters, null));
        return c;
    }

    public final ppq c(WorkerParameters workerParameters) {
        long longValue = ((Number) this.e.b()).longValue();
        int i = workerParameters.e;
        if (i < longValue) {
            dely.b(a.h(i, "Marking for retry. Current attempt count is "));
            return new ppo();
        }
        dely.b("Max attempt count " + this.e.b() + " reached. Failing");
        return new ppn();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.delz
            if (r0 == 0) goto L13
            r0 = r5
            delz r0 = (defpackage.delz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            delz r0 = new delz
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            deme r0 = r0.d
            defpackage.ffci.b(r5)
            goto L47
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            defpackage.ffci.b(r5)
            ffbr r5 = r4.d
            java.lang.Object r5 = r5.b()
            cvjo r5 = (defpackage.cvjo) r5
            r0.d = r4
            r0.c = r3
            java.lang.Object r5 = r5.c(r0)
            if (r5 == r1) goto L61
            r0 = r4
        L47:
            j$.time.Instant r5 = (j$.time.Instant) r5
            if (r5 == 0) goto L5f
            ffbr r0 = r0.k
            java.lang.Object r0 = r0.b()
            cqoh r0 = (defpackage.cqoh) r0
            j$.time.Instant r0 = r0.f()
            r0.getClass()
            j$.time.Duration r5 = defpackage.ernl.a(r0, r5)
            return r5
        L5f:
            r5 = 0
            return r5
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.deme.d(ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0073, code lost:
    
        if (r8 != r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.ffgu r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.dema
            if (r0 == 0) goto L13
            r0 = r8
            dema r0 = (defpackage.dema) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dema r0 = new dema
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L49
            if (r2 == r5) goto L41
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r0 = r0.a
            j$.time.Instant r0 = (j$.time.Instant) r0
            defpackage.ffci.b(r8)
            return r0
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L39:
            java.lang.Object r2 = r0.a
            deme r2 = (defpackage.deme) r2
            defpackage.ffci.b(r8)
            goto L75
        L41:
            java.lang.Object r2 = r0.a
            deme r2 = (defpackage.deme) r2
            defpackage.ffci.b(r8)
            goto L5f
        L49:
            defpackage.ffci.b(r8)
            ffbr r8 = r7.d
            java.lang.Object r8 = r8.b()
            cvjo r8 = (defpackage.cvjo) r8
            r0.a = r7
            r0.d = r5
            java.lang.Object r8 = r8.f(r0)
            if (r8 == r1) goto Lc6
            r2 = r7
        L5f:
            j$.time.Instant r8 = (j$.time.Instant) r8
            if (r8 != 0) goto Lc5
            ffbr r8 = r2.f
            java.lang.Object r8 = r8.b()
            djsi r8 = (defpackage.djsi) r8
            r0.a = r2
            r0.d = r4
            java.lang.Object r8 = r8.j(r0)
            if (r8 == r1) goto Lc6
        L75:
            java.util.Set r8 = (java.util.Set) r8
            boolean r4 = r8.isEmpty()
            if (r4 == 0) goto L7f
            r8 = 0
            return r8
        L7f:
            ffbr r4 = r2.k
            java.lang.Object r4 = r4.b()
            cqoh r4 = (defpackage.cqoh) r4
            j$.time.Instant r4 = r4.f()
            ffbr r2 = r2.d
            java.lang.Object r2 = r2.b()
            cvjo r2 = (defpackage.cvjo) r2
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r6 = defpackage.ffdx.n(r8, r6)
            r5.<init>(r6)
            java.util.Iterator r8 = r8.iterator()
        La2:
            boolean r6 = r8.hasNext()
            if (r6 == 0) goto Lb6
            java.lang.Object r6 = r8.next()
            djrj r6 = (defpackage.djrj) r6
            java.lang.String r6 = r6.toString()
            r5.add(r6)
            goto La2
        Lb6:
            enip r8 = defpackage.engq.f(r5)
            r0.a = r4
            r0.d = r3
            java.lang.Object r8 = r2.i(r8, r4, r0)
            if (r8 == r1) goto Lc6
            return r4
        Lc5:
            return r8
        Lc6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.deme.e(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.ffgu r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.demc
            if (r0 == 0) goto L13
            r0 = r6
            demc r0 = (defpackage.demc) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            demc r0 = new demc
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r6)
            goto L56
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.ffci.b(r6)
            ffbr r6 = r5.i
            java.lang.Object r6 = r6.b()
            dfzs r6 = (defpackage.dfzs) r6
            dgab r2 = new dgab
            r2.<init>()
            java.lang.String r4 = "am_profiles"
            r2.a = r4
            r2.e = r3
            com.google.android.gms.constellation.VerifyPhoneNumberRequest r2 = r2.a()
            dhre r6 = r6.a(r2)
            r0.c = r3
            java.lang.Object r6 = defpackage.axpj.a(r6, r0)
            if (r6 != r1) goto L56
            return r1
        L56:
            com.google.android.gms.constellation.VerifyPhoneNumberResponse r6 = (com.google.android.gms.constellation.VerifyPhoneNumberResponse) r6
            ffcu r6 = defpackage.ffcu.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.deme.f(ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0131, code lost:
    
        if (r3.a((defpackage.ejoc) r5, r9, r1) != r2) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00bb, code lost:
    
        if (r14 != r2) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0112 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.ffgu r14) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.deme.g(ffgu):java.lang.Object");
    }
}
