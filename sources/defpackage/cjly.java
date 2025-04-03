package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjly implements cjjt {
    private final azei a;
    private final cjjv b;

    public cjly(azei azeiVar) {
        azeiVar.getClass();
        this.a = azeiVar;
        this.b = new cjjv("BroadcastPipelineFailureInterceptor");
    }

    @Override // defpackage.cjjt
    public final cjjv a() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.cjjt
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.cjod r10, defpackage.ffgu r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.cjlw
            if (r0 == 0) goto L13
            r0 = r11
            cjlw r0 = (defpackage.cjlw) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cjlw r0 = new cjlw
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            cjob r10 = r0.d
            defpackage.ffci.b(r11)
            return r10
        L29:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L31:
            defpackage.ffci.b(r11)
            boolean r11 = r10 instanceof defpackage.cjob
            r2 = 0
            java.lang.String r4 = "checkSubjectType"
            java.lang.String r5 = "com/google/android/apps/messaging/shared/pipeline/Interceptor$Companion"
            java.lang.String r6 = "Interceptor.kt"
            java.lang.String r7 = "BuglePipeline"
            if (r11 == 0) goto L6c
            enru r11 = defpackage.cjjs.a
            ensk r11 = r11.h()
            ensn r8 = defpackage.ente.a
            r11.Y(r8, r7)
            r7 = 65
            ensk r11 = r11.h(r5, r4, r7, r6)
            enrr r11 = (defpackage.enrr) r11
            cjjv r4 = r9.b
            int r5 = defpackage.fflc.a
            ffkb r5 = new ffkb
            java.lang.Class<cjob> r6 = defpackage.cjob.class
            r5.<init>(r6)
            java.lang.String r5 = r5.c()
            java.lang.String r6 = "Running Interceptor %s. Subject is expected type %s"
            java.lang.String r4 = r4.a
            r11.D(r6, r4, r5)
            r11 = r10
            goto La3
        L6c:
            enru r11 = defpackage.cjjs.a
            ensk r11 = r11.h()
            ensn r8 = defpackage.ente.a
            r11.Y(r8, r7)
            r7 = 74
            ensk r11 = r11.h(r5, r4, r7, r6)
            enrr r11 = (defpackage.enrr) r11
            cjjv r4 = r9.b
            int r5 = defpackage.fflc.a
            ffkb r5 = new ffkb
            java.lang.Class<cjob> r6 = defpackage.cjob.class
            r5.<init>(r6)
            java.lang.String r5 = r5.c()
            java.lang.Class r6 = r10.getClass()
            ffkb r7 = new ffkb
            r7.<init>(r6)
            java.lang.String r6 = r7.c()
            java.lang.String r7 = "Skipping Interceptor %s. Expected type is %s but received subject of type %s"
            java.lang.String r4 = r4.a
            r11.J(r7, r4, r5, r6)
            r11 = r2
        La3:
            cjob r11 = (defpackage.cjob) r11
            if (r11 != 0) goto La8
            return r10
        La8:
            int r10 = r11.c
            r4 = 3
            if (r10 == r4) goto Lb0
            r4 = 2
            if (r10 != r4) goto Lc1
        Lb0:
            azei r10 = r9.a
            cjlx r4 = new cjlx
            r4.<init>(r11, r2)
            r0.d = r11
            r0.c = r3
            java.lang.Object r10 = r10.b(r4, r0)
            if (r10 == r1) goto Lc2
        Lc1:
            return r11
        Lc2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjly.b(cjod, ffgu):java.lang.Object");
    }
}
