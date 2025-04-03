package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnqs extends dero {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/satelliteapi/incoming/satellitesessionstatenotificationservice/SatelliteSessionStateNotificationServiceImpl");
    private final cnng b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnqs(ffhd ffhdVar, cnng cnngVar) {
        super(ffhdVar);
        ffhdVar.getClass();
        this.b = cnngVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.cntp r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cnqq
            if (r0 == 0) goto L13
            r0 = r6
            cnqq r0 = (defpackage.cnqq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cnqq r0 = new cnqq
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r6)
            return r6
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.ffci.b(r6)
            cnui r6 = r5.c
            if (r6 != 0) goto L38
            cnui r6 = defpackage.cnui.a
        L38:
            int r6 = r6.c
            cnuh r6 = defpackage.cnuh.b(r6)
            if (r6 != 0) goto L42
            cnuh r6 = defpackage.cnuh.UNRECOGNIZED
        L42:
            cnuh r2 = defpackage.cnuh.SESSION_STATUS_UNKNOWN
            if (r6 != r2) goto L73
            io.grpc.Status r6 = io.grpc.Status.e
            cnui r5 = r5.c
            if (r5 != 0) goto L4e
            cnui r5 = defpackage.cnui.a
        L4e:
            int r5 = r5.c
            cnuh r5 = defpackage.cnuh.b(r5)
            if (r5 != 0) goto L58
            cnuh r5 = defpackage.cnuh.UNRECOGNIZED
        L58:
            java.lang.String r5 = r5.name()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r0 = "Failed to process OnReceiveSessionStatusUpdateRequest, invalid session status: "
            java.lang.String r5 = r0.concat(r5)
            io.grpc.Status r5 = r6.withDescription(r5)
            io.grpc.StatusException r5 = r5.asException()
            java.lang.Object r5 = defpackage.ffci.a(r5)
            return r5
        L73:
            cnng r6 = r4.b
            r0.c = r3
            java.lang.Object r5 = r6.b(r5, r0)
            if (r5 != r1) goto L7e
            return r1
        L7e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnqs.b(cntp, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.dero
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.deqw r8, defpackage.ffgu r9) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnqs.c(deqw, ffgu):java.lang.Object");
    }
}
