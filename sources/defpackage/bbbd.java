package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bbbd {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/action/WaitForRcsServiceConnectionAsyncAction");
    public final ffsk b;
    private final clws c;
    private final Optional d;

    public bbbd(ffsk ffskVar, clws clwsVar, Optional optional) {
        this.b = ffskVar;
        this.c = clwsVar;
        this.d = optional;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ffgu r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof defpackage.bbay
            if (r0 == 0) goto L13
            r0 = r14
            bbay r0 = (defpackage.bbay) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bbay r0 = new bbay
            r0.<init>(r13, r14)
        L18:
            java.lang.Object r14 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            java.lang.String r3 = "WaitForRcsServiceConnectionAsyncAction.kt"
            r4 = 0
            java.lang.String r5 = "execute"
            java.lang.String r6 = "com/google/android/apps/messaging/shared/datamodel/action/WaitForRcsServiceConnectionAsyncAction"
            java.lang.String r7 = "Bugle"
            r8 = 1
            if (r2 == 0) goto L3d
            if (r2 != r8) goto L35
            ekzz r0 = r0.d
            defpackage.ffci.b(r14)     // Catch: java.lang.Throwable -> L32 defpackage.ffvj -> L8f
            goto L86
        L32:
            r14 = move-exception
            goto Lb4
        L35:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L3d:
            defpackage.ffci.b(r14)
            java.lang.String r14 = "WaitForRcsServiceConnectionAction.executeAction"
            ekzz r14 = defpackage.eleg.f(r14)
            enru r2 = defpackage.bbbd.a     // Catch: java.lang.Throwable -> Lb0
            ensk r2 = r2.g()     // Catch: java.lang.Throwable -> Lb0
            ensn r9 = defpackage.ente.a     // Catch: java.lang.Throwable -> Lb0
            r2.Y(r9, r7)     // Catch: java.lang.Throwable -> Lb0
            r9 = 42
            ensk r2 = r2.h(r6, r5, r9, r3)     // Catch: java.lang.Throwable -> Lb0
            enrr r2 = (defpackage.enrr) r2     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r9 = "Waiting for Rcs services connection"
            r2.q(r9)     // Catch: java.lang.Throwable -> Lb0
            j$.util.Optional r2 = r13.d     // Catch: defpackage.ffvj -> L8e java.lang.Throwable -> Lb0
            java.lang.Long r9 = new java.lang.Long     // Catch: defpackage.ffvj -> L8e java.lang.Throwable -> Lb0
            r10 = 3000(0xbb8, double:1.482E-320)
            r9.<init>(r10)     // Catch: defpackage.ffvj -> L8e java.lang.Throwable -> Lb0
            java.lang.Object r2 = r2.orElse(r9)     // Catch: defpackage.ffvj -> L8e java.lang.Throwable -> Lb0
            r2.getClass()     // Catch: defpackage.ffvj -> L8e java.lang.Throwable -> Lb0
            java.lang.Number r2 = (java.lang.Number) r2     // Catch: defpackage.ffvj -> L8e java.lang.Throwable -> Lb0
            long r9 = r2.longValue()     // Catch: defpackage.ffvj -> L8e java.lang.Throwable -> Lb0
            bbaz r2 = new bbaz     // Catch: defpackage.ffvj -> L8e java.lang.Throwable -> Lb0
            r2.<init>(r13, r4)     // Catch: defpackage.ffvj -> L8e java.lang.Throwable -> Lb0
            r0.d = r14     // Catch: defpackage.ffvj -> L8e java.lang.Throwable -> Lb0
            r0.c = r8     // Catch: defpackage.ffvj -> L8e java.lang.Throwable -> Lb0
            java.lang.Object r0 = defpackage.ffvm.a(r9, r2, r0)     // Catch: defpackage.ffvj -> L8e java.lang.Throwable -> Lb0
            if (r0 == r1) goto L8d
            r12 = r0
            r0 = r14
            r14 = r12
        L86:
            java.lang.Boolean r14 = (java.lang.Boolean) r14     // Catch: java.lang.Throwable -> L32 defpackage.ffvj -> L8f
            boolean r14 = r14.booleanValue()     // Catch: java.lang.Throwable -> L32 defpackage.ffvj -> L8f
            goto La8
        L8d:
            return r1
        L8e:
            r0 = r14
        L8f:
            enru r14 = defpackage.bbbd.a     // Catch: java.lang.Throwable -> L32
            ensk r14 = r14.j()     // Catch: java.lang.Throwable -> L32
            ensn r1 = defpackage.ente.a     // Catch: java.lang.Throwable -> L32
            r14.Y(r1, r7)     // Catch: java.lang.Throwable -> L32
            r1 = 51
            ensk r14 = r14.h(r6, r5, r1, r3)     // Catch: java.lang.Throwable -> L32
            enrr r14 = (defpackage.enrr) r14     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "Waiting for Rcs services connection timed out"
            r14.q(r1)     // Catch: java.lang.Throwable -> L32
            r14 = 0
        La8:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)     // Catch: java.lang.Throwable -> L32
            defpackage.ffig.a(r0, r4)
            return r14
        Lb0:
            r0 = move-exception
            r12 = r0
            r0 = r14
            r14 = r12
        Lb4:
            throw r14     // Catch: java.lang.Throwable -> Lb5
        Lb5:
            r1 = move-exception
            defpackage.ffig.a(r0, r14)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbbd.a(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.bbbb
            if (r0 == 0) goto L13
            r0 = r5
            bbbb r0 = (defpackage.bbbb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bbbb r0 = new bbbb
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            fflb r1 = r0.e
            bbbd r0 = r0.d
            defpackage.ffci.b(r5)     // Catch: java.lang.Throwable -> L2b
            goto L67
        L2b:
            r5 = move-exception
            goto L7a
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            defpackage.ffci.b(r5)
            fflb r5 = new fflb
            r5.<init>()
            r0.d = r4     // Catch: java.lang.Throwable -> L76
            r0.e = r5     // Catch: java.lang.Throwable -> L76
            r0.c = r3     // Catch: java.lang.Throwable -> L76
            ffrh r2 = new ffrh     // Catch: java.lang.Throwable -> L76
            ffgu r0 = defpackage.ffhi.c(r0)     // Catch: java.lang.Throwable -> L76
            r2.<init>(r0, r3)     // Catch: java.lang.Throwable -> L76
            r2.B()     // Catch: java.lang.Throwable -> L76
            bbbc r0 = new bbbc     // Catch: java.lang.Throwable -> L76
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L76
            r5.a = r0     // Catch: java.lang.Throwable -> L76
            clws r0 = r4.c     // Catch: java.lang.Throwable -> L76
            java.lang.Object r3 = r5.a     // Catch: java.lang.Throwable -> L76
            clwr r3 = (defpackage.clwr) r3     // Catch: java.lang.Throwable -> L76
            r0.k(r3)     // Catch: java.lang.Throwable -> L76
            java.lang.Object r0 = r2.m()     // Catch: java.lang.Throwable -> L76
            if (r0 == r1) goto L75
            r0 = r4
            r1 = r5
        L67:
            java.lang.Object r5 = r1.a
            clwr r5 = (defpackage.clwr) r5
            if (r5 == 0) goto L72
            clws r0 = r0.c
            r0.l(r5)
        L72:
            ffcu r5 = defpackage.ffcu.a
            return r5
        L75:
            return r1
        L76:
            r0 = move-exception
            r1 = r5
            r5 = r0
            r0 = r4
        L7a:
            java.lang.Object r1 = r1.a
            clwr r1 = (defpackage.clwr) r1
            if (r1 == 0) goto L85
            clws r0 = r0.c
            r0.l(r1)
        L85:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbbd.b(ffgu):java.lang.Object");
    }
}
