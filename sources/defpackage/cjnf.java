package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjnf implements cjjt {
    private final couo a;
    private final azoq b;
    private final autg c;
    private final atlz d;
    private final cjjv e;

    public cjnf(couo couoVar, azoq azoqVar, autg autgVar, atlz atlzVar, avkr avkrVar) {
        couoVar.getClass();
        azoqVar.getClass();
        autgVar.getClass();
        avkrVar.getClass();
        this.a = couoVar;
        this.b = azoqVar;
        this.c = autgVar;
        this.d = atlzVar;
        this.e = new cjjv("SendChatMessageInterceptor");
    }

    @Override // defpackage.cjjt
    public final cjjv a() {
        return this.e;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(2:10|(1:(5:13|14|15|16|17)(2:20|21))(5:22|23|24|(4:26|15|16|17)|27))(1:28))(4:34|(1:36)(1:51)|37|(1:39)(2:40|(2:42|(3:44|(1:46)|27)(2:47|48))(2:49|50)))|29|(5:31|23|24|(0)|27)(2:32|33)))|55|6|7|(0)(0)|29|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0033, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0124, code lost:
    
        r15 = defpackage.couo.k(r0, r14.a.h, 8);
        r14 = r14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22 */
    @Override // defpackage.cjjt
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.cjod r14, defpackage.ffgu r15) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjnf.b(cjod, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.azsu r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cjne
            if (r0 == 0) goto L13
            r0 = r6
            cjne r0 = (defpackage.cjne) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cjne r0 = new cjne
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r6)
            goto L3c
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.ffci.b(r6)
            azoq r6 = r4.b
            r0.c = r3
            java.lang.Object r6 = r6.c(r5, r0)
            if (r6 == r1) goto L4f
        L3c:
            aoku r6 = (defpackage.aoku) r6
            if (r6 == 0) goto L4d
            j$.util.Optional r5 = r6.e()
            if (r5 == 0) goto L4d
            java.lang.Object r5 = defpackage.fflm.b(r5)
            awui r5 = (defpackage.awui) r5
            return r5
        L4d:
            r5 = 0
            return r5
        L4f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjnf.d(azsu, ffgu):java.lang.Object");
    }
}
