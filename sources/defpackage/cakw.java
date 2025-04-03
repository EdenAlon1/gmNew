package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cakw implements ejuh {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/info/E2eeInfoDataSource");
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final capz g;
    private final ffsk h;
    private final ffhd i;
    private final cqoh j;

    public cakw(ffsk ffskVar, ffhd ffhdVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, cqoh cqohVar, ffbr ffbrVar5, capz capzVar) {
        this.h = ffskVar;
        this.i = ffhdVar;
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.e = ffbrVar4;
        this.j = cqohVar;
        this.f = ffbrVar5;
        this.g = capzVar;
        if ((capzVar.b & 2) == 0) {
            throw new IllegalArgumentException("Fetching e2ee capabilities should not have been triggered without providing self identity.");
        }
    }

    @Override // defpackage.ejuh
    public final erph a() {
        return axol.j(this.h, new cakv(this, null));
    }

    @Override // defpackage.ejuh
    public final /* bridge */ /* synthetic */ ListenableFuture b() {
        elfl c;
        c = axol.c(this.h, ffhe.a, ffsm.a, new cako(this, null));
        return c;
    }

    @Override // defpackage.ejuh
    public final /* bridge */ /* synthetic */ Object c() {
        int i = capp.e;
        return capo.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.util.List r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.cakr
            if (r0 == 0) goto L13
            r0 = r7
            cakr r0 = (defpackage.cakr) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cakr r0 = new cakr
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
            ffhd r7 = r5.i
            ffhd r7 = defpackage.ekxi.a(r7)
            cakq r2 = new cakq
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cakw.d(java.util.List, ffgu):java.lang.Object");
    }

    public final Object e(ffgu ffguVar) {
        capz capzVar = this.g;
        int i = capzVar.c;
        if (i == 2) {
            return ffra.a(ekxi.a(this.i), new caks(null, this), ffguVar);
        }
        if (i != 1) {
            throw new IllegalArgumentException("Request should have either conversationId or a list of MessagingIdentity.");
        }
        eygr eygrVar = ((capy) capzVar.d).b;
        eygrVar.getClass();
        return eygrVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.util.List r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.cakt
            if (r0 == 0) goto L13
            r0 = r7
            cakt r0 = (defpackage.cakt) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cakt r0 = new cakt
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ekzz r6 = r0.d
            defpackage.ffci.b(r7)     // Catch: java.lang.Throwable -> L29
            goto L53
        L29:
            r7 = move-exception
            goto L5f
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            defpackage.ffci.b(r7)
            ffhd r7 = r0.u()
            boolean r7 = defpackage.ekxi.b(r7)
            if (r7 == 0) goto L65
            java.lang.String r7 = "E2eeInfoDataSource#getRegistrations"
            ekzz r7 = defpackage.eleg.f(r7)
            r0.d = r7     // Catch: java.lang.Throwable -> L5b
            r0.c = r3     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r6 = r5.g(r6, r0)     // Catch: java.lang.Throwable -> L5b
            if (r6 == r1) goto L5a
            r4 = r7
            r7 = r6
            r6 = r4
        L53:
            ejug r7 = (defpackage.ejug) r7     // Catch: java.lang.Throwable -> L29
            r0 = 0
            defpackage.ffig.a(r6, r0)
            return r7
        L5a:
            return r1
        L5b:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L5f:
            throw r7     // Catch: java.lang.Throwable -> L60
        L60:
            r0 = move-exception
            defpackage.ffig.a(r6, r7)
            throw r0
        L65:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "TikTok trace may not live through suspension without TikTok provided CoroutineContext"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cakw.f(java.util.List, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0114 A[LOOP:0: B:12:0x010e->B:14:0x0114, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008e A[LOOP:3: B:50:0x0088->B:52:0x008e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r14v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [java.lang.Iterable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.util.List r14, defpackage.ffgu r15) {
        /*
            Method dump skipped, instructions count: 553
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cakw.g(java.util.List, ffgu):java.lang.Object");
    }
}
