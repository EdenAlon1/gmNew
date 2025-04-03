package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wmc extends ffhv implements ffjm {
    Object a;
    Object b;
    int c;
    final /* synthetic */ wmd d;
    final /* synthetic */ String e;
    final /* synthetic */ esgx f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wmc(wmd wmdVar, String str, esgx esgxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.d = wmdVar;
        this.e = str;
        this.f = esgxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wmc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0083 A[Catch: all -> 0x0011, TryCatch #1 {all -> 0x0011, blocks: (B:6:0x000d, B:7:0x005c, B:19:0x0079, B:21:0x0083, B:22:0x0084, B:16:0x0089, B:17:0x008b, B:13:0x0090, B:14:0x0096), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0084 A[Catch: all -> 0x0011, TryCatch #1 {all -> 0x0011, blocks: (B:6:0x000d, B:7:0x005c, B:19:0x0079, B:21:0x0083, B:22:0x0084, B:16:0x0089, B:17:0x008b, B:13:0x0090, B:14:0x0096), top: B:2:0x0007 }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v3, types: [ecri, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r12) {
        /*
            r11 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r11.c
            r2 = 0
            java.lang.String r3 = "MagicRewriteRequestToServer"
            if (r1 == 0) goto L1c
            java.lang.Object r0 = r11.b
            java.lang.Object r1 = r11.a
            defpackage.ffci.b(r12)     // Catch: java.lang.Throwable -> L11 java.lang.Exception -> L14 java.util.concurrent.CancellationException -> L16 defpackage.emeb -> L19
            goto L5c
        L11:
            r12 = move-exception
            goto L97
        L14:
            r12 = move-exception
            goto L79
        L16:
            r12 = move-exception
            goto L89
        L19:
            r12 = move-exception
            goto L90
        L1c:
            defpackage.ffci.b(r12)
            wmd r12 = r11.d
            ecrj r12 = r12.a
            ecri r1 = r12.d()
            ecrh r12 = defpackage.ecrh.SUCCESS
            wmd r4 = r11.d     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75 java.util.concurrent.CancellationException -> L85 defpackage.emeb -> L8c
            java.lang.String r5 = r11.e     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75 java.util.concurrent.CancellationException -> L85 defpackage.emeb -> L8c
            esgx r6 = r11.f     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75 java.util.concurrent.CancellationException -> L85 defpackage.emeb -> L8c
            cfup r7 = defpackage.ctjd.bd     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75 java.util.concurrent.CancellationException -> L85 defpackage.emeb -> L8c
            java.lang.Object r7 = r7.e()     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75 java.util.concurrent.CancellationException -> L85 defpackage.emeb -> L8c
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75 java.util.concurrent.CancellationException -> L85 defpackage.emeb -> L8c
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75 java.util.concurrent.CancellationException -> L85 defpackage.emeb -> L8c
            r8 = 1
            r9 = 0
            if (r7 == 0) goto L4e
            ffbr r7 = r4.b     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75 java.util.concurrent.CancellationException -> L85 defpackage.emeb -> L8c
            java.lang.Object r7 = r7.b()     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75 java.util.concurrent.CancellationException -> L85 defpackage.emeb -> L8c
            j$.util.Optional r7 = (j$.util.Optional) r7     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75 java.util.concurrent.CancellationException -> L85 defpackage.emeb -> L8c
            boolean r7 = r7.isPresent()     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75 java.util.concurrent.CancellationException -> L85 defpackage.emeb -> L8c
            if (r7 == 0) goto L4e
            r9 = r8
        L4e:
            r11.a = r1     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75 java.util.concurrent.CancellationException -> L85 defpackage.emeb -> L8c
            r11.b = r12     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75 java.util.concurrent.CancellationException -> L85 defpackage.emeb -> L8c
            r11.c = r8     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75 java.util.concurrent.CancellationException -> L85 defpackage.emeb -> L8c
            java.lang.Object r4 = r4.d(r5, r6, r9, r11)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75 java.util.concurrent.CancellationException -> L85 defpackage.emeb -> L8c
            if (r4 == r0) goto L6f
            r0 = r12
            r12 = r4
        L5c:
            esgu r12 = (defpackage.esgu) r12     // Catch: java.lang.Throwable -> L11 java.lang.Exception -> L14 java.util.concurrent.CancellationException -> L16 defpackage.emeb -> L19
            wmd r4 = r11.d
            ecda r5 = new ecda
            r5.<init>(r3)
            ecrj r3 = r4.a
            ecri r1 = (defpackage.ecri) r1
            ecrh r0 = (defpackage.ecrh) r0
            r3.f(r1, r5, r2, r0)
            return r12
        L6f:
            return r0
        L70:
            r0 = move-exception
            r10 = r0
            r0 = r12
            r12 = r10
            goto L97
        L75:
            r0 = move-exception
            r10 = r0
            r0 = r12
            r12 = r10
        L79:
            ecrh r0 = defpackage.ecrh.ERROR     // Catch: java.lang.Throwable -> L11
            febj r4 = defpackage.aiyg.a     // Catch: java.lang.Throwable -> L11
            aizl r4 = defpackage.aiyg.a(r12)     // Catch: java.lang.Throwable -> L11
            if (r4 == 0) goto L84
            throw r4     // Catch: java.lang.Throwable -> L11
        L84:
            throw r12     // Catch: java.lang.Throwable -> L11
        L85:
            r0 = move-exception
            r10 = r0
            r0 = r12
            r12 = r10
        L89:
            ecrh r0 = defpackage.ecrh.CANCEL     // Catch: java.lang.Throwable -> L11
            throw r12     // Catch: java.lang.Throwable -> L11
        L8c:
            r0 = move-exception
            r10 = r0
            r0 = r12
            r12 = r10
        L90:
            ecrh r0 = defpackage.ecrh.ERROR     // Catch: java.lang.Throwable -> L11
            java.lang.Exception r12 = defpackage.aiyh.a(r12)     // Catch: java.lang.Throwable -> L11
            throw r12     // Catch: java.lang.Throwable -> L11
        L97:
            wmd r4 = r11.d
            ecda r5 = new ecda
            r5.<init>(r3)
            ecrj r3 = r4.a
            ecri r1 = (defpackage.ecri) r1
            ecrh r0 = (defpackage.ecrh) r0
            r3.f(r1, r5, r2, r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wmc.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new wmc(this.d, this.e, this.f, ffguVar);
    }
}
