package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdgk {
    public static final cskc a = cskc.g("BugleCms", "DeadLetterQueuePersister");
    public final ffhd b;
    public final ffbr c;
    private final axdf d;
    private final cfyt e;
    private final asjt f;
    private final asih g;
    private final cbwj h;

    public cdgk(cbwj cbwjVar, axdf axdfVar, cfyt cfytVar, asjt asjtVar, asih asihVar, ffhd ffhdVar, ffbr ffbrVar) {
        cbwjVar.getClass();
        axdfVar.getClass();
        cfytVar.getClass();
        asjtVar.getClass();
        asihVar.getClass();
        ffhdVar.getClass();
        ffbrVar.getClass();
        this.h = cbwjVar;
        this.d = axdfVar;
        this.e = cfytVar;
        this.f = asjtVar;
        this.g = asihVar;
        this.b = ffhdVar;
        this.c = ffbrVar;
    }

    private final Object c(eyfq eyfqVar, cdgt[] cdgtVarArr, ffjm ffjmVar) {
        Object a2;
        try {
            for (cdgt cdgtVar : cdgtVarArr) {
                ffjmVar.a(cdgtVar, eyfqVar);
            }
            a2 = eyfqVar.build();
        } catch (Throwable th) {
            a2 = ffci.a(th);
        }
        Throwable c = ffch.c(a2);
        if (c != null) {
            if (!(c instanceof cdgs)) {
                throw c;
            }
            a2 = null;
        }
        ffci.b(a2);
        return a2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(final java.lang.String r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.cdge
            if (r0 == 0) goto L13
            r0 = r7
            cdge r0 = (defpackage.cdge) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cdge r0 = new cdge
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            fflb r6 = r0.d
            defpackage.ffci.b(r7)
            goto L5b
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.ffci.b(r7)
            fflb r7 = new fflb
            r7.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r7.a = r2
            cbwj r2 = r5.h
            cdga r4 = new cdga
            r4.<init>()
            java.lang.String r6 = "DeadLetterQueuePersister#deleteDlqRowById"
            elfl r6 = r2.b(r6, r4)
            r6.getClass()
            r0.d = r7
            r0.c = r3
            java.lang.Object r6 = defpackage.fgfz.c(r6, r0)
            if (r6 == r1) goto L5e
            r6 = r7
        L5b:
            java.lang.Object r6 = r6.a
            return r6
        L5e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdgk.a(java.lang.String, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a4, code lost:
    
        if (defpackage.fgfz.c(r2, r0) != r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008c A[Catch: Exception -> 0x00a8, TryCatch #2 {Exception -> 0x00a8, blocks: (B:39:0x0084, B:41:0x008c, B:43:0x0092), top: B:38:0x0084 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0092 A[Catch: Exception -> 0x00a8, TRY_LEAVE, TryCatch #2 {Exception -> 0x00a8, blocks: (B:39:0x0084, B:41:0x008c, B:43:0x0092), top: B:38:0x0084 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(boolean r10, defpackage.cdgt[] r11, defpackage.ffgu r12) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdgk.b(boolean, cdgt[], ffgu):java.lang.Object");
    }
}
