package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqit extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cqiy b;
    final /* synthetic */ cqel c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqit(ffgu ffguVar, cqiy cqiyVar, cqel cqelVar) {
        super(2, ffguVar);
        this.b = cqiyVar;
        this.c = cqelVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cqit) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
    
        if (r12.b(r1, r11) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0084, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0082, code lost:
    
        if (defpackage.ffra.a(r1, r4, r11) != r0) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [ffhh] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v9, types: [ensn] */
    /* JADX WARN: Type inference failed for: r12v16, types: [ensk] */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r12) {
        /*
            r11 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r11.a
            java.lang.String r2 = "processBatches Ended"
            r3 = 204(0xcc, float:2.86E-43)
            r4 = 1
            r5 = 0
            java.lang.String r6 = "invokeSuspend"
            java.lang.String r7 = "com/google/android/apps/messaging/shared/telephony/forwardsync/workorganizer/PausingForwardSyncWorkOrganizer$processBatches$lambda$3$$inlined$asyncPropagatingLegacy$default$1"
            java.lang.String r8 = "PausingForwardSyncWorkOrganizer.kt"
            java.lang.String r9 = "BugleTelephony"
            if (r1 == 0) goto L22
            if (r1 != r4) goto L1e
            defpackage.ffci.b(r12)     // Catch: java.lang.Throwable -> L1a java.util.concurrent.CancellationException -> L1c
            goto L50
        L1a:
            r12 = move-exception
            goto L8b
        L1c:
            r12 = move-exception
            goto L6e
        L1e:
            defpackage.ffci.b(r12)     // Catch: java.lang.Throwable -> L1a
            goto L85
        L22:
            defpackage.ffci.b(r12)
            java.lang.Object r12 = r11.d
            ffsk r12 = (defpackage.ffsk) r12
            enru r12 = defpackage.cqiy.a     // Catch: java.lang.Throwable -> L1a java.util.concurrent.CancellationException -> L1c
            ensk r12 = r12.h()     // Catch: java.lang.Throwable -> L1a java.util.concurrent.CancellationException -> L1c
            ensn r1 = defpackage.ente.a     // Catch: java.lang.Throwable -> L1a java.util.concurrent.CancellationException -> L1c
            r12.Y(r1, r9)     // Catch: java.lang.Throwable -> L1a java.util.concurrent.CancellationException -> L1c
            r1 = 192(0xc0, float:2.69E-43)
            ensk r12 = r12.h(r7, r6, r1, r8)     // Catch: java.lang.Throwable -> L1a java.util.concurrent.CancellationException -> L1c
            enrr r12 = (defpackage.enrr) r12     // Catch: java.lang.Throwable -> L1a java.util.concurrent.CancellationException -> L1c
            java.lang.String r1 = "Starting processBatches"
            r12.q(r1)     // Catch: java.lang.Throwable -> L1a java.util.concurrent.CancellationException -> L1c
            cqiy r12 = r11.b     // Catch: java.lang.Throwable -> L1a java.util.concurrent.CancellationException -> L1c
            cqih r12 = r12.b     // Catch: java.lang.Throwable -> L1a java.util.concurrent.CancellationException -> L1c
            cqel r1 = r11.c     // Catch: java.lang.Throwable -> L1a java.util.concurrent.CancellationException -> L1c
            r11.a = r4     // Catch: java.lang.Throwable -> L1a java.util.concurrent.CancellationException -> L1c
            java.lang.Object r12 = r12.b(r1, r11)     // Catch: java.lang.Throwable -> L1a java.util.concurrent.CancellationException -> L1c
            if (r12 != r0) goto L50
            goto L84
        L50:
            enru r12 = defpackage.cqiy.a
            ensk r12 = r12.h()
            ensn r0 = defpackage.ente.a
            r12.Y(r0, r9)
            ensk r12 = r12.h(r7, r6, r3, r8)
            enrr r12 = (defpackage.enrr) r12
            r12.q(r2)
            cqiy r12 = r11.b
            java.util.concurrent.atomic.AtomicReference r12 = r12.h
            r12.set(r5)
            ffcu r12 = defpackage.ffcu.a
            return r12
        L6e:
            ffuw r1 = defpackage.ffuw.a     // Catch: java.lang.Throwable -> L1a
            ffhd r1 = defpackage.ekxi.a(r1)     // Catch: java.lang.Throwable -> L1a
            cqiu r4 = new cqiu     // Catch: java.lang.Throwable -> L1a
            cqiy r10 = r11.b     // Catch: java.lang.Throwable -> L1a
            r4.<init>(r5, r10, r12)     // Catch: java.lang.Throwable -> L1a
            r12 = 2
            r11.a = r12     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r12 = defpackage.ffra.a(r1, r4, r11)     // Catch: java.lang.Throwable -> L1a
            if (r12 != r0) goto L85
        L84:
            return r0
        L85:
            ffbx r12 = new ffbx     // Catch: java.lang.Throwable -> L1a
            r12.<init>()     // Catch: java.lang.Throwable -> L1a
            throw r12     // Catch: java.lang.Throwable -> L1a
        L8b:
            enru r0 = defpackage.cqiy.a
            ensk r0 = r0.h()
            ensn r1 = defpackage.ente.a
            r0.Y(r1, r9)
            ensk r0 = r0.h(r7, r6, r3, r8)
            enrr r0 = (defpackage.enrr) r0
            r0.q(r2)
            cqiy r0 = r11.b
            java.util.concurrent.atomic.AtomicReference r0 = r0.h
            r0.set(r5)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqit.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cqit cqitVar = new cqit(ffguVar, this.b, this.c);
        cqitVar.d = obj;
        return cqitVar;
    }
}
