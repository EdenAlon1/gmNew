package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aljx implements alju {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/analytics/rcs/RcsCujDataLoggerImpl");
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;
    private final AtomicBoolean g;

    public aljx(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.e = ffbrVar4;
        this.f = ffbrVar5;
        this.g = new AtomicBoolean(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x009e, code lost:
    
        if (r8 != r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007e, code lost:
    
        if (r8.b(r9, r0) == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.alju
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r8, defpackage.ffgu r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.aljw
            if (r0 == 0) goto L13
            r0 = r9
            aljw r0 = (defpackage.aljw) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aljw r0 = new aljw
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L48
            if (r2 == r5) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            defpackage.ffci.b(r9)
            goto La0
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            aljx r8 = r0.d
            defpackage.ffci.b(r9)
            goto L80
        L3c:
            int r8 = r0.e
            aljx r2 = r0.d
            defpackage.ffci.b(r9)
            r6 = r9
            r9 = r8
            r8 = r2
            r2 = r6
            goto L62
        L48:
            defpackage.ffci.b(r9)
            ffbr r9 = r7.e
            java.lang.Object r9 = r9.b()
            alka r9 = (defpackage.alka) r9
            r0.d = r7
            r0.e = r8
            r0.c = r5
            java.lang.Object r9 = r9.a(r0)
            if (r9 == r1) goto Lbe
            r2 = r9
            r9 = r8
            r8 = r7
        L62:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L6b
            goto Lbb
        L6b:
            java.util.concurrent.atomic.AtomicBoolean r2 = r8.g
            boolean r2 = r2.getAndSet(r5)
            if (r2 != 0) goto Lbb
            r0.d = r8
            r2 = 0
            r0.e = r2
            r0.c = r4
            java.lang.Object r9 = r8.b(r9, r0)
            if (r9 == r1) goto Lbe
        L80:
            ffbr r8 = r8.e
            java.lang.Object r8 = r8.b()
            alka r8 = (defpackage.alka) r8
            r9 = 0
            r0.d = r9
            r0.c = r3
            lap r8 = r8.a
            aljz r2 = new aljz
            r2.<init>(r9)
            java.lang.Object r8 = r8.a(r2, r0)
            ffhh r9 = defpackage.ffhh.a
            if (r8 == r9) goto L9e
            ffcu r8 = defpackage.ffcu.a
        L9e:
            if (r8 == r1) goto Lbe
        La0:
            enru r8 = defpackage.aljx.a
            java.util.logging.Level r9 = java.util.logging.Level.INFO
            enrr r8 = r8.a(r9)
            java.lang.String r9 = "logRcsAvailabilityForAllSimsIfNotLoggedBefore"
            r0 = 49
            java.lang.String r1 = "com/google/android/apps/messaging/shared/analytics/rcs/RcsCujDataLoggerImpl"
            java.lang.String r2 = "RcsCujDataLoggerImpl.kt"
            ensk r8 = r8.h(r1, r9, r0, r2)
            enrr r8 = (defpackage.enrr) r8
            java.lang.String r9 = "RCS availability logged for all sims."
            r8.q(r9)
        Lbb:
            ffcu r8 = defpackage.ffcu.a
            return r8
        Lbe:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aljx.a(int, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(int r13, defpackage.ffgu r14) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aljx.b(int, ffgu):java.lang.Object");
    }
}
