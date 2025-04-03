package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awaa implements awab {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/FileTransferProcessorWithRetries");
    public final avzr b;
    public final avzh c;
    private final ffhd d;

    public awaa(ffhd ffhdVar, avzr avzrVar, avzh avzhVar) {
        ffhdVar.getClass();
        this.d = ffhdVar;
        this.b = avzrVar;
        this.c = avzhVar;
    }

    private final Object c(awap awapVar, ffgu ffguVar) {
        Object a2 = ffra.a(ekxi.a(this.d), new avzt(null, this, awapVar), ffguVar);
        return a2 == ffhh.a ? a2 : ffcu.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007e, code lost:
    
        if (r2.c(r9, r0) != r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.awab
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.awap r9, defpackage.ffgu r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.avzs
            if (r0 == 0) goto L13
            r0 = r10
            avzs r0 = (defpackage.avzs) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            avzs r0 = new avzs
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r10)
            goto L81
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L32:
            awap r9 = r0.e
            awaa r2 = r0.d
            defpackage.ffci.b(r10)
            goto L73
        L3a:
            defpackage.ffci.b(r10)
            enru r10 = defpackage.awaa.a
            ensk r10 = r10.h()
            ensn r2 = defpackage.ente.a
            java.lang.String r5 = "BugleFileTransfer"
            r10.Y(r2, r5)
            enrr r10 = (defpackage.enrr) r10
            ensn r2 = defpackage.cqpo.j
            r10.Y(r2, r9)
            java.lang.String r2 = "cancelProcessing"
            r5 = 81
            java.lang.String r6 = "com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/FileTransferProcessorWithRetries"
            java.lang.String r7 = "FileTransferProcessorWithRetries.kt"
            ensk r10 = r10.h(r6, r2, r5, r7)
            enrr r10 = (defpackage.enrr) r10
            java.lang.String r2 = "Cancelling processing and scheduled work item."
            r10.q(r2)
            avzh r10 = r8.c
            r0.d = r8
            r0.e = r9
            r0.c = r4
            java.lang.Object r10 = r10.a(r9, r0)
            if (r10 == r1) goto L84
            r2 = r8
        L73:
            r10 = 0
            r0.d = r10
            r0.e = r10
            r0.c = r3
            java.lang.Object r9 = r2.c(r9, r0)
            if (r9 != r1) goto L81
            goto L84
        L81:
            ffcu r9 = defpackage.ffcu.a
            return r9
        L84:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awaa.a(awap, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.awap r11, defpackage.ffgu r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.avzy
            if (r0 == 0) goto L13
            r0 = r12
            avzy r0 = (defpackage.avzy) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            avzy r0 = new avzy
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            java.lang.String r3 = "queueWorkItem"
            java.lang.String r4 = "com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/FileTransferProcessorWithRetries"
            java.lang.String r5 = "FileTransferProcessorWithRetries.kt"
            java.lang.String r6 = "BugleFileTransfer"
            r7 = 1
            if (r2 == 0) goto L39
            if (r2 != r7) goto L31
            awap r11 = r0.d
            defpackage.ffci.b(r12)
            goto L76
        L31:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L39:
            defpackage.ffci.b(r12)
            java.lang.String r12 = defpackage.awao.b(r11)
            enru r2 = defpackage.awaa.a
            ensk r2 = r2.h()
            ensn r8 = defpackage.ente.a
            r2.Y(r8, r6)
            enrr r2 = (defpackage.enrr) r2
            ensn r8 = defpackage.cqpo.j
            r2.Y(r8, r11)
            r8 = 88
            ensk r2 = r2.h(r4, r3, r8, r5)
            enrr r2 = (defpackage.enrr) r2
            java.lang.String r8 = "Queueing work item."
            r2.q(r8)
            ffhd r2 = r10.d
            ffhd r2 = defpackage.ekxi.a(r2)
            avzx r8 = new avzx
            r9 = 0
            r8.<init>(r9, r10, r12)
            r0.d = r11
            r0.c = r7
            java.lang.Object r12 = defpackage.ffra.a(r2, r8, r0)
            if (r12 != r1) goto L76
            return r1
        L76:
            r12.getClass()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            r12.booleanValue()
            enru r0 = defpackage.awaa.a
            ensk r0 = r0.h()
            ensn r1 = defpackage.ente.a
            r0.Y(r1, r6)
            enrr r0 = (defpackage.enrr) r0
            ensn r1 = defpackage.cqpo.j
            r0.Y(r1, r11)
            r11 = 102(0x66, float:1.43E-43)
            ensk r11 = r0.h(r4, r3, r11, r5)
            enrr r11 = (defpackage.enrr) r11
            java.lang.String r0 = "Queued work item - %s."
            r11.t(r0, r12)
            ffcu r11 = defpackage.ffcu.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awaa.b(awap, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007e, code lost:
    
        if (r2.c(r9, r0) != r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.awab
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.awap r9, defpackage.ffgu r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.avzu
            if (r0 == 0) goto L13
            r0 = r10
            avzu r0 = (defpackage.avzu) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            avzu r0 = new avzu
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r10)
            goto L81
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L32:
            awap r9 = r0.e
            awaa r2 = r0.d
            defpackage.ffci.b(r10)
            goto L73
        L3a:
            defpackage.ffci.b(r10)
            enru r10 = defpackage.awaa.a
            ensk r10 = r10.h()
            ensn r2 = defpackage.ente.a
            java.lang.String r5 = "BugleFileTransfer"
            r10.Y(r2, r5)
            enrr r10 = (defpackage.enrr) r10
            ensn r2 = defpackage.cqpo.j
            r10.Y(r2, r9)
            java.lang.String r2 = "pauseProcessing"
            r5 = 46
            java.lang.String r6 = "com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/FileTransferProcessorWithRetries"
            java.lang.String r7 = "FileTransferProcessorWithRetries.kt"
            ensk r10 = r10.h(r6, r2, r5, r7)
            enrr r10 = (defpackage.enrr) r10
            java.lang.String r2 = "Pausing processing and scheduled work item."
            r10.q(r2)
            avzh r10 = r8.c
            r0.d = r8
            r0.e = r9
            r0.c = r4
            java.lang.Object r10 = r10.e(r9, r0)
            if (r10 == r1) goto L84
            r2 = r8
        L73:
            r10 = 0
            r0.d = r10
            r0.e = r10
            r0.c = r3
            java.lang.Object r9 = r2.c(r9, r0)
            if (r9 != r1) goto L81
            goto L84
        L81:
            ffcu r9 = defpackage.ffcu.a
            return r9
        L84:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awaa.e(awap, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007e, code lost:
    
        if (r10.c(r9, r0) != r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.awab
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.awap r9, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r10, defpackage.ffgu r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.avzv
            if (r0 == 0) goto L13
            r0 = r11
            avzv r0 = (defpackage.avzv) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            avzv r0 = new avzv
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r11)
            goto L81
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L32:
            awap r9 = r0.e
            awaa r10 = r0.d
            defpackage.ffci.b(r11)
            goto L73
        L3a:
            defpackage.ffci.b(r11)
            enru r11 = defpackage.awaa.a
            ensk r11 = r11.h()
            ensn r2 = defpackage.ente.a
            java.lang.String r5 = "BugleFileTransfer"
            r11.Y(r2, r5)
            enrr r11 = (defpackage.enrr) r11
            ensn r2 = defpackage.cqpo.j
            r11.Y(r2, r9)
            java.lang.String r2 = "pauseProcessing"
            r5 = 58
            java.lang.String r6 = "com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/FileTransferProcessorWithRetries"
            java.lang.String r7 = "FileTransferProcessorWithRetries.kt"
            ensk r11 = r11.h(r6, r2, r5, r7)
            enrr r11 = (defpackage.enrr) r11
            java.lang.String r2 = "Pausing processing and scheduled work item."
            r11.q(r2)
            avzh r11 = r8.c
            r0.d = r8
            r0.e = r9
            r0.c = r4
            java.lang.Object r10 = r11.f(r9, r10, r0)
            if (r10 == r1) goto L84
            r10 = r8
        L73:
            r11 = 0
            r0.d = r11
            r0.e = r11
            r0.c = r3
            java.lang.Object r9 = r10.c(r9, r0)
            if (r9 != r1) goto L81
            goto L84
        L81:
            ffcu r9 = defpackage.ffcu.a
            return r9
        L84:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awaa.f(awap, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
    
        if (r2.b(r6, r0) == r1) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.awab
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.avzw
            if (r0 == 0) goto L13
            r0 = r7
            avzw r0 = (defpackage.avzw) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            avzw r0 = new avzw
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r7)
            goto L66
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r6 = r0.a
            awaa r2 = r0.e
            defpackage.ffci.b(r7)
            goto L4c
        L3a:
            defpackage.ffci.b(r7)
            avzh r7 = r5.c
            r0.e = r5
            r0.a = r6
            r0.d = r4
            java.lang.Object r7 = r7.h(r6, r0)
            if (r7 == r1) goto L79
            r2 = r5
        L4c:
            com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData r6 = r6.G()
            if (r6 == 0) goto L71
            awap r6 = r6.z()
            if (r6 == 0) goto L69
            r7 = 0
            r0.e = r7
            r0.a = r7
            r0.d = r3
            java.lang.Object r6 = r2.b(r6, r0)
            if (r6 != r1) goto L66
            goto L79
        L66:
            ffcu r6 = defpackage.ffcu.a
            return r6
        L69:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Processing id is null."
            r6.<init>(r7)
            throw r6
        L71:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Can't process message without attachment."
            r6.<init>(r7)
            throw r6
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awaa.h(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        if (r7.b(r6, r0) != r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.awab
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.awap r6, int r7, defpackage.ffgu r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.avzz
            if (r0 == 0) goto L13
            r0 = r8
            avzz r0 = (defpackage.avzz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            avzz r0 = new avzz
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r8)
            goto L5a
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            awap r6 = r0.e
            awaa r7 = r0.d
            defpackage.ffci.b(r8)
            goto L4c
        L3a:
            defpackage.ffci.b(r8)
            avzh r8 = r5.c
            r0.d = r5
            r0.e = r6
            r0.c = r4
            java.lang.Object r7 = r8.j(r6, r7, r0)
            if (r7 == r1) goto L5d
            r7 = r5
        L4c:
            r8 = 0
            r0.d = r8
            r0.e = r8
            r0.c = r3
            java.lang.Object r6 = r7.b(r6, r0)
            if (r6 != r1) goto L5a
            goto L5d
        L5a:
            ffcu r6 = defpackage.ffcu.a
            return r6
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awaa.j(awap, int, ffgu):java.lang.Object");
    }
}
