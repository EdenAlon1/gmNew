package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjyq implements cjyd {
    public static final cjyg a = new cjyg();
    public static final enru b = enru.c("com/google/android/apps/messaging/shared/profile/transport/ProfileActionSenderImpl");
    public final ffbr c;
    public final cjso d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    private final ffsk i;
    private final axbh j;
    private final ffbr k;
    private final ffbr l;
    private final ffbr m;
    private final ffbr n;
    private final ffbr o;
    private final atlz p;

    public cjyq(ffsk ffskVar, axbh axbhVar, ffbr ffbrVar, ffbr ffbrVar2, cjso cjsoVar, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, atlz atlzVar) {
        ffskVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        ffbrVar6.getClass();
        ffbrVar7.getClass();
        ffbrVar8.getClass();
        ffbrVar10.getClass();
        this.i = ffskVar;
        this.j = axbhVar;
        this.k = ffbrVar;
        this.c = ffbrVar2;
        this.d = cjsoVar;
        this.e = ffbrVar3;
        this.f = ffbrVar4;
        this.g = ffbrVar5;
        this.h = ffbrVar6;
        this.l = ffbrVar7;
        this.m = ffbrVar8;
        this.n = ffbrVar9;
        this.o = ffbrVar10;
        this.p = atlzVar;
    }

    private final awya h() {
        awxv awxvVar = (awxv) awya.a.createBuilder();
        awxvVar.getClass();
        awyb.c(((aulp) this.m.b()).a() ? awxz.CONTROL : awxz.USER, awxvVar);
        awyb.b(((aulp) this.m.b()).a() ? awxx.NORMAL : awxx.HIGH, awxvVar);
        awyb.d(awxvVar);
        return awyb.a(awxvVar);
    }

    @Override // defpackage.cjyd
    public final void a(apfz apfzVar) {
        axol.k(this.i, null, new cjym(apfzVar, this, null), 3);
    }

    @Override // defpackage.cjyd
    public final void b(engw engwVar, int i) {
        axol.k(this.i, null, new cjyj(engwVar, this, i, null), 3);
    }

    @Override // defpackage.cjyd
    public final void c(ParticipantsTable.BindData bindData) {
        axol.k(this.i, null, new cjyi(this, bindData, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.aqux r10, defpackage.ffgu r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.cjyh
            if (r0 == 0) goto L13
            r0 = r11
            cjyh r0 = (defpackage.cjyh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cjyh r0 = new cjyh
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            r4 = 0
            java.lang.String r5 = "asChatEndPoint"
            java.lang.String r6 = "com/google/android/apps/messaging/shared/profile/transport/ProfileActionSenderImpl"
            java.lang.String r7 = "ProfileActionSenderImpl.kt"
            java.lang.String r8 = "BugleProfiles"
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            defpackage.ffci.b(r11)
            goto L61
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L38:
            defpackage.ffci.b(r11)
            ffbr r11 = r9.o
            java.lang.Object r11 = r11.b()
            aulf r11 = (defpackage.aulf) r11
            boolean r11 = r11.a()
            if (r11 == 0) goto L88
            ffbr r11 = r9.n
            java.lang.Object r11 = r11.b()
            ckac r11 = (defpackage.ckac) r11
            com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId r10 = r10.g()
            elfl r10 = r11.c(r10)
            r0.c = r3
            java.lang.Object r11 = defpackage.fgfz.c(r10, r0)
            if (r11 == r1) goto L87
        L61:
            j$.util.Optional r11 = (j$.util.Optional) r11
            boolean r10 = r11.isEmpty()
            if (r10 == 0) goto L82
            enru r10 = defpackage.cjyq.b
            ensk r10 = r10.j()
            ensn r11 = defpackage.ente.a
            r10.Y(r11, r8)
            r11 = 263(0x107, float:3.69E-43)
            ensk r10 = r10.h(r6, r5, r11, r7)
            enrr r10 = (defpackage.enrr) r10
            java.lang.String r11 = "Failed to get chat endpoint from self identity"
            r10.q(r11)
            return r4
        L82:
            java.lang.Object r10 = r11.get()
            return r10
        L87:
            return r1
        L88:
            j$.util.Optional r10 = r10.m()
            java.lang.Object r10 = defpackage.fflm.b(r10)
            aoku r10 = (defpackage.aoku) r10
            if (r10 != 0) goto Lad
            enru r10 = defpackage.cjyq.b
            ensk r10 = r10.j()
            ensn r11 = defpackage.ente.a
            r10.Y(r11, r8)
            r11 = 272(0x110, float:3.81E-43)
            ensk r10 = r10.h(r6, r5, r11, r7)
            enrr r10 = (defpackage.enrr) r10
            java.lang.String r11 = "Failed to get self messaging identity"
            r10.q(r11)
            return r4
        Lad:
            j$.util.Optional r10 = r10.e()
            r10.getClass()
            java.lang.Object r10 = defpackage.fflm.b(r10)
            awui r10 = (defpackage.awui) r10
            if (r10 != 0) goto Ld5
            enru r10 = defpackage.cjyq.b
            ensk r10 = r10.j()
            ensn r11 = defpackage.ente.a
            r10.Y(r11, r8)
            r11 = 278(0x116, float:3.9E-43)
            ensk r10 = r10.h(r6, r5, r11, r7)
            enrr r10 = (defpackage.enrr) r10
            java.lang.String r11 = "Failed to get self RCS identifier"
            r10.q(r11)
            return r4
        Ld5:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjyq.d(aqux, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.cjyb r14, com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r15, defpackage.awui r16, boolean r17, defpackage.ffgu r18) {
        /*
            r13 = this;
            r0 = r18
            boolean r1 = r0 instanceof defpackage.cjyl
            if (r1 == 0) goto L15
            r1 = r0
            cjyl r1 = (defpackage.cjyl) r1
            int r2 = r1.c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.c = r2
            goto L1a
        L15:
            cjyl r1 = new cjyl
            r1.<init>(r13, r0)
        L1a:
            java.lang.Object r0 = r1.a
            ffhh r2 = defpackage.ffhh.a
            int r3 = r1.c
            r4 = 3
            if (r3 == 0) goto L6d
            r14 = 1
            r15 = 0
            if (r3 == r14) goto L64
            r14 = 2
            if (r3 == r14) goto L38
            if (r3 != r4) goto L30
            defpackage.ffci.b(r0)
            return r0
        L30:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L38:
            defpackage.ffci.b(r0)     // Catch: java.lang.Exception -> L3e
            ckbx r0 = (defpackage.ckbx) r0     // Catch: java.lang.Exception -> L3e
            throw r15     // Catch: java.lang.Exception -> L3e
        L3e:
            r0 = move-exception
            r14 = r0
            enru r15 = defpackage.axbh.a
            ensk r15 = r15.j()
            enrr r15 = (defpackage.enrr) r15
            ensk r14 = r15.g(r14)
            java.lang.String r15 = "handleWorkForDestination$default"
            r0 = 119(0x77, float:1.67E-43)
            java.lang.String r1 = "com/google/android/apps/messaging/shared/chatapi/protomessage/workhandler/RcsProtoMessageSenderHandler"
            java.lang.String r2 = "RcsProtoMessageSenderHandler.kt"
            ensk r14 = r14.h(r1, r15, r0, r2)
            enrr r14 = (defpackage.enrr) r14
            java.lang.String r15 = "RCS proto message send failed."
            r14.q(r15)
            ceyt r14 = defpackage.ceyt.k()
            return r14
        L64:
            defpackage.ffci.b(r0)
            r0.getClass()
            azcr r0 = (defpackage.azcr) r0
            throw r15
        L6d:
            defpackage.ffci.b(r0)
            axbh r7 = r13.j
            aoku r0 = r15.g()
            j$.util.Optional r0 = r0.e()
            ffbr r3 = r13.k
            java.lang.Object r3 = r3.b()
            avkc r3 = (defpackage.avkc) r3
            aoku r15 = r15.g()
            java.lang.String r15 = r15.o()
            awui r15 = r3.c(r15)
            java.lang.Object r15 = r0.orElse(r15)
            r15.getClass()
            r8 = r15
            awui r8 = (defpackage.awui) r8
            awya r11 = r13.h()
            ffhd r15 = r7.b
            ffhd r15 = defpackage.ekxi.a(r15)
            cjyk r5 = new cjyk
            r6 = 0
            r9 = r14
            r10 = r16
            r12 = r17
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r1.c = r4
            java.lang.Object r14 = defpackage.ffra.a(r15, r5, r1)
            if (r14 != r2) goto Lb6
            return r2
        Lb6:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjyq.e(cjyb, com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient, awui, boolean, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0129, code lost:
    
        if (defpackage.fgfz.c(r14, r10) == r1) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00bf -> B:18:0x00c1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.cjwl r14, defpackage.ffgu r15) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjyq.f(cjwl, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0171, code lost:
    
        if (defpackage.fgfz.c(r0, r3) == r4) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x012d A[LOOP:0: B:22:0x0127->B:24:0x012d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.cjwl r20, defpackage.engw r21, defpackage.azcr r22, defpackage.ffgu r23) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjyq.g(cjwl, engw, azcr, ffgu):java.lang.Object");
    }
}
