package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sao extends Exception {
    public final int a;
    public final int b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public sao(int r11, int r12, java.lang.String r13, java.lang.Throwable r14) {
        /*
            r10 = this;
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            java.lang.String r1 = "UNKNOWN"
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r11 == r5) goto L1d
            if (r11 == r4) goto L1a
            if (r11 == r3) goto L17
            if (r11 == r2) goto L14
            r6 = r1
            goto L1f
        L14:
            java.lang.String r6 = "CONNECTION_ERROR"
            goto L1f
        L17:
            java.lang.String r6 = "PREPARATION_ERROR"
            goto L1f
        L1a:
            java.lang.String r6 = "INFERENCE_ERROR"
            goto L1f
        L1d:
            java.lang.String r6 = "DOWNLOAD_ERROR"
        L1f:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r12)
            r8 = 15
            if (r12 == r8) goto L6f
            r8 = 16
            if (r12 == r8) goto L6c
            r8 = 501(0x1f5, float:7.02E-43)
            if (r12 == r8) goto L69
            switch(r12) {
                case 2: goto L66;
                case 3: goto L63;
                case 4: goto L60;
                case 5: goto L5d;
                case 6: goto L5a;
                case 7: goto L57;
                case 8: goto L54;
                case 9: goto L51;
                case 10: goto L4e;
                case 11: goto L4b;
                case 12: goto L48;
                default: goto L32;
            }
        L32:
            switch(r12) {
                case 601: goto L45;
                case 602: goto L42;
                case 603: goto L3f;
                case 604: goto L3c;
                case 605: goto L39;
                case 606: goto L36;
                default: goto L35;
            }
        L35:
            goto L71
        L36:
            java.lang.String r1 = "FEATURE_NOT_FOUND"
            goto L71
        L39:
            java.lang.String r1 = "NULL_BINDING"
            goto L71
        L3c:
            java.lang.String r1 = "NEEDS_SYSTEM_UPDATE"
            goto L71
        L3f:
            java.lang.String r1 = "BINDING_DIED"
            goto L71
        L42:
            java.lang.String r1 = "SERVICE_DISCONNECTED"
            goto L71
        L45:
            java.lang.String r1 = "BINDING_FAILURE"
            goto L71
        L48:
            java.lang.String r1 = "REQUEST_TOO_LARGE"
            goto L71
        L4b:
            java.lang.String r1 = "RESPONSE_PROCESSING_ERROR"
            goto L71
        L4e:
            java.lang.String r1 = "SERVICE_PROCESSING_ERROR"
            goto L71
        L51:
            java.lang.String r1 = "BUSY"
            goto L71
        L54:
            java.lang.String r1 = "NOT_AVAILABLE"
            goto L71
        L57:
            java.lang.String r1 = "CANCELLED"
            goto L71
        L5a:
            java.lang.String r1 = "IPC_ERROR"
            goto L71
        L5d:
            java.lang.String r1 = "COMPUTE_ERROR"
            goto L71
        L60:
            java.lang.String r1 = "REQUEST_PROCESSING_ERROR"
            goto L71
        L63:
            java.lang.String r1 = "BAD_REQUEST"
            goto L71
        L66:
            java.lang.String r1 = "BAD_DATA"
            goto L71
        L69:
            java.lang.String r1 = "NOT_ENOUGH_DISK_SPACE"
            goto L71
        L6c:
            java.lang.String r1 = "NOT_SUPPORTED"
            goto L71
        L6f:
            java.lang.String r1 = "RESPONSE_GENERATION_ERROR"
        L71:
            r8 = 5
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r9 = 0
            r8[r9] = r0
            r8[r5] = r6
            r8[r4] = r7
            r8[r3] = r1
            r8[r2] = r13
            java.lang.String r13 = "AICore failed with error type %s-%s and error code %s-%s: %s"
            java.lang.String r13 = java.lang.String.format(r13, r8)
            r10.<init>(r13, r14)
            r10.a = r11
            r10.b = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sao.<init>(int, int, java.lang.String, java.lang.Throwable):void");
    }
}
