package defpackage;

import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class delt implements ejns {
    public static final delq a = new delq();
    public static final enru b = enru.c("com/google/android/apps/messaging/welcome/v1/consent/ProfilesConsentWorker");
    public final eisx c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    public final ffbr j;
    private final ffsk k;
    private final ffbr l;
    private final ffbr m;

    public delt(eisx eisxVar, ffsk ffskVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9) {
        eisxVar.getClass();
        ffskVar.getClass();
        ffbrVar.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        ffbrVar6.getClass();
        this.c = eisxVar;
        this.k = ffskVar;
        this.d = ffbrVar;
        this.e = ffbrVar2;
        this.l = ffbrVar3;
        this.f = ffbrVar4;
        this.g = ffbrVar5;
        this.m = ffbrVar6;
        this.h = ffbrVar7;
        this.i = ffbrVar8;
        this.j = ffbrVar9;
    }

    @Override // defpackage.ejok
    public final /* synthetic */ ListenableFuture a(WorkerParameters workerParameters) {
        return ejoj.a();
    }

    @Override // defpackage.ejns, defpackage.ejok
    public final ListenableFuture b(WorkerParameters workerParameters) {
        elfl c;
        workerParameters.getClass();
        c = axol.c(this.k, ffhe.a, ffsm.a, new dels(this, workerParameters, null));
        return c;
    }

    public final ppq c(WorkerParameters workerParameters) {
        long longValue = ((Number) this.l.b()).longValue();
        int i = workerParameters.e;
        if (i < longValue) {
            delq.c(a.h(i, "Marking for retry. Current attempt count is "));
            return new ppo();
        }
        delq.c("Max attempt count " + this.l.b() + " reached. Failing");
        dekv dekvVar = (dekv) this.j.b();
        Object b2 = dekvVar.a.b();
        b2.getClass();
        axol.k((ffsk) b2, null, new dekr(dekvVar, null), 3);
        return new ppn();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c7, code lost:
    
        if (r9.i((defpackage.enip) r2, r4, r0) == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071 A[LOOP:0: B:25:0x006b->B:27:0x0071, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.ffgu r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.delr
            if (r0 == 0) goto L13
            r0 = r9
            delr r0 = (defpackage.delr) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            delr r0 = new delr
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L44
            if (r2 == r5) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            defpackage.ffci.b(r9)
            goto Lca
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L36:
            java.lang.Object r2 = r0.a
            delt r4 = r0.e
            defpackage.ffci.b(r9)
            goto L99
        L3e:
            delt r2 = r0.e
            defpackage.ffci.b(r9)
            goto L5a
        L44:
            defpackage.ffci.b(r9)
            ffbr r9 = r8.m
            java.lang.Object r9 = r9.b()
            djsi r9 = (defpackage.djsi) r9
            r0.e = r8
            r0.d = r5
            java.lang.Object r9 = r9.j(r0)
            if (r9 == r1) goto Lcd
            r2 = r8
        L5a:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r6 = defpackage.ffdx.n(r9, r6)
            r5.<init>(r6)
            java.util.Iterator r9 = r9.iterator()
        L6b:
            boolean r6 = r9.hasNext()
            if (r6 == 0) goto L7d
            java.lang.Object r6 = r9.next()
            djrj r6 = (defpackage.djrj) r6
            java.lang.String r6 = r6.a
            r5.add(r6)
            goto L6b
        L7d:
            enip r9 = defpackage.engq.f(r5)
            ffbr r5 = r2.d
            java.lang.Object r5 = r5.b()
            cvjo r5 = (defpackage.cvjo) r5
            r0.e = r2
            r0.a = r9
            r0.d = r4
            java.lang.Object r4 = r5.e(r0)
            if (r4 == r1) goto Lcd
            r7 = r2
            r2 = r9
            r9 = r4
            r4 = r7
        L99:
            enip r9 = (defpackage.enip) r9
            boolean r9 = defpackage.ffkj.e(r9, r2)
            if (r9 != 0) goto Lca
            java.lang.String r9 = "Caching RCS provisioning data"
            defpackage.delq.c(r9)
            ffbr r9 = r4.d
            java.lang.Object r9 = r9.b()
            cvjo r9 = (defpackage.cvjo) r9
            ffbr r4 = r4.h
            java.lang.Object r4 = r4.b()
            cqoh r4 = (defpackage.cqoh) r4
            j$.time.Instant r4 = r4.f()
            r5 = 0
            r0.e = r5
            r0.a = r5
            r0.d = r3
            enip r2 = (defpackage.enip) r2
            java.lang.Object r9 = r9.i(r2, r4, r0)
            if (r9 != r1) goto Lca
            goto Lcd
        Lca:
            ffcu r9 = defpackage.ffcu.a
            return r9
        Lcd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.delt.d(ffgu):java.lang.Object");
    }
}
