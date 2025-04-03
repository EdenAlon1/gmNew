package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awcd implements awat {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/UploadStep");
    private final ffbr b;
    private final crcc c;
    private final cqqb d;
    private final awcz e;
    private final crga f;
    private final awgn g;
    private final ffbr h;
    private final crbq i;
    private final fgjh j;
    private final atwx k;
    private awbs l;
    private final AtomicBoolean m = new AtomicBoolean(false);
    private final awcr n = awcr.g;

    public awcd(ffbr ffbrVar, crcc crccVar, cqqb cqqbVar, awcz awczVar, crga crgaVar, awgn awgnVar, ffbr ffbrVar2, crbq crbqVar, fgjh fgjhVar, atwx atwxVar) {
        this.b = ffbrVar;
        this.c = crccVar;
        this.d = cqqbVar;
        this.e = awczVar;
        this.f = crgaVar;
        this.g = awgnVar;
        this.h = ffbrVar2;
        this.i = crbqVar;
        this.j = fgjhVar;
        this.k = atwxVar;
    }

    private final crbv l(awbj awbjVar) {
        entd entdVar = crbv.h;
        crbf crbfVar = new crbf();
        crbfVar.f("encrypted_file");
        crbfVar.e(awbjVar.a);
        crbfVar.d(awbjVar.b);
        eyee eyeeVar = awbjVar.e;
        if (eyeeVar != null) {
            crbfVar.i(eyeeVar);
            crbfVar.h(awbjVar.f);
        }
        return crbfVar.j();
    }

    @Override // defpackage.awat
    public final awcr a() {
        return this.n;
    }

    @Override // defpackage.awat
    public final Object b(ffgu ffguVar) {
        this.m.set(true);
        Object e = e(ffguVar);
        return e == ffhh.a ? e : ffcu.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.awui r5, defpackage.awap r6, defpackage.ffgu r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.awbx
            if (r0 == 0) goto L13
            r0 = r7
            awbx r0 = (defpackage.awbx) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            awbx r0 = new awbx
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            awap r6 = r0.d
            defpackage.ffci.b(r7)     // Catch: defpackage.esps -> L4e
            goto L4b
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ffci.b(r7)
            ffbr r7 = r4.b     // Catch: defpackage.esps -> L4e
            java.lang.Object r7 = r7.b()     // Catch: defpackage.esps -> L4e
            akkf r7 = (defpackage.akkf) r7     // Catch: defpackage.esps -> L4e
            esph r5 = r7.a(r5)     // Catch: defpackage.esps -> L4e
            r0.d = r6     // Catch: defpackage.esps -> L4e
            r0.c = r3     // Catch: defpackage.esps -> L4e
            java.lang.Object r7 = r5.b(r0)     // Catch: defpackage.esps -> L4e
            if (r7 != r1) goto L4b
            return r1
        L4b:
            eyee r7 = (defpackage.eyee) r7     // Catch: defpackage.esps -> L4e
            return r7
        L4e:
            enru r5 = defpackage.awcd.a
            ensk r5 = r5.i()
            ensn r7 = defpackage.ente.a
            java.lang.String r0 = "BugleFileTransfer"
            r5.Y(r7, r0)
            enrr r5 = (defpackage.enrr) r5
            ensn r7 = defpackage.cqpo.j
            r5.Y(r7, r6)
            java.lang.String r6 = "getAuthToken"
            r7 = 261(0x105, float:3.66E-43)
            java.lang.String r0 = "com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/UploadStep"
            java.lang.String r1 = "UploadStep.kt"
            ensk r5 = r5.h(r0, r6, r7, r1)
            enrr r5 = (defpackage.enrr) r5
            java.lang.String r6 = "Could not obtain auth token for upload."
            r5.q(r6)
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awcd.c(awui, awap, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.crfk r15, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r16, defpackage.awap r17, int r18, defpackage.awcp r19, defpackage.crbv r20, defpackage.ffgu r21) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awcd.d(crfk, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, awap, int, awcp, crbv, ffgu):java.lang.Object");
    }

    @Override // defpackage.awat
    public final Object e(ffgu ffguVar) {
        if (this.l != null) {
            ensk h = a.h();
            h.Y(ente.a, "BugleFileTransfer");
            enrr enrrVar = (enrr) h;
            ensn ensnVar = cqpo.j;
            awbs awbsVar = this.l;
            enrrVar.Y(ensnVar, awbsVar != null ? awbsVar.b : null);
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/UploadStep", "pause", 396, "UploadStep.kt")).q("Pausing upload.");
            this.c.a(this.l);
        }
        return ffcu.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    @Override // defpackage.awat
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.awai r18, defpackage.awbj r19, defpackage.ffgu r20) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awcd.f(awai, awbj, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.crfj r20, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r21, defpackage.awap r22, final int r23, defpackage.awcp r24, com.google.android.rcs.client.messaging.data.ContentType r25, boolean r26, defpackage.ffgu r27) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awcd.g(crfj, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, awap, int, awcp, com.google.android.rcs.client.messaging.data.ContentType, boolean, ffgu):java.lang.Object");
    }

    @Override // defpackage.awat
    public final /* synthetic */ boolean h() {
        return false;
    }

    @Override // defpackage.awat
    public final /* synthetic */ boolean i() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0168, code lost:
    
        if (r3 != r4) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01a3, code lost:
    
        if (r3 != r4) goto L69;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ed A[Catch: all -> 0x01ef, TryCatch #1 {all -> 0x01ef, blocks: (B:62:0x00cf, B:64:0x00ed, B:67:0x0101, B:70:0x010c, B:72:0x011a), top: B:61:0x00cf }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0101 A[Catch: all -> 0x01ef, TryCatch #1 {all -> 0x01ef, blocks: (B:62:0x00cf, B:64:0x00ed, B:67:0x0101, B:70:0x010c, B:72:0x011a), top: B:61:0x00cf }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.awai r24, defpackage.crbv r25, defpackage.awui r26, defpackage.eyee r27, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r28, defpackage.awbt r29, defpackage.ffgu r30) {
        /*
            Method dump skipped, instructions count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awcd.j(awai, crbv, awui, eyee, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, awbt, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.awai r19, defpackage.awbj r20, defpackage.ffgu r21) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awcd.k(awai, awbj, ffgu):java.lang.Object");
    }
}
