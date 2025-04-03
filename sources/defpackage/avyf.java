package defpackage;

import android.content.Context;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.communication.synapse.security.scytale.MediaEncryptor;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avyf implements awat {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/EncryptionStep");
    private final Context b;
    private final fazb c;
    private final csuu d;
    private final awcz e;
    private final awcr f;
    private final int g;

    public avyf(Context context, fazb fazbVar, csuu csuuVar, awcz awczVar, int i) {
        this.b = context;
        this.c = fazbVar;
        this.d = csuuVar;
        this.e = awczVar;
        this.g = i;
        this.f = i == 1 ? awcr.f : awcr.e;
    }

    private static final fayi j(MediaEncryptor mediaEncryptor, ContentType contentType) {
        fayh fayhVar = (fayh) fayi.a.createBuilder();
        fayhVar.getClass();
        eyee x = eyee.x(mediaEncryptor.getKeyMaterial());
        fayhVar.copyOnWrite();
        fayi fayiVar = (fayi) fayhVar.instance;
        fayiVar.b |= 1;
        fayiVar.c = x;
        eyee x2 = eyee.x(mediaEncryptor.getDigest());
        fayhVar.copyOnWrite();
        fayi fayiVar2 = (fayi) fayhVar.instance;
        fayiVar2.b |= 2;
        fayiVar2.d = x2;
        int version = mediaEncryptor.getVersion();
        fayhVar.copyOnWrite();
        fayi fayiVar3 = (fayi) fayhVar.instance;
        fayiVar3.b |= 4;
        fayiVar3.e = version;
        Object fP = new avty().m().fP(contentType);
        fP.getClass();
        fayhVar.copyOnWrite();
        fayi fayiVar4 = (fayi) fayhVar.instance;
        fayiVar4.g = (awup) fP;
        fayiVar4.b |= 16;
        eyfy build = fayhVar.build();
        build.getClass();
        return (fayi) build;
    }

    @Override // defpackage.awat
    public final awcr a() {
        return this.f;
    }

    @Override // defpackage.awat
    public final Object b(ffgu ffguVar) {
        return ffcu.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.awap r14, com.google.communication.synapse.security.scytale.MediaEncryptor r15, android.net.Uri r16, com.google.android.rcs.client.messaging.data.ContentType r17, defpackage.ffgu r18) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avyf.c(awap, com.google.communication.synapse.security.scytale.MediaEncryptor, android.net.Uri, com.google.android.rcs.client.messaging.data.ContentType, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.awap r14, com.google.communication.synapse.security.scytale.MediaEncryptor r15, defpackage.eyee r16, com.google.android.rcs.client.messaging.data.ContentType r17, defpackage.ffgu r18) {
        /*
            r13 = this;
            r1 = r17
            r2 = r18
            boolean r3 = r2 instanceof defpackage.avyd
            if (r3 == 0) goto L17
            r3 = r2
            avyd r3 = (defpackage.avyd) r3
            int r4 = r3.e
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L17
            int r4 = r4 - r5
            r3.e = r4
            goto L1c
        L17:
            avyd r3 = new avyd
            r3.<init>(r13, r2)
        L1c:
            java.lang.Object r2 = r3.c
            ffhh r4 = defpackage.ffhh.a
            int r5 = r3.e
            r6 = 1
            if (r5 == 0) goto L39
            if (r5 != r6) goto L31
            byte[] r14 = r3.f
            java.lang.Object r0 = r3.b
            java.lang.Object r1 = r3.a
            defpackage.ffci.b(r2)
            goto L8a
        L31:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L39:
            defpackage.ffci.b(r2)
            enru r2 = defpackage.avyf.a
            ensk r2 = r2.h()
            ensn r5 = defpackage.ente.a
            java.lang.String r7 = "BugleFileTransfer"
            r2.Y(r5, r7)
            enrr r2 = (defpackage.enrr) r2
            ensn r5 = defpackage.cqpo.j
            r2.Y(r5, r14)
            java.lang.String r5 = "encryptThumbnailOld"
            r7 = 202(0xca, float:2.83E-43)
            java.lang.String r8 = "com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/EncryptionStep"
            java.lang.String r9 = "EncryptionStep.kt"
            ensk r2 = r2.h(r8, r5, r7, r9)
            enrr r2 = (defpackage.enrr) r2
            java.lang.String r5 = "Encrypting thumbnail."
            r2.q(r5)
            byte[] r2 = r16.I()
            com.google.media.webrtc.common.StatusOr r2 = r15.encrypt(r2, r6)
            java.lang.Object r2 = defpackage.cafo.a(r2)
            byte[] r2 = (byte[]) r2
            awcz r5 = r13.e
            fayi r0 = j(r15, r1)
            r7 = r16
            r3.a = r7
            r3.b = r1
            r3.f = r2
            r3.e = r6
            java.lang.Object r14 = r5.l(r14, r0, r3)
            if (r14 == r4) goto Laa
            r0 = r1
            r14 = r2
            r1 = r7
        L8a:
            awbj r2 = new awbj
            com.google.android.rcs.client.messaging.data.ContentType r4 = defpackage.bzpp.a
            eyee r7 = defpackage.eyee.x(r14)
            eyee r1 = (defpackage.eyee) r1
            byte[] r14 = r1.I()
            eyee r8 = defpackage.eyee.x(r14)
            r5 = r0
            com.google.android.rcs.client.messaging.data.ContentType r5 = (com.google.android.rcs.client.messaging.data.ContentType) r5
            r11 = 0
            r12 = 1961(0x7a9, float:2.748E-42)
            r3 = 0
            r6 = 0
            r9 = 0
            r10 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r2
        Laa:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avyf.d(awap, com.google.communication.synapse.security.scytale.MediaEncryptor, eyee, com.google.android.rcs.client.messaging.data.ContentType, ffgu):java.lang.Object");
    }

    @Override // defpackage.awat
    public final Object e(ffgu ffguVar) {
        return ffcu.a;
    }

    @Override // defpackage.awat
    public final Object f(awai awaiVar, awbj awbjVar, ffgu ffguVar) {
        if (this.g != 2 ? awbjVar.e == null || awbjVar.b == null : awbjVar.a == null || awbjVar.b == null) {
            throw new IllegalArgumentException("Invalid input in EncryptionStep.");
        }
        if (awbjVar.b != null) {
            return g(awaiVar, awbjVar, ffguVar);
        }
        throw new IllegalArgumentException("Content type must be present.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0099, code lost:
    
        if (r10 != r0) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.awai r8, defpackage.awbj r9, defpackage.ffgu r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.avye
            if (r0 == 0) goto L13
            r0 = r10
            avye r0 = (defpackage.avye) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            avye r0 = new avye
            r0.<init>(r7, r10)
        L18:
            r6 = r0
            java.lang.Object r10 = r6.a
            ffhh r0 = defpackage.ffhh.a
            int r1 = r6.c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L36
            if (r1 != r2) goto L2e
            awbj r9 = r6.d
            defpackage.ffci.b(r10)
            goto L9b
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            defpackage.ffci.b(r10)
            return r10
        L3a:
            defpackage.ffci.b(r10)
            fazb r10 = r7.c
            r10.b()
            com.google.media.webrtc.common.StatusOr r10 = com.google.communication.synapse.security.scytale.MediaEncryptor.createEncryptorInstance()
            java.lang.Object r10 = defpackage.cafo.a(r10)
            com.google.communication.synapse.security.scytale.MediaEncryptor r10 = (com.google.communication.synapse.security.scytale.MediaEncryptor) r10
            awcp r1 = r8.e
            int r4 = r10.getVersion()
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r4)
            r1.h = r5
            int r1 = r7.g
            if (r1 != r3) goto L7f
            eyee r4 = r9.e
            if (r4 == 0) goto L77
            awap r2 = r8.b
            r10.getClass()
            com.google.android.rcs.client.messaging.data.ContentType r5 = r9.b
            r5.getClass()
            r6.c = r3
            r1 = r7
            r3 = r10
            java.lang.Object r8 = r1.d(r2, r3, r4, r5, r6)
            if (r8 != r0) goto L76
            goto Lb1
        L76:
            return r8
        L77:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Thumbnail bytes must be present."
            r8.<init>(r9)
            throw r8
        L7f:
            r3 = r10
            awap r8 = r8.b
            r3.getClass()
            android.net.Uri r4 = r9.a
            r4.getClass()
            com.google.android.rcs.client.messaging.data.ContentType r5 = r9.b
            r5.getClass()
            r6.d = r9
            r6.c = r2
            r1 = r7
            r2 = r8
            java.lang.Object r10 = r1.c(r2, r3, r4, r5, r6)
            if (r10 == r0) goto Lb1
        L9b:
            awbn r10 = (defpackage.awbn) r10
            boolean r8 = r10 instanceof defpackage.awbj
            if (r8 == 0) goto Lb0
            awbj r10 = (defpackage.awbj) r10
            eyee r8 = r9.e
            eyee r0 = r9.g
            com.google.android.rcs.client.messaging.data.ContentType r1 = r9.f
            com.google.android.rcs.client.messaging.data.ContentType r9 = r9.h
            awbj r8 = defpackage.awbj.a(r10, r8, r1, r0, r9)
            return r8
        Lb0:
            return r10
        Lb1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avyf.g(awai, awbj, ffgu):java.lang.Object");
    }

    @Override // defpackage.awat
    public final /* synthetic */ boolean h() {
        return false;
    }

    @Override // defpackage.awat
    public final /* synthetic */ boolean i() {
        return false;
    }
}
