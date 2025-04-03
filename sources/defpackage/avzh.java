package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.rcs.client.messaging.data.ContentType;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avzh implements awab {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/FileTransferProcessor");
    private final akzt A;
    private final atwq B;
    private final awcm C;
    public final ffsk b;
    public final awcz c;
    public final ffbr d;
    public final ctap e;
    public final ConcurrentMap f;
    public final dtuu g;
    public final ctax h;
    public final ffbr i;
    public final awco j;
    public final ffbr k;
    public final csuu l;
    private final ffhd m;
    private final ffhd n;
    private final awaw o;
    private final avyg p;
    private final awce q;
    private final awbd r;
    private final awbq s;
    private final avyk t;
    private final awaj u;
    private final cqoh v;
    private final ffbr w;
    private final cqps x;
    private final cbar y;
    private final atwx z;

    public avzh(ffsk ffskVar, ffsk ffskVar2, ffhd ffhdVar, ffhd ffhdVar2, awaw awawVar, avyg avygVar, awcm awcmVar, awce awceVar, awbd awbdVar, awbq awbqVar, avyk avykVar, awaj awajVar, awcz awczVar, ffbr ffbrVar, ctap ctapVar, cqoh cqohVar, ConcurrentMap concurrentMap, dtuu dtuuVar, ctax ctaxVar, ffbr ffbrVar2, awco awcoVar, ffbr ffbrVar3, ffbr ffbrVar4, cqps cqpsVar, cbar cbarVar, atwx atwxVar, akzt akztVar, csuu csuuVar, asmp asmpVar, atwq atwqVar) {
        ffskVar.getClass();
        ffskVar2.getClass();
        ffhdVar.getClass();
        ffhdVar2.getClass();
        awczVar.getClass();
        ffbrVar.getClass();
        ctapVar.getClass();
        cqohVar.getClass();
        concurrentMap.getClass();
        dtuuVar.getClass();
        ctaxVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        cqpsVar.getClass();
        cbarVar.getClass();
        atwxVar.getClass();
        akztVar.getClass();
        csuuVar.getClass();
        asmpVar.getClass();
        this.b = ffskVar;
        this.m = ffhdVar;
        this.n = ffhdVar2;
        this.o = awawVar;
        this.p = avygVar;
        this.C = awcmVar;
        this.q = awceVar;
        this.r = awbdVar;
        this.s = awbqVar;
        this.t = avykVar;
        this.u = awajVar;
        this.c = awczVar;
        this.d = ffbrVar;
        this.e = ctapVar;
        this.v = cqohVar;
        this.f = concurrentMap;
        this.g = dtuuVar;
        this.h = ctaxVar;
        this.i = ffbrVar2;
        this.j = awcoVar;
        this.w = ffbrVar3;
        this.k = ffbrVar4;
        this.x = cqpsVar;
        this.y = cbarVar;
        this.z = atwxVar;
        this.A = akztVar;
        this.l = csuuVar;
        this.B = atwqVar;
    }

    static /* synthetic */ Object n(avzh avzhVar, awai awaiVar, long j, boolean z, boolean z2, boolean z3, ffgu ffguVar) {
        return avzhVar.b(awaiVar, j, z, z2, z3, false, "video/avc", ffguVar);
    }

    private final Object o(MessagePartCoreData messagePartCoreData, ffgu ffguVar) {
        if (!messagePartCoreData.bu() || messagePartCoreData.V() == null) {
            return false;
        }
        if (messagePartCoreData.bo()) {
            String V = messagePartCoreData.V();
            V.getClass();
            ContentType e = awuq.e(V);
            ensk h = a.h();
            h.Y(ente.a, "BugleFileTransfer");
            ((enrr) h.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/FileTransferProcessor", "shouldResizeMessagePart", 729, "FileTransferProcessor.kt")).D("Original content type: %s. Resolved content type: %s", messagePartCoreData.V(), e);
            return l(e, ffguVar);
        }
        if (messagePartCoreData.bD()) {
            Uri t = messagePartCoreData.t();
            t.getClass();
            return p(t, ffguVar);
        }
        ensk j = a.j();
        j.Y(ente.a, "BugleFileTransfer");
        ((enrr) j.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/FileTransferProcessor", "shouldResizeMessagePart", 739, "FileTransferProcessor.kt")).q("Attachment is neither image nor video so no resizing.");
        return false;
    }

    private final Object p(Uri uri, ffgu ffguVar) {
        return ffra.a(this.m, new avzb(this, uri, null), ffguVar);
    }

    private final void q(awat awatVar, awai awaiVar, awbj awbjVar) {
        this.A.c("Bugle.FileProcessing.Starts");
        ensk h = a.h();
        h.Y(ente.a, "BugleFileTransfer");
        enrr enrrVar = (enrr) h;
        ensn ensnVar = cqpo.j;
        awap awapVar = awaiVar.b;
        enrrVar.Y(ensnVar, awapVar);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/FileTransferProcessor", "startPipeline", 171, "FileTransferProcessor.kt")).J("Adding processing pipeline to in progress map. Processing request: contentUri = %s, contentType = %s, encryptionProtocol = %s.", awbjVar.a, awbjVar.b, Long.valueOf(cfmg.a(awbjVar.j)));
        ffhe ffheVar = ffhe.a;
        ffsm ffsmVar = ffsm.a;
        this.f.put(awapVar, new awan(awatVar, awaiVar, ffra.b(this.b, ekxi.a(ffheVar), ffsmVar, new avzc(null, awaiVar, awapVar, this, awatVar, awbjVar))));
    }

    private final boolean r(MessageCoreData messageCoreData) {
        if (((ersq) ((atvf) this.B).a.b()).a("bugle.disable_sending_already_processed_messages")) {
            int[] dm = MessageData.dm();
            int k = messageCoreData.k();
            int i = 0;
            while (true) {
                if (i >= 5) {
                    break;
                }
                if (k != dm[i]) {
                    i++;
                } else if (i >= 0) {
                    ensk j = a.j();
                    j.Y(ente.a, "BugleFileTransfer");
                    enrr enrrVar = (enrr) j;
                    enrrVar.aa(ensy.MEDIUM);
                    enrrVar.Y(csux.b, messageCoreData.B());
                    ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/FileTransferProcessor", "isMessageInSuccessfulOutgoingStatus", 775, "FileTransferProcessor.kt")).r("The message was already marked with one of the successful statuses (status = %s). Skipping processing.", messageCoreData.k());
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.awab
    public final Object a(awap awapVar, ffgu ffguVar) {
        awan awanVar = (awan) this.f.get(awapVar);
        if (awanVar == null) {
            ensk h = a.h();
            h.Y(ente.a, "BugleFileTransfer");
            enrr enrrVar = (enrr) h;
            enrrVar.Y(cqpo.j, awapVar);
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/FileTransferProcessor", "cancelProcessing", 672, "FileTransferProcessor.kt")).q("Processing id missing from map while cancelling processing.");
            return ffcu.a;
        }
        ensk h2 = a.h();
        h2.Y(ente.a, "BugleFileTransfer");
        enrr enrrVar2 = (enrr) h2;
        enrrVar2.Y(cqpo.j, awapVar);
        ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/FileTransferProcessor", "cancelProcessing", 675, "FileTransferProcessor.kt")).q("Cancelling processing.");
        Object a2 = ffra.a(ekxi.a(this.m), new avyl(null, awanVar, this, awapVar), ffguVar);
        return a2 == ffhh.a ? a2 : ffcu.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r12v5, types: [fazb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [fazb, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.awai r21, long r22, boolean r24, boolean r25, boolean r26, boolean r27, java.lang.String r28, defpackage.ffgu r29) {
        /*
            Method dump skipped, instructions count: 699
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avzh.b(awai, long, boolean, boolean, boolean, boolean, java.lang.String, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.google.android.rcs.client.messaging.data.ContentType r6, android.net.Uri r7, defpackage.ffgu r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.avyp
            if (r0 == 0) goto L13
            r0 = r8
            avyp r0 = (defpackage.avyp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            avyp r0 = new avyp
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r8)
            goto L60
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.ffci.b(r8)
            java.lang.String r8 = r6.toString()
            boolean r8 = defpackage.le.A(r8)
            if (r8 == 0) goto L41
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        L41:
            java.lang.String r8 = r6.toString()
            boolean r8 = defpackage.le.n(r8)
            if (r8 == 0) goto L6c
            ffhd r8 = r5.m
            ffhd r8 = defpackage.ekxi.a(r8)
            avyo r2 = new avyo
            r4 = 0
            r2.<init>(r4, r5, r6, r7)
            r0.c = r3
            java.lang.Object r8 = defpackage.ffra.a(r8, r2, r0)
            if (r8 != r1) goto L60
            return r1
        L60:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r6 = r8.booleanValue()
            r6 = r6 ^ r3
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        L6c:
            r6 = 0
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avzh.c(com.google.android.rcs.client.messaging.data.ContentType, android.net.Uri, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r8, defpackage.ffgu r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.avyr
            if (r0 == 0) goto L13
            r0 = r9
            avyr r0 = (defpackage.avyr) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            avyr r0 = new avyr
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            java.lang.Object r8 = r0.a
            defpackage.ffci.b(r9)
            goto L59
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            defpackage.ffci.b(r9)
            cqoh r9 = r7.v
            j$.time.Instant r9 = r9.f()
            long r5 = r9.toEpochMilli()
            cqtk r9 = defpackage.cqtk.UPLOAD
            r8.aW(r5, r9)
            ffhd r9 = r7.n
            ffhd r9 = defpackage.ekxi.a(r9)
            avyq r2 = new avyq
            r2.<init>(r4, r7, r8)
            r0.a = r8
            r0.d = r3
            java.lang.Object r9 = defpackage.ffra.a(r9, r2, r0)
            if (r9 == r1) goto Ld1
        L59:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            java.lang.String r0 = "markMessageInProgress"
            java.lang.String r1 = "com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/FileTransferProcessor"
            java.lang.String r2 = "FileTransferProcessor.kt"
            java.lang.String r3 = "BugleFileTransfer"
            if (r9 == 0) goto L9c
            enru r9 = defpackage.avzh.a
            ensk r9 = r9.h()
            ensn r5 = defpackage.ente.a
            r9.Y(r5, r3)
            enrr r9 = (defpackage.enrr) r9
            ensn r3 = defpackage.csux.b
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r5 = r8.B()
            r9.Y(r3, r5)
            ensn r3 = defpackage.cqpo.j
            com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData r8 = r8.G()
            if (r8 == 0) goto L8b
            awap r4 = r8.z()
        L8b:
            r9.Y(r3, r4)
            r8 = 432(0x1b0, float:6.05E-43)
            ensk r8 = r9.h(r1, r0, r8, r2)
            enrr r8 = (defpackage.enrr) r8
            java.lang.String r9 = "File transfer starting. Marked message in progress."
            r8.q(r9)
            goto Lce
        L9c:
            enru r9 = defpackage.avzh.a
            ensk r9 = r9.j()
            ensn r5 = defpackage.ente.a
            r9.Y(r5, r3)
            enrr r9 = (defpackage.enrr) r9
            ensn r3 = defpackage.csux.b
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r5 = r8.B()
            r9.Y(r3, r5)
            ensn r3 = defpackage.cqpo.j
            com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData r8 = r8.G()
            if (r8 == 0) goto Lbe
            awap r4 = r8.z()
        Lbe:
            r9.Y(r3, r4)
            r8 = 438(0x1b6, float:6.14E-43)
            ensk r8 = r9.h(r1, r0, r8, r2)
            enrr r8 = (defpackage.enrr) r8
            java.lang.String r9 = "File transfer starting. Failed to mark message in progress."
            r8.q(r9)
        Lce:
            ffcu r8 = defpackage.ffcu.a
            return r8
        Ld1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avzh.d(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a6, code lost:
    
        if (defpackage.fgfz.c(r6, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.awab
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.awap r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.avys
            if (r0 == 0) goto L13
            r0 = r7
            avys r0 = (defpackage.avys) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            avys r0 = new avys
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            defpackage.ffci.b(r7)
            goto La9
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            awan r6 = r0.f
            awap r2 = r0.e
            avzh r4 = r0.d
            defpackage.ffci.b(r7)
            goto L88
        L3d:
            defpackage.ffci.b(r7)
            java.util.concurrent.ConcurrentMap r7 = r5.f
            java.lang.Object r7 = r7.get(r6)
            awan r7 = (defpackage.awan) r7
            if (r7 != 0) goto L74
            enru r7 = defpackage.avzh.a
            ensk r7 = r7.j()
            ensn r0 = defpackage.ente.a
            java.lang.String r1 = "BugleFileTransfer"
            r7.Y(r0, r1)
            enrr r7 = (defpackage.enrr) r7
            ensn r0 = defpackage.cqpo.j
            r7.Y(r0, r6)
            java.lang.String r6 = "pauseProcessing"
            r0 = 448(0x1c0, float:6.28E-43)
            java.lang.String r1 = "com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/FileTransferProcessor"
            java.lang.String r2 = "FileTransferProcessor.kt"
            ensk r6 = r7.h(r1, r6, r0, r2)
            enrr r6 = (defpackage.enrr) r6
            java.lang.String r7 = "Processing id missing from map while pausing processing."
            r6.q(r7)
            ffcu r6 = defpackage.ffcu.a
            return r6
        L74:
            r0.d = r5
            r0.e = r6
            r0.f = r7
            r0.c = r4
            awat r2 = r7.a
            java.lang.Object r2 = r2.e(r0)
            if (r2 != r1) goto L85
            goto La8
        L85:
            r4 = r5
            r2 = r6
            r6 = r7
        L88:
            awai r6 = r6.b
            com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r6 = r6.a()
            if (r6 == 0) goto La9
            cqps r7 = r4.x
            elfl r6 = r7.c(r2, r6)
            r6.getClass()
            r7 = 0
            r0.d = r7
            r0.e = r7
            r0.f = r7
            r0.c = r3
            java.lang.Object r6 = defpackage.fgfz.c(r6, r0)
            if (r6 != r1) goto La9
        La8:
            return r1
        La9:
            ffcu r6 = defpackage.ffcu.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avzh.e(awap, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x009a, code lost:
    
        if (defpackage.fgfz.c(r8, r0) != r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0080, code lost:
    
        if (r10.a.e(r0) == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.awab
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.awap r8, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r9, defpackage.ffgu r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.avyt
            if (r0 == 0) goto L13
            r0 = r10
            avyt r0 = (defpackage.avyt) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            avyt r0 = new avyt
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            defpackage.ffci.b(r10)
            goto L9d
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            java.lang.Object r9 = r0.a
            awap r8 = r0.f
            avzh r2 = r0.e
            defpackage.ffci.b(r10)
            goto L84
        L3d:
            defpackage.ffci.b(r10)
            java.util.concurrent.ConcurrentMap r10 = r7.f
            java.lang.Object r10 = r10.get(r8)
            awan r10 = (defpackage.awan) r10
            if (r10 != 0) goto L72
            enru r10 = defpackage.avzh.a
            ensk r10 = r10.j()
            ensn r2 = defpackage.ente.a
            java.lang.String r4 = "BugleFileTransfer"
            r10.Y(r2, r4)
            enrr r10 = (defpackage.enrr) r10
            ensn r2 = defpackage.cqpo.j
            r10.Y(r2, r8)
            java.lang.String r2 = "pauseProcessing"
            r4 = 468(0x1d4, float:6.56E-43)
            java.lang.String r5 = "com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/FileTransferProcessor"
            java.lang.String r6 = "FileTransferProcessor.kt"
            ensk r10 = r10.h(r5, r2, r4, r6)
            enrr r10 = (defpackage.enrr) r10
            java.lang.String r2 = "Processing id missing from map while pausing processing."
            r10.q(r2)
            goto L83
        L72:
            r0.e = r7
            r0.f = r8
            r0.a = r9
            r0.d = r4
            awat r10 = r10.a
            java.lang.Object r10 = r10.e(r0)
            if (r10 != r1) goto L83
            goto L9c
        L83:
            r2 = r7
        L84:
            cqps r10 = r2.x
            elfl r8 = r10.c(r8, r9)
            r8.getClass()
            r9 = 0
            r0.e = r9
            r0.f = r9
            r0.a = r9
            r0.d = r3
            java.lang.Object r8 = defpackage.fgfz.c(r8, r0)
            if (r8 != r1) goto L9d
        L9c:
            return r1
        L9d:
            ffcu r8 = defpackage.ffcu.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avzh.f(awap, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.awas r33, defpackage.ffgu r34) {
        /*
            Method dump skipped, instructions count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avzh.g(awas, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x016a, code lost:
    
        if (r5.i(r2, r1, 0, r11) != r3) goto L73;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // defpackage.awab
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r20, defpackage.ffgu r21) {
        /*
            Method dump skipped, instructions count: 900
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avzh.h(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.awap r29, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r30, int r31, defpackage.ffgu r32) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avzh.i(awap, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, int, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
    
        if (r2.k(r7, r8, r9, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.awab
    @defpackage.ffbs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.awap r7, int r8, defpackage.ffgu r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.avyy
            if (r0 == 0) goto L13
            r0 = r9
            avyy r0 = (defpackage.avyy) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            avyy r0 = new avyy
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            defpackage.ffci.b(r9)
            goto L6b
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            int r8 = r0.a
            awap r7 = r0.f
            avzh r2 = r0.e
            defpackage.ffci.b(r9)
            goto L5a
        L3d:
            defpackage.ffci.b(r9)
            ffhd r9 = r6.n
            ffhd r9 = defpackage.ekxi.a(r9)
            avyx r2 = new avyx
            r2.<init>(r5, r6, r7)
            r0.e = r6
            r0.f = r7
            r0.a = r8
            r0.d = r4
            java.lang.Object r9 = defpackage.ffra.a(r9, r2, r0)
            if (r9 == r1) goto L7c
            r2 = r6
        L5a:
            com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r9 = (com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData) r9
            if (r9 == 0) goto L6e
            r0.e = r5
            r0.f = r5
            r0.d = r3
            java.lang.Object r7 = r2.k(r7, r8, r9, r0)
            if (r7 != r1) goto L6b
            goto L7c
        L6b:
            ffcu r7 = defpackage.ffcu.a
            return r7
        L6e:
            java.lang.String r8 = "MessageCoreData is null for "
            java.lang.String r9 = "."
            java.lang.String r7 = defpackage.a.i(r7, r8, r9)
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r7)
            throw r8
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avzh.j(awap, int, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x029f, code lost:
    
        if (r7.i(r6, r2, r1, r4) != r5) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0263, code lost:
    
        if (defpackage.ffcu.a == r5) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b5, code lost:
    
        if (h(r2, r4) == r5) goto L76;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.awap r29, int r30, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r31, defpackage.ffgu r32) {
        /*
            Method dump skipped, instructions count: 696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avzh.k(awap, int, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(com.google.android.rcs.client.messaging.data.ContentType r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.avza
            if (r0 == 0) goto L13
            r0 = r7
            avza r0 = (defpackage.avza) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            avza r0 = new avza
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.google.android.rcs.client.messaging.data.AutoValue_ContentType r6 = r0.d
            defpackage.ffci.b(r7)
            goto L49
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.ffci.b(r7)
            r7 = r6
            com.google.android.rcs.client.messaging.data.AutoValue_ContentType r7 = (com.google.android.rcs.client.messaging.data.AutoValue_ContentType) r7
            r0.d = r7
            r0.c = r3
            ffhd r7 = r5.m
            avyn r2 = new avyn
            r4 = 0
            r2.<init>(r5, r4)
            java.lang.Object r7 = defpackage.ffra.a(r7, r2, r0)
            if (r7 == r1) goto L65
        L49:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r0 = 0
            if (r7 == 0) goto L5f
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "image/png"
            boolean r6 = r7.equals(r6)
            if (r6 != 0) goto L5f
            goto L60
        L5f:
            r3 = r0
        L60:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        L65:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avzh.l(com.google.android.rcs.client.messaging.data.ContentType, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData r8, defpackage.awap r9, defpackage.byyz r10, defpackage.ffgu r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof defpackage.avzf
            if (r0 == 0) goto L13
            r0 = r11
            avzf r0 = (defpackage.avzf) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            avzf r0 = new avzf
            r0.<init>(r7, r11)
        L18:
            java.lang.Object r11 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            awap r9 = r0.e
            java.lang.Object r8 = r0.a
            defpackage.ffci.b(r11)
            goto L9b
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            defpackage.ffci.b(r11)
            java.lang.String[] r11 = com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable.a
            bwdi r11 = new bwdi
            r11.<init>()
            java.lang.String r2 = "FileTransferProcessor#updateMessagePart"
            r11.ap(r2)
            java.lang.Integer r2 = com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable.e()
            int r2 = r2.intValue()
            java.lang.Integer r4 = com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable.e()
            int r4 = r4.intValue()
            r5 = 60080(0xeab0, float:8.419E-41)
            java.lang.String r6 = "processing_id"
            if (r4 >= r5) goto L5c
            defpackage.dtub.w(r6, r4)
        L5c:
            if (r2 < r5) goto L6f
            if (r9 != 0) goto L66
            android.content.ContentValues r2 = r11.a
            r2.putNull(r6)
            goto L6f
        L66:
            android.content.ContentValues r2 = r11.a
            java.lang.String r4 = defpackage.awao.b(r9)
            r2.put(r6, r4)
        L6f:
            bwdm r2 = new bwdm
            r2.<init>()
            java.lang.String r4 = r8.aa()
            r2.j(r4)
            r11.C(r2)
            if (r10 == 0) goto L83
            r11.q(r10)
        L83:
            ffhd r10 = r7.n
            ffhd r10 = defpackage.ekxi.a(r10)
            avze r2 = new avze
            r4 = 0
            r2.<init>(r4, r7, r11)
            r0.a = r8
            r0.e = r9
            r0.d = r3
            java.lang.Object r11 = defpackage.ffra.a(r10, r2, r0)
            if (r11 == r1) goto Ld9
        L9b:
            java.lang.Integer r11 = (java.lang.Integer) r11
            if (r11 != 0) goto La0
            goto Ld6
        La0:
            int r10 = r11.intValue()
            if (r10 != 0) goto Ld6
            enru r10 = defpackage.avzh.a
            ensk r10 = r10.j()
            ensn r11 = defpackage.ente.a
            java.lang.String r0 = "BugleFileTransfer"
            r10.Y(r11, r0)
            enrr r10 = (defpackage.enrr) r10
            ensn r11 = defpackage.csux.b
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r8 = r8.B()
            r10.Y(r11, r8)
            ensn r8 = defpackage.cqpo.j
            r10.Y(r8, r9)
            java.lang.String r8 = "updateMessagePart"
            r9 = 417(0x1a1, float:5.84E-43)
            java.lang.String r11 = "com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/FileTransferProcessor"
            java.lang.String r0 = "FileTransferProcessor.kt"
            ensk r8 = r10.h(r11, r8, r9, r0)
            enrr r8 = (defpackage.enrr) r8
            java.lang.String r9 = "Failed to update processing id for message part."
            r8.q(r9)
        Ld6:
            ffcu r8 = defpackage.ffcu.a
            return r8
        Ld9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avzh.m(com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData, awap, byyz, ffgu):java.lang.Object");
    }
}
