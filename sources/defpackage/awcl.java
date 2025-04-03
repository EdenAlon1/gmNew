package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awcl implements awat {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/WaitingStep");
    public final awam b;
    public final awap c;
    public ffrf d;
    private final ffsk e;
    private final ffbr f;
    private final ffss g;
    private final awcr h = awcr.b;

    public awcl(ffsk ffskVar, awam awamVar, ffbr ffbrVar, awap awapVar) {
        this.e = ffskVar;
        this.b = awamVar;
        this.f = ffbrVar;
        this.c = awapVar;
        this.g = ffqy.c(ffskVar, null, new awcf(this, null), 3);
    }

    @Override // defpackage.awat
    public final awcr a() {
        return this.h;
    }

    @Override // defpackage.awat
    public final Object b(ffgu ffguVar) {
        ffrf ffrfVar = this.d;
        if (ffkj.e(ffrfVar != null ? Boolean.valueOf(ffrfVar.h(new CancellationException("Waiting step was cancelled."))) : null, true)) {
            ensk h = a.h();
            h.Y(ente.a, "BugleFileTransfer");
            enrr enrrVar = (enrr) h;
            enrrVar.Y(cqpo.j, this.c);
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/WaitingStep", "cancel", 117, "WaitingStep.kt")).q("Waiting step was cancelled.");
        } else {
            ensk j = a.j();
            j.Y(ente.a, "BugleFileTransfer");
            enrr enrrVar2 = (enrr) j;
            enrrVar2.Y(cqpo.j, this.c);
            ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/WaitingStep", "cancel", 122, "WaitingStep.kt")).q("Failed to cancel waiting step!");
        }
        return ffcu.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ffgu r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.awcg
            if (r0 == 0) goto L13
            r0 = r7
            awcg r0 = (defpackage.awcg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            awcg r0 = new awcg
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            awcl r0 = r0.d
            defpackage.ffci.b(r7)     // Catch: defpackage.ffvj -> L29
            goto L5b
        L29:
            r7 = move-exception
            goto L63
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L33:
            defpackage.ffci.b(r7)
            ffbr r7 = r6.f     // Catch: defpackage.ffvj -> L61
            java.lang.Object r7 = r7.b()     // Catch: defpackage.ffvj -> L61
            r7.getClass()     // Catch: defpackage.ffvj -> L61
            eyev r7 = (defpackage.eyev) r7     // Catch: defpackage.ffvj -> L61
            j$.time.Duration r7 = defpackage.eykn.c(r7)     // Catch: defpackage.ffvj -> L61
            long r4 = r7.toMillis()     // Catch: defpackage.ffvj -> L61
            awcj r7 = new awcj     // Catch: defpackage.ffvj -> L61
            r2 = 0
            r7.<init>(r6, r2)     // Catch: defpackage.ffvj -> L61
            r0.d = r6     // Catch: defpackage.ffvj -> L61
            r0.c = r3     // Catch: defpackage.ffvj -> L61
            java.lang.Object r7 = defpackage.ffvm.a(r4, r7, r0)     // Catch: defpackage.ffvj -> L61
            if (r7 != r1) goto L5a
            return r1
        L5a:
            r0 = r6
        L5b:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: defpackage.ffvj -> L29
            r7.booleanValue()     // Catch: defpackage.ffvj -> L29
            return r7
        L61:
            r7 = move-exception
            r0 = r6
        L63:
            enru r1 = defpackage.awcl.a
            ensk r1 = r1.j()
            ensn r2 = defpackage.ente.a
            java.lang.String r3 = "BugleFileTransfer"
            r1.Y(r2, r3)
            enrr r1 = (defpackage.enrr) r1
            ensn r2 = defpackage.cqpo.j
            awap r0 = r0.c
            r1.Y(r2, r0)
            ensk r0 = r1.g(r7)
            java.lang.String r1 = "awaitCallback"
            r2 = 84
            java.lang.String r3 = "com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/WaitingStep"
            java.lang.String r4 = "WaitingStep.kt"
            ensk r0 = r0.h(r3, r1, r2, r4)
            enrr r0 = (defpackage.enrr) r0
            java.lang.String r1 = "Timeout waiting for file transfer to process."
            r0.q(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awcl.c(ffgu):java.lang.Object");
    }

    @Override // defpackage.awat
    public final Object e(ffgu ffguVar) {
        return ffcu.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.awat
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.awai r4, defpackage.awbj r5, defpackage.ffgu r6) {
        /*
            r3 = this;
            boolean r4 = r6 instanceof defpackage.awck
            if (r4 == 0) goto L13
            r4 = r6
            awck r4 = (defpackage.awck) r4
            int r0 = r4.c
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.c = r0
            goto L18
        L13:
            awck r4 = new awck
            r4.<init>(r3, r6)
        L18:
            java.lang.Object r6 = r4.a
            ffhh r0 = defpackage.ffhh.a
            int r1 = r4.c
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            awbj r5 = r4.e
            awcl r4 = r4.d
            defpackage.ffci.b(r6)     // Catch: java.util.concurrent.CancellationException -> L2b
            goto L48
        L2b:
            r5 = move-exception
            goto L51
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            defpackage.ffci.b(r6)
            ffss r6 = r3.g     // Catch: java.util.concurrent.CancellationException -> L4e
            r4.d = r3     // Catch: java.util.concurrent.CancellationException -> L4e
            r4.e = r5     // Catch: java.util.concurrent.CancellationException -> L4e
            r4.c = r2     // Catch: java.util.concurrent.CancellationException -> L4e
            java.lang.Object r6 = r6.c(r4)     // Catch: java.util.concurrent.CancellationException -> L4e
            if (r6 != r0) goto L47
            return r0
        L47:
            r4 = r3
        L48:
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.util.concurrent.CancellationException -> L2b
            r6.booleanValue()     // Catch: java.util.concurrent.CancellationException -> L2b
            return r5
        L4e:
            r4 = move-exception
            r5 = r4
            r4 = r3
        L51:
            enru r6 = defpackage.awcl.a
            ensk r6 = r6.j()
            ensn r0 = defpackage.ente.a
            java.lang.String r1 = "BugleFileTransfer"
            r6.Y(r0, r1)
            enrr r6 = (defpackage.enrr) r6
            ensn r0 = defpackage.cqpo.j
            awap r4 = r4.c
            r6.Y(r0, r4)
            ensk r4 = r6.g(r5)
            java.lang.String r5 = "start"
            r6 = 100
            java.lang.String r0 = "com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/WaitingStep"
            java.lang.String r1 = "WaitingStep.kt"
            ensk r4 = r4.h(r0, r5, r6, r1)
            enrr r4 = (defpackage.enrr) r4
            java.lang.String r5 = "Waiting for the MessageCoreData creation was cancelled."
            r4.q(r5)
            awbk r4 = defpackage.awbk.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awcl.f(awai, awbj, ffgu):java.lang.Object");
    }

    @Override // defpackage.awat
    public final boolean h() {
        ffrf ffrfVar = this.d;
        if (ffrfVar != null) {
            return ffrfVar.j();
        }
        return false;
    }

    @Override // defpackage.awat
    public final /* synthetic */ boolean i() {
        return false;
    }
}
