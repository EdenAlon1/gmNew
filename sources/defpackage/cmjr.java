package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmjr implements cmju {
    private final ffhd a;
    private final cqoh b;

    public cmjr(ffhd ffhdVar, cqoh cqohVar) {
        ffhdVar.getClass();
        cqohVar.getClass();
        this.a = ffhdVar;
        this.b = cqohVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.google.android.apps.messaging.shared.api.messaging.MessageId r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.cmjp
            if (r0 == 0) goto L13
            r0 = r7
            cmjp r0 = (defpackage.cmjp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cmjp r0 = new cmjp
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            cmjr r6 = r0.d
            defpackage.ffci.b(r7)
            goto L57
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            defpackage.ffci.b(r7)
            r6.getClass()
            apah r6 = (defpackage.apah) r6
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r6 = r6.c()
            r6.getClass()
            r0.d = r5
            r0.c = r4
            ffhd r7 = r5.a
            ffhd r7 = defpackage.ekxi.a(r7)
            cmjm r2 = new cmjm
            r2.<init>(r3, r6)
            java.lang.Object r7 = defpackage.ffra.a(r7, r2, r0)
            if (r7 == r1) goto L67
            r6 = r5
        L57:
            j$.time.Instant r7 = (j$.time.Instant) r7
            if (r7 == 0) goto L66
            cqoh r6 = r6.b
            j$.time.Instant r6 = r6.f()
            j$.time.Duration r6 = j$.time.Duration.between(r7, r6)
            return r6
        L66:
            return r3
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmjr.a(com.google.android.apps.messaging.shared.api.messaging.MessageId, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.cmju
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.cmjs r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cmjq
            if (r0 == 0) goto L13
            r0 = r6
            cmjq r0 = (defpackage.cmjq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cmjq r0 = new cmjq
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
            com.google.android.apps.messaging.shared.api.messaging.MessageId r5 = r5.a
            r0.c = r3
            java.lang.Object r6 = r4.a(r5, r0)
            if (r6 == r1) goto L7a
        L3c:
            j$.time.Duration r6 = (j$.time.Duration) r6
            if (r6 != 0) goto L42
            j$.time.Duration r6 = j$.time.Duration.ZERO
        L42:
            epwy r5 = defpackage.epwy.a
            eyfq r5 = r5.createBuilder()
            epwx r5 = (defpackage.epwx) r5
            r5.getClass()
            defpackage.eqty.b(r3, r5)
            r6.getClass()
            eyev r6 = defpackage.eykn.a(r6)
            defpackage.eqty.c(r6, r5)
            epxa r6 = defpackage.epxa.a
            eyfq r6 = r6.createBuilder()
            epwz r6 = (defpackage.epwz) r6
            r6.getClass()
            defpackage.eqtz.c(r3, r6)
            defpackage.eqtz.b(r3, r6)
            defpackage.eqtz.d(r3, r6)
            epxa r6 = defpackage.eqtz.a(r6)
            defpackage.eqty.d(r6, r5)
            epwy r5 = defpackage.eqty.a(r5)
            return r5
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmjr.b(cmjs, ffgu):java.lang.Object");
    }
}
